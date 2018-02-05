import java.util.ArrayList;

public class MethodExp extends ParamsBodyExp {
	
	
	public MethodExp( ArrayList<String> params, Exp body) {
		this.params = params;
		this.body = body;
	}

	@Override
	ValEnv eval(Env env) {
		Closure closure = new Closure(this, env);
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
