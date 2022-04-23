package com.company;
import java.util.*;

public class MyQueue {


    public static class Queue<T>{

        LinkedList<T> myQueue = new LinkedList<>();

        public boolean empty(){
            boolean a = false;
            if(myQueue.size() == 0){
                a = true;
            }
            return a;
        }

        public int size(){
            return (int) myQueue.get(myQueue.size());
        }

        public T peek(){
            return myQueue.getFirst();
        }
        public T enqueue(T newItem){
            myQueue.addLast(newItem);
            return newItem;
        }
        public T dequeue(){
            return myQueue.removeFirst();
        }

    }

}