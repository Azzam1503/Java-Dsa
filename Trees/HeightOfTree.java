package Trees;

public class HeightOfTree {
    public static int height(Tree<Integer> root){
        int currHeight =1;
        int prevHeight =1;
        for(int i=0; i<root.children.size(); i++){
            int childHeight = height(root.children.get(i));
            currHeight++;
        }
        return height;
    }
}
