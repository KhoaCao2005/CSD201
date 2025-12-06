/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session7.hashing;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author khoac
 */
class Node<K, V> {

    K key;
    V value;

    public Node(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("(%d,%s)", key, value);
    }
}

public class HashTable<K, V> {

    private int tableSize;
    private List<Node<K, V>> buckets[];
    private int size;

    public HashTable(int tableSize) {
        this.tableSize = tableSize;
        this.buckets = new List[tableSize];
        this.size = 0;
        for (int i = 0; i < tableSize; i++) {
            this.buckets[i] = new LinkedList<>();
        }
    }

    public int getSize() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int hash(K key) {
        return Objects.hashCode(key) % this.tableSize;
    }

    public void put(K key, V value) {
        int index = this.hash(key);
        List<Node<K, V>> bucket = this.buckets[index];
        for (Node<K, V> node : bucket) {
            if (node.key.equals(key)) {
                throw new IllegalStateException("Key already exists.");
            }
        }
        bucket.add(new Node(key, value));
        this.size++;
    }

    public V get(K key) {
        int index = this.hash(key);
        List<Node<K, V>> bucket = this.buckets[index];
        for (Node<K, V> node : bucket) {
            if (node.key.equals(key)) {
                return node.value;
            }
        }
        return null;
    }

    public V remove(K key) {
        int index = this.hash(key);
        List<Node<K, V>> bucket = this.buckets[index];
        for (Node<K, V> node : bucket) {
            if (node.key.equals(key)) {
                bucket.remove(node);
                this.size--;
                return node.value;
            }
        }
        return null;
    }

    public void show() {
        for (int i = 0; i < this.tableSize; i++) {
            System.out.print(i + ": ");
            System.out.println(this.buckets[i]);
        }
    }

    public static void main(String[] args) {
        HashTable<Integer, String> ht = new HashTable<>(3);
        ht.put(1, "Nam");
        ht.put(2, "Minh");
        ht.put(3, "Thanh");
        ht.put(4, "Tuan");
        ht.put(5, "Chien");
        System.out.println(ht.get(1));
        System.out.println(ht.get(5));
        ht.show();
        ht.remove(2);
        ht.show();
    }
}
