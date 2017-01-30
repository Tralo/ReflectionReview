package t9;

public class VideoPhoneDecorate extends PhoneDecorate{

	public VideoPhoneDecorate(Phone phone) {
		super(phone);
	}
	
	@Override
	public void call() {
		System.out.println("手机可以视频聊天");
		super.call();
	}

}
