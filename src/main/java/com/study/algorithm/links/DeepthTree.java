package com.study.algorithm.links;


class TreeNode {
    TreeNode leftNode;
    TreeNode rightNode;
    private int val;

    TreeNode(int val) {
        this.val = val;
        this.leftNode = null;
        this.rightNode = null;
    }

}

/**
 * 输入：二叉树[8, 12, 2, null, null, 6, 4, null, null, null, null]如下图所示：
 *     8
 *    / \
 *   12  2
 *      / \
 *     6   4
 *
 * 输出：3
 */
public class DeepthTree {
    public int deepthTree(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftDeepth = deepthTree(node.leftNode);
        int rightDeepth = deepthTree(node.rightNode);
        return (leftDeepth > rightDeepth) ? (leftDeepth + 1) : (rightDeepth + 1);
    }

    public static void main(String[] args) {

        TreeNode treeNode = new TreeNode(8);
        treeNode.leftNode = new TreeNode(12);
        treeNode.rightNode = new TreeNode(2);
        treeNode.leftNode.leftNode = null;
        treeNode.leftNode.rightNode = null;
        treeNode.rightNode.leftNode = new TreeNode(6);
        treeNode.rightNode.rightNode = new TreeNode(4);
        DeepthTree deepthTree =new DeepthTree();
        int res = deepthTree.deepthTree(treeNode);

        System.out.println(res);
    }
}
