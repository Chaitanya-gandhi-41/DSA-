## Question

Basic optimization question based on Knapsack Problem except that this knapsack can be broken 

Question link ->https://www.geeksforgeeks.org/problems/fractional-knapsack-1587115620/1

## Approach and Logic 

1. **Calculate Value-to-Weight Ratio:**
   - Compute the value-to-weight ratio for each item by dividing its value by its weight.

2. **Sort Items:**
   - Sort the items in descending order based on their value-to-weight ratios.
   - This ensures prioritization of items with higher value relative to their weight.

3. **Greedy Selection:**
   - Iterate through the sorted items.
   - Include the entire item if its weight is less than or equal to the remaining capacity.
   - If the weight exceeds the remaining capacity, include a fraction of the item to fill the knapsack to capacity.

4. **Update and Sum:**
   - Update the remaining capacity after each inclusion.
   - Continue the process until the knapsack is full or all items are considered.
   - Sum up the values of the selected items to obtain the maximum total value.
  
### (C++)

```cpp
public:
    double fractionalKnapsack(int W, Item arr[], int n) {
        // Sorting items based on value/weight ratio
        std::sort(arr, arr + n, [](const Item& a, const Item& b) {
            return static_cast<double>(a.value) / a.weight > static_cast<double>(b.value) / b.weight;
        });

        double total_value = 0.0;

        for (int i = 0; i < n; ++i) {
            // If weight of the current item is less than or equal to the remaining capacity
            if (arr[i].weight <= W) {
                total_value += arr[i].value;
                W -= arr[i].weight;
            } else {
                // If the weight of the current item is more than the remaining capacity,
                // take a fraction of it to fill the knapsack to its capacity
                double fraction = static_cast<double>(W) / arr[i].weight;
                total_value += arr[i].value * fraction;
                break;
            }
        }

        return total_value;
    }

```
