package Collections;

import java.util.Stack;

public class StackPeekExample {

  public static void main(String[] args) {
	  
//peek(): Returns the element with the highest priority (smallest by default) without removing it from the queue.
	  
    Stack<String> books = new Stack<>();
    books.push("Data");
    books.push("Java for Beginners");
    books.push("Data Structures and Algorithms");
    books.push("Clean Code");
   

    System.out.println("Stack: " + books); // Output: Stack: [Clean Code, Data Structures and Algorithms, Java for Beginners]

    String topBook = books.peek(); //remove the last added data 1st from the stack
    System.out.println("Top book (without removing): " + topBook); // Output: Top book (without removing): Clean Code
    System.out.println("Stack after peek: " + books); // Output: Stack after peek: [Data, Java for Beginners, Data Structures and Algorithms, Clean Code]
  }
}


//