import java.util.ArrayList;

public abstract class ParamsBodyExp extends Exp {
	
	ArrayList<String> params = new ArrayList<String>();
	Exp body;
	
	
	public Exp getBody() {
		return body;
	}

	@Override
	ValEnv eval(Env env) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<String> getParams() {
		return params;
	}

	@Override
	void print() {
		// TODO Auto-generated method stub

	}

}
