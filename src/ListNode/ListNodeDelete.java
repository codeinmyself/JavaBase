package ListNode;
/*
 * �������������ͷָ���һ�����ָ�룬����һ�������� O(1)ʱ��ɾ�� �ý�㡣 
 */
public class ListNodeDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListNode head=new ListNode();
		ListNode second=new ListNode();
		ListNode third=new ListNode();
		
		head.nextNode=second;
		second.nextNode=third;
		
		head.data=1;
		second.data=2;
		third.data=3;
		
		ListNodeDelete ln=new ListNodeDelete();
		ln.deleteNode(head,second);
		System.out.println(head.nextNode.data);
		
	}
	
	public void deleteNode(ListNode head,ListNode deListNode){
		if(head==null||deListNode==null){
			return;
		}
		if(head==deListNode){
			head=null;
		}else{
			if(deListNode.nextNode==null){
				ListNode pointListNode=head;
				while(pointListNode.nextNode.nextNode!=null){
					pointListNode=pointListNode.nextNode;
				}
				pointListNode.nextNode=null;
			}else{
				deListNode.data=deListNode.nextNode.data;
				deListNode.nextNode=deListNode.nextNode.nextNode;
			}
		}
		
	}

}

