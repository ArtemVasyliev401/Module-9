package Homework_5;





public class MyHashMapTest {
    public static void main(String[] args) {
        MyHashMap<String, Integer> fruitPrices = new MyHashMap<>();

        //put(Object key, Object value) додає пару ключ + значення
        fruitPrices.put("Apple",10);
        fruitPrices.put("Pear",9);
        fruitPrices.put("Orange",11);
        fruitPrices.put("Banana",12);
        fruitPrices.put("Kiwi",7);

        //size() повертає розмір колекції
        System.out.println("fruitPrices.size() = " + fruitPrices.size());

        //get(Object key) повертає значення (Object value) за ключем
        System.out.println("fruitPrices.get(Pear) = " + fruitPrices.get("Pear"));

        //remove(Object key) видаляє пару за ключем
        System.out.println("fruitPrices.remove(Banana) = " + fruitPrices.remove("Banana"));
        System.out.println("fruitPrices = " + fruitPrices);
        System.out.println("fruitPrices.size() = " + fruitPrices.size());

        //clear() очищає колекцію
        fruitPrices.clear();
        System.out.println("fruitPrices.size() = " + fruitPrices.size());
        System.out.println("fruitPrices = " + fruitPrices);




    }
}
