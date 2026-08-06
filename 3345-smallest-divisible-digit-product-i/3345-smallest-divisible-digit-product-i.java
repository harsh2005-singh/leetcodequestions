class Solution {
    public int smallestNumber(int n, int t) {
        while (true) {
            if (isValid(n, t)) {
                return n;
            }
            n++;
        }
    }

    private boolean isValid(int num, int t) {
        int product = 1;
        int x = num;

        if (x == 0) return true;

        while (x > 0) {
            int digit = x % 10;

            // If any digit is 0, product becomes 0,
            // which is divisible by every positive t.
            if (digit == 0) return true;

            product *= digit;
            x /= 10;
        }

        return product % t == 0;
    }
}