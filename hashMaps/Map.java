package hashMaps;

import java.util.ArrayList;

public class Map<K, V> {
    ArrayList<MapNode<K, V>> bucket;
    int size; 
    int numBuckets;
    public Map(){
        bucket = new ArrayList<>();
        numBuckets = 5;
        for(int i=0; i<numBuckets; i++){
            bucket.add(null);
        }
    }

    private int getIndex(K key){
        int hc = key.hashCode();
        int index = hc%numBuckets;
        return index;
    }

    private void rehash(){
        ArrayList<MapNode<K, V>> temp = bucket;
        bucket = new ArrayList<>();
        numBuckets = numBuckets*2;
        size = 0;
        for(int i=0; i<numBuckets; i++){
            bucket.add(null);
        }

        for(int i=0; i<temp.size(); i++){
            MapNode<K, V> head = temp.get(i);
            while(head != null){
                K key = head.key;
                V value = head.value;

                insert(key, value);
                head = head.next;
            }
        }

    }

    public void insert(K key, V value){
        int index = getIndex(key);
        MapNode<K, V> head = bucket.get(index);
        while(head != null){
            if(head.key.equals(key)){
                head.value = value;
                return;
            }
            head = head.next;
        }

        head = bucket.get(index);
        MapNode<K, V> newNode = new MapNode<>(key, value);
        newNode.next = head;
        bucket.set(index, newNode);
        size++;

        double loadFactor = (1.0*size)/numBuckets;
        if(loadFactor>=0.7){
            rehash();
        }
    }

    public int size(){
        return size;
    }

    public V getValue(K key){
        int index = getIndex(key);
        MapNode<K, V> head = bucket.get(index);

        while(head != null){
            if(head.key.equals(key)){
                return head.value;
            }
            head= head.next;
        }

        return null;
        
    }

    public V removeKey(K key){
        int index = getIndex(key);
        MapNode<K, V> head = bucket.get(index);
        MapNode<K, V> prev = null; 
        while(head != null){
            if(head.key.equals(key)){
                if(prev != null){
                    prev.next = head.next;
                }else{
                    bucket.set(index, head.next);
                }
                size--;
                return head.value;
            }
            prev= head;
            head= head.next;
        }

        return null;
    }
}
