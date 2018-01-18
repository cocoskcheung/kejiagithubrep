package javsstructure.com;

public class Queue {

	private String[] queuearray;
	private int queueSize;
	private int top;
	
	public Queue(int size) {
		queueSize=size;
		top=0;
		queuearray=new String[size];
	}
	
	public boolean isEmpty() {
	if(top>0) {
		return false;
	}else {
		return true;
	}
	
	}
	
	public void insert(String val) {
		if (this.top<this.queueSize) {
			queuearray[top]=val;						
			top=top+1;
			
		}else {
			throw new RuntimeException("queue is full="+val);			
		}
		
	}
	
	public String  remove() {
		if(top==0) {
			throw new RuntimeException("remove exception,queue is empty");
		}
		String popval=peek(1);
		top=top-1;		
		for(int i=0;i<top;i++) {
		   queuearray[i]=queuearray[i+1];		   
		}
		queuearray[top]=null;
		
		return popval;
		
	}
	
	private String peek(int order) {		
		if(top>0) {
			return queuearray[order-1];		    		
		}else {
			throw new RuntimeException("Peek exception");
		}			
   }
}
