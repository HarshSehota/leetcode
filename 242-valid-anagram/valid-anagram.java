import java.util.Arrays;
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()==t.length()){
        char[] charArray1 = s.toCharArray();
        char[] charArray2 = t.toCharArray();
          Arrays.sort(charArray1);
         Arrays.sort(charArray2);
         String s1 = new String(charArray1);
         String t1 = new String(charArray2);
         
         if(s1.equals(t1)) {
            return true;
        } 
       
        
    
}
 return false;
}
}