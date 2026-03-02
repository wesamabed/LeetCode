class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>(numCourses);
        int[] inDegree = new int[numCourses];
        for(int i = 0; i < numCourses; i++){
            adj.add(i, new ArrayList<>());
        }
        for(int[] prerequisite: prerequisites){
            int course = prerequisite[0];
            int pre = prerequisite[1];
            adj.get(pre).add(course);
            inDegree[course]++;
        }
        int counter = 0;
        Queue<Integer> queue = new ArrayDeque<>(numCourses);
        for(int i = 0; i < numCourses; i++){
            if(inDegree[i] == 0) queue.offer(i);
        }
        if(queue.isEmpty()) return false;
        while(!queue.isEmpty()){
            int curr = queue.poll();
            counter++;
            List<Integer> courses = adj.get(curr);
            for(int course: courses){
                inDegree[course]--;
                if(inDegree[course] == 0) queue.offer(course);
            }
        }

        return counter == numCourses;
    }

}