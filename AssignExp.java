
public class AssignExp extends Exp {

	String varName;
	Exp exp;
	
	public AssignExp(String varName, Exp exp){
		this.varName = varName;
		this.exp = exp;
	}

	@Override
	ValEnv eval(Env env) {		
		Env orig = env;
		//System.out.println(exp);
		Object x = exp.eval(env).val;
		System.out.println("assigning " + varName + " to " + x);
		if(varName.equals("MAIN")){
			ValEnv v = (new ProcedureExp((Closure)x)).eval((env));
			return v;
		}
		env.defAssign(varName, x);
		return new ValEnv(null, orig);
	}

	@Override
	void print() {
		//TODO
	}
}