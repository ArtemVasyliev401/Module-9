package Homework_4;

public class MyStackNode<T>{
    public MyStackNode<T> next;
    private T value;


    public MyStackNode(T value) {
        this.value = value;
    }

    public MyStackNode<T> getNext() {
        return next;
    }
    public T getValue() {
        return value;
    }
    public void setNext(MyStackNode<T> next) {
        this.next = next;
    }
    public void setValue(T value) {
        this.value = value;
    }

}
