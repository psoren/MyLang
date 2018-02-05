import java.util.ArrayList;

public class AddExp extends Exp {

	String lst;
	Exp adding;

	public AddExp(String lst, Exp adding) {
		this.lst = lst;
		this.adding = adding;
	}
	
	@Override
	ValEnv eval(Env env) {
		Object lookupLst = env.lookup(lst);
		if(!(lookupLst instanceof java.util.ArrayList)){
			System.err.println("add: expects type <list> as 1st argument");
			System.exit(3);  
		}
		@SuppressWarnings("unchecked")
		ArrayList<Object> arrList = (ArrayList<Object>) lookupLst;
		ValEnv ve2 = adding.eval(env);
		arrList.add(ve2.val);
		ve2.env.assign(lst, arrList);
		return new ValEnv(null,env);
		
		}
	@Override
	void print() {
		// TODO Auto-generated method stub
	}
}
