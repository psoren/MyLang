
public class LogicalExp extends Exp {
	boolean neg;
	String operator;
	Exp operand1; 
	Exp operand2; 
	

	public LogicalExp(boolean neg, String operator, Exp operand1, Exp operand2) {
		this.neg = neg;
		this.operator = operator;
		this.operand1 = operand1;
		this.operand2 = operand2;
	}

	@Override
	ValEnv eval(Env env){
		
		String T = "T";
		String F = "F";
		
		//if this statement was negated
		//when we return, true is false and false is true
		if(this.neg == true){
			T = "F";
			F = "T";
		}

		// ---- ? ----
		if(operator.equals("?")){
			Object value1 = operand1.eval(env).val;
			Object value2 = operand2.eval(env).val;
			if(value1 instanceof String ){
				if( value2 instanceof String){
					if(value1.equals(value2)){ // both strings and equal ==> T
						return new ValEnv(T, env);
					}
					return new ValEnv(F, env);
					// val1 string, val2 not ==> F
				}
			} //val1 not string
			if(value2 instanceof String){ // but val2 is a str ==> F
				return new ValEnv(F, env);
			} 
			// now neither are strings
			if(value1 == value2)
				return new ValEnv(T, env);
			else 
				return new ValEnv(F,env); 
		}
		// ---- < ----
		else if(operator.equals("<")){
			Object value1 = operand1.eval(env).val;
			Object value2 = operand2.eval(env).val;
			if(!(value1 instanceof Integer)){
				System.err.println(operator + ": expects type <integer> as 1st argument");
				System.exit(3);  // exit(3)
			}
			if(!(value2 instanceof Integer)){
				System.err.println(operator + ": expects type <integer> as 2nd argument");
				System.exit(3);  // exit(3)
			}
			if((Integer)value1 < (Integer)value2)
				return new ValEnv(T, env);
			else 
				return new ValEnv(F,env); 
		}
		// ---- >----
		else if(operator.equals(">")){
			Object value1 = operand1.eval(env).val;
			Object value2 = operand2.eval(env).val;
			if(!(value1 instanceof Integer)){
				System.err.println(operator + ": expects type <integer> as 1st argument");
				System.exit(3);  // exit(3)
			}
			if(!(value2 instanceof Integer)){
				System.err.println(operator + ": expects type <integer> as 2nd argument");
				System.exit(3);  // exit(3)
			}
			if((Integer)value1 > (Integer)value2)
				return new ValEnv(T, env);
			else 
				return new ValEnv(F,env); 
		}
		// ---->=----
		else if(operator.equals(">=")){
			Object value1 = operand1.eval(env).val;
			Object value2 = operand2.eval(env).val;
			if(!(value1 instanceof Integer)){
				System.err.println(operator + ": expects type <integer> as 1st argument");
				System.exit(3);  // exit(3)
			}
			if(!(value2 instanceof Integer)){
				System.err.println(operator + ": expects type <integer> as 2nd argument");
				System.exit(3);  // exit(3)
			}
			if((Integer)value1 >= (Integer)value2)
				return new ValEnv(T, env);
			else 
				return new ValEnv(F,env); 
		}
		// ----<=----
		else if(operator.equals("<=")){
			Object value1 = operand1.eval(env).val;
			Object value2 = operand2.eval(env).val;
			if(!(value1 instanceof Integer)){
				System.err.println(operator + ": expects type <integer> as 1st argument");
				System.exit(3);  // exit(3)
			}
			if(!(value2 instanceof Integer)){
				System.err.println(operator + ": expects type <integer> as 2nd argument");
				System.exit(3);  // exit(3)
			}
			if((Integer)value1 <= (Integer)value2)
				return new ValEnv(T, env);
			else 
				return new ValEnv(F,env); 
		}
	/*	// ---- ! ----
		else if(operator.equals("!")){
			Object value1 = operand1.eval(env).val;
			if(value1 instanceof String){
				if(value1.equals(T))
					return new ValEnv(F, env);
				else if(value1.equals(F))
					return new ValEnv(T, env);
				else{
					System.err.println(operator + ": expects type boolean as 1st argument");
					System.exit(3);  
				}
			}else{ // not a string
				System.err.println(operator + ": expects type boolean as 1st argument");
				System.exit(3);  
			}
		}*/
		// none of the above operators...
		return null;
	}


	@Override
	void print() {
		//TODO
	}

	public String getOperator(){
		return operator;
	}
}
