package Tree;
/*
 * 输入两颗二叉树 A 和 B，判断 B 是不是 A 的子结构。 
 */
public class TreeContain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinaryTreeNode root1=new BinaryTreeNode();
		BinaryTreeNode node1=new BinaryTreeNode();
		BinaryTreeNode node2=new BinaryTreeNode();
		BinaryTreeNode node3=new BinaryTreeNode();
		BinaryTreeNode node4=new BinaryTreeNode();
		BinaryTreeNode node5=new BinaryTreeNode();
		BinaryTreeNode node6=new BinaryTreeNode();

		root1.leftNode=node1;
		root1.rightNode=node2;
		node1.leftNode=node3;
		node1.rightNode=node4;
		node4.leftNode=node5;
		node4.rightNode=node6;
		
		root1.value=8;
		node1.value=8;
		node2.value=7;
		node3.value=9;
		node4.value=2;
		node5.value=4;
		node6.value=7;
		
		BinaryTreeNode root2=new BinaryTreeNode();
		BinaryTreeNode a=new BinaryTreeNode();
		BinaryTreeNode b=new BinaryTreeNode();
		
		root2.leftNode=a;
		root2.rightNode=b;
		
		root2.value=8;
		b.value=2;
		a.value=9;
		
		TreeContain test=new TreeContain();
		System.out.println(test.hasSubTree(root1,root2));
	}
	
	public boolean hasSubTree(BinaryTreeNode root1,BinaryTreeNode root2){
		boolean result=false;
		if(root1!=null&&root2!=null){
			if(root1.value==root2.value){
				result=AHasB(root1.leftNode,root2)||AHasB(root1.rightNode,root2);
			}
		}
		return result;
	}
	
	public boolean AHasB(BinaryTreeNode root1,BinaryTreeNode root2){
		if(root2==null)
			return true;
		if(root1==null)
			return false;
		if(root1.value==root2.value){
			return AHasB(root1.leftNode,root2.leftNode)&&AHasB(root1.rightNode,root2.rightNode);
		}
		return false;
	}

}
