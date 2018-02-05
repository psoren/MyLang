import java.util.ArrayList;

public class MultiExp extends Exp {
	ArrayList<Exp> exps = new ArrayList<Exp>();
	
	public MultiExp(ArrayList<Exp> exps) {
		this.exps = exps;
	}

	public ArrayList<Exp> getExps() {
		return exps;
	}

	@Override
	ValEnv eval(Env env) {
		ValEnv ve = new ValEnv(null,env);
			for(Exp exp: exps){
				ve = exp.eval(env);
			}
		return ve;
	}

	@Override
	void print() {
		for(Exp exp: exps){
			exp.print();
		}
	}

	@Override
	public String toString() {
		return "MultiExp [exps=" + exps + "]";
	}

}
