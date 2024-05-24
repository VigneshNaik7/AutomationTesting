package Collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class Array_Deque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Integer> queue = new ArrayDeque<>();
		
		queue.add(100);
		queue.add(200);
		queue.add(300);
		queue.add(400);
		queue.add(500);
		
		
		queue.remove();// no need to pass the element or array index it will remove the 1st element value in the arraylist
		
		for(Integer i:queue) {
			System.out.println(i);
		}

	}

}
