package t8;

public abstract class GetTime {
	
	public long getTime() {
		long start = System.currentTimeMillis();
//		for(int i = 0; i < 10000; i++){
//			System.out.println(i);
//		}
		code();
		
		long end = System.currentTimeMillis();
		
		return end - start;
	}
	
	
	public abstract void code();

}