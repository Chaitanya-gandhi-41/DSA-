# Question Link -> https://www.geeksforgeeks.org/problems/pairs-violating-bst-property--212515/1

```cpp
#include <ext/pb_ds/assoc_container.hpp>
#include <ext/pb_ds/tree_policy.hpp>
using namespace __gnu_pbds;

#define ordered_set tree<int, null_type, less<int>, rb_tree_tag,tree_order_statistics_node_update>

class Solution {
public:
  vector<int> order;
  void InOrder(Node *root){
    if (!root)
      return;
      
    InOrder(root->left);
    order.push_back(root->data);
    InOrder(root->right);
  }
  int pairsViolatingBST(int n, Node *root)
  {
    InOrder(root);
    
    int cnt = 0;
    ordered_set st;
    for (int i = 0; i < n; ++i){
      int distance = i - st.order_of_key(order[i]);
      st.insert(order[i]);
      cnt += distance;
    }
    return cnt;
  }
};
````
