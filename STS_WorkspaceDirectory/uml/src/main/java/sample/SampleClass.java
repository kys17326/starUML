package sample;

public class SampleClass {
	private static SampleClass  sampleClass;
	
	public static SampleClass getInstance() {
		//이미 객체를 만들었다면 다시 만들지 않게 하기 위한 제어문
		if(sampleClass == null)
			sampleClass = new SampleClass();
		return sampleClass;
	}
	public void samplePrint() {
		System.out.println("Hello Sample");
	}
}
