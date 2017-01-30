package t8;

public class ForDemo extends GetTime {

	@Override
	public void code() {
		for(int i = 0; i < 10000; i++){
			System.out.println(i);
		}
	}

}
