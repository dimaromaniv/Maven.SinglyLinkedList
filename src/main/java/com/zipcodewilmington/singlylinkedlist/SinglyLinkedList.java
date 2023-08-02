package com.zipcodewilmington.singlylinkedlist;

import java.util.Comparator;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T> implements LinkedListIface {

    private Node<T> head = null;

    //private


    public SinglyLinkedList() {
    }


    public Boolean isEmpty() {
        return head == null;
    }

    @Override
    public void add(Object data) {
        Node newnode = new Node(data);
        if (this.head == null) {
            this.head = newnode;
        } else {
            Node<T> temp = head;
            while (temp.hasNext()) { // walk to end
                temp = (Node<T>) temp.getNext();
            }
            temp.setNext(newnode);
        }

    }


    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();

        string.append("head -> ");

        Node<T> temp = this.head;
        if (!isEmpty()){
            do{
                string.append("[")
                        .append(temp.getDate())
                        .append("] -> ");
                temp = temp.getNext();

            } while (temp != null);
        }


        string.append("NULL");

        return string.toString();

    }

    @Override
    public void remove(int index) throws IndexOutOfBoundsException {

    }

    @Override
    public Object get(int index) throws IndexOutOfBoundsException {
        return null;
    }

    @Override
    public boolean contains(Object data) {
        return false;
    }

    @Override
    public int find(Object data) {
        if (this.isEmpty()) return -1;
        int found  = -1;
        //??
        Node<T> temp = head;
        do {
            found++;
            if (temp.getDate().equals(data)) return found;
            temp = temp.getNext();
        } while (temp != null);

        return -1;
    }

    @Override
    public int size() {

        if (this.isEmpty()) return 0;
        int n = 0;
        Node<T> temp = head;
        do {
            n++;
            temp = temp.getNext();
        } while (temp != null);
        return n;
    }

    @Override
    public SinglyLinkedList copy() {
        return null;
    }

    @Override
    public void sort(Comparator comparator) {

    }
}
