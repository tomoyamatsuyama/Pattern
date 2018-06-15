public class Solver {

	public static String[] answer() {
//		Class = "A","B" or "C" 

//		showdata();
		String[] kaitou = new String[Data.numdata];

		for(int i=0; i<Data.numdata; i++){
			double first = Data.zokusei[i][0];
			double second = Data.zokusei[i][1];
			double third = Data.zokusei[i][2];
			double four = Data.zokusei[i][3];
			double five = Data.zokusei[i][4];
			double fLD = (2.0906875 * first) + (0.4130575 * second) - (2.8526319 * third) - (0.4331897 * four) + (2.0607398 * five) + 0.037297358;
			
			if (fLD >= 1.0) {
				kaitou[i] = "C";
			} else if (-0.8 < fLD && fLD <= -0.166) {
				kaitou[i] = "B";
			} else {
				kaitou[i] = "A";
			}
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
