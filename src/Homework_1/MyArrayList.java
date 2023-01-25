package Homework_1;

import java.util.Arrays;
import java.util.StringJoiner;

public class MyArrayList<T> {
    private static final int CAPACITY = 8;
    private Object[] data;
    private int size;
    public MyArrayList(){
        data = new Object[CAPACITY];
    }
    

    //add(Object value) додає елемент в кінець
    public void add(T value){
        if(size == data.length){
            System.out.println("Resie happened");
            int newSize = data.length*2;
            Object [] newData = new Object [newSize];
            System.arraycopy(data,0,newData,0,data.length);
         data = newData;
        }
        data[size] = value;
        size++;
    }

    //get(int index) повертає елемент за індексом
    public T get (int i){
        if(data[0]== null){
            throw new IndexOutOfBoundsException("The array is empty");
        }

        return (T)data[i-1];
    }

    //remove(int index) видаляє елемент із вказаним індексом
    public  void remove( int index) {
        index = index-1;
        if(index > data.length || data[index]==null || index < 0){
            System.out.println("Sorry, you entered the wrong value!");
            throw new IndexOutOfBoundsException("Sorry, you entered the wrong value. Array size = "+ size);
        }
        if (index < size) {
            data[index] = null;
            for (int j = 0; j < size; j++) {
                if (data[j] == null) {
                    data[j] = data[j + 1];
                    data[j + 1] = null;
                }
            }
            size--;
        }

    }

    //size() повертає розмір колекції
    public int size(){
        return size;

    }
    //clear() очищає колекцію
    public void clear(){
        for (int i = 0; i < size; i++) {
            data[i] = null;
        }
        size = 0;
        data = Arrays.copyOf(data, CAPACITY);
    }

    @Override
    public String toString() {
        StringJoiner result = new StringJoiner(", ");
        for (int i = 0; i < size; i++) {
            result.add(data[i].toString());
        }
        return "[" + result + "]";
    }
}





