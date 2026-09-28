class Solution {
    public int diagonalPrime(int[][] nums) {
        int maxPrime = 0;
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            int val1 = nums[i][i];
            int val2 = nums[i][n - i - 1];
            
            if (val1 > maxPrime && isPrime(val1)) {
                maxPrime = val1;
            }
            if (val2 > maxPrime && isPrime(val2)) {
                maxPrime = val2;
            }
        }
        
        return maxPrime;
    }
    
    private boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num <= 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;
        
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}