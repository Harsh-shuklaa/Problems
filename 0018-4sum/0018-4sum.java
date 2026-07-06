class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
   
      List<List<Integer>> ans  = new ArrayList<>() ;
         Arrays.sort(nums);
       int  n = nums.length;
       for(int i = 0;i<n-3;i++){
           if(i>0 && nums[i] ==nums[i-1]){
           continue;
           }

           for(int j = i+1;j <n-2;j++){
             if(j>i+1 && nums[j]== nums[j-1]){
                continue;
             }
                int left = j+1;
                int right = n-1;
                long sum =(long)target-nums[i]-nums[j];
                while(left<right){
                    long s =(long)nums[left]+nums[right];
                    if(s==sum){
                    ans.add( Arrays.asList (nums[i],nums[j],nums[left],nums[right]));
                    left++;
                    right--;

                    while(left<right && nums[left]==nums[left-1]){
                      left++;
                    }
                    while(left <right  && nums[right]==nums[right+1]){
                      right--;
                    }
                    }

                    else if(s<sum){
                    left++;
                    
                    }
                    else{
                    right--;
                    }


}

           }
           }
           return ans;
}
}