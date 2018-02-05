
public class ClassClosure extends ClosureParents{

	public ClassClosure(ClassExp cl, Env env) {
		this.exp = cl;
		this.env = env;
	}

	public ClassClosure(Env env) {
		this.exp = null;
		this.env = env;
	}
}
