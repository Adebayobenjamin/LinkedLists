public class Main {
    public static void main(String... args){
        Stack stack = new Stack(5);
        stack.push(24);
        stack.push(55);
        stack.push(24);
        stack.push(55);
        stack.push(55);
        stack.pop();
        stack.list();
    }
}
