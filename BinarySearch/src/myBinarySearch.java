import java.util.Arrays;

/**
 * Implementation of binary search algorithm 
 * 
 * @author Andreas
 *
 */
public class myBinarySearch {
	/**
	 * Search for int key within sorted int array a[]
	 * @param key the int to be searched
	 * @param a array of integers, must be sorted in ascending order
	 * @return index of key in array a[ if present; -1 if not present
	 */
	public static int rank(int key, int[] a){
		int lo = 0;
		int hi = a.length - 1;
		while(lo <= hi){
			//Key is in a[lo..hi or not present
			int mid = lo + (hi - lo)/2;
			if(key < a[mid] ){
				hi = mid - 1;
			}
			else if(key < a[mid]){
				lo = mid + 1;
			}
			else
				return mid;
		}
		return -1;
	}
	
	/**
	 * Reads in a sequence of ints from the whitelist file, specifies as command line 
	 * argument. Reads in ints from standard input and prints to standard output those ints
	 * that do not appear in file
	 * @param args
	 */
	
	public static void main(String[] args){
		
		//read the integers from a file
		In in = new In(args[0]);
		int[] whitelist = In.readInts(args[0]);
		
		//sort the array
		Arrays.sort(whitelist);
		
		//read integer key from standard input; print if not in whitelist
		while(!StdIn.isEmpty())
		{
			int key = StdIn.readInt();
			if (rank(key, whitelist) == -1)
				StdOut.println(key);
		}
	}
		
}
		
