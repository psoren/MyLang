
public class LiteralExp extends Exp {

	String value;
	
	public LiteralExp(String value){
		this.value = value;
	}
	
	@Override
	ValEnv eval(Env env) {
		try{ // integer type
			return new ValEnv(Integer.parseInt(value), env);
		}catch(NumberFormatException e){ // String type
			return new ValEnv(value, env);
		}
	}

	@Override
	void print() {
		System.out.print(value);
	}
}
