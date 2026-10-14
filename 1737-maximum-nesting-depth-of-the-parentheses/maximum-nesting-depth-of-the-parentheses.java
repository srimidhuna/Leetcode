class Solution {
    public int maxDepth(String s) {
        
       int maxNestingDepth=Integer.MIN_VALUE;
       int currentMaxNestingDepth=0;
       
       for(int i=0;i<s.length();i++){
           char ch=s.charAt(i);
           if(ch=='('){
              currentMaxNestingDepth+=1;
           }
           if(ch==')'){
              currentMaxNestingDepth-=1;
           }
           maxNestingDepth=Math.max(maxNestingDepth,currentMaxNestingDepth);
       }
       return maxNestingDepth;

    }
}