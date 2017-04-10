package graph;

import java.io.IOException;

class parent{
	void run(){
		
	}
}
public class Pow extends parent{
	static float power(int x,int y){
		if(y==0){
			return 1;
		}
		float l=power(x,y/2);
		if(y%2==0){
			return l*l;
		}
		else{
			return x*l*l;
		}
	}
	void run() {
		
	}
	
	public static void main(String[] args) {
		float r=power(2,4);
		System.out.println(r);
		
		Graph g=new Graph(4);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 3);
		g.BFS(0);
	}
}
