class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int[] left =new int[n];
        int[] right=new int[n];
        int[] res=new int[n];
        left[0]=0;
        for(int i=1;i<n;i++){
            left[i]=left[i-1]+nums[i-1];
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        for(int i=0;i<n;i++){
            right[i]=sum-nums[i];
            sum=right[i];
        }
        for(int i=0;i<n;i++){
            res[i]=Math.abs(right[i]-left[i]);
        }
        return res;
    }
}