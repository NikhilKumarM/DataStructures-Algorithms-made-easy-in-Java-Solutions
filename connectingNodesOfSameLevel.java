// PROBLEM:  Write a function to connect all the adjacent nodes at the same level in a binary tree. Structure of the given Binary Tree node is like following.

// A Binary Tree node
/* class Node
{
    int data;
    Node left, right, nextRight;
    Node(int item)
    {
        data = item;
        left = right = nextRight = null;
		
    }
} */


// function that the root of the binary tree as argument

void connect(Node root)
    {
       
        Queue<Node> queue = new LinkedList<Node>();      // for level order traversal
        Queue<Node> levelNode = new LinkedList<Node>();  // for keeping track of the nodes of the same level
        if(root!=null){
            queue.add(root);
            queue.add(null);
            while(!queue.isEmpty()){
                Node temp = queue.poll();
                if(temp!=null){
                    levelNode.add(temp);
                    if(temp.left!=null){
                        queue.add(temp.left);
                    }
                    if(temp.right!=null){
                        queue.add(temp.right);
                    }
                }
                else{
                    Node prevNode=null;
                    while(!levelNode.isEmpty()){
                         Node node = levelNode.poll();
                         if(prevNode!=null){
                             prevNode.nextRight = node;
                         }
                         prevNode= node;
                         
                    }
                    prevNode.nextRight=null;
                    if(!queue.isEmpty())
                        queue.add(null);
                }
                
            }
        }
    }