package Homework_2;


public class MyLinkedNode<T> {
     MyLinkedNode<T> next;
     MyLinkedNode<T> prev;
    private T data;


    public MyLinkedNode(T data , MyLinkedNode<T> prev, MyLinkedNode<T> next) {
        this.next = next;
        this.prev = prev;
        this.data = data;
    }

    public MyLinkedNode<T> getNext() {
        return next;
    }

    public void setNext(MyLinkedNode<T> next) {
        this.next = next;
    }

    public MyLinkedNode<T> getPrev() {
        return prev;
    }

    public void setPrev(MyLinkedNode<T> prev) {
        this.prev = prev;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
