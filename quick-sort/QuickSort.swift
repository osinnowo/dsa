class QuickSort {
  func quickSort(_ array: inout [Int]) -> [Int] {
    quickSort(&array, 0, array.count - 1)
    return array
  }

  func quickSort(_ array: inout[Int], _ start: Int, _ end: Int) {
    if(start >= end) { return }
    var left = start
    var right = end
    var pivot = array[(start + end) / 2]
    while (left <= right) {
      while(array[left] < pivot) { left += 1}
      while(array[right] > pivot) { right -= 1 }
      if(left <= right) {
        (array[left], array[right]) = (array[right], array[left])
        left += 1; right -= 1
      }
    }
    quickSort(&array, start, right)
    quickSort(&array, left, end)
  }
}