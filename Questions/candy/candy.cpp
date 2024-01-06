#include <vector>

int Solution::candy(vector<int> &A) {
    int n = A.size();
    vector<int> candies(n, 1);

    // Traverse from left to right
    for (int i = 1; i < n; ++i) {
        if (A[i] > A[i - 1]) {
            candies[i] = candies[i - 1] + 1;
        }
    }

    // Traverse from right to left
    for (int i = n - 2; i >= 0; --i) {
        if (A[i] > A[i + 1]) {
            candies[i] = max(candies[i], candies[i + 1] + 1);
        }
    }

    // Calculate the total number of candies
    int total_candies = 0;
    for (int i = 0; i < n; ++i) {
        total_candies += candies[i];
    }

    return total_candies;
}
