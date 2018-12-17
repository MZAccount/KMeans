import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Puncte {
private Map<Integer,List<Integer>> mPuncte;

public Set<Entry<Integer, List<Integer>>> entrySet() {
	return mPuncte.entrySet();
}
}
