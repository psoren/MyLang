import java.util.ArrayList;

public class ListExp extends Exp {
	
	ArrayList<Exp> exps;
	
	public ListExp(ArrayList<Exp> exps) {
		if (exps == null)
			this.exps = new ArrayList<Exp>();
		else
			this.exps = exps;
	}

	@Override
	ValEnv eval(Env env) {		
		return new ValEnv(exps, env);
	}

	@Override
	void print() {
		// TODO Auto-generated method stub
	}
}
