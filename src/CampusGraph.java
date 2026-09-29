import java.util.*;

public class CampusGraph {
    private Map<String, List<String>> adjVertices;

    public CampusGraph() {
        this.adjVertices = new HashMap<>();
    }

    public void addLocation(String label) {
        adjVertices.putIfAbsent(label, new ArrayList<>());
    }

    public void addConnection(String label1, String label2) {
        adjVertices.get(label1).add(label2);
        adjVertices.get(label2).add(label1); // Undirected graph
    }

    public void traverseBFS(String root) {
        if (!adjVertices.containsKey(root)) {
            System.out.println("Location not found on campus.");
            return;
        }
        
        Set<String> visited = new LinkedHashSet<>();
        Queue<String> queue = new LinkedList<>();
        
        queue.add(root);
        visited.add(root);
        
        System.out.print("Campus Route: ");
        while (!queue.isEmpty()) {
            String vertex = queue.poll();
            System.out.print(vertex + " -> ");
            
            for (String v : adjVertices.get(vertex)) {
                if (!visited.contains(v)) {
                    visited.add(v);
                    queue.add(v);
                }
            }
        }
        System.out.println("End");
    }
}