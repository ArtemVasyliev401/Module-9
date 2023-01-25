package Homework_1;

public class MyListArrTest {
    public static void main(String[] args) {
        MyArrayList<String> cars = new MyArrayList<>();
        //add
        cars.add("Audi");
        cars.add("Mercedes");
        cars.add("Tesla");
        cars.add("Jeep");
        System.out.println("cars = " + cars);

        //size() повертає розмір колекції
        System.out.println("cars.size() = " + cars.size());

        //get(int index) повертає елемент за індексом
        System.out.println("cars.get(4) = " + cars.get(4));

        //remove(int index) видаляє елемент із вказаним індексом
        cars.remove(2);
        System.out.println("cars = " + cars);
        System.out.println("cars.size() = " + cars.size());

        //clear() очищає колекцію
        cars.clear();
        System.out.println("cars = " + cars);
        System.out.println("cars.size() = " + cars.size());

    }



    }

