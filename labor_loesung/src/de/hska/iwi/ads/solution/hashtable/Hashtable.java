package de.hska.iwi.ads.solution.hashtable;

public class Hashtable<K extends Comparable<K>, V> extends de.hska.iwi.ads.dictionary.AbstractHashMap<K,V>{

    public Hashtable(int capacity) {
        super(capacity);
        // TODO Auto-generated constructor stub
    }
    
    private int hash(K key, int index) {
        int leng = this.hashtable.length;
        int hashCode = key.hashCode();
        int hash = hashCode % leng + (index * index) % leng;

        return hash;

     }
    
    public V get(Object o) {
        
        K key = (K)o;
        
        int i = 0;
        
        int j;
        do {
            
             j = hash(key, i);
            if(hashtable[j] != null && hashtable[j].getKey() == key) {
                return hashtable[j].getValue();
                
            }
            i++;
        }
            
            while(hashtable[j] != null && i<hashtable.length);    
            
            return null;
    }
    

     public V put(K key, V value) {

     
     int i = 0; 
     int j;
     do  {
         j = hash(key, i);
         
         if(hashtable[j] == null) {
             hashtable[j] = new SimpleEntry<>(key, value);
             
             this.size++;
             
             return null;
         }
         
         if(hashtable[j].getKey().equals(key)) {
             V oldValue = hashtable[j].getValue();
             hashtable[j].setValue(value);
             
             
           return oldValue;
         }
         i++;
         
     }
     while(i<hashtable.length);
     
     throw new DictionaryFullException();
    

}
}