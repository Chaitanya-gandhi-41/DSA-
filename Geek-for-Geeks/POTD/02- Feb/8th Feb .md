```cpp

class Solution {
public:
    bool check(Node *root)
    {
        queue<pair<Node*, int>> q; 
        q.push({root,0});
        int firstLeaf = -1;
        
        while(!q.empty()){
            auto node = q.front().first;
            int lvl = q.front().second;
            q.pop();
            
            if(!node->left && !node->right)
            {
                if(firstLeaf == -1)
                    firstLeaf = lvl;
                else if(firstLeaf != lvl) 
                    return false;
            }
            ++lvl;
            if(node->left) 
                q.push({node->left, lvl});
            if(node->right) 
                q.push({node->right, lvl});
        }
        return true;
    }
};

```
