package hashMaps;

import java.util.HashMap;

public class LongestSubsetToZero {
    public static int longestSubsetToZero(int arr[]){
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=1; i<arr.length; i++){
            arr[i] += arr[i-1];
        }
        
        int len = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                if(len < i + 1){
                    len = i+1; 
                }else if(map.containsKey(arr[i])){
                    if(len < i- map.get(arr[i])){
                        len = i - map.get(arr[i]);
                    }
                }else{
                    map.put(arr[i], i);
                }
            }
        }

        return len;
    }    

    public static void main(String[] args) {
        int arr[] = {95, -97, -387, -435, -5, -70, 897, 127, 23, 284};
        int num = longestSubsetToZero(arr);
        System.out.println(num);
    }
}
