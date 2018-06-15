import java.util.*;
import java.math.*;

public class Solver {

	public static String[] answer() {
//		Class = "A","B","C","D" or "E" 

//		showdata();
		double setA = -1.592133067;
		double setB = -0.896488442;
		double setC = -0.067492503;
		double setD = 0.682362548;
		double setE = 1.6289112;

		String[] kaitou = new String[Data.numdata];
		for(int i=0; i<Data.numdata; i++){
			double first = Data.dzokusei[i][0];
			double second = Data.dzokusei[i][1];
			double third = Data.dzokusei[i][2];
			double four = Data.dzokusei[i][3];
			double five = Data.dzokusei[i][4];
			// double six = Data.dzokusei[i][5];
			
			// if (six.equals("px")) {
			// 	sixth = 0.172049073;
			// } else if (six.equals("sg")) {
			// 	sixth = -0.124851484;
			// } else if (six.equals("vt")) {
			// 	sixth = -0.205124321;
			// } else if (six.equals("wr")) {
			// 	sixth = 0.067781060;
			// } else {
			// 	sixth = 0.0;
			// }
			
			// double fLD = (0.755941367 * first) + (0.006241747 * second) + (2.462826054 * third) - (0.014861695 * four) - (0.576328167 * five) - 0.02253642 + 0.003886572;
			
			double fLD = (0.764557334 * first) + (0.001234026 * second) + (2.455223849 * third) - (0.016081431 * four) - (0.569096397 * five) + 0.013720752;

			Double diffA = Math.abs(fLD - setA);
			Double diffB = Math.abs(fLD - setB);
			Double diffC = Math.abs(fLD - setC);
			Double diffD = Math.abs(fLD - setD);
			Double diffE = Math.abs(fLD - setE);

			HashMap<Double, String> diffMap = new HashMap<>();
			diffMap.put(diffA, "A");
			diffMap.put(diffB, "B");
			diffMap.put(diffC, "C");
			diffMap.put(diffD, "D");
			diffMap.put(diffE, "E");

			Object[] mapKey = diffMap.keySet().toArray();
			Arrays.sort(mapKey);

			Object key = mapKey[0];
			String value = diffMap.get(key);
			kaitou[i] = value;

			// if (fLD < -1.61) {
			// 	kaitou[i] = "A";
			// } else if (fLD < -0.92) {
			// 	kaitou[i] = "B";
			// } else if (fLD < -0.07) {
			// 	kaitou[i] = "C";
			// } else if (fLD < 0.069) {
			// 	kaitou[i] = "D";
			// } else {
			// 	kaitou[i] = "E";
			// }
		}
		return kaitou;
	}

	private static void showdata() {
		for(int i=0; i<Data.numdata; i++){
			System.out.print(i + ",");
			for(int j=0; j<Data.numzokusei-1; j++){
				System.out.print(Data.dzokusei[i][j] + ",");
			}
			System.out.print(Data.szokusei[i]);
			System.out.println();
		}
	}

}
