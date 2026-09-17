class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int l = 0, r = 0, sum = 0;
        
        int min = Integer.MAX_VALUE;
        int ans = Integer.MAX_VALUE;

        int[] best = new int[arr.length];
        Arrays.fill(best, Integer.MAX_VALUE);

        while (r < arr.length) {
            sum += arr[r];

            while (sum >= target) {
                
                if (sum == target) {
                    int len = r - l + 1;

                    // Previous non-overlapping subarray
                    if (l > 0 && best[l - 1] != Integer.MAX_VALUE) {
                        ans = Math.min(ans, len + best[l - 1]);
                    }

                    min = Math.min(min, len);
                }

                sum -= arr[l];
                l++;
            }

            // Best subarray till index r
            if (r == 0) {
                best[r] = min;
            } else {
                best[r] = Math.min(best[r - 1], min);
            }

            r++;
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}