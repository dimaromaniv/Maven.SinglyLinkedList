package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {

    @Test
    public void testConstructor() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        Assert.assertNotNull(list);
    }


    @Test
    public void testIsEmpty() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.isEmpty();
        Assert.assertTrue(list.isEmpty());
    }

    @Test
    public void testIsEmpty1() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);


        Assert.assertEquals(false, list.isEmpty());
    }

    @Test
    public void testIsEmpty2() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.add(2);

        Assert.assertEquals(false, list.isEmpty());
    }

    @Test
    public void testToString() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        String expected = "head -> NULL";

        Assert.assertEquals(expected, list.toString());
    }

    @Test
    public void testToString1() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        String expected = "head -> [1] -> NULL";
        list.add(1);
        Assert.assertEquals(expected, list.toString());
    }

    @Test
    public void testToString2() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        String expected = "head -> [1] -> [2] -> NULL";

        Assert.assertEquals(expected, list.toString());
    }
    @Test
    public void testSize () {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);

        Assert.assertEquals(1,list.size());
    }
    @Test
    public void testSize1 () {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.add(2);
        Assert.assertEquals(2,list.size());
    }
    @Test
    public void testSize2 () {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Assert.assertEquals(3,list.size());
    }
    @Test
    public void testHasFind() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();

        Assert.assertEquals(-1, list.find(1));
    }

    @Test
    public void testHasFind1() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list .add(4);
        list.add(5);
        list.add(3);

        Assert.assertEquals(1, list.find(5));
    }
    @Test
    public void testHasFind2() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();

        list.add(5);

        Assert.assertEquals(list.size()-1, list.find(5));
    }



}
