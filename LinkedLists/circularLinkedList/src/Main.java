public class Main {
    public static void main(String... args){
        CircularLinkedLists circularLinkedLists = new CircularLinkedLists();
        circularLinkedLists.prepend("44");
        circularLinkedLists.append("22");
        circularLinkedLists.append("23");
        circularLinkedLists.append("24");
        circularLinkedLists.prepend("33");
        circularLinkedLists.removeAny("55");
        circularLinkedLists.pop();
        circularLinkedLists.unshift();
        circularLinkedLists.list();
    }
}
