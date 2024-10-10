import java.util.Stack;

class Solution {
  public int maxWidthRamp(int[] nums) {
      Stack<Integer> stack = new Stack<>();

      for(int i=0; i<nums.length; i++){
          if(stack.isEmpty() || nums[stack.peek()] > nums[i]){
              stack.push(i);
          }
      }

      int maxRampWidth = 0;
      for(int j=nums.length-1; j>=0; j--){
          while(!stack.isEmpty() && nums[stack.peek()] <= nums[j]){
              int i = stack.pop();
              maxRampWidth =  Math.max(maxRampWidth, j - i);
          }
      }
      return maxRampWidth;
  }
}
