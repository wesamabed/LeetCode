class Solution {
    public int fib(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,0);
        map.put(1,1);
        return calc(n, map);
    }
    private int calc(int n, Map<Integer, Integer> map){
        if(map.containsKey(n)) return map.get(n);
        return calc(n - 1, map) + calc(n - 2, map);
    }
}