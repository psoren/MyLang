
public class ProgExp extends Exp {

	Exp multiExp;
	Exp main;
	
	public ProgExp(Exp multiExp, Exp main) {
		this.multiExp = multiExp;
		this.main = main;
	}

	@Override
	ValEnv eval(Env env) {
		ValEnv ve = multiExp.eval(env);
		ValEnv ve1 = main.eval(env);
		return ve1;
	}

	@Override
	void print() {
		// TODO Auto-generated method stub
	}
}
