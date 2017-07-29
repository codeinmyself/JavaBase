package ListNode;

public class ReverseLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head=new ListNode();
		ListNode second=new ListNode();
		ListNode third=new ListNode();
		ListNode forth=new ListNode();
		
		head.data=1;
		second.data=2;
		third.data=3;
		forth.data=4;
		
		head.nextNode=second;
		second.nextNode=third;
		third.nextNode=forth;
		
		ReverseLink rl=new ReverseLink();
		ListNode resultListNode=rl.reverse(head);
		
		System.out.println(resultListNode.data);

	}
	
	public ListNode reverse(ListNode head){
		if(head==null){
			return null;
		}
		if(head.nextNode==null){
			return head;
		}
		
		ListNode preListNode=null;
		ListNode nowListNode=head;
		
		ListNode resultNode=null;
		
		while(nowListNode.nextNode!=null){
			ListNode nextListNode=nowListNode.nextNode;
			if(nextListNode==null){
				resultNode=nextListNode;
			}
			nowListNode.nextNode=preListNode;
			preListNode=nowListNode;
			nowListNode=nextListNode;
		}
		return nowListNode;
	}

}
