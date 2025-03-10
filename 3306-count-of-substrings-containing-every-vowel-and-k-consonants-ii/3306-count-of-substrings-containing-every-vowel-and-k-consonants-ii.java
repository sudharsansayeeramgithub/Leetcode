class Solution {
    public long countOfSubstrings(String word, int k) {
        long countOfSubString = 0;
        int start = 0, end = 0, consonantCount = 0;
        Map<Character, Integer> vowelsCount = new HashMap<>();
        int[] nextConsonant = new int[word.length()];
        int nextConsonantIndex = word.length();

        // Precompute next consonant index for each position
        for (int i = word.length() - 1; i >= 0; i--) {
            nextConsonant[i] = nextConsonantIndex;
            if (!isVowel(word.charAt(i))) {
                nextConsonantIndex = i;
            }
        }

        while (end < word.length()) {
            char newLetter = word.charAt(end);
            
            if (isVowel(newLetter)) {
                vowelsCount.put(newLetter, vowelsCount.getOrDefault(newLetter, 0) + 1);
            } else {
                consonantCount++;
            }

            // Maintain the window with at most `k` consonants
            while (consonantCount > k) {
                char startLetter = word.charAt(start);
                if (isVowel(startLetter)) {
                    vowelsCount.put(startLetter, vowelsCount.get(startLetter) - 1);
                    if (vowelsCount.get(startLetter) == 0) {
                        vowelsCount.remove(startLetter);
                    }
                } else {
                    consonantCount--;
                }
                start++;
            }

            // Count valid substrings
            while (start < word.length() && vowelsCount.size() == 5 && consonantCount == k) {
                countOfSubString += nextConsonant[end] - end;
                char startLetter = word.charAt(start);
                if (isVowel(startLetter)) {
                    vowelsCount.put(startLetter, vowelsCount.get(startLetter) - 1);
                    if (vowelsCount.get(startLetter) == 0) {
                        vowelsCount.remove(startLetter);
                    }
                } else {
                    consonantCount--;
                }
                start++;
            }

            end++;
        }

        return countOfSubString;
    }

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
