import java.util.*;

public class MinMaxHeap {
  static class MinHeap {
    List<Integer> heap = new ArrayList<Integer>();

    public MinHeap(List<Integer> array) {
      heap = buildHeap(array);
    }

    public List<Integer> buildHeap(List<Integer> array) {
      int firstParentIdx = (array.size() - 2) / 2;
      for(int currentIdx = firstParentIdx; currentIdx >= 0; currentIdx--) {
        siftDown(currentIdx, array.size() - 1, array);
      }
      return array;
    }

    public void siftDown(int currentIdx, int endIdx, List<Integer> heap) {
       int childIdxOne = (currentIdx * 2) + 1;
       while(childIdxOne <= endIdx) {
         int childIdxTwo = (currentIdx * 2) + 2 <= endIdx ? (currentIdx * 2) + 2 : -1;
         int idxToSwap = childIdxOne;
         if(childIdxTwo != -1 && heap.get(childIdxTwo) < heap.get(childIdxOne)) {
           idxToSwap = childIdxTwo;
         }
         if(heap.get(currentIdx) > heap.get(idxToSwap)) {
           swapAt(currentIdx, idxToSwap, heap);
           currentIdx = idxToSwap;
           childIdxOne = (currentIdx * 2) + 1;
           continue;
         }
         break;
       }
    }

    public void siftUp(int currentIdx, List<Integer> heap) {
      int parentIdx = (currentIdx - 1) / 2;
      while(currentIdx >= 1 && heap.get(currentIdx) < heap.get(parentIdx)) {
        swapAt(currentIdx, parentIdx, heap);
        currentIdx = parentIdx;
        parentIdx = (currentIdx - 1) / 2;
      }
    }

    public int peek() {
       return heap.get(0);
    }

    public int remove() {
       swapAt(0, heap.size() - 1, heap);
       int itemToRemove = heap.get(heap.size() - 1);
       heap.remove(heap.size() - 1);
       siftDown(0, heap.size() - 1, heap);
       return itemToRemove;
    }

    public void insert(int value) {
      heap.add(value);
      siftUp(heap.size() - 1, heap);
    }
    
    public void swapAt(int i, int j, List<Integer> heap) {
      int temp = heap.get(i);
      heap.set(i, heap.get(j));
      heap.set(j, temp);
    }
  }
}
