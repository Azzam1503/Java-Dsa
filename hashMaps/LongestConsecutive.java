package hashMaps;

import java.util.ArrayList;
import java.util.HashMap;

public class LongestConsecutive {
    
    public static ArrayList<Integer> longestConsecutive(int[] arr){
        HashMap<Integer, Boolean> visitedElements = new HashMap<>();
        HashMap<Integer, Integer> elementsToIndexMapping = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int num = arr[i];
            elementsToIndexMapping.put(num, i);

            if(!visitedElements.containsKey(num)){
                visitedElements.put(num, false);
            }
        }
        ArrayList<Integer> longestSequence = new ArrayList<>();
        int globalMaxSequenceLenght = 1;
        int globalMinStartIndex = 0;

        for(int i=0; i<arr.length; i++){
            int num = arr[i];

            int currentMinIndex = i;
            int tempNum = num;
            int count = 0;

            while(visitedElements.containsKey(tempNum) && !visitedElements.get(tempNum)){
                visitedElements.put(tempNum, true);

                count++;
                tempNum++;
            }

            tempNum = num -1;

            while(visitedElements.containsKey(tempNum) && !visitedElements.get(tempNum)){
                visitedElements.put(tempNum, true);

                count++;

                currentMinIndex = elementsToIndexMapping.get(tempNum);
                tempNum--;
            }

            if(count > globalMaxSequenceLenght){
                globalMaxSequenceLenght = count;
                globalMinStartIndex = currentMinIndex;
            }else if(count == globalMaxSequenceLenght){
                if(currentMinIndex < globalMinStartIndex){
                    globalMinStartIndex = currentMinIndex;
                }
            }
        }

        int globalStartNum = globalMinStartIndex;
        longestSequence.add(globalStartNum);

        if(globalMaxSequenceLenght > 1){
            longestSequence.add(globalStartNum + globalMaxSequenceLenght-1);
        }
        return longestSequence;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 15};
        ArrayList<Integer> seq = longestConsecutive(arr);
        System.out.println(seq);
    }
}
