class Solution {
    public int totalFruit(int[] fruits) {
        int maxFruits = 0, l = 0;
        HashMap<Integer, Integer> basket = new HashMap<>();

        for (int r = 0; r < fruits.length; r++) {
            basket.put(fruits[r], basket.getOrDefault(fruits[r], 0) + 1);

            while (basket.size() > 2) { // More than 2 types, shrink window
                basket.put(fruits[l], basket.get(fruits[l]) - 1);
                if (basket.get(fruits[l]) == 0) {
                    basket.remove(fruits[l]); // Remove empty fruit type
                }
                l++; // Move left boundary
            }

            maxFruits = Math.max(maxFruits, r - l + 1);
        }

        return maxFruits;
    }
}
