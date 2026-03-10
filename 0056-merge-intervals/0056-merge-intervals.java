class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals == null || intervals.length == 0) return new int[0][];
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> list = new ArrayList<>();
        list.add(intervals[0]);
        for(int i = 0; i < intervals.length; i++){
            int[] current = intervals[i];
            int[] lastMerged = list.get(list.size() - 1);
            if(lastMerged[1] >= current[0]){
                lastMerged[1] = Math.max(lastMerged[1], current[1]);
            }
            else{
                list.add(current);
            }
        }
        return list.toArray(new int[list.size()][2]);
    }
}