import java.util.ArrayList;

public class Stack {
    int top = -1;
    int size;
    int items[];

    public boolean isFull(){
        return top == size - 1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public void push(int item){
        if(isFull()){
            System.out.println("Stack overflow !!");
        }else{
            top++;
            items[top] = item;
        }
    }

    public void pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
        }else{
            top--;
        }
    }

    public void list(){
        ArrayList<Integer> itemsList = new ArrayList<Integer>();
        int counter = 0;
        while(counter <= top){
            itemsList.add(items[counter]);
            counter++;
        }
        System.out.println(itemsList);
    }


    public Stack(int size){
        this.size = size;
        this.items = new int[size];
    }
}
