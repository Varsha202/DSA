class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int num:nums){
            if(hm.containsKey(num))
                hm.put(num,hm.get(num)+1);
            else
                hm.put(num,1);
        }
        for(int num:nums){
            if(hm.containsKey(num))
                if(hm.get(num)==1)
                    return num;
        }
        return 0;
    }
}