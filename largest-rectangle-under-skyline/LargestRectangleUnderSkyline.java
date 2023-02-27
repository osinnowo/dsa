import java.util.*;

class LargestRectangleUnderSkyline {
  public int largestRectangleUnderSkyline(ArrayList<Integer> buildings) {
    Stack<Integer> pillarIndices = new Stack<Integer>();
    int maxArea = 0;
    ArrayList<Integer> extendedBuildings = new ArrayList<Integer>(buildings);
    extendedBuildings.add(0);
    for(int idx = 0; idx < extendedBuildings.size(); idx++) {
      int height = extendedBuildings.get(idx);
      while(!pillarIndices.isEmpty() && extendedBuildings.get(pillarIndices.peek()) >= height) {
        int pillarHeight = extendedBuildings.get(pillarIndices.pop());
        int width = (pillarIndices.isEmpty()) ? idx: idx - pillarIndices.peek() - 1;
        maxArea = Math.max(width * pillarHeight, maxArea);
      }
      pillarIndices.push(idx);
    }
    return maxArea;
  }
}