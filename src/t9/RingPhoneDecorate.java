package t9;

public class RingPhoneDecorate extends PhoneDecorate{

	public RingPhoneDecorate(Phone phone) {
		super(phone);
	}
	
	@Override
	public void call() {
		System.out.println("手机可以听彩铃");
		super.call();
	}

}
