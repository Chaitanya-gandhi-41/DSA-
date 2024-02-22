# Question Link-> https://www.geeksforgeeks.org/problems/distinct-occurrences/1

```cpp

class Solution {
public:
    int mod = 1e9 + 7;

    int solve(int i, int j, int n, int m, string s, string t, vector<vector<int>>& dp) {
        if (j == m)
            return 1;
        if (i == n)
            return 0;

        if (dp[i][j] != -1)
            return dp[i][j];

        int ntake = solve(i + 1, j, n, m, s, t, dp);
        int take = 0;
        if (s[i] == t[j])
            take = solve(i + 1, j + 1, n, m, s, t, dp);

        return dp[i][j] = (take + ntake) % mod;
    }

    int subsequenceCount(string s, string t) {
        int n = s.size(), m = t.size();
        vector<vector<int>> dp(n + 1, vector<int>(m + 1, -1));
        return solve(0, 0, n, m, s, t, dp);
    }
};

````
