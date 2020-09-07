package test;
//메서드를 만드는 클래스

/*
 * 1. 클래스는 데이터 타입이다.
 * 2. 클래스는 메서드를 가지고 있는 컨테이너
 * 3. 메서드는 결과데이터를 남길 수 있다. (리턴타입을 지정해서 값을 남길수 있다)
 * 4. 메서드는 값들을 입력받을 수 있다.
 * 5. 메서드는 2번 클래스의 변수를 만들어야(new) 호출 가능
 * 6. but 메서드 이에 static키워드가 있으면 클래스이름.메서드이름()으로 호출 가능
 * 7. ex) Math.random();
 */
public class Mtest { // test.Mtest == (패키지).(클래스)
	
	public static void hello() {
		System.out.println("hello");
	}
	
	public int add(int x, int y) { // public 리턴타입 메서드 이름(입력타입)
		int z = x + y;
		return z;
	}
			
	public MyData getMyData() {
		System.out.println("getMyData 메서드 호출");
		MyData mydata = new MyData();
		mydata.x = 7;
		mydata.y = 17;
		mydata.z = 107;
		return mydata; // mydata.x , mydata.y , mydata.z
	}
	
	//리턴 타입이 없는 것 == void
	public void m1() {
		System.out.println("m1 test...");
	}
	
	//리턴 타입이 숫자가 있는 것
	public int m2() {
		System.out.println("m2 test...");
		return 2;
	}
	
	//String을 리턴하는 메서드
	public String getName() {
		System.out.println("m3 test...");
		String name = "구디" + "아카데미";
		return name; // return "구디아카데미"
	}				 //*name 변수를 남기는 것이 아님*
}

//지난 시간 클래스를 만든 이유 : 새로운 데이터 타입을 만들기 위해
//지금 클래스를 만든 이유 : 메서드를 만들고 싶어서
//클래스 역할
//1. 새로운 데이터 타입
//2. 새로운 메서드를 담고 있다
//3. 1+2