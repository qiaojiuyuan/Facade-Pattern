/**
 * 写信过程接口，调用方法顺序不能颠倒
 * @author qiaojy
 *
 */
public interface ILetterProcess {

	/**
	 * 写信的内容
	 * @param context
	 */
	public void writeContext(String context);
	
	/**
	 * 写信封
	 * @param address
	 */
	public void fillEnvelope(String address);
	
	/**
	 * 把信放到信封里
	 */
	public void letterInotoEnvelope();
	
	/**
	 * 邮递
	 */
	public void sendLetter();
}
