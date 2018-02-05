
public class ForExp extends Exp {

	String varName;
	String plusORminus;
	Exp min;
	Exp max;
	Exp inc;
	Exp body;

	public ForExp(String varName, String plusORminus, Exp min, Exp max, Exp inc, Exp body) {
		this.varName = varName;
		this.plusORminus = plusORminus;
		this.min = min;
		this.max = max;
		this.inc = inc;
		this.body = body;
	}

	@Override
	ValEnv eval(Env env) {
		Env orig = env;

		// define the varName as the min value in a new local env with this env as its nextEnv
		Env newEnv = new Env(env);
		Object minVal = min.eval(env).val;
		Object maxVal = max.eval(env).val;
		Object incVal = inc.eval(env).val;

		if(!(minVal instanceof Integer )){
			System.err.println("for loop: expects type <integer> as minimum argument");
			System.exit(3);  
		}
		if(!(maxVal instanceof Integer )){
			System.err.println("for loop: expects type <integer> as maximum argument");
			System.exit(3);  
		}
		if(!(incVal instanceof Integer )){
			System.err.println("for loop: expects type <integer> as incrementing argument");
			System.exit(3);  
		}
		// execute the body while incrementing the var until it reaches the max
		int minInt = (Integer) minVal;
		int maxInt = (Integer) maxVal;
		int incInt = (Integer) incVal;
		if(plusORminus=="-")
			incInt =  -incInt;
		
		newEnv.defAssign(varName, minInt);
		//System.out.println("min = " + minInt + " max = " + maxInt + " inc = " + incInt);
		if(maxInt < minInt){
			for(int i = minInt; i > maxInt; i = i + incInt){
				//System.out.println("java " + i);
				newEnv.assign(varName, i); // will reassign varName to min again the first time...
				body.eval(newEnv);
			}
		}
		else{
			for(int i = minInt; i < maxInt; i = i + incInt){
				//System.out.println("java " + i);
				newEnv.assign(varName, i); // will reassign varName to min again the first time...
				body.eval(newEnv);
			}
		}
		return new ValEnv(null, orig);
	}

	@Override
	void print() {
		// TODO Auto-generated method stub
	}
}
