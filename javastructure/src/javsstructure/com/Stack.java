package javsstructure.com;

public class Stack {

	private String[] stackarray;
	private int stacksize;
	private int top;
	
	public Stack(int size) {
		stacksize=size;
		top=0;
		stackarray=new String[size];
	}
	
	public void push(String val) {
		if (this.top<this.stacksize) {
			stackarray[top]=val;						
			top=top+1;
			
		}else {
			throw new RuntimeException(" master version:push stack over flow="+val);			
		}
		
	}
	
	public String  pop() {
		if(top==0) {
			throw new RuntimeException("pop exception,stack is empty");
		}
		String popval=peek(top);
		top=top-1;
		stackarray[top]=null;
		return popval;
		
	}
	
	private String peek(int order) {		
		if(top>0) {
			return stackarray[order-1];		    		
		}else {
			throw new RuntimeException("Peek exception");
		}			
   }
}
