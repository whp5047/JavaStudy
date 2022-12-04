package Algorithm.Graph;

import java.util.Stack;

public class DfsSearch {

	int count;
	boolean[] visited;
	Stack<Integer> stack;
	int[][] matrix;
	
	public DfsSearch(int count) {
		this.count = count;
		visited = new boolean[count];
		stack = new Stack<Integer>();
	}

	public void dfsTraversal() {
		stack.push(0);
		visited[0] = true;
		
		while(stack.isEmpty() == false) {
			int node = stack.pop();
			
			System.out.print(node + " ");
			
			for( int j = 0 ; j <count ; j++) {
				
				if(matrix[node][j] != 0 && visited[j] == false ) {
					stack.push(j);
					visited[j] = true;
				}
				
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		// dfs 깊이우선탐색 스택으로 구현
		// bfs 넓이우선탐색 큐로 구현
		
		int count = 8;
		UndirectedGraph graph = new UndirectedGraph(count);
		
		graph.addEdges(0, 1, 1);
		graph.addEdges(0, 2, 1);
		graph.addEdges(1, 3, 1);
		graph.addEdges(1, 4, 1);
		graph.addEdges(2, 5, 1);
		graph.addEdges(2, 6, 1);
		graph.addEdges(4, 5, 1);
		graph.addEdges(3, 7, 1);
		
		DfsSearch dfs = new DfsSearch(count);
		dfs.matrix = graph.getMatrix();
		dfs.dfsTraversal();

	}

}
