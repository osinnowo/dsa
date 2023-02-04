import java.util.*;

public class FindTheKthLargestNumber {
    public int findKthLargestNumber1(int[] nums, int k) { 
        PriorityQueue<Integer> q = new PriorityQueue<Integer>(k); 
        for(int i: nums){
            q.offer(i);
            if(q.size() > k ){ 
                q.poll();
            } 
        }
        return q.peek();
    }

    public int findKthLargestNumber2(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}
