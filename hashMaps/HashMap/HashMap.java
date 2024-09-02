package hashMaps.HashMap;

import java.util.ArrayList;

class MapNode<K, V> {
    K key;
    V value;
    MapNode<K, V> next;

    public MapNode(K key, V value) {
        this.key = key;
        this.value = value;
        next = null;
    };
}

public class HashMap<K, V> {
    ArrayList<MapNode<K, V>> map;
    int bucketSize;
    int size;

    public HashMap() {
        map = new ArrayList<>();
        bucketSize = 5;
        size = 0;
        for (int i = 0; i < bucketSize; i++) {
            map.add(null);
        }
    }

    public int getIndex(K key) {
        int hashCode = key.hashCode();
        int index = hashCode % bucketSize;
        return index;
    }

    public void insert(K key, V value) {
        int keyIndex = getIndex(key);
        // System.out.println("keyIndex " + keyIndex);
        MapNode<K, V> head = map.get(keyIndex);
        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }
        MapNode<K, V> newNode = new MapNode<>(key, value);
        size++;
        head = map.get(keyIndex);
        newNode.next = head;
        map.set(keyIndex, newNode);

        double loadFactor = (1.0 * size) / bucketSize;
        System.out.println(loadFactor);
        if (loadFactor > 0.7) {
            rehash();
        }
    }

    private void rehash() {
        ArrayList<MapNode<K, V>> temp = map;
        map = new ArrayList<>();
        bucketSize *= 2;
        size = 0;
        System.out.println("rehashed " + bucketSize);
        for (int i = 0; i < bucketSize; i++) {
            map.add(null);
        }
        ;

        for (int i = 0; i < temp.size(); i++) {
            MapNode<K, V> head = temp.get(i);
            while (head != null) {
                insert(head.key, head.value);
                head = head.next;
            }
        }
    }

    public int size() {
        return size;
    }

    public V search(K key) {
        int index = getIndex(key);
        MapNode<K, V> head = map.get(index);
        while (head != null) {
            if (head.key.equals(key)) {
                return head.value;
            }
            ;
            head = head.next;
        }
        return null;
    }

    public V remove(K key) {
        int index = getIndex(key);
        MapNode<K, V> head = map.get(index);
        MapNode<K, V> prev = null;
        while (head != null) {
            if (head.key.equals(key)) {
                if (prev == null) {
                    map.set(index, head.next);
                } else {
                    prev.next = head.next;
                }
                ;
                size--;
                V value = head.value;
                head = null;
                return value;
            }
            ;
            prev = head;
            head = head.next;
        }
        return null;
    }

}
