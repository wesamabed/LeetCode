class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>(numCourses);
        int[] visited = new int[numCourses];
        int[] order = new int[numCourses];
        int[] count = {numCourses - 1};
        for(int i = 0; i < numCourses; i++) adj.add(i, new ArrayList<>());
        for(int[] prerequisite: prerequisites){
            adj.get(prerequisite[1]).add(prerequisite[0]);
        } 
        for (int i = 0; i < numCourses; i++){
            if(!canFinish(i, adj, visited, order, count)) return new int[0];
        }
        return order;
    }

    private boolean canFinish(int course, List<List<Integer>> adj, int[] visited, int[] order, int[] count){
        if(visited[course] == 2) return true;
        if(visited[course] == 1) return false;
        visited[course] = 1;
        List<Integer> neighbors = adj.get(course);
        for(int neighbor: neighbors){
            if(!canFinish(neighbor, adj, visited, order, count)) return false;
        }
        visited[course] = 2;
        order[count[0]] = course;
        count[0] --;
        return true;
    }
}