class MinHeap {
    constructor(array) {
      this.heap = this.buildHeap(array);
    }
  
    buildHeap(array) {
      let firstParentIdx = Math.floor((array.length - 2) / 2);
      for(let currentIdx = firstParentIdx; currentIdx >= 0; currentIdx--) {
        this.siftDown(currentIdx, array.length - 1, array);
      }
      return array;
    }
  
    siftDown(currentIdx, endIdx, heap) {
      let childOneIdx = (currentIdx * 2) + 1;
      while(childOneIdx <= endIdx) {
        let childTwoIdx = (currentIdx * 2) + 2 <= endIdx ? (currentIdx * 2) + 2 : -1;
        let idxToSwap = childOneIdx;
        if(childTwoIdx != -1 && heap[childTwoIdx] < heap[childOneIdx]){
            idxToSwap = childTwoIdx;
        }
        if(heap[idxToSwap] < heap[currentIdx]){
            this.swapAt(idxToSwap, currentIdx, heap);
            currentIdx = idxToSwap;
            childOneIdx = (currentIdx * 2) + 1;
            continue;
        }
        break;
      }
    }
  
    siftUp(currentIdx, heap) {
      let parentIdx = Math.floor((currentIdx - 1) / 2);
      while(currentIdx >= 1 && heap[currentIdx] < heap[parentIdx]) {
        this.swapAt(parentIdx, currentIdx, heap);
        currentIdx = parentIdx;
        parentIdx = Math.floor((currentIdx - 1) / 2);
      }
    }
  
    peek() {
      return this.heap[0];
    }
  
    remove() {
      this.swapAt(0, this.heap.length - 1, this.heap);
      const itemToRemove = this.heap.pop();
      this.siftDown(0, this.heap.length - 1, this.heap);
      return itemToRemove;
    }
  
    insert(value) {
      this.heap.push(value);
      this.siftUp(this.heap.length - 1, this.heap);
    }
    swapAt(i, j, heap) {
        [heap[i], heap[j]] = [heap[j], heap[i]];
    }
}
  
exports.MinHeap = MinHeap;