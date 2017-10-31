import java.util.*;

public class SelectionSorter {

	public static void selectionSort(ArrayList<String> wordList) {
		
	int size = wordList.size();
	String temp;
	boolean largest = true;
	for (int i = size - 1 ; i > 0; i--) {
		for (int j = 0; j < i -1; j++) {
			if (wordList.get(i).compareTo(wordList.get(j)) < 0) {
				Collections.swap(wordList, i, j);
				} 
			
		}
	}
		
	}
}

