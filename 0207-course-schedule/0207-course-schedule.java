class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>(numCourses);
        int[] visited = new int[numCourses];
        for(int i = 0; i < numCourses; i++){
            adj.add(i, new ArrayList<>());
        }
        for(int[] prerequisite: prerequisites){
            int course = prerequisite[0];
            int pre = prerequisite[1];
            adj.get(course).add(pre);
        }
        for(int i = 0; i < numCourses; i++){
            if (!dfs(i, adj, visited)) return false;
        }
        return true;
    }
    private boolean dfs(int course, List<List<Integer>> adj, int[] visited){
        if(visited[course] == 2) return true;
        if(visited[course] == 1) return false;
        visited[course] = 1;
        List<Integer> courses = adj.get(course);
        for(int curr: courses){
            if (!dfs(curr, adj, visited)) return false;
        }
        visited[course] = 2;
        return true;
    }
}