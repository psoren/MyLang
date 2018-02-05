
public class IdExp extends Exp {

	String varName;
	
	public IdExp(String varName) {
		this.varName = varName;
	}

	@Override
	ValEnv eval(Env env) {
		try{ 
			ValEnv ve;
			Object exp = env.lookup(varName);
			//System.out.println( varName + " = " + exp);
			if(exp instanceof Closure){
				Closure close = (Closure)exp;
				ve = new ValEnv(close, env);
				
			}else if(exp instanceof String){ //if a string
				ve = new ValEnv(exp.toString(), env);
			
			}else if(exp instanceof ValEnv){
				ve = new ValEnv(((ValEnv) exp).val, env); // ((ValEnv) exp).env);     // its a ValEnv
				
			}else if(exp instanceof Integer)
				ve = new ValEnv((Integer)exp, env); 	// if an int value
			else{
				ve = new ValEnv(exp, env); 	//nulls...(read)'s (write)'s etc
			}
			return ve;
			
		}catch(RuntimeException e){
			e.printStackTrace();
			System.err.print("reference to undefined identifier: " + varName);
			System.exit(4);
		}
		return null;
	}

	@Override
	public String toString() {
		return "IdExp [varName=" + varName + "]";
	}

	@Override
	void print() {
		System.out.print(varName + "=" );
	}
}
