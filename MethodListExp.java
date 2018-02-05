import java.util.ArrayList;

public class MethodListExp extends Exp {

	ArrayList<String> methods = new ArrayList<String>();

	public MethodListExp(ArrayList<String> methods) {
		this.methods = methods;
	}
	
	@Override
	ValEnv eval(Env env) {

		//maybe we dont need to create a methodlistexp class, just use methodexp
		
		
		
		
		return null;
	}

	@Override
	void print() {
	}
}