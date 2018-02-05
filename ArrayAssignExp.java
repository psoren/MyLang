import java.util.ArrayList;

public class ArrayAssignExp extends Exp {

	/*array[i] = x*/

	String varName;
	Exp index;
	Exp value;

	public ArrayAssignExp(String varName, Exp index, Exp value){
		this.varName = varName;
		this.index = index;
		this.value = value;
	}

	@Override
	ValEnv eval(Env env) {
		Env orig = env;

		try{
			ArrayList<Integer> array = (ArrayList<Integer>) env.lookup(varName);
			int newIndex = (Integer)index.eval(env).val;
			int newValue = (Integer)value.eval(env).val;
			array.set(newIndex, newValue);
		}
		catch (ClassCastException e){
			System.err.print("array index access expects an integer, given ");
			//System.err.println(value.eval(env).val.getClass().getName());
			System.exit(3);
		}
		return new ValEnv(null, orig);
	}

	@Override
	void print() {
		// TODO Auto-generated method stub
	}
}
