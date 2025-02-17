class Solution {
    int count = 0;

    public int numTilePossibilities(String tiles) {
        // Count frequency of each character
        int[] freq = new int[26];
        for (char ch : tiles.toCharArray()) {
            freq[ch - 'A']++;
        }

        backtrack(freq);
        return count;
    }

    private void backtrack(int[] freq) {
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                // Use this character
                freq[i]--;
                count++; // Count current sequence
                
                backtrack(freq); // Explore further sequences
                
                // Backtrack
                freq[i]++;
            }
        }
    }
}
