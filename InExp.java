import java.util.Scanner;

public class InExp extends Exp {

	static Scanner inp  = new Scanner(System.in); 
	Exp str;

	public InExp(Exp str) {
		this.str = str;
	}

	@Override
	ValEnv eval(Env env) {
		if(str != null){
			Object val = str.eval(env).val;
			if(!(val instanceof String)){
				System.err.println("in expects type <String>");
				System.exit(13);
			}
			// will handle file input later TODO
		}
		// no param means std input
		String line = inp.next();
		try{
			Exp lit = new LiteralExp(line);
			ValEnv ve = lit.eval(env);
			return ve;
		}catch(Exception e){
			System.err.println("read expects type <integer>, given: " + line);
			System.exit(13);
		}
		return new ValEnv(null, env);
	}

	@Override
	void print() {
		//System.out.print(ve.val); TODO
	}
}
