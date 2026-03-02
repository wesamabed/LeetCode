class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>(numCourses);
        int[] inDegree = new int[numCourses];
        for (int i = 0; i < numCourses; i++){
            adj.add(new ArrayList<>());
        }
        for (int[] pair: prerequisites){
            int course = pair[0];
            int pre = pair[1];
            adj.get(pre).add(course);
            inDegree[course]++;
        }
        Queue<Integer> queue = new ArrayDeque<>();
        int count = 0;
        for (int i = 0; i < adj.size(); i++){
            if (inDegree[i] == 0) queue.offer(i);
        }
        if(queue.isEmpty()) return false;
        while(!queue.isEmpty()){
            int curr = queue.poll();
            count++;
            inDegree[curr]--;
            List<Integer> dependents = adj.get(curr);
            for(int neigh: dependents){
                inDegree[neigh]--;
                if(inDegree[neigh] == 0) queue.offer(neigh);
            }
        }

        return count == numCourses;
    }
}