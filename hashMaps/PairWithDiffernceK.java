package hashMaps;

import java.util.HashMap;

public class PairWithDiffernceK {
    public static int pair(int[] arr, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        int pairCount = 0;
        for(int i=0; i<arr.length; i++){
            int p1 = arr[i] + k;
            boolean flag = false;

            if(arr[i] == p1){
                flag=true;
            }

            if(map.containsKey(p1)){
                pairCount += map.get(p1);
            }

            int p2 = arr[i]-k;

            if(map.containsKey(p2) && !flag){
                pairCount += map.get(p2);
            }

            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }else{
                map.put(arr[i], 1);
            }

        }
        return pairCount;

    }
    public static void main(String[] args) {
        int arr[] = {5, 1, 2, 4};
        int numPair = pair(arr, 3);
        System.out.println(numPair);
    }
}
