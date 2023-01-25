package Homework_5;

public class MyHashMap<K, V> {
    private MyHashMapNode<K, V>[] bucket;
    private static final int CAPACITY = 16;
    private int size;

    static class MyHashMapNode<K, V> {
        K key;
        V value;
        MyHashMapNode<K, V> next;

        public MyHashMapNode(K key, V value, MyHashMapNode<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }

    public MyHashMap() {
        bucket = new MyHashMapNode[CAPACITY];
    }

    private int hash(K key) {
        return Math.abs(key.hashCode()) % CAPACITY;
    }

    //put(Object key, Object value) додає пару ключ + значення
    public void put(K key, V value){
            if (null == key)if (null == key) {
                throw new IndexOutOfBoundsException("Key cannot be null");
            }

            int hash = hash(key);
            MyHashMapNode <K, V> add = new MyHashMapNode<>(key,value,null);
            if (bucket[hash] == null){
                bucket[hash] = add;
            }else {
                MyHashMapNode <K, V> currient  = bucket[hash];
                while (currient != null){
                    if(currient.key.equals(key)){
                        currient.value = value;
                    }else {
                        if(currient.next == null){
                            currient.next = add;
                            return;
                        }
                        currient.next = currient;
                    }
                }
            }
                size++;
        }

    //size() повертає розмір колекції
    public int size() {
        return size;
    }

    //get(Object key) повертає значення (Object value) за ключем
    public V get(K key) {
        if (null == key) {
            throw new IndexOutOfBoundsException("Key cannot be null");
        }
        int hash = hash(key);
        MyHashMapNode<K, V> node = bucket[hash];
        if (node == null) return null;
        while (node != null) {
            if (node.key.equals(key)) {
                return node.value;
            } else {
                node = node.next;
            }
        }
        return null;
    }

    //remove(Object key) видаляє пару за ключем
    public boolean remove(K key){
        if(key == null) return false;
        int hash = hash(key);
        MyHashMapNode<K,V> b = bucket[hash];
        if(null == b) return false;
        MyHashMapNode<K,V> prev = null;
        while(null !=b){
            if(b.key.equals (key)){
                //delete
                if(prev == null) {  // first node to remove
                    bucket[hash]=b.next;
                }else{
                    prev.next = b.next;
                }
                size--;
                return true;
            }else{
                prev=b;
                b =b.next;
            }
        }
        return false;
    }

    //clear() очищає колекцію
    public void clear(){
        bucket = new MyHashMapNode[0];
        bucket = new MyHashMapNode[CAPACITY];
        size = 0;

    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        if (size == 0){
            builder.append("The collection is empty.");
        }
        for (MyHashMapNode m : bucket) {
            if (m != null) {
                builder.append(" [" + m.getKey()).append(", " + m.getValue()+"]");
            }
        }
        return builder.toString();
    }
}
