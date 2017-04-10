package graph;

import java.util.Iterator;
import java.util.LinkedList;

public class BFS {
	int V;
	LinkedList<Integer> adj[];
	BFS(int v){
		V=v;
		adj=new LinkedList[V];
		for (int i = 0; i < adj.length; i++) {
			adj[i]=new LinkedList<Integer>();
		}
	}
	void addEdge(int v,int u){
		adj[v].add(u);
	}
	void BFSUtil(int s){
		boolean visited[]=new boolean[V];
		LinkedList<Integer> pq=new LinkedList<Integer>();
		pq.add(s);
		visited[s]=true;
		while(pq.size()!=0){
			s=pq.poll();
			System.out.print(s+" ");
			Iterator<Integer> it=adj[s].iterator();
			while(it.hasNext()){
				int n=it.next();
				if(!visited[n]){
					visited[n]=true;
					pq.add(n);
				}
			}
		}
	}
	public static void main(String[] args) {
		BFS b=new BFS(6);
		b.addEdge(0,1);
		b.addEdge(1,2);
		b.addEdge(2,4);
		b.addEdge(1,3);
		b.addEdge(1, 5);
		b.BFSUtil(0);
	}
}
