class Pair {
    int key;
    int value;

    Pair(int key , int value){
       this.key = key;
       this.value= value;
    }

    int getKey(){
         return key;
    }
    int getValue(){
         return value;
    }
}


class Solution {

    int[] nearestSmallerLeftIdx(int[] heights) {
        Stack<Pair>s = new Stack <>();
        int[]left=new int[heights.length];
        int pseudoIdx = -1;

        for(int i = 0;i<heights.length;i++){
            if(s.isEmpty()){
                left[i]=pseudoIdx;
            }
            else if(!s.isEmpty() &&  s.peek().getValue()<heights[i]){
                left[i]=s.peek().getKey();
            }
            else if(!s.isEmpty() &&  s.peek().getValue()>=heights[i]){
                while(!s.isEmpty() && s.peek().getValue()>=heights[i]){
                    s.pop();
                }
                if(s.isEmpty()){
                     left[i]=pseudoIdx;
                }
                else if(s.peek().getValue()<heights[i]){
                    left[i]=s.peek().getKey();
                }
            }
            s.push(new Pair(i,heights[i]));

        }
        return left;
    }

    int[] nearestSmallerRightIdx(int[] heights) {
 Stack<Pair>s = new Stack <>();
        int[]right=new int[heights.length];
        int pseudoIdx = heights.length;

        for(int i = heights.length-1;i>=0;i--){
            if(s.isEmpty()){
                right[i]=pseudoIdx;
            }
            else if(!s.isEmpty() &&  s.peek().getValue()<heights[i]){
                right[i]=s.peek().getKey();
            }
            else if(!s.isEmpty() &&  s.peek().getValue()>=heights[i]){
                while(!s.isEmpty() && s.peek().getValue()>=heights[i]){
                    s.pop();
                }
                if(s.isEmpty()){
                     right[i]=pseudoIdx;
                }
                else if(s.peek().getValue()<heights[i]){
                    right[i]=s.peek().getKey();
                }
            }
            s.push(new Pair(i,heights[i]));
        }
        return right;
    }

    public int largestRectangleArea(int[] heights) {
       int right[] =  nearestSmallerRightIdx(heights);
        int left[] =  nearestSmallerLeftIdx(heights);
        int[] width = new int[heights.length ];
        int[] area = new int[heights.length];
        int maxArea = 0;
        for (int i = 0; i < heights.length; i++) {
            int w = right[i] - left[i] - 1;
            width[i]=w;
        }

        for (int i = 0; i < heights.length; i++) {
            int a = heights[i] * width[i];
            area[i]=a;
              maxArea = Math.max(maxArea, a);
        }

        // for(int i = 0;i<heights.length;i++){

        //  maxArea = Math.max(maxArea, area[i]);
        //  }
        return maxArea;

    }
}