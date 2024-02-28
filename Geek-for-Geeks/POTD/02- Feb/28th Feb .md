# Question Link -> https://www.geeksforgeeks.org/problems/check-if-a-number-is-divisible-by-83957/1

```cpp

class Solution {
public:
    int DivisibleByEight(string s) {
        int n = s.size();
        int l = stoi(s.substr(max(n - 3, 0)));
        return l % 8 == 0 ? 1 : -1;
    }
};

````
