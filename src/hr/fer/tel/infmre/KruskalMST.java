package hr.fer.tel.infmre;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by fhrenic on 06/12/2016.
 */
public class KruskalMST {

	private double weight;
	private final List<Edge> mst;

	public KruskalMST(Graph g) {

		mst = new LinkedList<>();
		List<Edge> edges = new ArrayList<>(g.getEdges());
		edges.sort(null);
		UnionFind uf = new UnionFind(g.getV());

		// run greedy algorithm
		for (Edge e : edges) {
			int u = e.getEither();
			int v = e.getOther(u);

			if (!uf.areConnected(u, v)) {
				uf.union(u, v);
				mst.add(e);
				weight += e.getWeight();
			}
		}

	}

	public double getWeight() {
		return weight;
	}

	public Iterable<Edge> getMST() {
		return mst;
	}
}
