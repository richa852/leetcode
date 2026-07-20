class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        boolean[]visited=new boolean[n];
        int count=0;
        for(int i=0;i<n;i++){
            if(!visited[i]){
                dfs(i,isConnected,visited);
                count++;
            }
        }
        return count;
    }
    private void dfs(int start,int[][] graph,boolean[] visited){
        visited[start]=true;
        for(int j=0;j<graph.length;j++){
            if(graph[start][j]==1 && !visited[j]){
                dfs(j,graph,visited);
            }
        }
    }
}