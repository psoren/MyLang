
public class CommentExp extends Exp {

	@Override
	ValEnv eval(Env env) {
		return new ValEnv(null, env);
	}

	@Override
	void print() {
		// TODO Auto-generated method stub
	}
}
