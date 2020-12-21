
/* https://leetcode.com/problems/populating-next-right-pointers-in-each-node/submissions/
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        connectRoot(root);
        return root;
    }
    
    void connectRoot(Node node) {
        // System.out.println("connect called for " + node.val);
        
        if((node == null) || ((node.left == null) && (node.right == null))) {
            return;
        }
        
        if(node.left != null) {
            // System.out.println("getting next in left");
            if(node.right != null) {
                node.left.next = node.right;
            } else {
                node.left.next = getNext(node);
            }
        }
        
        if(node.right != null) {
        // System.out.println("getting next in right");
            node.right.next = getNext(node.next);
        }
        
        connectRoot(node.left);
        // System.out.println("calling right");
        connectRoot(node.right);
    }
    
    Node getNext(Node node) {
        if(node != null) {
            if(node.left != null) {
                return node.left;
            }
            
            if(node.right != null) {
                return node.right;
            }
        }
        
        return node;
    }
}