class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stk = new Stack<>();
        int maxArea = 0;
        for (int iter = 0; iter <= heights.length; iter++) {
            int currHeight = (iter == heights.length) ? 0 : heights[iter];
            while (!stk.isEmpty() && currHeight < heights[stk.peek()]) {
                int height = heights[stk.pop()];
                int width;

                if (stk.isEmpty()) {
                    width = iter;
                } else {
                    width = iter - stk.peek() - 1;
                }
                int area = height * width;
                maxArea = Math.max(maxArea, area);
            }
            stk.push(iter);
        }
        return maxArea;
    }
}
