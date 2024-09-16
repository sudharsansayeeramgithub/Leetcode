class Solution {
    public int findMinDifference(List<String> timePoints) {
        List<Integer> times=new ArrayList<>();
        for(String s:timePoints){
            int time=0;
            time=Integer.parseInt(s.substring(0,2))*60;
            time+=Integer.parseInt(s.substring(3));
            times.add(time);
        }
        Collections.sort(times);
        int mini=Integer.MAX_VALUE;
        for(int i=1;i<times.size();i++){
            int diff=times.get(i)-times.get(i-1);
            mini=Math.min(mini,diff);
        }
        return Math.min(mini,24*60-times.get(times.size()-1)+times.get(0));
    }
}