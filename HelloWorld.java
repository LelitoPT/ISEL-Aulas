import java.util.*;
public class HelloWorld {
	public static boolean compareArray(int[] a, int[] b) {		
		boolean ok = true;
		for (int i = 0; i < a.length ; i++) {
			if (a[i] != b[i]) {
				ok = false;
			}
		}
		return ok;
	}
	public static int[] equalArray(int[] a, int beg, int end) {
		int[] b = new int [end];
		int tmp = 0;
		for (int i = beg; i < end; i++) {
			b[tmp] = a[i];
			tmp++;
		}
		return b;
	}
	public static int string2Int( String str ){
		int decimal = 1, tgt_int = 0;
		for (int i = str.length(); i > 0; i--) {
			tgt_int += ((int)(str.charAt(i - 1) - '0') * decimal);
            decimal *= 10;
		}
		return tgt_int;
	} 
	public static void main (String [] args) {
		System.out.println("HelloWorld");
		Scanner in = new Scanner(System.in);
		int[] arr = new int[args.length];
		
		for(int i = 0; i < args.length; ++i){
			arr[i] = string2Int(args[i]);
		}
		
		System.out.println("Reverse array:");
		
		int reverser = arr.length - 1;
		int[] rev_arr = new int [arr.length];
		for(int i = 0; i < arr.length; ++i){
			if (i == 0) {
				System.out.print("[ ");
				System.out.print((int)arr[reverser] + " ");
			}
			else {
				System.out.print(" " + (int)arr[reverser] + " ");
			}
			if (i == arr.length - 1 ) {
				System.out.println("]");
			}
			rev_arr[i] = arr[reverser];
			reverser -= 1;
		}
		
		System.out.println("Duplicate array:");

		int[] b_arr = equalArray(arr, 0, arr.length);

		for(int i = 0; i < b_arr.length; ++i){
			if (i == 0) {
				System.out.print("[ ");
				System.out.print((int)b_arr[i] + " ");
			}
			else {
				System.out.print(" " + (int)b_arr[i] + " ");
			}
			if (i == b_arr.length - 1 ) {
				System.out.println("]");
			}
		}

		System.out.println("Same array? " + compareArray(b_arr, arr));
	}

}