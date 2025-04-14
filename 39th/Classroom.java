// import java.util.*;

// public class Classroom{
//     static class Edge{
//         int src;
//         int dest;
//         int wt;

//         public Edge(int s,int d,int w){
//             this.src = s;
//             this.dest = d;
//             this.wt = w;
//         }
//     }

//     public static void createGraph(ArrayList<Edge> graph[]){
//         for(int i=0;i<graph.length;i++){
//             graph[i] = new ArrayList<Edge>();
//         }

//         graph[0].add(new Edge(0, 2,2));

//         graph[1].add(new Edge(1, 2,10));
//         graph[1].add(new Edge(1, 3,0));

//         graph[2].add(new Edge(2,0,2));
//         graph[2].add(new Edge(2,1,10));
//         graph[2].add(new Edge(2,3,-1));

//         graph[3].add(new Edge(3,1,0));
//         graph[3].add(new Edge(3,2,-1));
//     }

//     public static void main(String[] args) {
//         int v = 4;

//         ArrayList<Edge> graph[] = new ArrayList[v];  
//         createGraph(graph);

//         //print 2's neighbors 
//         for(int i=0;i<graph[2].size();i++){
//             Edge e = graph[2].get(i);
//             System.out.println(e.dest+" , "+e.wt);
//         }
//     }
// }

//BFS by Graph traversal 

// import java.util.*;

// public class Classroom {
//     static class Edge {
//         int src;
//         int dest;

//         public Edge(int s, int d) {
//             this.src = s;
//             this.dest = d;

//         }
//     }

//     public static void createGraph(ArrayList<Edge> graph[]) {
//         for (int i = 0; i < graph.length; i++) {
//             graph[i] = new ArrayList<Edge>();
//         }

//         graph[0].add(new Edge(0, 1));
//         graph[0].add(new Edge(0, 2));

//         graph[1].add(new Edge(1, 0));
//         graph[1].add(new Edge(1, 3));

//         graph[2].add(new Edge(2, 0));
//         graph[2].add(new Edge(2, 4));

//         graph[3].add(new Edge(3, 1));
//         graph[3].add(new Edge(3, 4));
//         graph[3].add(new Edge(3, 5));

//         graph[4].add(new Edge(4, 2));
//         graph[4].add(new Edge(4, 3));
//         graph[4].add(new Edge(4, 5));

//         graph[5].add(new Edge(5, 3));
//         graph[5].add(new Edge(5, 4));
//         graph[5].add(new Edge(5, 6));

//         graph[5].add(new Edge(6, 5));

//     }

//     public static void bfs(ArrayList<Edge> graph[], int v, boolean vis[], int start) {
//         Queue<Integer> q = new LinkedList<>();
//         // boolean vis[] = new boolean[v];
//         // q.add(0);
//         q.add(start);

//         while (!q.isEmpty()) {
//             int curr = q.remove();
//             if (vis[curr] == false) {
//                 System.out.print(curr + " ");
//                 vis[curr] = true;

//                 for (int i = 0; i < graph[curr].size(); i++) {
//                     Edge e = graph[curr].get(i);
//                     q.add(e.dest);
//                 }
//             }
//         }
//     }

//     public static void main(String[] args) {//O(v + e)
//         int v = 7;
//         /*
//          * 1 ---3
//          * / | \
//          * 0 | 5 -- 6
//          * \ | /
//          * 2 ---- 4
//          * 
//          */

//         ArrayList<Edge> graph[] = new ArrayList[v];
//         createGraph(graph);

//         boolean vis[] = new boolean[v];
//         for (int i = 0; i < v; i++) {
//             if (vis[i] == false) {
//                 bfs(graph, v, vis, i);
//             }
//         }
//         // bfs(graph, v);
//         System.out.println();
//     }
// }

//DFS by Graph traversal 

// import java.util.*;

// public class Classroom {
//     static class Edge {
//         int src;
//         int dest;

//         public Edge(int s, int d) {
//             this.src = s;
//             this.dest = d;

//         }
//     }

//     public static void createGraph(ArrayList<Edge> graph[]) {
//         for (int i = 0; i < graph.length; i++) {
//             graph[i] = new ArrayList<Edge>();
//         }

