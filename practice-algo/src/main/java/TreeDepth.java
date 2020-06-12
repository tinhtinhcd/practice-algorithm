import Util.TreeNode;

public class TreeDepth {
    int max = 0;
    public int maxDepth(TreeNode root) {
        maxD(0, root);
        return max;
    }

    private void maxD(int depth, TreeNode node){
        if(node == null)
            max = Math.max(max, depth);
        else{
            depth++;
            maxD(depth, node.left);
            maxD(depth, node.right);
        }
    }
}
