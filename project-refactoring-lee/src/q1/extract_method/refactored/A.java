package q1.extract_method.refactored;

import java.util.List;

public class A {
   Node m1(List<Node> nodes, String p) {
      ex(nodes, p);
   }

   Edge m2(List<Node> edgeList, String p) {
      ex(edgeList, p);
   }
   
   <T extends Graph> void ex(List<T> objects, String p) {
	   for (obj : objects) {
			if (obj.contains(p)) {
				System.out.println(obj);
			}
	   }
	   
	   return null;
   }

	private void extractedMethod(List<Node> nodeList, String p) {
		for (node : nodeList) {
			if (node.contains(p)) {
				System.out.println(node);
			}
		}
	}
}

class Graph {
	String name;
	
	public boolean contains(String p) {
		return name.contains(p);
	}
}

class Node extends Graph {
}

class Edge extends Graph {
}