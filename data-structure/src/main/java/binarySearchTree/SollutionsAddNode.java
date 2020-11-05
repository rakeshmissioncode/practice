package binarySearchTree;

public class SollutionsAddNode {

    public TreeNode<Integer> insertIntoBST(TreeNode<Integer> root, int val) {

        //base Condition
        //base Condition
        if (root == null) {
            root = new TreeNode<Integer>(val);
            return root;

        }
        TreeNode<Integer> currentRoot = root;
        while (true) {

            if (val <= currentRoot.val) {

                if (currentRoot.left != null) {
                    currentRoot = currentRoot.left;
                } else {
                    currentRoot.left = new TreeNode(val);
                    break;
                }

            } else {

                if (currentRoot.right != null) {
                    currentRoot = currentRoot.right;
                } else {
                    currentRoot.right = new TreeNode(val);
                    break;
                }

            }


        }

        return root;


    }
}
