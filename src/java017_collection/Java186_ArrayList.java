//package java017_collection;/////////////////////////////////////못따라함
//
//import java.util.ArrayList;
//
//public class Java186_ArrayList {
//
//	public static void main(String[] args) {
//
//	}
//
//	public static String[] display(ArrayList<String> aList) {
//		ArrayList<String> aList = new ArrayList<String>();
//		aList.add("oracle");
//		aList.add("mysql");
//		aList.add("mssql");
//		String[] arr = display(aList);
//		for (String data : arr)
//			System.out.println(data);
//	}
//
//	public static String[] display(ArrayList<String> aList) {
////		String[] stn = new String[aList.size()];
////		for (int i = 0; i < stn.length; i++) {
////			stn[i] = aList.get(i);
////		}
////		return stn;
////////////////////////////////////////////////////////////////////
////	String[] stn = new String[aList.size()];
////	aList.to
////	return aList.toArray(stn);
/////////////////////////////////////////////////////////////////////
//		return aList.toArray(new String[aList.size()]);
//		
//	}
//}
package java017_collection;

import java.util.ArrayList;

public class Java186_ArrayList {

	public static void main(String[] args) {
		ArrayList<String> aList = new ArrayList<String>();
		aList.add("oracle");
		aList.add("mysql");
		aList.add("mssql");
		String[] arr = display(aList);
		for (String data : arr)
			System.out.println(data);

	}// end main()

	public static String[] display(ArrayList<String> aList) {

		// 1
//		String[] stn = new String[aList.size()];
//		for (int i = 0; i < stn.length; i++) {
//			stn[i] = aList.get(i);
//		}
//
//		return stn;

		//////////////////////////////////////////
		// 2
//		String[] stn = new String[aList.size()];
//		return aList.toArray(stn);

		//////////////////////////////////////////
		//3
		return aList.toArray(new String[aList.size()]);

	}// end display()

}// end class
