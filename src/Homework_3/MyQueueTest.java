package Homework_3;


public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue<String> planets = new MyQueue<>();

        //add(Object value) додає елемент в кінець
        planets.add("Mars");
        planets.add("Jupiter");
        planets.add("Venera");
        planets.add("Earth");
        System.out.println("list = " + planets);

        //size() повертає розмір колекції
        System.out.println("planets.size() = " + planets.size());

        //peek() повертає перший елемент з черги
        System.out.println("planets.peak() = " + planets.peak());

        //poll() повертає перший елемент з черги і видаляє його з колекції
        System.out.println("planets.poll() = " + planets.poll());
        System.out.println("planets.size() = " + planets.size());

        //clear() очищає колекцію
        planets.clear();
        System.out.println("planets = " + planets);
        System.out.println("planets.size() = " + planets.size());
    }
}
