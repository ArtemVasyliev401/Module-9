package Homework_2;

public class MyTestLinkedList {
    public static void main(String[] args) {
        MyLinkedList<String> name = new MyLinkedList<>();

        name.add("Artem");
        name.add("Petro");
        name.add("Vasyl");
        name.add("Sergiy");
        System.out.println("name = " + name);
        //size
        System.out.println("name.size() = " + name.size());
        //remove
        name.remove(1);
        System.out.println("name = " + name);
        //get
        System.out.println("name.get(2) = " + name.get(2));
        //clear
        name.clear();
        System.out.println("name = " + name);


    }
}
