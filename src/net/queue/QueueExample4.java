package net.queue;

import java.util.*;
public class QueueExample4 {
   public static void main(String[] args) {
     //declare a Queue  
    Queue LL_queue = new LinkedList();
    //initialize the Queue
    LL_queue.add("Value-0");
    LL_queue.add("Value-1");
    LL_queue.add("Value-2");
    LL_queue.add("Value-3");
    //traverse the Queue using Iterator
    System.out.println("The Queue elements through iterator:");
    Iterator iterator = LL_queue.iterator();
    while(iterator.hasNext()){
        String element = (String) iterator.next();
        System.out.print(element + " ");
    }
    System.out.println("\n\nThe Queue elements using for loop:");
    //use new for loop to traverse the Queue
    for(Object object : LL_queue) {
        String element = (String) object;
        System.out.print(element + " ");
    }
    }
}