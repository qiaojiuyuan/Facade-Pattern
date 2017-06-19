
public class ClientMain {

	public static void main(String[] args) {
		//直接使用门面类
		ModenPostOffice office = new ModenPostOffice();
		office.sendLetter("你好,我是XXX", "北京市大旺路");
	}
}