//         graph[0].add(new Edge(0, 1));
//         graph[0].add(new Edge(0, 2));

//         graph[1].add(new Edge(1, 0));
//         graph[1].add(new Edge(1, 3));

//         graph[2].add(new Edge(2, 0));
//         graph[2].add(new Edge(2, 4));

//         graph[3].add(new Edge(3, 1));
//         graph[3].add(new Edge(3, 4));
//         graph[3].add(new Edge(3, 5));

//         graph[4].add(new Edge(4, 2));
//         graph[4].add(new Edge(4, 3));
//         graph[4].add(new Edge(4, 5));

//         graph[5].add(new Edge(5, 3));
//         graph[5].add(new Edge(5, 4));
//         graph[5].add(new Edge(5, 6));

//         graph[5].add(new Edge(6, 5));

//     }

//     public static void bfs(ArrayList<Edge> graph[], int v, boolean vis[], int start) {
//         Queue<Integer> q = new LinkedList<>();
//         // boolean vis[] = new boolean[v];
//         // q.add(0);
//         q.add(start);

//         while (!q.isEmpty()) {
//             int curr = q.remove();
//             if (vis[curr] == false) {
//                 System.out.print(curr + " ");
//                 vis[curr] = true;

//                 for (int i = 0; i < graph[curr].size(); i++) {
//                     Edge e = graph[curr].get(i);
//                     q.add(e.dest);
//                 }
//             }
//         }
//     }

//     public static void dfs(ArrayList<Edge> graph[], int curr, boolean vis[]) {
//         System.out.print(curr + " ");
//         vis[curr] = true;

//         for (int i = 0; i < graph[curr].size(); i++) {
//             Edge e = graph[curr].get(i);
//             if(vis[e.dest] == false){

//                 dfs(graph, e.dest, vis);
//             }
//         }
//     }

//     public static void main(String[] args) {// O(v + e)
//         int v = 7;
//         /*
//          * 1 ---3
//          * / | \
//          * 0 | 5 -- 6
//          * \ | /
//          * 2 ---- 4
//          * 
//          */

//         ArrayList<Edge> graph[] = new ArrayList[v];
//         createGraph(graph);

//         boolean vis[] = new boolean[v];
//         for (int i = 0; i < v; i++) {
//             if (vis[i] == false) {
//                 dfs(graph,i,vis);
//             }
//         }

//         System.out.println();
//     }
// }

// //All paths from source to target 

// import java.util.*;

// public class Classroom {
//     static class Edge {
//         int src;
//         int dest;

//         public Edge(int s, int d) {
//             this.src = s;
//             this.dest = d;

//         }
//     }

//     public static void createGraph(ArrayList<Edge> graph[]) {
//         for (int i = 0; i < graph.length; i++) {
//             graph[i] = new ArrayList<Edge>();
//         }

//         graph[0].add(new Edge(0, 1));
//         graph[0].add(new Edge(0, 2));

//         graph[1].add(new Edge(1, 0));
//         graph[1].add(new Edge(1, 3));

//         graph[2].add(new Edge(2, 0));
//         graph[2].add(new Edge(2, 4));

//         graph[3].add(new Edge(3, 1));
//         graph[3].add(new Edge(3, 4));
//         graph[3].add(new Edge(3, 5));

//         graph[4].add(new Edge(4, 2));
//         graph[4].add(new Edge(4, 3));
//         graph[4].add(new Edge(4, 5));

//         graph[5].add(new Edge(5, 3));
//         graph[5].add(new Edge(5, 4));
//         graph[5].add(new Edge(5, 6));

//         graph[5].add(new Edge(6, 5));

//     }

//     public static void bfs(ArrayList<Edge> graph[], int v, boolean vis[], int start) {
//         Queue<Integer> q = new LinkedList<>();
//         // boolean vis[] = new boolean[v];
//         // q.add(0);
//         q.add(start);

//         while (!q.isEmpty()) {
//             int curr = q.remove();
//             if (vis[curr] == false) {
//                 System.out.print(curr + " ");
//                 vis[curr] = true;

//                 for (int i = 0; i < graph[curr].size(); i++) {
//                     Edge e = graph[curr].get(i);
//                     q.add(e.dest);
//                 }
//             }
//         }
//     }

