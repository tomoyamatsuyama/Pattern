public class Solver {

	public static String[] answer() {
//		Class = "A","B" or "C" 

//		showdata();
		String[] kaitou = new String[Data.numdata];
		for(int i=0; i<Data.numdata; i++){
			double x = Data.zokusei[i][0];
			if (x < (-1.0 + 1.0/3.0) ) {
				kaitou[i] = "A";
			} else if (x < (-1.0 + 2.0/3.0) ) {
				kaitou[i] = "B";
			} else {
				kaitou[i] = "C";
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
