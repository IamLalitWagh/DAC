package pgdac.ads.graphD11;

public interface Graph {
	void addEdge(int u, int v);
	void addEdge(int u, int v, int w);
	void printBFS(int startVertex);
	void printDFS(int startVertex);
}
