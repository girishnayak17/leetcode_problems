class Solution {
    public int lengthOfLongestSubstring(String s) {
       int count=1,temp=0;
       StringBuilder sub = new StringBuilder();
       
       if(s.length() == 0){
        return 0;
       }
       
       for(int i=0; i< s.length();i++){
          
          
          for(int j=0;j<sub.length() ; j++){
            if(sub.charAt(j) == s.charAt(i)){
                sub.delete(0,j+1);
                temp=sub.length();
                break;
                
            }
          }
            temp++;
            sub.append(s.charAt(i));

            if(temp > count){
            count = temp;
          }
            
          }
       
       return count;
    }
}