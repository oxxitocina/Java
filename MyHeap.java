package com.company;
import java.util.*;

class MyHeap <T extends Comparable<T>> {

    ArrayList<T> heap = new ArrayList<T>();

    private int ParentIndex(int i) {
        return i / 2;
    }
    private T Parent(int i) {
        return heap.get(ParentIndex(i));
    }

    private void heapifyUp(int i) {
        while (i > 0 && Parent(i).compareTo(heap.get(i)) < 0) {
            T temp = heap.get(ParentIndex(i));
            heap.set(ParentIndex(i), heap.get(i));
            heap.set(i, temp);
            i = ParentIndex(i);
        }
    }

    private void heapifyDown(int i) {
        int maxI = i;
        int leftI = 2*i;
        int rightI = 2*i+1;
        T max = heap.get(maxI);
        T left = heap.get(leftI);
        T right = heap.get(rightI);

        while (i < heap.size()) {
            if ( max.compareTo(left) < 0) {
                max = left;
                maxI = leftI;
            }
            if ( max.compareTo(right) < 0) {
                max = right;
                maxI = rightI;
            }
            if (maxI != i) {
                T temp = heap.get(i);
                heap.set(i, heap.get(maxI));
                heap.set(maxI, temp);
                i = maxI;  
            }
            else {
                break;
            }
        }
    }

    public boolean remove(T item){
        int a = 0;
        for(int i = 0; i < heap.size(); i++){
            if(heap.get(i).equals(item)){
                int size = heap.size()-1;
                heap.set(i, heap.get(size));
                heap.set(size, null);
              heapifyDown(0);
              return true;
            }
        }
        return false;
    }

    public void add(T item) {
        heap.add(item);
        heapifyUp(heap.size()-1);
    }

    public T removeRoot() {
        T root = heap.get(0);
        remove(root);
        return root;
    }

    public T peek() {
        return heap.get(0);
    }
}
