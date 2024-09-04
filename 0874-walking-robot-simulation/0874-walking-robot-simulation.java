class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        // Directions: North, East, South, West
        final int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int ans = 0, d = 0, x = 0, y = 0;
        Set<Pair<Integer, Integer>> obstaclesSet = new HashSet<>();
        
        // Populate the set with obstacle coordinates
        for (int[] o : obstacles) {
            obstaclesSet.add(new Pair<>(o[0], o[1]));
        }
        
        for (int c : commands) {
            if (c == -1) {
                // Turn right
                d = (d + 1) % 4;
            } else if (c == -2) {
                // Turn left
                d = (d + 3) % 4;
            } else {
                // Move forward 'c' steps
                for (int step = 0; step < c; step++) {
                    int nextX = x + directions[d][0];
                    int nextY = y + directions[d][1];
                    
                    // Check if the next position is an obstacle
                    if (obstaclesSet.contains(new Pair<>(nextX, nextY))) {
                        break;
                    }
                    
                    // Update position
                    x = nextX;
                    y = nextY;
                }
            }
            // Calculate the maximum distance squared from origin
            ans = Math.max(ans, x * x + y * y);
        }
        return ans;
    }
}
