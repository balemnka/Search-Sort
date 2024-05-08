import java.util.ArrayList;

public class SearchSort {

	public static void main(String[] args) {
		
	    // instantiate two ArrayList
	    ArrayList<Integer> integersList1 = new ArrayList<>();
	    ArrayList<Integer> integersList2 = new ArrayList<>();
	    
	    int numElements = 50000;
	    
	    for (int i = 0; i < numElements; ++i) {
	      int randomNumbers = (int) (Math.random() * Integer.MAX_VALUE);
	      integersList1.add(randomNumbers);
	      integersList2.add(randomNumbers);
	    }
	    
	    long startTime = System.nanoTime();
	    selectionSort(integersList1);
	    long endTime = System.nanoTime();
	    System.out.println("Selection sort time with " + numElements + " elements = " + (endTime - startTime));
	    
	    startTime = System.nanoTime();
	    bubbleSort(integersList2);
	    endTime = System.nanoTime();
	    System.out.println("Bubble sort time with " + numElements + " elements = " + (endTime - startTime)
	    );
	  }
	
	  static void selectionSort(ArrayList<Integer> integersList) {
		  int smallestNumber;
		  int smallestIndex;
	  
		  for (int i = 0; i < integersList.size(); ++i) {
		      smallestNumber = integersList.get(i);
		      smallestIndex = i;
			
		for (int n = i + 1; n < integersList.size(); ++n) {
				if (integersList.get(n) < smallestNumber) {
					smallestNumber = integersList.get(n);
					smallestIndex = n;
				}
			}
		integersList.set(smallestIndex, integersList.get(i));
		integersList.set(i, smallestNumber);
		}
	}
	
	  static void bubbleSort(ArrayList<Integer> integersList) {
		  int temp;
		  
		  for (int i = 0; i < integersList.size(); ++i) {
		      for (int n = 0; n < integersList.size() - 1 - i; ++n) {
		    	  if (integersList.get(n) > integersList.get(n + 1)) {
		    		  temp = integersList.get(n);
		    		  integersList.set(n, integersList.get(n + 1));
		    		  integersList.set(n + 1, temp);
		    	  }
		      }
		  }
	  }
}
