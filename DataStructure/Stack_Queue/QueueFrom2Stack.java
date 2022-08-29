package DataStructure.Stack_Queue;


import java.util.*;
class HelloWorld {
    static Stack<Integer> stack1 = new Stack<Integer>();
    static Stack<Integer> stack2 = new Stack<Integer>();
    
    public static void enQueue(int item){
          stack1.push(item);
    }
        
    public static int deQueue(){
        if(stack1.size() == 0) {
            if(stack2.size() == 0) {
                System.out.println("Queue Empty");
            }
        }
        while(stack1.size() > 0){
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }
    
    public static void main(String[] args) {
        HelloWorld queue = new HelloWorld();
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        queue.enQueue(5);
        System.out.println(queue.toString());
        
        Stack<Integer> stack3 = new Stack<Integer>();
        stack3.push(100);
        stack3.push(200);
        System.out.println(stack3.pop());
        
    }
    
}
