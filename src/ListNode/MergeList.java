package ListNode;
/*
 * ：输入两个递增排序的链表，合并这两个链表并使新链表中的结点仍然是按 照递增排序的。 
 */
public class MergeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListNode head1=new ListNode();
		ListNode second1=new ListNode();
		ListNode head2=new ListNode();
		ListNode second2=new ListNode();
		ListNode third2=new ListNode();
		
		head1.nextNode=second1;
		head2.nextNode=second2;
		second2.nextNode=third2;
		
		head1.data=1;
		second1.data=1;
		head2.data=2;
		second2.data=2;
		third2.data=2;
		
		MergeList test=new MergeList();
		ListNode result=test.mergeList(head1,head2);
		System.out.println(result.nextNode.data);
	}
	public ListNode mergeList(ListNode head1,ListNode head2){
		if(head1==null){
			return head2;
		}else if(head2==null){
			return head1;
		}
		ListNode mergeHead=null;
		if(head1.data<head2.data){
			mergeHead=head1;
			mergeHead.nextNode=mergeList(head1.nextNode,head2);
		}else{
			mergeHead=head2;
			mergeHead.nextNode=mergeList(head1,head2.nextNode);
		}
		return mergeHead;
	}

}
