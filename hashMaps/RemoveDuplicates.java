package hashMaps;

import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDuplicates {

    public static ArrayList<Integer> removeDuplicate(int[] arr){
        ArrayList<Integer> output = new ArrayList<>();
        HashMap<Integer, Boolean> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                continue;
            }

            output.add(arr[i]);
            map.put(arr[i], true);
        }

        return output;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 2, 1, 4, 4, 5, 6};
        ArrayList<Integer> output = removeDuplicate(arr);
        System.out.println(output);
    }
}