//     public static void dfs(ArrayList<Edge> graph[], int curr, boolean vis[]) {//O(V+E)
//         System.out.print(curr + " ");
//         vis[curr] = true;

//         for (int i = 0; i < graph[curr].size(); i++) {
//             Edge e = graph[curr].get(i);
//             if (vis[e.dest] == false) {

//                 dfs(graph, e.dest, vis);
//             }
//         }
//     }

//     //modified dfs code 
//     //O(V^V);vb     Za
//     public static void printAllPath(ArrayList<Edge> graph[], boolean vis[], int curr, String path, int tar) {
//         if (curr == tar) {
//             System.out.println(path);
//             return;
//         }

//         for (int i = 0; i < graph[curr].size(); i++) {
//             Edge e = graph[curr].get(i);
//             if (!vis[e.dest]) {
//                 vis[curr] = true;
//                 printAllPath(graph, vis, e.dest, path + e.dest, tar);
//                 vis[curr] = false;
//             }
//         }
//     }

//     public static void main(String[] args) {// O(v + e)
//         int v = 7;
//         /*
//          * 1 ---3
//          * / | \
//          * 0 | 5 -- 6
//          * \ | /
//          * 2 ---- 4
//          * 
//          */

//         ArrayList<Edge> graph[] = new ArrayList[v];
//         createGraph(graph);

//         int src = 0,tar = 5;
//         printAllPath(graph, new boolean[v], src,"0", tar);
//     }
// }

//Cycle detection

// import java.util.*;

// public class Classroom {
//     static class Edge {
//         int src;
//         int dest;

//         public Edge(int s, int d) {
//             this.src = s;
//             this.dest = d;

//         }
//     }

//     public static void createGraph(ArrayList<Edge> graph[]) {
//         for (int i = 0; i < graph.length; i++) {
//             graph[i] = new ArrayList<Edge>();
//         }

//         graph[0].add(new Edge(0, 2));

//         graph[1].add(new Edge(1, 0));

//         graph[2].add(new Edge(2, 3));

//         graph[3].add(new Edge(3, 0));

//     }

//     public static boolean isCycleDirected(ArrayList<Edge> graph[], boolean vis[], int curr, boolean rec[]) {
//         vis[curr] = true;
//         rec[curr] = true;

//         for (int i = 0; i < graph[curr].size(); i++) {
//             Edge e = graph[curr].get(i);
//             if (rec[e.dest]) {//cycle
//                 return true;
//             } else if (!vis[e.dest]) {
//                 if (isCycleDirected(graph, vis, e.dest, rec)) {
//                     return true;
//                 }
//             }
//         }

//         rec[curr] = false;
//         return false;
//     }

//     public static void main(String[] args) {// O(v + e)
//         int v = 4;

//         ArrayList<Edge> graph[] = new ArrayList[v];
//         createGraph(graph);

//         boolean vis[] = new boolean[v];
//         boolean rec[] = new boolean[v];
//         for (int i = 0; i < v; i++) {
//             if(!vis[i]){
//                 boolean isCycle = isCycleDirected(graph, vis, 0, rec);
//                  if(isCycle){
//                     System.out.println(isCycle);
//                     break;
//                  }
//             }
//         }

//     }
// }

//Topological sorting using DFS

// import java.util.*;

// public class Classroom {
//     static class Edge {
//         int src;
//         int dest;

//         public Edge(int s, int d) {
//             this.src = s;
//             this.dest = d;

//         }
//     }

//     public static void createGraph(ArrayList<Edge> graph[]) {
//         for (int i = 0; i < graph.length; i++) {
//             graph[i] = new ArrayList<Edge>();
//         }

//         graph[2].add(new Edge(2, 3));

//         graph[3].add(new Edge(3, 1));

//         graph[4].add(new Edge(4, 0));
//         graph[4].add(new Edge(4, 1));

//         graph[5].add(new Edge(5, 0));
//         graph[5].add(new Edge(5, 2));

//     }

//     public static void topSortUtil(ArrayList<Edge> graph[],int  curr,boolean vis[],Stack<Integer> stack){
//         vis[curr] = true;

//         for(int i=0; i<graph[curr].size();i++){
//             Edge e = graph[curr].get(i);

