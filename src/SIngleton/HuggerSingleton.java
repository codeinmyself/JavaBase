package SIngleton;
/*
 * 饿汉式单例 模式
 */
public class HuggerSingleton {

	public static final HuggerSingleton instance=new HuggerSingleton();
	
	private HuggerSingleton(){}
	
	public static HuggerSingleton getInstance(){
		return instance;
	}

}
