import java.util.Scanner;

public class Main {
    public static void main(String ...args){
        LinkedList linkedList = new LinkedList();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Append data to list");
        String data = scanner.nextLine();

        System.out.println("Append another data to list");
        String secondData = scanner.nextLine();
        linkedList.append(data);
        linkedList.append(secondData);
        System.out.println("Prepend another data to list");
        String thirdData = scanner.nextLine();

        linkedList.prepend(thirdData);
        System.out.println("I want to delete the first data");
        linkedList.shift();


        System.out.println("Now i'm going to list all nodes data");

        linkedList.listAllNodesdata();
        System.out.println("Remove any above data");
        String dataToRemove = scanner.nextLine();
        linkedList.removeAny(dataToRemove);
        System.out.println(linkedList.head.data);
        //linkedList.listAllNodesdata();





    }
}
