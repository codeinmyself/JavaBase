package SIngleton;
/*
 * ����ʽ���� ģʽ
 */
public class HuggerSingleton {

	public static final HuggerSingleton instance=new HuggerSingleton();
	
	private HuggerSingleton(){}
	
	public static HuggerSingleton getInstance(){
		return instance;
	}

}
