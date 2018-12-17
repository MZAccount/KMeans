import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;


public class KMeansMain {

	public static  void main(String[] args) {
		String input="0 1\n"
				+ "1 2\n"
				+ "3 5\n";
		String sCluster="1 2";
		
//
//		List<List<Integer>> puncte=getPoints(input);
//		List<List<Integer>> centreCluster=getPoints(sCluster);
//		
//Map<Integer,List<Integer>>		hartaPuncte=getInitialPointsMap(puncte,0);
//		


//////////////////

// Add in new data, one at a time, recalculating centroids with each new one. 

Entry<Puncte,Clustere> date = null;


Puncte Puncte = date.getKey();
Clustere Clustere = date.getValue();
Map<String, List<Integer>> ClusterePuncte = Clustere.hartaClusterPuncte();
for(Entry<Integer, List<Integer>> punct:Puncte.entrySet()){
	int i=punct.getKey();
	List<Integer> vectorPunct = punct.getValue();
	int minim=Integer.MAX_VALUE;
	String clusterMinim="A";
	// Calculam minimul distantei punctului fata de clustere
	for(Entry<String, List<Integer>> cluster:Clustere.setCentre()){
		String j=cluster.getKey();
		List<Integer> vectorCentruCluster = cluster.getValue();
		int nrDimensiuni=vectorPunct.size();
		int distanta=0;
		// Calculam distanta intre punct si centru
		for (int k = 0; k < nrDimensiuni; k++) {
			int valoarePunct=vectorPunct.indexOf(k);
			int valoareCentru=vectorCentruCluster.indexOf(k);
			distanta+=(int)Math.pow(valoarePunct-valoareCentru,2);
		}
		distanta=(int) Math.sqrt(distanta);
		
		if(minim>distanta) {
			minim=distanta;
			clusterMinim=j;
		}
		}
	// Actualizam centrul cluster-ului
	List<Integer> vectorCentruCluster = Clustere.get(clusterMinim);
	ClusterePuncte.get(clusterMinim).add(i);
	
	int size = ClusterePuncte.get(clusterMinim).size();
	
	int nrDimensiuni=vectorPunct.size();
	
	
	for(Entry<Integer, List<Integer>> punct2:Puncte.entrySet()){
		if(ClusterePuncte.get(clusterMinim).contains(punct2.getKey())) {
			// Punct din cluster
			List<Integer> vectorPunct2 = punct2.getValue();

			
			
			
//			for (int k = 0; k < nrDimensiuni; k++) {
//				int valoarePunct=vectorPunct2.indexOf(k);
//				int valoareCentru=vectorCentruCluster.indexOf(k);
//				int valoareNoua=valoarePunct
//			}
		}
	}
	

	}
}

	private static Map<String, List<Integer>> getClusterPoints() {
		// TODO Auto-generated method stub
		return null;
	}

}
