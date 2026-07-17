class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0] , b[0]));
        List<int[]> ans = new ArrayList<>();
        int start1 = intervals[0][0];
        int end1 = intervals[0][1];
      

        for (int i = 1; i < intervals.length; i++) {
            int start2 = intervals[i][0];
            int end2 = intervals[i][1];
            boolean overlapping = end1 >= start2;

            if (overlapping) {
                // Merge the intervals
                start1=start1;
                end1 = Math.max(end1, end2);
             continue;
           }
                ans.add(new int[] { start1, end1 });
                start1 = start2;
                end1 = end2;
    }
        ans.add(new int[] { start1, end1 });
        return ans.toArray(new int[ans.size()][]);

    }

}