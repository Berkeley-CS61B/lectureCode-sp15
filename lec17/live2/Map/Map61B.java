import java.util.Set;
/* Your implementation ULLMap should implement this interace. To do so, 
 * append "implements Map61B<K,V>" to the end of your "public class..."
 * declaration, though you can use other formal type parameters if you'd like.
 */ 
public interface Map61B<K, V> {
    /** Removes all of the mappings from this map. */
    public void clear();

    /* Returns true if this map contains a mapping for the specified key. */
    public boolean containsKey(K key);

    /* Returns the value to which the specified key is mapped, or null if this
     * map contains no mapping for the key. You'll notice that the parameter
     * type is K, not K. This odd choice follows Java conventions.
     * Since all Ks have a .equals method, this won't really matter.
     * Don't worry about this too much.
     */
    public V get(K key);

   /* Returns the number of key-value mappings in this map. */
    public int size();

    /* Associates the specified value with the specified key in this map.
     * Returns the previous value associated with key, or null if there was no
     * mapping for key. (A null return can also indicate that the map previously
     * associated null with key.)
     */
    public void put(K key, V value);

    /* Removes the mapping for the specified key from this map if present.
     * Not required for HW5. */
    public V remove(K key);

    /* Removes the entry for the specified key only if it is currently mapped to
     * the specified value. Not required for HW5. */
    public V remove(K key, K value);

    /* Returns a Set view of the keys contained in this map. Not required for HW5. */
    public Set<K> keySet();    
}
