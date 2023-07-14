class Solution {
    public int climbStairs(int n) {
        if (n == 1)
            return 1;
        else if (n == 2)
            return 2;

        // previous two steps which is posssible
        int prev1 = 1; 
        int prev2 = 2; 
        
        
        for (int i = 3; i <= n; i++) {
            int current = prev1 + prev2; 
            prev1 = prev2; 
            prev2 = current; 
        }
        
        return prev2; 
    }
}



// n=0 0
// n=1 1
// n=2 2

// 10 
//     8 9 - 7 6
//       8 7 
//     return climb(n-1) + clinb(n-2);



// 10
// 8    9
// 7 6
// 6 5 
// 5 4