# Question Link -> https://www.geeksforgeeks.org/problems/power-set4302/1

```cpp
class Solution {
public:
    vector<string> out;
    string curr;
    
    void subSeq(int i, string &s) {
        if (i == s.size()) {
            if (curr.size())
                out.push_back(curr);
            return;
        }
        
        curr.push_back(s[i]);
        subSeq(i + 1, s);
        curr.pop_back();
        subSeq(i + 1, s);
    }
    
    vector<string> AllPossibleStrings(string s) {
        subSeq(0, s);
        sort(out.begin(), out.end());
        return out;
    }
};
````
