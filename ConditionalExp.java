
public class ConditionalExp extends Exp {

	Exp condition;	// condition
	Exp trueExp;	// if true
	Exp falseExp;	// if false
	
	
	public ConditionalExp(Exp condition, Exp trueExp, Exp falseExp) {
		this.condition = condition;
		this.trueExp   = trueExp;
		this.falseExp  = falseExp;
	}

	@Override
	ValEnv eval(Env env) {
		ValEnv ve1 = condition.eval(env);
		if((ve1.val.equals("T"))){	
			//System.out.println("true, evalling " + trueExp);
			ValEnv tValEnv = trueExp.eval(env);
			return tValEnv;
		}
		else if((ve1.val.equals("F"))){	
			//System.out.println("false");
			if(falseExp != null){	//it could be null because it is optional
				ValEnv fValEnv = falseExp.eval(env);
				return fValEnv;
			}
		}else{
			System.err.println("Conditional is not of type <boolean>");
			System.exit(3);
		}
		// returns when a conditional is false and does not have an else
		return new ValEnv(null, env);
	}

	@Override
	void print() {
		System.out.print("(if ");
		condition.print();
		trueExp.print();
		falseExp.print();
		System.out.print(")");
	}
}
