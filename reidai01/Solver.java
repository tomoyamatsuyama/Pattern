import java.util.*;

import java.math.*;

public class Solver {

	public static String[] answer() {
//		Class = "A","B" or "C" 

		double setA = -0.040474694;
		double setB = 0.0084862875342282;
		double setC = 0.0344168757355263;

		// showdata();
		String[] kaitou = new String[Data.numdata];
		for(int i=0; i<Data.numdata; i++){
			Double one = Data.zokusei[i][0];
			Double two = Data.zokusei[i][1];
			Double three = Data.zokusei[i][2];
			Double four = Data.zokusei[i][3];
			Double five = Data.zokusei[i][4];

			Double ave = (one + two + three + four + five) / 5;

			Double diffA = Math.abs(ave - setA);
			Double diffC = Math.abs(ave - setB);
			Double diffB = Math.abs(ave - setC);

			HashMap<Double, String> diffMap = new HashMap<>();
			diffMap.put(diffA, "A");
			diffMap.put(diffB, "B");
			diffMap.put(diffC, "C");

			Object[] mapKey = diffMap.keySet().toArray();
			Arrays.sort(mapKey);

			Object key = mapKey[0];
			String value = diffMap.get(key);
			System.out.println(value);

			// if (x < (-1.0 + 1.0/3.0) ) {
			// 	kaitou[i] = "A";
			// } else if (x < (-1.0 + 2.0/3.0) ) {
			// 	kaitou[i] = "B";
			// } else {
			// 	kaitou[i] = "C";
			// }
		}
		return kaitou;
	}

	private static void showdata() {
		for(int i=0; i<Data.numdata; i++){
			System.out.print(i + ",");
			for(int j=0; j<Data.numzokusei; j++){
				System.out.print(Data.zokusei[i][j] + ",");
			}
			System.out.println();
		}
	}

}
