import java.util.Stack;

public class Main {
    // *****************************************************

    // stack = LIFO data structure. Last-In First-Out
    //               stores objects into a sort of "vertical tower"
    //		  push() to add objects to the top
    //		  pop() to remove objects from the top

    // uses of stacks?
    // 1. undo/redo features in text editors
    // 2. moving back/forward through browser history
    // 3. backtracking algorithms (maze, file directories)
    // 4. calling functions (call stack)

    // *****************************************************

    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();



        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push("Borderlands");
        stack.push("FFVII");

//        System.out.println(stack.empty());

//        String myFavGame = stack.pop(); // removes / returns the last added "top" item
        System.out.println(stack.peek()); // shows the object at the top of the stack
        System.out.println(stack.search("FFVII")); // searched from last to first, starts with 1

        System.out.println(stack);
    }


}
