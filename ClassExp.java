import java.util.ArrayList;

public class ClassExp extends Exp {
	//String name;
	Exp init;
	ArrayList<Exp> methods = new ArrayList<Exp>();


	public ClassExp( Exp init, ArrayList<Exp> methods) {
		//this.name = name;
		this.init = init;
		this.methods = methods;
	}

	@Override
	ValEnv eval(Env env) {
		ClassClosure closure = new ClassClosure(this, env);
		return new ValEnv(closure, env);
	}

	@Override
	void print() {
		//TODO
	}

}
