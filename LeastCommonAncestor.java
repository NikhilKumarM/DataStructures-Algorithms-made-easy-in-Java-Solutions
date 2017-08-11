/*
      Given a Binary Search Tree and 2 nodes value n1 and n2  , your task is to find the lowest common ancestor of the two nodes .
	  You are required to complete the function LCA .
       /* A Binary Search Tree node */
       /* class Node
          {
             int data;
             Node left, right;
             Node(int item)
             {
              data = item;
               left = right = null;
             }
          }
*/   
*/

Node lca(Node node, int n1, int n2) 
    {
        //  code 
        if(node == null){
            return node;
        }
        if(node.data==n1 || node.data==n2){
            return node;
        }
        Node left = lca(node.left,n1,n2);
        Node right= lca(node.right,n1,n2);
        if(left!=null&&right!=null){
            return node;
        }
        else{
            return left!=null?left:right;
        }
    }