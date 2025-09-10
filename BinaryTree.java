import java.util.LinkedList;
import java.util.Queue;

class BinaryTreeNode<T> {
    T data;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;

    public BinaryTreeNode(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTree {

    public static void printLevelWise(BinaryTreeNode<Integer> root) {
        // Your code goes here
        if (root == null) {
            return;
        }

        Queue<BinaryTreeNode<Integer>> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            BinaryTreeNode<Integer> currNode = q.poll();

            int leftVal = -1, rightVal = -1;

            if (currNode.left != null) {
                leftVal = currNode.left.data;
                q.add(currNode.left);
            }
            if (currNode.right != null) {
                rightVal = currNode.right.data;
                q.add(currNode.right);
            }

            System.out.println(currNode.data + ":L:" + leftVal + ",R:" + rightVal);
        }
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
        root.left = new BinaryTreeNode<>(2);
        root.right = new BinaryTreeNode<>(3);
        root.left.left = new BinaryTreeNode<>(4);
        root.left.right = new BinaryTreeNode<>(5);
        root.right.left = new BinaryTreeNode<>(6);
        root.right.right = new BinaryTreeNode<>(7);

        printLevelWise(root);
    }

}