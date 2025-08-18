package de.hska.iwi.ads.solution.sorting;

import de.hska.iwi.ads.sorting.AbstractMergesort;

public class ReverseMergesort<E extends Comparable<E>> extends AbstractMergesort<E> {

	@Override
	protected void mergesort(E[] a, int links, int rechts) {
		// TODO Auto-generated method stub
		
		int mid; 
		if(links < rechts ) {
			mid = (links +rechts)/2;
			mergesort(a,links,mid);
			mergesort(a,mid+1,rechts);
			merge(a, links, mid, rechts);
		}
	}
	
	ReverseArray<E> umdrehen = new ReverseArray<>();
	
	protected void merge(E [] a, int links, int m, int rechts) {
		
		int l = links;
		int r = rechts;
		
		umdrehen.reverse(a, m+1, r);
		for (int i = links; i<= rechts; i++) {
			if(a[l].compareTo(a[r])<=0) {
				b[i]= a[l];
				l = l+1;
			}
			else {
				b[i] = a[r];
				r= r-1;
			}
		}
		for(int i = links; i<=rechts; i++) {
			a[i] = b[i];
		}
		
		
	}
	
	

}
