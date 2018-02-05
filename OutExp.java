import java.util.ArrayList;

public class OutExp extends Exp {
	
	Exp exp;
	String ln;
	
	public OutExp(Exp exp, String ln) {
		this.exp = exp;
		this.ln = ln;
	}

	@Override
	ValEnv eval(Env env) {
		ValEnv ve  = exp.eval(env);
	
			if(!(ve.val instanceof Integer) && !(ve.val instanceof String) && !(ve.val instanceof java.util.ArrayList)){
			System.err.println("out: expects type <integer> or type <String> or type<list> as 1st argument.");
			System.exit(3); 
		}
		String toPrint = "";
		if(ve.val instanceof String){
			String str = (String) ve.val;
			StringBuilder sb = new StringBuilder();
			for(int i = 1; i < str.length()-1; i++){
				sb.append(str.charAt(i));
			}
			toPrint = sb.toString();
		}
		
		else if (ve.val instanceof ArrayList){
			ArrayList<Integer> list = (ArrayList<Integer>) ve.val;
			
			for(int i = 0; i < list.size()-1;i++){
				System.out.println(list.get(i));
			}
			System.out.print(list.get(list.size()-1));
		}
		else
			toPrint = ve.val.toString();
		
		if(ln.equals("outln"))
			System.out.println(toPrint);
		else
			System.out.print(toPrint);
		return ve;
	}

	@Override
	void print() {
		//TODO
	}
}
