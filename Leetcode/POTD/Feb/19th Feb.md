# Question Link-> https://leetcode.com/problems/power-of-two/description/

```cpp



class Solution {
public:
    bool isPowerOfTwo(int n) {
        return n > 0 && not (n & n - 1);
    }
};







````
