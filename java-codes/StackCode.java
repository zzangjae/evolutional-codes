import java.util.Stack;


/*
    Stack extends class Vector which provides synchronized dynamic array.

    if you need fast stack and don't need to be synchronized. ArrayDeque will be better choice.
 */
public class StackCode {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        System.out.println(stack.push(1));  // {1}
        System.out.println(stack.push(2));  // {2, 1}

        System.out.println(stack.empty());  // {2, 1}

        System.out.println(stack.search(1));  // {2, 1}
        System.out.println(stack.search(3));  // {2, 1}

        System.out.println(stack.pop());  // {1}

        System.out.println(stack.peek());  // {1}
        System.out.println(stack.pop());  // {}

        System.out.println(stack.empty());  // {}

    }

}
