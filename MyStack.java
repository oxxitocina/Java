package com.company;
import java.util.*;

public class MyStack<T> {

        LinkedList<T> myStack = new LinkedList<>();

        public T push(T newItem){
            myStack.addLast(newItem);
            return newItem;
        }

        public boolean empty(){
            boolean a = false;
            if(myStack.size() == 0){
                a = true;
            }
            return a;
        }

        public T peek()
        {
            return myStack.get(myStack.size()-1);
        }

        public T pop(){
            return myStack.remove(myStack.size()-1);
        }

        public int size(){
            return myStack.size();
        }
}
