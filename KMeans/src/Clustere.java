import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Clustere {
	private Map<String,List<Integer>> mClustere;
	Map<String, List<Integer>> mHartaClusterPuncte;
	public Set<Entry<String, List<Integer>>> setCentre() {
		return mClustere.entrySet();
	}
	public Map<String, List<Integer>> hartaClusterPuncte() {
		return mHartaClusterPuncte;
	}
	public List<Integer> get(String clusterMinim) {
		return mClustere.get(clusterMinim);
	}

}
