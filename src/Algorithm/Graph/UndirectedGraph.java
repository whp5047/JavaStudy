package Algorithm.Graph;

public class UndirectedGraph {
	
	/* graph : �������� ���⼺�� �����ο� ����, ���� ���� ���� ���� Ʈ��(Tree)�� �׷����� �� ������
	 * 
	 * Directed : ���⼺�� �����ϴ� �׷��� ex)Tree 
	 * Undirected : ���⼺�� �������� ����
	 * 
	 * �ϳ� �̻��� Circle�� ����� �׷����� Cyclic �׷���
	 * �ϳ��� ���� ��� ACyclic�׷���
	 * 
	 * ǥ�����
	 * Adjacency Matrix(�������迭) -> ������ ���� m, ����� ���� 2m 
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
