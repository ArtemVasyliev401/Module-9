package Homework_3;

import java.util.StringJoiner;
import java.util.Arrays;

public class MyQueue<T> {
    private static final int INIT_SIZE = 8;
    private Object[] data;

    private int index;
    public MyQueue(){
        data = new Object[INIT_SIZE];
    }

    //add(Object value) додає елемент в кінець
    public void add(T value){
        if(index == data.length){
            System.out.println("Resie happened");
            int newSize = data.length*2;
            Object [] newData = new Object [newSize];
            System.arraycopy(data,0,newData,0,data.length);
            data = newData;
        }
        data[index] = value;
        index++;
    }

    //clear() очищає колекцію
    public void clear(){
        for (int i = 0; i < index; i++) {
            data[i] = null;
        }
        index = 0;
        data = Arrays.copyOf(data, INIT_SIZE);
    }

    //size() повертає розмір колекції
    public int size() {
        return index;
    }

    //peek() повертає перший елемент з черги
   public T peak(){
       if(data[0]== null){
           throw new IndexOutOfBoundsException("The queue is empty");
       }
        return (T) data[0];
    }

    //poll() повертає перший елемент з черги і видаляє його з колекції
    public T poll(){
        if(data[0]== null){
            throw new IndexOutOfBoundsException("The queue is empty");
        }
        Object firstElement = data[0];
            data[0] = null;

            for (int j = 0; j < index - 1; j++) {
                if (data[j] == null) {
                    data[j] = data[j + 1];
                    data[j + 1] = null;
                }
            }
            index--;
            return (T) firstElement ;
        }

    @Override
    public String toString() {
        StringJoiner result = new StringJoiner(", ");
        for (int i = 0; i < index; i++) {
            result.add(data[i].toString());
        }
        return "[" + result + "]";
    }

    }

