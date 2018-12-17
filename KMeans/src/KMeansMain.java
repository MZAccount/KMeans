import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class KMeansMain {

	public static void main(String[] args) {
		String input="0 1\n"
				+ "1 2\n"
				+ "3 5\n";
		String cluster="1 2";
		

		List<List<Integer>> puncte=getPoints(input);
		List<List<Integer>> centreCluster=getPoints(cluster);
		
Map<Integer,List<Integer>>		hartaPuncte=getInitialPointsMap(puncte,0);
		
		for(;unclusteredPointsRemain(hartaPuncte,0);) {
			addClosestPointToRespectiveClusterAndUpdateCluster(hartaPuncte);
		}
		
		
	}

	private static void addClosestPointToRespectiveClusterAndUpdateCluster(Map<Integer, List<Integer>> hartaPuncte) {
Entry<Integer, List<Integer>> pair;
pair=		addClosestPointToCluster(hartaPuncte);
int cluster=pair.getKey();
List lastPoint=pair.getValue();
		updateCluster(cluster,lastPoint);
		
	}

	private static Entry<Integer, List<Integer>> addClosestPointToCluster(Set<Integer, List<Integer>> hartaPuncte) {
		
		// Optional
		sortPoints(points);
		
		List< List<Integer>> puncte=getUnsortedSet(hartaPuncte);
		
		List< List<Integer>> centre=getCenters(hartaPuncte);
		Set<Integer,List<List<Integer>> distanceToClusterCenter=
				getClusterDistances(puncte,centre);
		
		// TODO Auto-generated method stub
		return null;
	}

	private static  List<List<Integer>> getClusterDistances(List<List<Integer>> puncte,
			List<List<Integer>> centre) {
		
		for (List<Integer> punct : puncte) {
			for (List<Integer> centru : centre) {
				distante.add(distance(punct,centru));			}
		}
		
		return null;
	}

	private static Integer distance(List<Integer> punct, List<Integer> centru) {
		Integer rez = 0;
		assert punct.size()==centru.size();
		int i=0;
		for (Integer integer : punct) {
			rez+=(int)Math.pow(integer-centru.get(i),2);
			i++;
		}
		return (int) Math.sqrt(rez);
	}

	private static void sortPoints() {
		// TODO Auto-generated method stub
		
	}

	private static void updateCluster(int cluster, List lastPoint) {
		// TODO Auto-generated method stub
		
	}

	private static Map<Integer, List<Integer>> getInitialPointsMap(List<List<Integer>> points, int i) {
		Map map=new HashMap();
		for (List<Integer> point : points) {
			map.put(i, point);
		}
		return map;
	}

	private static boolean unclusteredPointsRemain(Map<Integer,List<Integer>> pointsMap, int i) {

		Map<Integer, Entry<Integer, List<Integer>>> unclusteredPointsMap = pointsMap.entrySet().stream().filter(p->p.getKey().intValue()==i).collect(Collectors.toMap(java.util.Map.Entry::getKey, e -> e));
		
	
		return unclusteredPointsMap.isEmpty();
	}

	private static List<List<Integer>> getPoints(String input) {
		String[] split = input.split("\n");
		List<String> rawPointList=Arrays.asList(split);
		List<List<Integer>> pointsList=rawPointList.stream().map(s->{
			
			return Arrays.asList(s.split(" " )).stream().map(i->new Integer(i)).collect(Collectors.toList());}).collect(Collectors.toList());
		return pointsList;
	}

}
