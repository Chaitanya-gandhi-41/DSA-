```cpp
//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;


// } Driver Code Ends

class Solution {
public:
    long long numberOfPathUtil(int i, int j, int k, int n, vector<vector<int>>& arr, vector<vector<vector<long long>>>& dp) {
        // Base case: If sum becomes negative or index goes out of bound
        if (i >= n || j >= n || k < 0)
            return 0;

        // If we have reached the bottom-right cell and collected required coins
        if (i == n - 1 && j == n - 1 && k == arr[i][j])
            return 1;

        // If already visited, return the value
        if (dp[i][j][k] != -1)
            return dp[i][j][k];

        // Recursive cases: Move right or down
        // Calculate the number of paths by moving right and down
        dp[i][j][k] = numberOfPathUtil(i + 1, j, k - arr[i][j], n, arr, dp) +
                      numberOfPathUtil(i, j + 1, k - arr[i][j], n, arr, dp);

        return dp[i][j][k];
    }

    long long numberOfPath(int n, int k, vector<vector<int>> arr) {
        // Initialize DP table with -1
        vector<vector<vector<long long>>> dp(n, vector<vector<long long>>(n, vector<long long>(k + 1, -1)));

        // Call the utility function
        return numberOfPathUtil(0, 0, k, n, arr, dp);
    }
};
    


//{ Driver Code Starts.

int main()
{
    Solution obj;
    int i,j,k,l,m,n,t;
    cin>>t;
    while(t--)
    {
        cin>>k>>n;
        vector<vector<int>> v(n+1, vector<int>(n+1, 0));
        for(i=0;i<n;i++)
            for(j=0;j<n;j++)
                cin>>v[i][j];
        cout << obj.numberOfPath(n, k, v) << endl;
    }
}
// } Driver Code Ends

````
