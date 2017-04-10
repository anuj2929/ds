package graph;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph {
	private int V;
	private LinkedList<Integer> abj[];

	Graph(int v) {
		V = v;
		abj = new LinkedList[v];
		for (int i = 0; i < v; i++) {
			abj[i] = new LinkedList<Integer>();
		}
	}

	void addEdge(int v, int w) {
		abj[v].add(w);
	}

	void BFS(int s) {
		boolean visited[] = new boolean[V];
		for (int i = 0; i < visited.length; i++) {
			visited[i] = false;
		}
		LinkedList<Integer> queue = new LinkedList<Integer>();
		queue.add(s);
		visited[s] = true;

		while (queue.size() != 0) {
			s = queue.poll();
			System.out.print(s + " ");
			Iterator<Integer> it = abj[s].iterator();
			while (it.hasNext()) {
				int n = it.next();
				
				if (!visited[n]) {
					visited[n] = true;
					queue.add(n);
				}
			}
		}
	}
}
