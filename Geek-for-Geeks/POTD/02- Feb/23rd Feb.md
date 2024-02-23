# Question Link-> https://www.geeksforgeeks.org/problems/buy-and-sell-a-share-at-most-twice/1

```cpp
class Solution {
public:
    int maxProfit(vector<int>& price) {
        int n = price.size();
        vector<int> left(n, 0);
        int nin = price[0];
        int out = 0;
        for (int i = 1; i < n; ++i) {
            nin = min(nin, price[i]);
            left[i] = max(left[i - 1], price[i] - nin);
            out = max(out, left[i]);
        }
        
        int nax = price[n - 1];
        for (int i = n - 2; i > 0; --i) {
            nax = max(nax, price[i]);
            out = max(out, left[i - 1] + nax - price[i]);
        }
        return out;
    }
};

```
