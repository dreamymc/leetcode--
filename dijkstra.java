import java.util.*;

class Graph {
    private int V;
    private List<List<Edge>> adj;

    Graph(int V) {
        this.V = V;
        adj = new ArrayList<>(V);
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
    }

    void addEdge(int src, int dest, int weight) {
        Edge edge = new Edge(dest, weight);
        adj.get(src).add(edge);
    }

    List<Integer> dijkstra(int src, int dest) {
        int[] dist = new int[V]; // Define the dist array
        int[] prev = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        Arrays.fill(prev, -1);

        dist[src] = 0;
        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(node -> node.distance));
        pq.add(new Node(src, 0));

        while (!pq.isEmpty()) {
            Node u = pq.poll();
            int uNode = u.node;

            for (Edge edge : adj.get(uNode)) {
                int v = edge.dest;
                int weight = edge.weight;

                if (dist[uNode] != Integer.MAX_VALUE && dist[uNode] + weight < dist[v]) {
                    dist[v] = dist[uNode] + weight;
                    prev[v] = uNode;
                    pq.add(new Node(v, dist[v]));
                }
            }
        }

        List<Integer> path = new ArrayList<>();
        int current = dest;
        while (current != -1) {
            path.add(current);
            current = prev[current];
        }
        Collections.reverse(path);

        return path;
    }

    int getShortestDistance(int src, int dest) {
        List<Integer> path = dijkstra(src, dest);
        int distance = 0;

        if (path.size() > 1) {
            for (int i = 0; i < path.size() - 1; i++) {
                int u = path.get(i);
                int v = path.get(i + 1);
                for (Edge edge : adj.get(u)) {
                    if (edge.dest == v) {
                        distance += edge.weight;
                        break;
                    }
                }
            }
            return distance;
        } else {
            return -1;
        }
    }

    private class Node {
        int node;
        int distance;

        Node(int node, int distance) {
            this.node = node;
            this.distance = distance;
        }
    }

    private class Edge {
        int dest;
        int weight;

        Edge(int dest, int weight) {
            this.dest = dest;
            this.weight = weight;
        }
    }
}

public class dijkstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of nodes (1-10): ");
        int V = scanner.nextInt();
        if (V < 1 || V > 10) {
            System.out.println("Invalid number of nodes. Please enter a number between 1 and 10.");
            return;
        }

        Graph graph = new Graph(V);

        System.out.print("Enter the source node (0-" + (V - 1) + "): ");
        int src = scanner.nextInt();
        if (src < 0 || src >= V) {
            System.out.println("Invalid source node. Please enter a valid node.");
            return;
        }

        System.out.print("Enter the target node (0-" + (V - 1) + "): ");
        int dest = scanner.nextInt();
        if (dest < 0 || dest >= V) {
            System.out.println("Invalid target node. Please enter a valid node.");
            return;
        }

        System.out.print("Enter the number of different edges for each node: ");
        int numEdges = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < V; i++) {
            for (int j = 0; j < numEdges; j++) {
                System.out
                        .print("Enter the destination node and weight for edge " + (j + 1) + " from node " + i + ": ");
                int edgeDest = scanner.nextInt();
                int edgeWeight = scanner.nextInt();
                if (edgeDest < 0 || edgeDest >= V) {
                    System.out.println("Invalid destination node. Please enter a valid node.");
                    return;
                }
                graph.addEdge(i, edgeDest, edgeWeight);
            }
        }

        int shortestDistance = graph.getShortestDistance(src, dest);
        List<Integer> shortestPath = graph.dijkstra(src, dest);

        System.out.println("Shortest Path from Node " + src + " to Node " + dest + ":");
        for (int i = 0; i < shortestPath.size() - 1; i++) {
            System.out.print(shortestPath.get(i) + " -> ");
        }
        System.out.println(shortestPath.get(shortestPath.size() - 1));
        System.out.println("Shortest Distance: " + shortestDistance);

    }
}
