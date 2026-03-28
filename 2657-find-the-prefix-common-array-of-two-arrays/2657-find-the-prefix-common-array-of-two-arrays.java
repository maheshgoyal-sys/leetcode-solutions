class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
   int n = A.length;
        int[] result = new int[n];

        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        for (int i = 0; i < n; i++) {
            setA.add(A[i]);
            setB.add(B[i]);

            int count = 0;

            for (int x : setA) {
                if (setB.contains(x)) {
                    count++;
                }
            }

            result[i] = count;
        }

        return result;

    }
}