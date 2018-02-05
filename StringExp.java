
public class StringExp extends Exp {

	String str;
	
	public StringExp(String str) {
		this.str = str;
	}

	@Override
	ValEnv eval(Env env) {
		return new ValEnv(str, env);
	}

	@Override
	void print() {
		// TODO Auto-generated method stub
	}
}
