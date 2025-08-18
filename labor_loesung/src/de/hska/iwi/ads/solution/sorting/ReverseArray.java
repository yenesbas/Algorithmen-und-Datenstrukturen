/*
package de.hska.iwi.ads.solution.sorting;
import de.hska.iwi.ads.sorting.Reverse;


public class ReverseArray <E extends Comparable<E>> implements Reverse<E>{
	@Override
	public void reverse(E[] a, int from, int to) {
		if (a.length <=0) {
			return;
		}
		E temp;
		
		int k = to;
		int mid= (from + to)/2;
		
		for(int i = from; i <= mid; i++) {
			temp = a[i];
			a[i] = a[k];
			a[k] = temp;
			k--;
		}
	}
}
*/

package de.hska.iwi.ads.solution.sorting;

import de.hska.iwi.ads.sorting.Reverse;

public class ReverseArray<E extends Comparable<E>> implements Reverse<E> {
	
	
	public void reverse(E[] a, int from, int to) {
		if(a.length <=0) {
			System.out.println("Leere Array");
		}
		
		while(from < to) {
			E speicher = a[from];
			a[from] = a[to];
			a[to] = speicher;
			from ++;
			to--;
		}
	}
  
}
