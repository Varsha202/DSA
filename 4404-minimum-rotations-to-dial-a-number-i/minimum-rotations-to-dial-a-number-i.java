class Solution {
    public int minRotations(String s) {
        int curr=0,tot=0;
        for(int i=0;i<s.length();i++){
            int next=s.charAt(i)-'0';
            int diff=Math.abs(curr-next);
            tot+=Math.min(diff,10-diff);
            curr=next;
        }
        return tot;
    }
}