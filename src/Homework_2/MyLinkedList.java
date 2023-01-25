package Homework_2;

public class MyLinkedList<T> {
        private MyLinkedNode<T> head;
        private MyLinkedNode<T> tail;
        private int size;

    public MyLinkedList() {
        this.tail = new MyLinkedNode<T>(null,head,null);
        this.head = new MyLinkedNode<T>(null,null,tail);
    }

    //add(Object value) додає елемент в кінець
        public void add(T data){
        MyLinkedNode prev = tail;
         prev.setData(data);
        tail = new MyLinkedNode<>(null,prev,null);
        prev.setNext(tail);

            size++;
    }

    //get(int index) повертає елемент за індексом
        public T get(int index){
            if (head == null) {
                throw new IndexOutOfBoundsException("List is empty");
            }
            if( index > size ){
                throw new IndexOutOfBoundsException("You entered an invalid collection size value " + size);
            }
        MyLinkedNode<T> getIndex = head.getNext();
            for (int i = 0; i < index; i++) {
                getIndex = getNextElement(getIndex);
            }
            return getIndex.getData();
         }
         private MyLinkedNode<T> getNextElement (MyLinkedNode<T> nextElement){
                return nextElement.getNext();
    }

    //remove(int index) видаляє елемент із вказаним індексом
         public void remove(int index){
             if (head == null) {
                 throw new IndexOutOfBoundsException("List is empty");
             }
             if( index > size ){
                 throw new IndexOutOfBoundsException("You entered an invalid collection size value " + size);
             }
             MyLinkedNode<T> removeIndex = head;
             for (int i = 0; i < index; i++) {
                 removeIndex = getNextElement(removeIndex);
             }
             removeIndex.setNext(removeIndex.getNext().getNext());
             removeIndex = removeIndex.getNext();
             removeIndex.setPrev(removeIndex.getPrev().getPrev());

             size--;
    }

    //clear() очищає колекцію
         public void clear(){
             head = null;
             tail = null;
             size = 0;

    }

    //size() повертає розмір колекції
    public int size(){
        return size;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i < size +1 ; i++) {
            if(get(i)!= null) {
                builder.append(get(i)).append(", ");
            }
        }
        return builder.toString();
    }


}
