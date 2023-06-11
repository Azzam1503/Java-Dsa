package recursion3.revision;

public class PrintKeypad {

    public static String[] getString(int x){
        if(x<=1 || x>=10){
            System.exit(0);
        }
        if(x == 2){
            String[] output = {"a", "b", "c"};
            return output;
        }else if(x == 3){
            String[] output = {"d", "e", "f"};
            return output;
        }else if(x == 4){
            String[] output = {"g", "h", "i"};
            return output;
        }else if(x == 5){
            String[] output = {"j", "k", "l"};
            return output;
        }else if(x == 6){
            String[] output = {"m", "n", "o"};
            return output;
        }else if(x == 7){
            String[] output = {"p", "q", "r", "s"};
            return output;
        }else if(x == 8){
            String[] output = {"t", "u", "v"};
            return output;
        }else{
            String[] output = {"w", "x", "y", "z"};
            return output;
        }
    }


    public static void print(int n, String output){
        if(n==0){
            System.out.println(output);
            return;
        }

        String[] options= getString(n%10);
        for(int i=0; i<options.length; i++){
            print(n/10, options[i] + output);
        }

        
    }

    public static void main(String[] args) {
        print(23, "");
    }
}
