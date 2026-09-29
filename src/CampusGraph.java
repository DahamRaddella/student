import java.util.*;

public class CampusGraph {
    private Map<String, List<String>> adjList;

    public CampusGraph() {
        adjList = new HashMap<>();
    }

    // Add building/vertex
    public void addBuilding(String building) {
        adjList.putIfAbsent(building, new ArrayList<>());
    }

    // Add path/edge between buildings
    public void addPath(String building1, String building2) {
        addBuilding(building1);
        addBuilding(building2);
        adjList.get(building1).add(building2);
        adjList.get(building2).add(building1); // Undirected graph
    }

    // BFS traversal to find route
    public void displayCampusRoute(String start) {
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.add(start);
        visited.add(start);

        System.out.println("Campus Route starting from " + start + ":");
        while (!queue.isEmpty()) {
            String current = queue.poll();
            System.out.print(current + " -> ");
            for (String neighbor : adjList.get(current)) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
        System.out.println("END");
    }

    public void printGraph() {
        for (String building : adjList.keySet()) {
            System.out.println(building + " connects to: " + adjList.get(building));
        }
    }
}
