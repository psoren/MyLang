
public class GiveExp extends Exp {

	Exp exp;

	public GiveExp(Exp exp){
		this.exp = exp;
	}

	@Override
	ValEnv eval(Env env) {
		//ValEnv ve = exp.eval(env);
		//return ve;
		//i think this is ok
		return exp.eval(env);
	}

	@Override
	void print() {
		// TODO Auto-generated method stub
	}
}
