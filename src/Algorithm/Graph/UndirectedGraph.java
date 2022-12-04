package Algorithm.Graph;

public class UndirectedGraph {
	
	/* graph : 엣지간의 방향성이 자유로운 구조, 셀프 엣지 또한 가능 트리(Tree)가 그래프의 한 형태임
	 * 
	 * Directed : 방향성이 존재하는 그래프 ex)Tree 
	 * Undirected : 방향성이 존재하지 않음
	 * 
	 * 하나 이상의 Circle을 만드는 그래프를 Cyclic 그래프
	 * 하나도 없는 경우 ACyclic그래프
	 * 
	 * 표현방법
	 * Adjacency Matrix(이차원배열) -> 엣지의 갯수 m, 노드의 갯수 2m 
	 * Adhacency List(LinkedList)
	 * 
	 *  
	 */
	private int count;
	private int[][] vertextMatrix;
	
	public UndirectedGraph(int count) {
		this.count = count;
		vertextMatrix = new int[count][count];
		
	}
	
	public void addEdges(int from, int to, int weight) {
		vertextMatrix[from][to] = weight;
		vertextMatrix[to][from] = weight;
		
	}
	
	public int[][] getMatrix(){
		return vertextMatrix;
		
	}

}
