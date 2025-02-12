class TreeNode {
int val;
TreeNode left;
TreeNode r;
TreeNode(int x){
val =x;
}
TreeNode (int x, TreeNode l,TreeNode ri) {
val = x;
left = l;
r = ri;
}
}

public class recursiveSolution {
public static List<Integer> postOrder(TreeNode t){
List<Integer> res = new ArrayList<>();
if(t!=null) {
res.addAll(postOrder(t.left));
res.addAll(postOrder(t.r));
res.add(t.val);
}
return res;
}
}
