package graph;

import java.util.*;

public class CloneGraphEx {

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        n1.neighbors.add(n2);
        n1.neighbors.add(n4);
        n2.neighbors.add(n3);
        n3.neighbors.add(n4);
        n4.neighbors.add(n1);

        CloneGraph cg = new CloneGraph();
        Node clone = cg.cloneGraph(n1);

        CloneGraphAnother another = new CloneGraphAnother();
        Node anotherWay = another.cloneGraph(n1);

        System.out.println("Original graph : " + n1);
        System.out.println("Cloned graph : " + clone);
        System.out.println("Cloned graph : " + anotherWay);

    }
}

class Node {
    int val;
    List<Node> neighbors;
    Node(int val) {
        this.val = val;
        this.neighbors = new ArrayList<>();
    }
}

class CloneGraph {
    public Node cloneGraph(Node node) {
        if (node == null) return null;

        HashMap<Node, Node> map = new HashMap<>();
        return dfs(node, map);
    }

    private Node dfs(Node node, HashMap<Node, Node> map) {
        if (map.containsKey(node)) return map.get(node);

        Node clone = new Node(node.val);
        map.put(node, clone);
        for (Node neighbor : node.neighbors) {
            clone.neighbors.add(dfs(neighbor, map));
        }
        return clone;
    }
}

class CloneGraphAnother {
    public Node cloneGraph(Node node) {
        if (node == null) return null;

        HashMap<Node, Node> map = new HashMap<>();
        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);
        map.put(node, new Node(node.val));

        while (!queue.isEmpty()) {
            Node curr = queue.poll();
            for (Node neighbor : curr.neighbors) {
                if (!map.containsKey(neighbor)) {
                    map.put(neighbor, new Node(neighbor.val));
                    queue.offer(neighbor);
                }
                map.get(curr).neighbors.add(map.get(neighbor));
            }
        }
        return map.get(node);
    }
}