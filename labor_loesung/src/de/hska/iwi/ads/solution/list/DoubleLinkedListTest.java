package de.hska.iwi.ads.solution.list;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class DoubleLinkedListTest {

  /*   @Override
    public <K extends Comparable<K>, V> Map<K, V> createMap() {
        return new DoubleLinkedList<>();
    }*/

    Map<Integer, String> testMap;

    @BeforeEach
    void setTestMap() {
        testMap = new DoubleLinkedList<>();
        testMap.put(6, "Sechs");
        testMap.put(3, "Drei");
        testMap.put(1, "Eins");
        testMap.put(7, "Sieben");
        testMap.put(8, "Acht");
        testMap.put(4, "Vier");
        testMap.put(2, "Zwei");
    }

    @Test
    void ownTestSize() {
        assertEquals(7, testMap.size());
    }

    @Test
    void ownTestGetValue() {
        assertEquals("Eins", testMap.get(1));
    }

    @Test
    void ownTestGetNonExistingValue() {
        assertNull(testMap.get(10));
    }

    
    void testPut() {
    	testMap.put(9, "Neun");
        assertEquals(8, testMap.size());    
        assertEquals("Neun", testMap.get(9));
      }
      
      @Test
      void testPut2() {
    	  testMap.put(9, "Neun");
    	  testMap.put(5, "Fünf");
        assertEquals(9, testMap.size());    
        assertEquals("Neun", testMap.get(9));
        assertEquals("Fünf", testMap.get(5));
      }
      
      @Test
      void testPut3() {
    	  testMap.put(9, "Neun");
    	  testMap.put(5, "Fünf");
    	  testMap.put(2, "Two");
    	  testMap.put(9, "Neun");
        
        assertEquals(9, testMap.size());    
        assertEquals("Neun", testMap.get(9));
        assertEquals("Fünf", testMap.get(5));
      }

    @Test
    void ownTestPutValue() {
        assertNull(testMap.put(11, "Elf"));
        assertEquals("Elf", testMap.get(11));
    }

    @Test
    void ownTestPutExistingValue() {
        assertEquals("Acht", testMap.put(8, "Eight"));
        assertEquals("Eight", testMap.get(8));
    }
    
   
    
    @Test
    void doublekeyys() {
    	assertEquals(null, testMap.put(10,"Eight" ));
    }

    @Test
    void testGet() {
      assertNull(testMap.get(5));
    }
    
    @Test
    void testGet1() {
      assertEquals("Sieben", testMap.get(7));
    }
    
    @Test
    void testGet2() {
      assertEquals("Sechs", testMap.get(6));
    }
    
    @Test
    void testGetNull() {
      assertThrows(NullPointerException.class, () -> testMap.get(null));
    }
    
    @Test
    void testPutNull() {
      assertThrows(NullPointerException.class, () -> testMap.put(null, "Null"));
    }
}