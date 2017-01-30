package t9;

public class PhoneDemo {
	public static void main(String[] args) {
		Phone phone = new IPhone();
		phone.call();
		System.out.println("---------");
		// 需求： 听彩铃
		
		PhoneDecorate ringDecorate = new RingPhoneDecorate(phone);
		ringDecorate.call();
		System.out.println("---------");
		
		// 需求： 听音乐
		PhoneDecorate musicDecorate = new MusicPhoneDecorate(ringDecorate);
		musicDecorate.call();
		System.out.println("---------");
		
		// 需求： 可以视频聊天
		PhoneDecorate videoDecorate = new VideoPhoneDecorate(musicDecorate);
		videoDecorate.call();
		
		
	}
}
