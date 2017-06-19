/**
 * 门面类，对外使用
 * @author qiaojy
 *
 */
public class ModenPostOffice {

	private ILetterProcess letterProcess = new LetterProcessImpl();
	private Police police = new Police();
	
	public void sendLetter(String context,String address) {
		//封装写信
		letterProcess.writeContext(context);
		//封装写信的地址
		letterProcess.fillEnvelope(address);
		//使用另一个对象，改变内部逻辑，但外部调用者并不知道
		police.checkLetter(letterProcess);
		letterProcess.letterInotoEnvelope();
		letterProcess.sendLetter();
	}
}
