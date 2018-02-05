import java.util.ArrayList;

public class ProcedureExp extends Exp {

	Object methodObj;
	Exp caller;
	ArrayList<Exp> exps = new ArrayList<Exp>();

	public ProcedureExp(Exp caller, ArrayList<Exp> exps) {
		this.methodObj = exps.remove(0);
		this.exps = exps;
		this.caller = caller;
		System.out.println("caller   " + caller);
	}

	public ProcedureExp(Closure c) {
		methodObj = c;
	}

	@Override
	ValEnv eval(Env env) {
		Env orig = env;
		System.out.println(caller);
		if(caller != null){
			Object cl = caller.eval(env);
			if(!(cl instanceof ClassClosure)){
				System.err.print("Invalid class attempting to call a method");
				System.exit(13);
			}
			
			ClassClosure cc = (ClassClosure) cl;
			System.out.println("HEYEY" + cc.exp);
			
		} // caller is not null and a class OR is null
		
		//System.out.println("ProcCall ");
		ClosureParents close = null;
		// step 1, eval the id exp containing the closure
		if(methodObj instanceof Exp){
			Exp method = (Exp) methodObj;
			ValEnv ve = method.eval(env); 
			Object opExp = ve.val;
			// step 2, check if it is a closure
			if(!(opExp instanceof ClosureParents )){
				System.err.print("procedure application: expected procedure, given non-procedure");
				System.exit(7);
			}
			if(opExp instanceof Closure)
				close = (Closure) opExp;
			else if(opExp instanceof ClassClosure){
				close    = (ClassClosure) opExp;
				Exp init = ((ClassExp)close.exp).init;
				//.out.println(close.exp);
				close = (InitClosure) init.eval(env).val;
			}
		}else if(methodObj instanceof Closure){
			close = (Closure) methodObj;
		}else if(methodObj instanceof ClassClosure){
			close = (ClassClosure) methodObj;
			close = (InitClosure) close.exp.eval(env).val;
		}else{
			System.err.print("procedure application: expected procedure, given non-procedure");
			System.exit(7);
		}
		Env lamEnv = close.env;

		ArrayList<Object> values = new ArrayList<Object>();
		// 3, eval operands in call Env
		for (int i = 0; i < exps.size(); i++){
			Object val = exps.get(i).eval(env).val;
			values.add(val);
		}

		// 4, check if same number of params
		//System.out.println(close);
		ArrayList<String> procParams = ((ParamsBodyExp)close.exp).getParams();
		int procNumArgs = procParams.size();
		int thisNumArgs = exps.size();
		if(thisNumArgs != procNumArgs){
			System.err.printf("procedure expects %d arguments, given %d", 
					procNumArgs, thisNumArgs );
			System.exit(8);
		}

		// Step 5.
		// create new local environment with closure and assign values to params
		Env newEnv = new Env(lamEnv);
		for(int i = 0; i < procNumArgs; i++){
			newEnv.define(procParams.get(i), values.get(i));
		}

		//6, 7, evaluate  with the new callEnv and return with old env
		Object methodVal = ((ParamsBodyExp)close.exp).getBody().eval(newEnv).val;
		//System.out.println(close.method.getBody() + " gives " + methodVal);
		return new ValEnv(methodVal, orig);
	}

	@Override
	void print() {
		// TODO Auto-generated method stub
	}
}
