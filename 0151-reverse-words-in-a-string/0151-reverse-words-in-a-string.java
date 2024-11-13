class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String[] arr = s.split(" ");
        String s1= "";
        for(int i = arr.length-1;i>=0;i--){
            if(arr[i]=="")
                continue;
            if(i==0){
                s1 = s1+arr[i];
            }
            else
                s1 = s1+arr[i]+" ";
        }
        return s1;
    }
}
