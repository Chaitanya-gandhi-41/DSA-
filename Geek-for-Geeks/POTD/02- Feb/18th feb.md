## Question Link -> https://www.geeksforgeeks.org/problems/sum-of-leaf-nodes-in-bst/1


```cpp
class Solution {
public:
    int sumOfLeafNodes(Node *root) {
        if (!root)
            return 0;
        
        if (!root->left && !root->right)
            return root->data;
        
        return sumOfLeafNodes(root->left) + sumOfLeafNodes(root->right);
    }
};
````
