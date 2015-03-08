import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.AbstractSet;

/** A data structure that uses a linked list to store pairs of keys and values.
 *  Any key must appear at most once in the dictionary, but values may appear multiple
 *  times. Supports get(key), put(key, value), and contains(key) methods. The value
 *  associated to a key is the value in the last call to put with that key. */
public class ULLMap<K, V>  implements Map61B<K, V>, Iterable<K>{
    int size = 0;

    /** Returns the value corresponding to KEY or null if no such value exists. */
    public V get(K key) {
        if (_list == null) return null;
        Entry lookup = _list.get(key);
        if (lookup == null) return null;
        return lookup._val;
    }

    @Override
    public int size() {
        return size;
    }

    /** Removes all of the mappings from this map. */
    @Override
    public void clear() {
        size = 0;
        _list = null;
    }

    /** Inserts the key-value pair of KEY and VALUE into this dictionary,
     *  replacing the previous value associated to KEY, if any. */
    public void put(K key, V val) {
        if (_list != null) {
            Entry lookup = _list.get(key);
            if (lookup == null) _list = new Entry(key, val, _list);
            else lookup._val = val;
        } else {
            _list = new Entry(key, val, _list);
            size = size + 1;
        }
    }

    /** Returns true if and only if this dictionary contains KEY as the
     *  key of some key-value pair. */
    public boolean containsKey(K key) {
        if (_list == null) return false;
        return _list.get(key) != null;
    }

    @Override
    public Iterator<K> iterator() {
        return new ULLMapIter();
    }

    /** Returns the result of inverting DICT so that keys become values and values
     *  become keys. If more than one key corresponds to the same value, then an
     *  arbitrary key is chosen to be the new value. */
    public static <K, V> ULLMap<V, K> invert(ULLMap<K, V> dict) {
        ULLMap<V, K> inverted = new ULLMap<V, K>();
        for (K key : dict) {
            inverted.put(dict.get(key), key);
        }
        return inverted;
    }

    /** Keys and values are stored in a linked list of Entry objects.
     *  This variable stores the first pair in this linked list. */
    private Entry _list;

    /** Represents one node in the linked list that stores the key-value pairs
     *  in the dictionary. */
    private class Entry {
        
        /** Stores KEY as the key in this key-value pair, VAL as the value, and
         *  NEXT as the next node in the linked list. */
        public Entry(K key, V val, Entry next) {
            _key = key;
            _val = val;
            _next = next;
        }

        /** Returns the Entry in this linked list of key-value pairs whose key
         *  is equal to KEY, or null if no such Entry exists. */
        public Entry get(K key) {
            if (key != null && key.equals(_key)) return this;
            if (_next == null) return null;
            return _next.get(key);
        }

        /** Stores the key of the key-value pair of this node in the list. */
        private K _key;
        /** Stores the value of the key-value pair of this node in the list. */
        private V _val;
        /** Stores the next Entry in the linked list. */
        private Entry _next;
        
    }

    /** An iterator that iterates over the keys of the dictionary. */
    private class ULLMapIter implements Iterator<K> {

        /** Create a new ULLMapIter by setting _cur to the first node in the
         *  linked list that stores the key-value pairs. */
        public ULLMapIter() {
            _cur = _list;
        }

        @Override
        public boolean hasNext() {
            return _cur != null;
        }
       
        @Override
        public K next() {
            K ret = _cur._key;
            _cur = _cur._next;
            return ret;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }

        /** Stores the current key-value pair. */
        private Entry _cur;
    
    }

    @Override
    public V remove(K key) {
        throw new UnsupportedOperationException();
    }

    @Override
    public V remove(K key, K value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Set<K> keySet() {
        /*TreeSet<K> keysCopy = new TreeSet<K>();
        for (K key : this) {
            keysCopy.add(key);
        }
        return keysCopy;*/
        //return mySet;
        return new ViewSet();
//        return new ViewSet();
    }

    private class ViewSet extends AbstractSet<K> {
        public int size() {
            return ULLMap.this.size(); //my boss's size;
        }

        public Iterator<K> iterator() {
            return ULLMap.this.iterator();
            //ViewSetIterator();
        }


    }

}