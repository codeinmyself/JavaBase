import java.util.Stack;

public class StackQueue<T>{

	private Stack<T> stack1=new Stack<T>();
	private Stack<T> stack2=new Stack<T>();

	public void appendTail(T t){
		stack1.push(t);
	}
	public T deleteHead() throws Exception{
		if(stack2.isEmpty()){
			while(!stack1.isEmpty()){
				stack2.push(stack1.pop());
			}
		}
		if(stack2.isEmpty()){
			throw new Exception("����Ϊ�գ�����ɾ����");
		}
		return stack2.pop();
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
			StackQueue<String> sq=new StackQueue<>();
			sq.appendTail("1");
			sq.appendTail("2");
			sq.appendTail("3");
			sq.deleteHead();
	}

}
