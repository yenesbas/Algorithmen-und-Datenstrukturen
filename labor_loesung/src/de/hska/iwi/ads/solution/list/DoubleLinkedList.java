package de.hska.iwi.ads.solution.list;

import de.hska.iwi.ads.dictionary.AbstractDoubleLinkedList;

public class DoubleLinkedList<K extends Comparable<K>, V> extends AbstractDoubleLinkedList<K, V> {

    private void checkNullKey(K key) {
        if (key == null) {
            throw new NullPointerException("Der Key darf nicht null sein.");
        }
    }

    private ListElement findElementByKey(K key) {
        checkNullKey(key);
        ListElement current = head;
        while (current != null) {
            if (current.entry.getKey().equals(key)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    @Override
    public V get(Object o) {
    	@SuppressWarnings("unchecked")
        K key = (K) o;
        checkNullKey(key);
        ListElement element = findElementByKey(key);
        if (element != null) {
            return element.entry.getValue();
        } else {
            return null;
        }
    }

    @Override
    public V put(K key, V value) {
        checkNullKey(key);
        ListElement element = findElementByKey(key);

        if (element != null) {
            V oldValue = element.entry.getValue();
            element.entry.setValue(value);
            return oldValue;
        } else {
            SimpleEntry<K, V> entry = new SimpleEntry<>(key, value);
            ListElement newElement = new ListElement(entry, null, head);

            if (head != null) {
                head.previous = newElement;
            }
            head = newElement;
            size++;
            return null;
        }
    }
}
