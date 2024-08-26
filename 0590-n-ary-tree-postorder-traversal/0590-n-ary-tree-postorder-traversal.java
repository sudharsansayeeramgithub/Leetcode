/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> postorder(Node root) {
        if(root == null) return new ArrayList<>();
        List<Integer> result=new ArrayList<>();
        dfs(root,result);
        return result;
    }
    private void dfs(Node root,List<Integer> result){
        for(Node child:root.children){
            dfs(child,result);
        }
        result.add(root.val);
    }
}