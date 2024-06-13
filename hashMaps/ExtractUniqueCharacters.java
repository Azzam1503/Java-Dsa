package hashMaps;

import java.util.HashMap;

public class ExtractUniqueCharacters {
    public static String extract(String s){
        String output  = ""; 

        HashMap<Character, Boolean> map = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char currentChar = s.charAt(i);
            if(!map.containsKey(currentChar)){
                map.put(currentChar, true);
                output += currentChar; 
            }
        }
        return output;
    }

    public static void main(String[] args) {
        String s = extract("aacdccee");
        System.out.println(s);
    }
}