//             if(!vis[e.dest]){
//                 topSortUtil(graph, e.dest, vis, stack);
//             }
//         }

//         stack.push(curr);
//     }

//     public static void topSort(ArrayList<Edge> graph[],int v){
//         boolean vis[] = new boolean[v];
//         Stack<Integer> stack = new Stack<>();

//         for(int i = 0;i<v; i++){
//             if(!vis[i]){
//                 topSortUtil(graph, i,vis,stack);
//             }
//         }

//         while(!stack.isEmpty()){
//             System.out.print(stack.pop()+ " ");
//         }

//     }

//     public static void main(String[] args) {// O(v + e)
//         int v = 6;

//         ArrayList<Edge> graph[] = new ArrayList[v];
//         createGraph(graph);

//         topSort(graph, v);

//     }
// }

// //Cycle detection for undirected graph

// import java.util.*;

// public class Classroom {
//     static class Edge {
//         int src;
//         int dest;

//         public Edge(int s, int d) {
//             this.src = s;
//             this.dest = d;

//         }
//     }

//     public static void createGraph(ArrayList<Edge> graph[]) {
//         for (int i = 0; i < graph.length; i++) {
//             graph[i] = new ArrayList<Edge>();
//         }

//         graph[0].add(new Edge(0, 1));
//         graph[0].add(new Edge(0, 4));

//         graph[1].add(new Edge(1, 0));
//         graph[1].add(new Edge(1, 2));
//         // graph[1].add(new Edge(1, 4));

//         graph[2].add(new Edge(2, 1));
//         graph[2].add(new Edge(2, 3));

//         graph[3].add(new Edge(3, 2));

//         graph[4].add(new Edge(4, 0));
//         // graph[4].add(new Edge(4, 1));
//         graph[4].add(new Edge(4, 5));

//         graph[5].add(new Edge(5, 4));

//     }

//     public static boolean isCycleUndirected(ArrayList<Edge> graph[],boolean vis[],int curr,int par){
//         vis[curr] = true;

//         for(int i = 0;i<graph[curr].size();i++){
//             Edge e = graph[curr].get(i);
//             if(vis[e.dest]&& e.dest != par){
//                 return true;
//             }else if(!vis[e.dest]){
//                 if(isCycleUndirected(graph, vis, e.dest, curr)){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }

//     public static void main(String[] args) {// O(v + e)
//         int v = 6;

//         ArrayList<Edge> graph[] = new ArrayList[v];
//         createGraph(graph);
//         System.out.println(isCycleUndirected(graph,new boolean[v], 0, -1));

//     }
// }

// //Dijkstra's algorithms for minimum shortest path 

// import java.util.*;

// public class Classroom {
//     static class Edge {
//         int src;
//         int dest;
//         int wt;

//         public Edge(int s, int d, int w) { // Constructor inside Edge class
//             this.src = s;
//             this.dest = d;
//             this.wt = w;
//         }
//     }

//     public static void createGraph(ArrayList<Edge>[] graph) {
//         for (int i = 0; i < graph.length; i++) {
//             graph[i] = new ArrayList<>();
//         }

//         graph[0].add(new Edge(0, 1, 2));
//         graph[0].add(new Edge(0, 2, 4));

//         graph[1].add(new Edge(1, 3, 7));
//         graph[1].add(new Edge(1, 2, 1));

//         graph[2].add(new Edge(2, 4, 3));

//         graph[3].add(new Edge(3, 5, 1));

//         graph[4].add(new Edge(4, 3, 2));
//         graph[4].add(new Edge(4, 5, 5));
//     }

//     public static class Pair implements Comparable<Pair> {
//         int node;
//         int dist;

//         public Pair(int n, int d) {
//             this.node = n;
//             this.dist = d;
//         }

//         @Override
//         public int compareTo(Pair p2) {
//             return this.dist - p2.dist; // Ascending order
//         }
//     }

//     //O(E + E logv)
//     public static void dijkstra(ArrayList<Edge>[] graph, int src, int V) {
//         PriorityQueue<Pair> pq = new PriorityQueue<>();
//         int[] dist = new int[V];
//         Arrays.fill(dist, Integer.MAX_VALUE); // Initialize distances
//         dist[src] = 0; // Source node distance is 0

//         boolean[] vis = new boolean[V];

