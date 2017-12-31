package tree;

public class BinarySearchTree 
{
	Node root;
	
	public void addNewNode(int data)
	{
		Node newNode = new Node(data);
		if( root == null)
		{
			root = newNode;
		}
		else
		{
			 traversingNode(root, newNode);
		}
			
			 
	}
	
	public void traversingNode(Node  node, Node newNode)
	{
		if(newNode.data < node.data)
		{
			if(node.left == null)
			{
				node.left = newNode;
			}
			else 
			{
				traversingNode(node.left, newNode);
			}
		}
		else if(newNode.data>node.data)
			
		{
			if(node.right == null)
			{
				newNode.right = newNode;
			}
			else
			{
				traversingNode(node.right, newNode);
			}
		}
	}
	
	public void traverse()
	{
		
		if(root!=null)
		{
			Node nodeToTraverse = root;
			
		 if(nodeToTraverse.left!=null && nodeToTraverse.right !=null)
		 {
			 System.out.println(nodeToTraverse.data);
		 }
		 else
		 {
			 inorder(nodeToTraverse);
		 }
		}
		
		
	}
	
	public void inorder(Node nodeToTraverse)
	{
		System.out.println(nodeToTraverse.data);
		
		if(nodeToTraverse.left != null)
		{
			inorder(nodeToTraverse);
		}
		if(nodeToTraverse.right!=null)
		{
			inorder(nodeToTraverse);
		}
	}
	
	public static void main(String args[])
	{
		BinarySearchTree b = new BinarySearchTree();
		b.addNewNode(15);
		b.addNewNode(14);
		b.addNewNode(16);
	}
}
