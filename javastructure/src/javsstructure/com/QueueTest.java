package javsstructure.com;

public class QueueTest {

	public static void main(String[] args) {
		Queue 	queueObj=new Queue(3);
		queueObj.insert("2");
		queueObj.insert("5");
		queueObj.insert("7");			
		System.out.println(queueObj.remove());	
		System.out.println(queueObj.remove());	
		queueObj.insert("8");
		queueObj.insert("9");	
		System.out.println(queueObj.remove());	
		queueObj.insert("10");
		System.out.println("master"+queueObj.remove());		
		System.out.println(queueObj.remove());		
		System.out.println(queueObj.remove());		
		//System.out.println(queueObj.remove());		
	}

}
