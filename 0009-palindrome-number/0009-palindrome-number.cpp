class Solution {
public:
    bool isPalindrome(int x) {
        string str = to_string(x);
        string ptr = str;
        reverse(str.begin(),str.end());
        if(str == ptr)
        return true;
        else
        return false;
    }
};