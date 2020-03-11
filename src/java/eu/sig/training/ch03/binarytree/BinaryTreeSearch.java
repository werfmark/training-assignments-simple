package eu.sig.training.ch03.binarytree;

public class BinaryTreeSearch {

    // tag::calculateDepth[]
    public static int calculateDepth(BinaryTreeNode<Integer> node, int nodeValue) {
        int depth = 0;
        if (node.getValue() == nodeValue) {
            return depth;
        } 
        if (nodeValue < node.getValue()) {
               SearchLeft();
        }
        else {
               SearchRight();
        }
    }
}
