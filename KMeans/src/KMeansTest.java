
public class KMeansTest {

	
	public void basicTest() {
		String input="\r\n" + 
				"0 1\r\n" + 
				"1 2\r\n" + 
				"1 1\r\n" + 
				"3 5\r\n" + 
				"3 4";
		String cluster="0 1\n"
				+ "3 5";
		

		String i1="\r\n" + 
				"0: 1 2\r\n" + 
				"0: 1 1\r\n" + 
				"0: 3 4\r\n" + 
				"1: 0 1\r\n" + 
				"2: 3 5";

		String i2="\r\n" +
				"0: 1 2\r\n" + 
				"0: 3 4\r\n" + 
				"1: 0 1\r\n" + 
				"1: 1 1\r\n" + 
				"2: 3 5";

		String i3="\r\n" + 
				"\r\n" + 
				"0: 1 2\r\n" + 
				"1: 0 1\r\n" + 
				"1: 1 1\r\n" + 
				"1: 3 4\r\n" + 
				"2: 3 5\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"";
		
		

		String i4="\r\n" + 
				"A: 0 -> 1, (1 2)\r\n" + 
				"1: 0 1\r\n" + 
				"1: 1 1\r\n" + 
				"1: 1 2\r\n" + 
				"1: 3 4\r\n" + 
				"2: 3 5\r\n" + 
				"c1: 0.75 2.5\r\n" + 
				"c2: 3.00 3.5 ";
		
		
		//TODO: add to print action and clusters
		
		
	}
}
