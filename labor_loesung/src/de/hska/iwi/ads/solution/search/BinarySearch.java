package de.hska.iwi.ads.solution.search;

import de.hska.iwi.ads.search.Search;

public class BinarySearch<E extends Comparable<E>> implements Search<E>{

    @Override
    public int search(E[] a, E key, int left, int right) {
          
        if(a.length == 0) {
          return -1;
        }
        else if(key.compareTo(a[left]) < 0) {
        /*
         * 	CompareTo;
         * 		-1 = key < a[left]
         * 		0  = key = a[left]
         * 		1  = key > a[left]
         */
          return left - 1;
        }else if(key.compareTo(a[right]) > 0) {
          return right + 1;
        }
        return binarySearch(a, key, left, right);
      }
    private int binarySearch(E[] a, E key, int left, int right) {  
                                                                                    
        
        if (left > right) {
            return left;
            
        }
        else {
            int mid = (left + right)/2;
            if(key.compareTo(a[mid]) == 0) { // direk degeri bulmuyor mu
                
                return binarySearch(a, key,  left, mid-1); // [0, 1, 1, 3, 5] in diesem Fall gibt er den 1 mit kleineren index zurück            
            }
            else if(key.compareTo(a[mid])< 0) {                
                return binarySearch(a,key,left,mid-1);
            }
            else {
                return binarySearch(a, key, mid +1, right);
            }   
        }  
    }    
}