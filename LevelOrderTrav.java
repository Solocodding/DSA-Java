import java.util.*;

class TreeNode{
    int val;
    TreeNode left=null;
    TreeNode right=null;
    TreeNode(int val){
        this.val=val;
    }
}

public class LevelOrderTrav {
    public static void main(String arg[]){
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.right.left=new TreeNode(4);
        root.right.right=new TreeNode(5);
        root.right.left.left=new TreeNode(6);
        root.right.left.right=new TreeNode(7);

        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode temp=q.remove();
            System.out.println(temp.val);
            if(temp.left!=null)
                q.add(temp.left);
            if(temp.right!=null)
                q.add(temp.right);
        }
     }    
}
