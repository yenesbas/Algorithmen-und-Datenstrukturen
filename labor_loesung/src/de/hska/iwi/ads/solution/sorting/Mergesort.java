package de.hska.iwi.ads.solution.sorting;

import de.hska.iwi.ads.sorting.AbstractMergesort;

public class Mergesort<E extends Comparable<E>> extends AbstractMergesort<E> {

	@Override
	protected void mergesort(E[] a, int links, int rechts) {
		// TODO Auto-generated method stub
		
		if(links < rechts) {
			int m = (links +rechts)/2;
			
			mergesort(a, links, m);
			mergesort(a,m+1, rechts);
			merge(a, links, m, rechts);
		}
		
	}
	
	protected void merge(E[]a, int links, int m, int rechts) {
				
		int l = links;
		int r = m+1;
		for(int i = links; i<=rechts; i++) {
			if (r > rechts || (l<=m && a[l].compareTo(a[r])<=0 )) {		//(r>rechts) heißt alle elemente in rechten Teil bereits in b übertragen worden sind 
				b[i] = a[l];		                                 //wenn aktuelle Element a[l] kleiner oder gleich a[r] ist, wird a[l] in b[i] kopiert.
				l = l+1;
				}
		else {
			b[i] = a[r];        
			r= r+1;
			}
		}
		for(int i = links; i<= rechts; i++) {
			a[i] = b[i];			
		}		
	}
	
}