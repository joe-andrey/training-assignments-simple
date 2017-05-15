package eu.sig.training.ch03.binarytree;

public class BinaryTreeSearch {

    // tag::calculateDepth[]
    public static int calculateDepth(BinaryTreeNode<Integer> node, int nodeValue) {
        int depth = 0;
        if (node.getValue() == nodeValue) {
            return depth;
        } else {
            if (nodeValue < node.getValue()) {
                BinaryTreeNode<Integer> left = node.getLeft();
                return explore(nodeValue, left);
            } else {
                BinaryTreeNode<Integer> right = node.getRight();
                return explore(nodeValue, right);
            }
        }
    }
    // end::calculateDepth[]

	private static int explore(int nodeValue, BinaryTreeNode<Integer> left) {
		if (left == null) {
		    throw new TreeException("Value not found in tree!");
		} else {
		    return 1 + calculateDepth(left, nodeValue);
		}
	}

}