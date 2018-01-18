package javsstructure.com;

public class StackTest {

	public static void main(String[] args) {
		Stack stackObj=new Stack(3);
		stackObj.push("2");
		stackObj.push("5");
		stackObj.push("7");	
		System.out.println(stackObj.pop());
		System.out.println(stackObj.pop());	
		stackObj.push("8");
		stackObj.push("9");
		System.out.println(stackObj.pop());
		System.out.println(stackObj.pop());
		System.out.println(stackObj.pop());


		
	}

}
