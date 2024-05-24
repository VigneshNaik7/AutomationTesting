package Collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class Priority_Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//poll(): Retrieves and removes the element with the highest priority (smallest by default) from the queue.
		
		Queue< Integer> pqueue = new PriorityQueue<Integer>();
		
		pqueue.add(10);
		pqueue.add(21);
		pqueue.add(5);
		pqueue.add(1);
		pqueue.add(11);
		pqueue.add(4);
		
		System.out.println("PriorityQueue before "+pqueue); //organize the inserted value in the asecending order
		
		Integer removed_value=pqueue.poll(); //remove the 1st element from the list
		
		System.out.println("Removed value from PriorityQueue is "+removed_value);
		System.out.println("PriorityQueue afetr "+pqueue);
		

	}

}
 