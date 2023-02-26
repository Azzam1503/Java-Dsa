package strings;

public class printAllSubStrings {
    public static void allSubStrings(String str){
        // for(int i=0; i<str.length(); i++){
        //     for(int j=i; j<str.length(); j++){
        //         for(int k=i; k<=j; k++){
        //             System.out.print(str.charAt(k));
        //         }
        //         System.out.println();
        //     }
        // }

        //another approach
        // for(int i=0; i<str.length(); i++){
        //     for(int j=i; j<str.length(); j++){
        //         System.out.println(str.substring(i, j+1));
        //     }
        // }

        //printing length wise 
        for(int len =1; len<=str.length(); len++){
            for(int start=0; start<=str.length()-len; start++){
                int end = start+len-1;
                System.out.println(str.substring(start, end+1));
            }
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        allSubStrings(str);
    }
}
