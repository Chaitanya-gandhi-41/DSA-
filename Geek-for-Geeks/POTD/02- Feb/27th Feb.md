# Question Link-> https://www.geeksforgeeks.org/problems/play-with-or5515/1

```cpp

int* game_with_number(int arr[], int n)
{
    for(int i = 0 ; i < n - 1; ++i){
        arr[i] |= arr[i+1];
    }
    return arr;
}

````
