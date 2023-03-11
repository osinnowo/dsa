using System;
using System.Collections.Generic;
public class Program {
	public class MinMaxHeap {
		public List<int> heap = new List<int>();

		public MinHeap(List<int> array) {
			heap = buildHeap(array);
		}

		public List<int> buildHeap(List<int> array) {
			int firstParentIdx = (array.Count - 2) / 2;
            for(int i = firstParentIdx; i >= 0; i--) {
                siftDown(i, array.Count - 1, array);
            }
            return array;
		}

		public void siftDown(int currentIdx, int endIdx, List<int> heap) {
			int childOneIdx = (currentIdx * 2) + 1;
            while(childOneIdx <= endIdx) {
                int childTwoIdx = (currentIdx * 2) + 2 <= endIdx ? (currentIdx * 2) + 2 : -1;
                int idxToSwap = childOneIdx;
                if(childTwoIdx != -1 && heap[childTwoIdx] < heap[childOneIdx]) {
                    idxToSwap = childTwoIdx;
                }
                if(heap[idxToSwap] < heap[currentIdx]) {
                    swapAt(idxToSwap, currentIdx, heap);
                    currentIdx = idxToSwap;
                    childOneIdx = (currentIdx * 2) + 1;
                    continue;
                } 
                return;
            }
		}

		public void siftUp(int currentIdx, List<int> heap) {
			int parentIdx = (currentIdx - 1) / 2;
            while(currentIdx >= 1 && heap[currentIdx] < heap[parentIdx]) {
                swapAt(currentIdx, parentIdx, heap);
                currentIdx = parentIdx;
                parentIdx = (currentIdx - 1) / 2;
            }
		}

		public int Peek() {
    		return heap[0];
		}

		public int Remove() {
            swapAt(0, heap.Count - 1, heap);
            int itemToRemove = heap[heap.Count - 1];
            heap.RemoveAt(heap.Count - 1);
            siftDown(0, heap.Count - 1, heap);
            return itemToRemove;
		}

		public void Insert(int value) {
			heap.Add(value);
            siftUp(heap.Count - 1, heap);
		}

        public void swapAt(int i, int j, List<int> heap) {
            int temp = heap[i];
            heap[i] = heap[j];
            heap[j] = temp;
        }
	}
}
