
public class Closure extends ClosureParents {


	public Closure(MethodExp meth, Env env) {
		this.exp = meth;
		this.env = env;
	}

	public Closure(Env env) {
		this.exp = null;
		this.env = env;
	}
}
