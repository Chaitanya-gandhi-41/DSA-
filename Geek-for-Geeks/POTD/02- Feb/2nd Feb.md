  Question Link ->  https://www.geeksforgeeks.org/problems/implement-atoi/1
  

### JAVA
  ````JAVA
  class Solution {
public:
    int atoi(string s) {
        int n = 0; 
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 && s[i] == '-') 
                continue;
            if (s[i] >= '0' && s[i] <= '9')
                n = n * 10 + s[i] - '0';
            else 
                return -1; 
        }
        return (s[0] == '-') ? -n : n;
    }
};
````
