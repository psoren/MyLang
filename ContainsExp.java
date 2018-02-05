import java.util.ArrayList;

public class ContainsExp extends Exp {

	String lst;
	Exp item;

	public ContainsExp(String lst, Exp item) {
		this.lst = lst;
		this.item = item;
	}
	
	@Override
	ValEnv eval(Env env) {

		Object lookupLst = env.lookup(lst);		
		if(!(lookupLst instanceof java.util.ArrayList)){
			System.err.println("contains: expects type <list> as 1st argument");
			System.exit(3);  
		}
		ArrayList<?> arrList = (ArrayList<?>) lookupLst;
		ValEnv ve2 = item.eval(env);
		if(arrList.contains(ve2.val))
			return new ValEnv("T", env);
		else
			return new ValEnv("F", env);
		}

	@Override
	void print() {
		// TODO Auto-generated method stub
	}
}
