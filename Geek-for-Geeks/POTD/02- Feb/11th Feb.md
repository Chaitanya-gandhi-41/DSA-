````cpp

class Solution {
public:
    vector<int> recamanSequence(int n){
        vector<int> a(n+1,0);
        unordered_set<int> st;
        for(int i = 1; i <= n; ++i){
            if((a[i-1] - i) > 0 && st.find(a[i-1] - i) == st.end())
                a[i] = a[i-1] - i;
            else
                a[i] = a[i-1] + i;
            st.insert(a[i]);
        }
        return a;
    }
};

````
