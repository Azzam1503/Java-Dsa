package hashMaps;

public class MapUse {
    public static void main(String[] args) {
        Map<String, Integer> map = new Map<>();
        
        for(int i=0; i< 20; i++){
            map.insert("abc" + i, i+1);
        }

        map.removeKey("abc2");
        map.removeKey("abc5");
        for(int i=0; i< 20; i++){
            System.out.println(("abc"+i) + ": "+ map.getValue("abc" + i));
        }

        
    }
}
