### Question Link-> https://www.geeksforgeeks.org/problems/does-array-represent-heap4345/1

```cpp

class Solution {
public:
    bool isMaxHeap(int arr[], int n)
    {
        int st = n / 2;
        for(int i = st; i >= 0; --i){
            if((i*2 + 1 < n && arr[i] < arr[i*2 + 1]) || (i*2 + 2 < n) && arr[i] < arr[i*2 + 2])
                return false;
        }
        return true;
    }
};
```
