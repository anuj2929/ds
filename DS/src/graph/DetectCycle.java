package graph;

import java.util.Iterator;
import java.util.LinkedList;

public class DetectCycle {
	int V;
	LinkedList<Integer> adj[];
	DetectCycle(int v){
		V=v;
		adj=new LinkedList[V];
		for(int i=0;i<V;i++){
			adj[i]=new LinkedList<Integer>();
		}
	}
	void addEdge(int v,int u){
		adj[v].add(u);
		adj[u].add(v);
	}
	boolean isCyclic(){
		boolean visited[]=new boolean[V];
		for (int i = 0; i < visited.length; i++) {
			visited[i]=false;
		}
		for(int i=0;i<V;i++){
			if(!visited[i]){
				if(isCyclicUtil(i,visited,-1)){
					return true;
				}
			}
		}
		return false;
	}
	boolean isCyclicUtil(int i, boolean[] visited, int j) {
		visited[i]=true;
		Iterator<Integer> it=adj[i].iterator();
		while(it.hasNext()){
			int n=it.next();
			if(!visited[n]){
				if(isCyclicUtil(n, visited, i)){
					return true;
				}
			}else if(n!=j){
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		DetectCycle d=new DetectCycle(5);
		d.addEdge(0, 1);
		d.addEdge(0, 2);
		d.addEdge(1, 2);
		if(d.isCyclic()){
			System.out.println("Yes cyclic graph");
		}else{
			System.out.println("Not cyclic graph");
		}
	}

}
