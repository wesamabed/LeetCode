class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>(numCourses);
        int[] inDegree = new int[numCourses];
        int[] order = new int[numCourses];
        int[] count = {numCourses - 1};
        for(int i = 0; i < numCourses; i++) adj.add(i, new ArrayList<>());
        for(int[] prerequisite: prerequisites){
            adj.get(prerequisite[1]).add(prerequisite[0]);
            inDegree[prerequisite[0]]++;
        } 
        int counter = 0;
        Queue<Integer> queue = new ArrayDeque<>(numCourses);
        for(int i = 0; i < numCourses; i++){
            if(inDegree[i] == 0) queue.offer(i);
        }
        while(!queue.isEmpty()){
            int current = queue.poll();
            order[counter] = current;
            counter++;
            List<Integer> neighbors = adj.get(current);
            for(int neighbor: neighbors){
                inDegree[neighbor]--;
                if(inDegree[neighbor] == 0) queue.offer(neighbor);
            }
        }

        return counter == numCourses ? order : new int[0];
    }

}