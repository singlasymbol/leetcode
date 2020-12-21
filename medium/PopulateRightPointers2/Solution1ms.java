/* https://leetcode.com/submissions/detail/433074165/
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
        if(root == null) {
            return null;
        }
        
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int nodesInQueue = 0;
        
        while(!queue.isEmpty()) {            
            nodesInQueue = queue.size();
            
            while(nodesInQueue-- > 0) {
                Node node = queue.poll();
                
                if(nodesInQueue == 0) {
                    node.next = null;
                } else {
                    node.next = queue.peek();
                }
                
                if(node.left != null) {
                    queue.add(node.left);
                }
                if(node.right != null) {
                    queue.add(node.right);
                }
            }

        }
        
        return root;
    }
}