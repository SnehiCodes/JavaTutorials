public class Main {
    public static void main(String[] args){
        //  Depth First Search  =  Pick a route, keep going.
        //                         If you reach a dead end, or an already visited node,
        //                         backtrack to a previous node with unvisited adjacent neighbours

        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(1,4);
        graph.addEdge(2,3);
        graph.addEdge(2,4);
        graph.addEdge(4,0);
        graph.addEdge(4,2);

        graph.print();

        graph.depthFirstSearch(0);

    }

    public void depthFirstSearch(int src){
        boolean[] visited = new boolean[matrix.length];
       dFSHelper(src,visited);}