//         pq.add(new Pair(src, 0)); // Corrected insertion

//         while (!pq.isEmpty()) {
//             Pair curr = pq.remove(); // Shortest distance node

//             if (!vis[curr.node]) {
//                 vis[curr.node] = true;    

//                 for(int i = 0 ;i<graph[curr.node].size();i++){
//                     Edge e = graph[curr.node].get(i);
//                     int u = e.src;
//                     int v = e.dest;

//                     if (dist[u] + e.wt < dist[v]) { // Relaxation step
//                         dist[v] = dist[u] + e.wt;
//                         pq.add(new Pair(v, dist[v])); // Push updated distance
//                     }
//                 }
//             }
//         }

//         for (int i = 0; i < V; i++) {
//             System.out.print(dist[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         int v = 6;

//         ArrayList<Edge>[] graph = new ArrayList[v];
//         createGraph(graph);

//         dijkstra(graph, 0, v);
//     }
// }

//Bellman ford algorithms for minimum shortest path 

// import java.util.*;

// public class Classroom {
//     static class Edge {
//         int src;
//         int dest;
//         int wt;

//         public Edge(int s, int d, int w) { // Constructor inside Edge class
//             this.src = s;
//             this.dest = d;
//             this.wt = w;
//         }
//     }

//     public static void createGraph(ArrayList<Edge>[] graph) {
//         for (int i = 0; i < graph.length; i++) {
//             graph[i] = new ArrayList<>();
//         }

//         graph[0].add(new Edge(0, 1, 2));
//         graph[0].add(new Edge(0, 2, 4));

//         graph[1].add(new Edge(1, 2, -4));

//         graph[1].add(new Edge(2, 3, 2));

//         graph[2].add(new Edge(3, 4, 4));

//         graph[3].add(new Edge(4, 1, -1));
//     }

//     public static void bellmanFord(ArrayList<Edge> graph[],int src,int V){
//         int dist[] = new int[V];
//         for(int i = 0;i<V;i++){
//             if(i!=src){
//                 dist[i] = Integer.MAX_VALUE;
//             }
//         }

//         for(int k=0;k<V-1;k++){//O(v)  O(E)
//             for(int i=0;i<V;i++){
//                 for(int j=0;j<graph[i].size();j++){
//                     Edge e = graph[i].get(j);
//                     int u = e.src;
//                     int v = e.dest;

//                     if(dist[u] != Integer.MAX_VALUE && dist[u]+e.wt < dist[v]){
//                         dist[v] = dist[u] + e.wt;
//                     }
//                 }
//             }
//         }

//         //detect -ve wt cycles 
//         for(int i=0;i<V;i++){
//             for(int j=0;j<graph[i].size();j++){
//                 Edge e = graph[i].get(j);
//                 int u = e.src;
//                 int v = e.dest;

//                 if(dist[u] != Integer.MAX_VALUE && dist[u]+e.wt < dist[v]){
//                    System.out.println("Negative wt cycles");
//                 }
//             }
//         }

//         for(int i = 0;i<dist.length;i++){
//             System.out.print(dist[i]+" ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         int v = 5;

//         ArrayList<Edge>[] graph = new ArrayList[v];
//         createGraph(graph);

//        bellmanFord(graph, 0, v);
//     }
// }

// //Prim's Algorithm 

// import java.util.*;

// public class Classroom {
//     static class Edge {
//         int src;
//         int dest;
//         int wt;

//         public Edge(int s, int d, int w) { // Constructor inside Edge class
//             this.src = s;
//             this.dest = d;
//             this.wt = w;
//         }
//     }

//     public static void createGraph(ArrayList<Edge>[] graph) {
//         for (int i = 0; i < graph.length; i++) {
//             graph[i] = new ArrayList<>();
//         }

//         graph[0].add(new Edge(0, 1, 10));
//         graph[0].add(new Edge(0, 2, 15));
//         graph[0].add(new Edge(0, 3, 30));

//         graph[1].add(new Edge(1, 0, 10));
//         graph[1].add(new Edge(1, 3, 40));

//         graph[2].add(new Edge(2, 0, 15));
//         graph[2].add(new Edge(2, 3, 50));

//         graph[3].add(new Edge(3, 1, 40));
//         graph[3].add(new Edge(3, 2, 50));
//     }

