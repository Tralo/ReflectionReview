package t9;

public class MusicPhoneDecorate extends PhoneDecorate {

	public MusicPhoneDecorate(Phone phone) {
		super(phone);
	}
	
	@Override
	public void call() {
		System.out.println("手机可以听音乐");
		super.call();
	}

}
