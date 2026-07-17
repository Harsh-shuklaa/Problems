class Solution {
    public int[][] insertedArray(int[][] intervals, int[] newInterval) {
        List<int[]> newArray = new ArrayList<>();
           
            boolean insert = false;
       for(int i =0;i<intervals.length;i++){   
            if (!insert && intervals[i][0]>=newInterval[0]) {
                newArray.add(newInterval);
                insert =true;
            }
            newArray.add(intervals[i]);
}
            if(!insert) {
                newArray.add(newInterval);
        }
       return newArray.toArray(new int[newArray.size()][]); 
    }

    public int[][] insert(int[][] intervals, int[] newInterval) {

    int[][] newArray = insertedArray(intervals, newInterval);

         List<int[]>ans = new ArrayList<>();
         int start1 = newArray[0][0];
         int end1 = newArray[0][1];

         for(int i = 1;i<newArray.length;i++){
             int start2 = newArray[i][0];
             int end2 = newArray[i][1];

             boolean overlapping = (end1>=start2);

             if(overlapping){
                start1=start1;
                end1=Math.max(end1,end2);
             }
             else{
                ans.add(new int[]{start1,end1});
                start1=start2;
                end1=end2;
             }
            
         }
         ans.add(new int[]{start1,end1});
         return ans.toArray(new int[ans.size()][]);
    }
}