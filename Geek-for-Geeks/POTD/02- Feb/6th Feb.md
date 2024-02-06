```cpp
class Solution {
public:
    int cnt;
    
    void dfs(Node* node, int& k, int lvl, unordered_map<int, bool>& mp) {
        if (!node)
            return;
        
        mp[lvl] = false;
        
        if (!node->left && !node->right) {
            if (lvl - k >= 0 && !mp[lvl - k]) {
                mp[lvl - k] = true;
                cnt++;
            }
        }
        
        ++lvl;
        dfs(node->left, k, lvl, mp);
        dfs(node->right, k, lvl, mp);
    }
    
    int printKDistantfromLeaf(Node* root, int k) {
        cnt = 0;
        unordered_map<int, bool> mp;
        dfs(root, k, 0, mp);
        return cnt;
    }
};
```
