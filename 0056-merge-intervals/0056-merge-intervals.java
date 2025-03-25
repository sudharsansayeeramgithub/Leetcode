class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> mergedIntervals=new ArrayList<>();
        int prevStart=intervals[0][0],prevEnd=intervals[0][1],start,end;
        for(int i=1;i<intervals.length;i++){
            start=intervals[i][0];end=intervals[i][1];
            if(start<=prevEnd){
                prevEnd=Math.max(end,prevEnd);
            }else{
                mergedIntervals.add(new int[]{prevStart,prevEnd});
                prevEnd=end;
                prevStart=start;
            }
        }
        mergedIntervals.add(new int[]{prevStart,prevEnd});
        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
    }
}