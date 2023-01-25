package Homework_4;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack<String> cities = new MyStack<>();

        //push(Object value) додає елемент в кінець
        cities.push("Kyiv");
        cities.push("Lviv");
        cities.push("Poltava");
        cities.push("Kremenchuk");
        cities.push("Dnipro");
        System.out.println("cities = " + cities);


        System.out.println("cities.size() = " + cities.size());

        //peek() повертає перший елемент стеку
        System.out.println("cities.peek() = " + cities.peek());

        //pop() повертає перший елемент стеку та видаляє його з колекції
        System.out.println("cities.pop() = " + cities.pop());
        System.out.println("cities.size() = " + cities.size());
        System.out.println("cities = " + cities);

        //remove(int index) видаляє елемент за індексом
        cities.remove(3);
        System.out.println("cities.size() = " + cities.size());
        System.out.println("cities = " + cities);

        //clear() очищає колекцію
        cities.clear();
        System.out.println("cities.size() = " + cities.size());
        System.out.println("cities = " + cities);
    }

}




