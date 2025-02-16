class Solution {
    int[] result;
    boolean[] used;
    boolean found = false;

    public int[] constructDistancedSequence(int n) {
        int length = 2 * n - 1;
        result = new int[length];
        used = new boolean[n + 1];
        backtrack(n, 0);
        return result;
    }

    private void backtrack(int n, int index) {
        if (found) return;

        if (index == result.length) {
            found = true;
            return;
        }

        if (result[index] != 0) {
            backtrack(n, index + 1);
            return;
        }

        for (int num = n; num >= 1; num--) {
            if (!used[num]) {
                if (num == 1) {
                    result[index] = 1;
                    used[1] = true;
                    backtrack(n, index + 1);
                    if (found) return;
                    result[index] = 0;
                    used[1] = false;
                } else {
                    int secondPos = index + num;
                    if (secondPos < result.length && result[secondPos] == 0) {
                        result[index] = num;
                        result[secondPos] = num;
                        used[num] = true;

                        backtrack(n, index + 1);

                        if (found) return;

                        result[index] = 0;
                        result[secondPos] = 0;
                        used[num] = false;
                    }
                }
            }
        }
    }
}
