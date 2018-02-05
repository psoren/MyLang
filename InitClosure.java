
public class InitClosure extends ClosureParents{


	public InitClosure(InitializerExp init, Env env) {
		exp = init;
		this.env = env;
	}

	public InitClosure(Env env) {
		this.exp = null;
		this.env = env;
	}
}


