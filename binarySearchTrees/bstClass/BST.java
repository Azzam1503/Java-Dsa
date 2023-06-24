package binarySearchTrees.bstClass;

public class BST {
    private BinaryTreeNode<Integer> root;
    private int size;

    private boolean isPresentHelper(BinaryTreeNode<Integer> root, int x){
        if(root == null){
            return false;
        }
        if(root.data == x){
            return true;
        }
        if(root.data > x){
            return isPresentHelper(root.left, x);
        }else{
            return isPresentHelper(root.right, x);
        }
    }
    public boolean isPresent(int x){
        return isPresentHelper(root, x);
    }

    private BinaryTreeNode<Integer> insertHelper(BinaryTreeNode<Integer> root, int data){
        if(root == null){
            BinaryTreeNode<Integer> newNode = new BinaryTreeNode<Integer>(data);
            size++;
            return newNode;
        }

        if(root.data > data){
            root.left = insertHelper(root.left, data);
        }else{
            root.right = insertHelper(root.right, data);
        }
        return root;
    }
    public void insert(int x){
        root = insertHelper(root, x);
    }

    private static int smallest(BinaryTreeNode<Integer> root){
        if(root == null){
            return 0;
        }

        int leftLargest = smallest(root.left);
        int rightLargest = smallest(root.right);
        return Math.min(root.data, Math.min(leftLargest, rightLargest));
    }

    private static BSTDeleteReturn deleteHelper(BinaryTreeNode<Integer> root, int x){
        if(root == null){
            return new BSTDeleteReturn(null, false);
        }

        if(root.data > x){
            BSTDeleteReturn rightOutput = deleteHelper(root.right, x);
            root.right = rightOutput.root;
            rightOutput.root = root;
            return rightOutput;
        }
        if(root.data < x){
            BSTDeleteReturn leftOutput = deleteHelper(root.left, x);
            root.left = leftOutput.root;
            leftOutput.root = root;
            return leftOutput;
        }

        if(root.left == null && root.right == null){
            return new BSTDeleteReturn(null, true);
        }
        if(root.left != null && root.right == null){
            return new BSTDeleteReturn(root.left, true);
        }
        if(root.left == null && root.right != null){
            return new BSTDeleteReturn(root.right, true);
        }

        int rightMin = smallest(root.right);
        root.data = rightMin;
        BSTDeleteReturn outputRight = deleteHelper(root.right, rightMin);
        root.right = outputRight.root;
        return new BSTDeleteReturn(root, true);

    }

    public boolean delete(int x){
        BSTDeleteReturn output = deleteHelper(root, x);
        root = output.root;
        if(output.deleted){
            size--;
        }
        return output.deleted;
    }


    public int size(){
        return size;
    }
    private static void printTreeHelper(BinaryTreeNode<Integer> root){
        if(root == null){
            return;
        }

        System.out.print(root.data + ": ");
        if(root.left != null){
            System.out.print("L-" + root.left.data + ", ");
        }

        if(root.right != null){
            System.out.print("R-" + root.right.data);
        }

        System.out.println();
        printTreeHelper(root.left);
        printTreeHelper(root.right);
    }

    public void printTree(){
        printTreeHelper(root);
    }
    
}
