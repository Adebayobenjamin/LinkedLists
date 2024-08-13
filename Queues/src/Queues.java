public class Queues {
    int size;
    int front = -1;
    int rear = -1;
    int items[];
    public Queues(int size){
        this.size = size;
        this.items = new int[size];
    }

    public boolean isFull(){
        if( rear == size-1){
            return true;
        }
        return false;
    }
    public boolean isEmpty(){
        if(front == -1){
            return true;
        }
        return false;
    }

    public void enqueue(int item){
        if(isFull()){
            System.out.println("stack overflow!!!!");
        }else{
            front = 0;
                rear++;
                items[rear] = item;
            }
        }

    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty!!!!");
        }else if(front >= rear){
            front = -1;
            rear = -1;

        }else {
            front ++;

        }
    }
    public void list(){
        if(isEmpty() == true){
            System.out.println("[]");
            return;
        }
        int counter = front;
       while (counter <= rear){
           System.out.println(items[counter]);
           counter++;
       }

    }
    public int peek (){
        return items[front];
    }
    public int size(){
        return items.length;
    }
}
