public class AdjacencyListGraph {
    // adjacency lists (using bag data type)
    private final int V;
    private Bag<Integer>[] adj;

    public AdjacencyListGraph(int V) {
        this.V = V;
        // create empty graph with V vertices
        adj = (Bag<Integer>[]) new Bag[V];
        for (int v = 0; v < V; v++) {
            adj[v] = new Bag<Integer>();
        }
    }

    public void addEdge(int v, int w) {
        // add edge v+w (parallel edges allowed)
        adj[v].add(w);
        adj[w].add(v);
    }

    public Iterable<Integer> adj(int v) {
        // iterator for vertices adjacent to v
        return adj[v];
    }
}
