public class Solver {

	public static String[] answer() {
//		Class = "A","B","C","D" or "E" 

//		showdata();
		String[] kaitou = new String[Data.numdata];
		for(int i=0; i<Data.numdata; i++){
			double x = Data.dzokusei[i][0];
			if (x < (-1.0 + 1.0/5.0) ) {
				kaitou[i] = "A";
			} else if (x < (-1.0 + 2.0/5.0) ) {
				kaitou[i] = "B";
			} else if (x < (-1.0 + 3.0/5.0) ) {
				kaitou[i] = "C";
			} else if (x < (-1.0 + 4.0/5.0) ) {
				kaitou[i] = "D";
			} else {
				kaitou[i] = "E";
			}
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
