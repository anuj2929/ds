package graph;

import java.util.Iterator;
import java.util.LinkedList;

public class DFS {
	int V;
	LinkedList<Integer> ll[];
	DFS(int v){
		V=v;
		ll=new LinkedList[V];
		for (int i = 0; i < ll.length; i++) {
			ll[i]=new LinkedList<Integer>();
		}
	}
	void addEdge(int v,int u){
		ll[v].add(u);
	}
	void recursionDFS(int source,boolean[] visited){
		visited[source]=true;
		System.out.print(source+" ");
		Iterator<Integer> it=ll[source].iterator();
		while (it.hasNext()) {
			int n=it.next();
			if(!visited[n]){
				recursionDFS(n, visited);
			}
			
		}
	}
	void callDFS(int source){
		boolean visited[]=new boolean[V];
		recursionDFS(source,visited);
	}
	
	public static void main(String[] args) {
		DFS d=new DFS(5);
		d.addEdge(0,1);
		d.addEdge(0,2);
		d.addEdge(1,3);
		d.addEdge(1,4);
		d.callDFS(0);
	}
}
