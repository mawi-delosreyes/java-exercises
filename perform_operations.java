class Main{
	static int PerformOperation(int num1, int num2, String operation){
		int result = 0;
		String _operation = operation.toLowerCase();

		if(_operation.equals("add")){
			result = num1 + num2;
		}
		else if (_operation.equals("subtract")){
			result = num1 - num2;
		}
		else if(_operation.equals("multiply")){
			result = num1 * num2;
		}
		else if(_operation.equals("divide")){
			result = num1 / num2;
		}

		return result;
	}

	public static void main(String[] args){
		System.out.println("Add: " + PerformOperation(1,2,"add"));
		System.out.println("Subtract: " + PerformOperation(2,1,"SubTract"));
		System.out.println("Multiply: " + PerformOperation(1,2,"MULTIPLY"));
		System.out.println("Divide: " + PerformOperation(2,2,"dIvIdE"));
	}
}