//     public static class Pair implements Comparable<Pair>{
//         int node;
//         int cost;

//         public Pair(int n,int c){
//             this.node = n;
//             this.cost = c;
//         }

//         @Override
//         public int compareTo(Pair p2){
//             return this.cost - p2.cost; //ascending 
//         }
//     }

//     public static void primsAlgo(ArrayList<Edge> graph[],int v){
//         PriorityQueue<Pair> pq = new PriorityQueue<>(); //non-mst  ElogE
//         boolean vis[] = new boolean[v];
//         pq.add(new Pair(0,0));

//         int mstCost = 0;

//         while(!pq.isEmpty()){
//             Pair curr = pq.remove();
//             if(!vis[curr.node]){
//                 vis[curr.node] = true;
//                 mstCost += curr.cost;

//                 for(int i=0;i<graph[curr.node].size();i++){
//                     Edge e = graph[curr.node].get(i);
//                     if(!vis[e.dest]){
//                         pq.add(new Pair(e.dest,e.wt));
//                     }
//                 }
//             }
//         }
//         System.out.println("Minimum cost of mst = "+mstCost);
//     }

//     public static void main(String[] args) {
//         int v = 4;

//         ArrayList<Edge>[] graph = new ArrayList[v];
//         createGraph(graph);
//         primsAlgo(graph, v);
//     }
// }

//Kosaraju's Algorithm for strongly connected component

// import java.util.*;

// public class Classroom {
//     static class Edge {
//         int src;
//         int dest;

//         public Edge(int s, int d) { // Constructor inside Edge class
//             this.src = s;
//             this.dest = d;

//         }
//     }

//     public static void createGraph(ArrayList<Edge>[] graph) {
//         for (int i = 0; i < graph.length; i++) {
//             graph[i] = new ArrayList<Edge>();
//         }

//         graph[0].add(new Edge(0, 2));
//         graph[0].add(new Edge(0, 3));

//         graph[1].add(new Edge(1, 0));

//         graph[2].add(new Edge(2, 1));

//         graph[3].add(new Edge(3, 4));
//     }

//     public static void topSort(ArrayList<Edge> graph[], int curr, boolean vis[], Stack<Integer> s) {

//         vis[curr] = true;

//         for (int i = 0; i < graph[curr].size(); i++) {
//             Edge e = graph[curr].get(i);
//             if (!vis[e.dest]) {
//                 topSort(graph, e.dest, vis, s);
//             }
//         }

//         s.push(curr);

//     }

//     public static void dfs(ArrayList<Edge> graph[], int curr, boolean vis[]) {
//         vis[curr] = true;
//         System.out.print(curr + " ");

//         for (int i = 0; i < graph[curr].size(); i++) {
//             Edge e = graph[curr].get(i);
//             if (!vis[e.dest]) {
//                 dfs(graph, e.dest, vis);
//             }
//         }
//     }

//     public static void kosarajuAlgo(ArrayList<Edge> graph[], int v) {
//         // step 1  -- O(v + E)
//         Stack<Integer> s = new Stack<>();
//         boolean vis[] = new boolean[v];
//         for (int i = 0; i < v; i++) {
//             if (!vis[i]) {
//                 topSort(graph, i, vis, s);
//             }
//         }

//         // step 2   O(v + E)
//         ArrayList<Edge> transpose[] = new ArrayList[v];
//         for (int i = 0; i < graph.length; i++) {
//             vis[i] = false;
//             transpose[i] = new ArrayList<Edge>();
//         }

//         for (int i = 0; i < v; i++) {
//             for (int j = 0; j < graph[i].size(); j++) {
//                 Edge e = graph[i].get(j); // e.src => e.dest
//                 transpose[e.dest].add(new Edge(e.dest, e.src));
//             }
//         }

//         // step 3  O(v + E)
//         while (!s.isEmpty()) {
//             int curr = s.pop();
//             if (!vis[curr]) {
//                 dfs(transpose, curr, vis);
//                 System.out.println();
//             }
//         }

//     }

//     public static void main(String[] args) {
//         int v = 5;

//         ArrayList<Edge>[] graph = new ArrayList[v];
//         createGraph(graph);

//         kosarajuAlgo(graph, v);

