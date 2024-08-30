class TreeNode{
    int val;
    TreeNode left=null;
    TreeNode right=null;
    TreeNode(int val){
        this.val=val;
    }
}

class levelorder_trav_rec {

    public static boolean show(TreeNode root,int level){
        if(root==null) return false;
        if(level==1){
            System.out.print(root.val+" ");
            return true;
        }
        boolean left=show(root.left,level-1);
        boolean right=show(root.right,level-1);
        
        return left||right;
    }
    public static void level(TreeNode root){
        int level=1;
        while(show(root,level)){
            level++;
        }
    }
    public static void main(String args[]){
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(7);
        root.left.left.left=new TreeNode(8);

        level(root);
    }
}
