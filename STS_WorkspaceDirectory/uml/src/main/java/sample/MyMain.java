package sample;

public class MyMain {

	public static void main(String[] args) {
		//getInstance에서 객체를 생성하여 s에 넣어준다.
		SampleClass s = SampleClass.getInstance();
		s.samplePrint();
		
		//
		//복잡한 로직
		//
		
		//다시 선언 해도 메모리를 추가로 사용 하지 않는다.
		s = SampleClass.getInstance();
		s.samplePrint();

	}

}
