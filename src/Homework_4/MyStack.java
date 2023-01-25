package Homework_4;

public class MyStack<T> {
    private MyStackNode<T> head;
    private MyStackNode<T> tail;
    private int size;


    //push(Object value) додає елемент в кінець
    public void push(T val) {
        MyStackNode<T> temp = new MyStackNode<>(val);
        temp.next = head;
        head = temp;
        if (tail == null) {
            tail = temp;

        }
        size++;
    }

    //size() повертає розмір колекції
    public int size() {
        return size;
    }
    //peek() повертає перший елемент стеку
    public T peek(){
        if (head == null) {
            throw new IndexOutOfBoundsException("List is empty");
        }

        return (T) head.getValue();
    }

    //pop() повертає перший елемент стеку та видаляє його з колекції
    public T pop(){
        if (head == null) {
            throw new IndexOutOfBoundsException("List is empty");
        }

        T popNode = head.getValue();
        head = head.next;
        size --;
        return (T) popNode;
    }

    //get(int index) повертає елемент за індексом
    public T get(int index) {
        if (head == null) {
            throw new IndexOutOfBoundsException("List is empty");
        }
        if( index > size ){
            throw new IndexOutOfBoundsException("You entered an invalid collection size value " + size);
        }
        if (head == null) {
            throw new IndexOutOfBoundsException("List is empty");
        }
        MyStackNode<T> search = head;
        for (int j = 0; j < index-1; j++) {
            search = search.getNext();

        }
        return search.getValue();
    }


    //remove(int index) видаляє елемент із вказаним індексом
    public void remove(int index) {
        if (head == null) {
            throw new IndexOutOfBoundsException("List is empty");
        }
        if( index > size ){
            throw new IndexOutOfBoundsException("You entered an invalid collection size value " + size);
        }

        if(index == 0 || index == 1) {
            head = head.next;

        }else{
            MyStackNode currentMyStackNode = head;
            for(int i = 1; i < index - 1; i ++) {
                currentMyStackNode = currentMyStackNode.next ;
            }
            currentMyStackNode.next = currentMyStackNode.next.next;

        }
        size --;
    }


    //clear() очищає колекцію
    public void clear(){
        head = null;
        size = 0;

    }


    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        MyStackNode<T> temp = head;
        while(temp!=null){
            builder.append(temp.getValue()).append(", ");
            temp = temp.next;
        }
        return builder.toString();
    }
}

