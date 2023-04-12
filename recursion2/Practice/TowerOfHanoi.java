package recursion2.Practice;

public class TowerOfHanoi {
    public static void toh(int disks, char source, char auxillary, char destination){
        if(disks==0){
            return;
        }

        toh(disks -1, source, destination, auxillary);
        System.out.println(source + " " + destination);
        toh(disks -1, auxillary, source, destination);
    }
    public static void main(String[] args) {
        toh(64, 'a', 'b', 'c');
    }
}