//     }
// }

//Bridge  Algorithm .

// import java.util.*;

// public class Classroom {
//     static class Edge {
//         int src;
//         int dest;

//         public Edge(int s, int d) { // Constructor inside Edge class
//             this.src = s;
//             this.dest = d;

//         }
//     }

//     public static void createGraph(ArrayList<Edge>[] graph) {
//         for (int i = 0; i < graph.length; i++) {
//             graph[i] = new ArrayList<Edge>();
//         }

//         graph[0].add(new Edge(0, 1));
//         graph[0].add(new Edge(0, 2));
//         graph[0].add(new Edge(0, 3));

//         graph[1].add(new Edge(1, 0));
//         graph[1].add(new Edge(1, 2));

//         graph[2].add(new Edge(2, 0));
//         graph[2].add(new Edge(2, 1));

//         graph[3].add(new Edge(3, 0));
//         graph[3].add(new Edge(3, 4));
//         // graph[3].add(new Edge(3, 5));

//         graph[4].add(new Edge(4, 3));
//         // graph[4].add(new Edge(4, 5));

//         // graph[5].add(new Edge(5, 3));
//         // graph[5].add(new Edge(5, 4));
//     }

//     public static void dfs(ArrayList<Edge>[] graph, int curr, boolean vis[],
//             int dt[], int low[], int time, int par) {

//         vis[curr] = true;
//         dt[curr] = low[curr] = ++time;

//         for (int i = 0; i < graph[curr].size(); i++) {
//             Edge e = graph[curr].get(i);
//             if (e.dest == par) {
//                 continue;
//             } else if (!vis[e.dest]) {
//                 dfs(graph, e.dest, vis, dt, low, time, curr);
//                 low[curr] = Math.min(low[curr], low[e.dest]);
//                 if (dt[curr] < low[e.dest]) {
//                     System.out.println("Bridge is : " + curr + "---" + e.dest);
//                 }
//             } else {
//                 low[curr] = Math.min(low[curr], low[e.dest]);
//             }
//         }
//     }

//     public static void getBridge(ArrayList<Edge>[] graph, int v) {
//         int dt[] = new int[v];
//         int low[] = new int[v];
//         int time = 0;
//         boolean vis[] = new boolean[v];

//         for (int i = 0; i < v; i++) {
//             if (!vis[i]) {
//                 dfs(graph, i, vis, dt, low, time, -1);
//             }
//         }
//     }

//     public static void main(String[] args) {
//         int v = 5;

//         ArrayList<Edge>[] graph = new ArrayList[v];
//         createGraph(graph);
//         getBridge(graph, v);
//     }
// }

//Articulation points

import java.util.*;

public class Classroom {
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) { // Constructor inside Edge class
            this.src = s;
            this.dest = d;

        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 3));
    }



    public static void dfs(ArrayList<Edge>[] graph, int curr, int par, int dt[], int low[], boolean vis[], int time,
            boolean ap[]) {

        vis[curr] = true;
        dt[curr] = low[curr] = ++time;
        int children = 0;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            int neigh = e.dest;

            if (par == neigh) {
                continue;
            } else if (vis[neigh]) {
                low[curr] = Math.min(low[curr], dt[neigh]);
            } else {
                dfs(graph, e.dest, curr, dt, low, vis, time, ap);
                low[curr] = Math.min(low[curr], low[neigh]);
                if (dt[curr] <= low[neigh] && par != -1) {
                    ap[curr] = true;
                }
                children++;
            }
        }

        if (par == -1 && children > 1) {
            ap[curr] = true;
        }
    }

//O(V+E)
    
    public static void getAP(ArrayList<Edge>[] graph, int v) {
        int dt[] = new int[v];
        int low[] = new int[v];
        int time = 0;
        boolean vis[] = new boolean[v];
        boolean ap[] = new boolean[v];

                for (int i = 0; i < v; i++) {
                    if (!vis[i]) {
                        dfs(graph, i, -1, dt, low, vis, time, ap);;
            }
        }

        for (int i = 0; i < v; i++) {
            if (ap[i]) {
                System.out.println("Ap : " + i);
            }
        }
    }

    public static void main(String[] args) {
        int v = 5;

        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);
        
        getAP(graph, v);
    }
}
