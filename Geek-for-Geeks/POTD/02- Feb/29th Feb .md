# Question Link -> https://www.geeksforgeeks.org/problems/sum-of-bit-differences2937/1

```cpp
class Solution {
public:
    long long sumBitDifferences(int arr[], int n) {
        long long out = 0;
        for(int i=0; i<32; ++i){
            long long one = 0;
            for(int j = 0; j < n; ++j)
                if((arr[j]&(1<<i))!=0)
                    ++one;
            long long zero = n - one;
            out += 2*one*zero;
        }
        return out;
    }
};
```
