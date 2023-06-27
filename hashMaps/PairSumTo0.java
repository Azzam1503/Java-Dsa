package hashMaps;

import java.util.HashMap;

public class PairSumTo0 {
    public static void pairrToSum(int arr[]){
        HashMap<Integer, Integer> map = new HashMap<>();
        int finalCount = 0;
        for(int i=0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
        }

        for(int i=0; i<arr.length; i++){
            int key = arr[i];

            if(map.containsKey(-key) && map.get(arr[i]) != 0){
                int times;

                if(key == (-key)){
                    int occurences = map.get(key);
                }
            }
        }
    }
}
