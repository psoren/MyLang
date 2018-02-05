import java.util.ArrayList;

public class InitializerExp extends ParamsBodyExp {

	ArrayList<Exp> assigns    = new ArrayList<Exp>();

	public InitializerExp( ArrayList<String> params, ArrayList<Exp> assigns, Exp body) {
		this.params = params;
		this.assigns = assigns;
		this.body = body;
	}
	
	@Override
	ValEnv eval(Env env) {
		InitClosure closure = new InitClosure(this, env);
		return new ValEnv(closure, env);
	}

	public ArrayList<String> getParams() {
		return params;
	}

	public Exp getBody() {
		return body;
	}

	@Override
	void print() {
		//TODO
	}

}


