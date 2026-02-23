class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>(numCourses);
        int[] visited = new int[numCourses];
        for (int i = 0; i < numCourses; i++){
            adj.add(new ArrayList<>());
        }
        for (int[] pair: prerequisites){
            int course = pair[0];
            int pre = pair[1];
            adj.get(course).add(pre);
        }
        for(int j = 0; j < numCourses; j++){
            boolean check = dfs(j, adj, visited);
            if(check == false) return false;
        }
        return true;
    }
    private boolean dfs(int course, List<List<Integer>> adj, int[] visited){
        if(visited[course] == 1) return false;
        if(visited[course] == 2) return true;
        visited[course] = 1;
        List<Integer> pre = adj.get(course);
        for(int i = 0; i < pre.size(); i++){
            boolean check = dfs(pre.get(i), adj, visited);
            if (check == false) return false;
        }
        visited[course] = 2;
        return true;
    }
}