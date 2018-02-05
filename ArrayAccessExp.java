import java.util.ArrayList;

public class ArrayAccessExp extends Exp {
	
	String varName;
	Exp value;
	
	public ArrayAccessExp(String varName, Exp value){
		this.varName = varName;
		this.value = value;
	}
	
	@Override
	ValEnv eval(Env env) {
		try{
			ArrayList<Integer> array = (ArrayList<Integer>) env.lookup(varName);
			int index = (Integer)value.eval(env).val;
			//System.out.println(value + " evalled = " + index);
			int v = array.get(index);
			return new ValEnv(v,env);
			
		}
		catch (ClassCastException e){
			System.err.print("array index access expects an integer, given ");
			System.err.println(value.eval(env).val.getClass().getName());
			System.exit(3);
		}
		return null;
	}

	@Override
	void print() {

	}
}
