/**
 * 
 */
package util.sort;

/**
 * @author Chris Trotter
 *
 */
public class QuickSort {

	 /**
	  * Generic QuickSort Method. 
	  * @param accepts any objects which extend the comparable interface. 
	  * @return sorted array.
	  */
	 public static <T extends Comparable<? super T>> T[] sort(T[] array) 
	    {
		 	if (null == array || array.length == 1) return array;
	        sort(0, array.length - 1, array);
	        return array;
	    }

	 	/**
	 	 * 
	 	 * @param low
	 	 * @param high
	 	 * @param array
	 	 */
	    private static <T extends Comparable<? super T>> void sort(int low, int high, T[] array)
	    {
	        if (low >= high) return;
	        int p = partition(low, high, array);
	        sort(low, p, array);
	        sort(p + 1, high, array);
	    }

	    /**
	     * 
	     * @param low
	     * @param high
	     * @param array
	     * @return
	     */
	    private static <T extends Comparable<? super T>> int partition(int low, int high, T[] array)
	    {
	        T pivot = array[low];

	        int i = low - 1;
	        int j = high + 1;
	        while (i < j)
	        {
	            i++; 
	            while (array[i].compareTo(pivot) < 0) 
	                i++;
	            j--; 
	            while (array[j].compareTo(pivot) > 0) 
	                j--;
	            if (i < j) 
	                swap(i, j, array);
	         }
	         return j;
	      }

	    /**
	     * 
	     * @param i
	     * @param j
	     * @param array
	     */
	    private static <T extends Comparable<? super T>> void swap(int i, int j, T[] array)
	    {
	        T temp = array[i];
	        array[i] = array[j];
	        array[j] = temp;
	    }
	    
	    /**
	     * Standard Int[] quick sort method.
	     * @param array int[] to be sorted.
	     * @return sorted int[]
	     */
		 public static int[] sort(int[] array) 
		    {
			 	if (null == array || array.length == 1||array.length == 0) return array;
		        sort(0, array.length - 1, array);
		        return array;
		    }

		 	/**
		 	 * 
		 	 * @param low
		 	 * @param high
		 	 * @param array
		 	 */
		    private static void sort(int low, int high, int[] array)
		    {
		        if (low >= high) return;
		        int p = partition(low, high, array);
		        sort(low, p, array);
		        sort(p + 1, high, array);
		    }

		    private static int partition(int low, int high, int[] array)
		    {
		        int pivot = array[low];

		        int i = low - 1;
		        int j = high + 1;
		        while (i < j)
		        {
		            i++; 
		            while (array[i] < pivot) 
		                i++;
		            j--; 
		            while (array[j] > pivot) 
		                j--;
		            if (i < j) 
		                swap(i, j, array);
		         }
		         return j;
		      }

		    /**
		     * Simple method to swap over the values in an Array.
		     * @param i
		     * @param j
		     * @param array
		     */
		    private static void swap(int i, int j, int[] array)
		    {
		        int temp = array[i];
		        array[i] = array[j];
		        array[j] = temp;
		    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[] intArray = new int[] {};
	      intArray = sort(intArray);
	      
	      Integer[] intArray2 = null;
	      intArray2 = sort(intArray2); 
	      
	      String[] stringArray = new String[] {"CAT","A","Q","R","","Y","U","I","D","E","Q",".","C","FROG"};
	      stringArray = sort(stringArray);
	      System.out.print(true);  
	}
	
	

}
