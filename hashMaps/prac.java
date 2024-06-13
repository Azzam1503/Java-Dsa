package hashMaps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class prac {
     public static void duplicates(int arr[], int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<n; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
        }
        
        for(int i=0; i<n; i++){
            if(map.containsKey(arr[i]) && map.get(arr[i]) > 1){
               System.out.print(arr[i] + " ");
               map.remove(arr[i]);
            }
        }
        
        // Collections.sort(ans);
        
        // if(ans.size()>0){
        //     return ans;
        // }else{
        //     ans.add(-1);
        //     return ans;
        // }
    }

    public static void main(String[] args) {
        int[] arr = {13, 9, 25, 1, 1, 0, 22, 13, 22, 20, 3, 8, 11, 25, 10, 3, 15, 11, 19, 20, 2, 4, 25, 14, 23, 14};
        // 1 3 11 13 14 20 22 25
        // ArrayList<Integer> ans = duplicates(arr, arr.length);
        duplicates(arr, arr.length);

        // for(int i=0; i<ans.size(); i++){
        //     System.out.println(ans.get(i));
        // }
    }
}
