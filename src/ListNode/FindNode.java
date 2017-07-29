package ListNode;
/*
 * ������һ����������������е����� k ����㡣Ϊ�˷��ϴ�����˵�ϰ�ߣ� ����� 1 ��ʼ������
 * �������β����ǵ�����һ����㡣����һ���� 6 ������ ������ͷ��������� 1,2,3,4��5,6��
 * ����������������ֵΪ 4 �Ľ�㡣 
 */
public class FindNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListNode head=new ListNode();
		ListNode second=new ListNode();
		ListNode third=new ListNode();
		ListNode forth=new ListNode();
		head.nextNode=second;
		second.nextNode=third;
		third.nextNode=forth;
		
		head.data=1;
		second.data=2;
		third.data=3;
		forth.data=4;
		
		FindNode fd=new FindNode();
		
		ListNode resultListNode=fd.findKToTail(head,3);
		System.out.println(resultListNode.data);
		
	}
	
	public ListNode findKToTail(ListNode head,int k){
		if(head==null||k==0){
			return null;
		}
		ListNode resultNode=null;
		ListNode headListNode=head;
		for(int i=0;i<k;i++){
			if(headListNode.nextNode!=null){
				headListNode=headListNode.nextNode;
			}else{
				return null;
			}
			
		}
		
		resultNode=head;
		while(headListNode!=null){
			resultNode=resultNode.nextNode;
			headListNode=headListNode.nextNode;
		}
		return resultNode;//���� s=a+b��s=b+a
	}
}


