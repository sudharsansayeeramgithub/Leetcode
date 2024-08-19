class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        int[][] points={p1,p2,p3,p4};
        Set<Integer> distance=new HashSet<>();
        for(int i=0;i<3;i++){
            for(int j=i+1;j<4;j++){
                int difference=(points[i][0]-points[j][0])*(points[i][0]-points[j][0])+(points[i][1]-points[j][1])*(points[i][1]-points[j][1]);
                if(difference==0) return false;
                distance.add(difference);
            }
        }
        return distance.size()==2;
    }
}