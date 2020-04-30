import Util.TreeNode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class SerializeTree {
    public String serialize(TreeNode root) {
        if(root == null)
            return "null,";
        String serializeString = String.valueOf(root.val)+ ","
                + serialize(root.left) + serialize(root.right);
        return serializeString;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.lastIndexOf(",") == data.length()-1)
            data = data.substring(0, data.length()-1);
        Queue<String> queue = new LinkedList<>();
        queue.addAll(Arrays.asList(data.split(",")));
        return helper(queue);
    }

    private TreeNode helper(Queue<String> queue){
        String value = queue.poll();
        if(value.equals("null"))
            return null;

        TreeNode node = new TreeNode(Integer.parseInt(value));
        node.left = helper(queue);
        node.right = helper(queue);
        return node;
    }
}
