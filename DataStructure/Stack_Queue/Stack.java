
import java.util.*;
class Stack {
    
    private int top;
    private int maxSize;
    private int[] stackData;

    public Stack(){}

    public Stack(int max) {
        this.maxSize = max;
        this.top = -1;
        this.stackData = new int [maxSize];
    }

    public boolean push(int item) {
        if(top < maxSize - 1) {
            top ++;
            stackData[top] = item;
            return true;
        }
        return false;
    }

    public int peek() {
        if (top != -1) {
            return stackData[top];
        }
        return -10000;
    }
    
    public int pop() {
        if (top != -1) {
            --top;
            int pop = stackData[top + 1];
            stackData[top + 1] = 0;
            return pop;
        }
        return -10000;
    }
    public static void main(String[] args) {
       Stack newStack = new Stack(10);
        newStack.push(1);
        newStack.push(10);
        newStack.push(11);
        newStack.push(100);
        System.out.println(Arrays.toString(newStack.stackData));
        int peek = newStack.peek();
        System.out.println(peek);
        int pop = newStack.pop();
        System.out.println(pop);
        System.out.println(Arrays.toString(newStack.stackData));
    }
}