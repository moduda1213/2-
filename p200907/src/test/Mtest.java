package test;
//�޼��带 ����� Ŭ����

/*
 * 1. Ŭ������ ������ Ÿ���̴�.
 * 2. Ŭ������ �޼��带 ������ �ִ� �����̳�
 * 3. �޼���� ��������͸� ���� �� �ִ�. (����Ÿ���� �����ؼ� ���� ����� �ִ�)
 * 4. �޼���� ������ �Է¹��� �� �ִ�.
 * 5. �޼���� 2�� Ŭ������ ������ ������(new) ȣ�� ����
 * 6. but �޼��� �̿� staticŰ���尡 ������ Ŭ�����̸�.�޼����̸�()���� ȣ�� ����
 * 7. ex) Math.random();
 */
public class Mtest { // test.Mtest == (��Ű��).(Ŭ����)
	
	public static void hello() {
		System.out.println("hello");
	}
	
	public int add(int x, int y) { // public ����Ÿ�� �޼��� �̸�(�Է�Ÿ��)
		int z = x + y;
		return z;
	}
			
	public MyData getMyData() {
		System.out.println("getMyData �޼��� ȣ��");
		MyData mydata = new MyData();
		mydata.x = 7;
		mydata.y = 17;
		mydata.z = 107;
		return mydata; // mydata.x , mydata.y , mydata.z
	}
	
	//���� Ÿ���� ���� �� == void
	public void m1() {
		System.out.println("m1 test...");
	}
	
	//���� Ÿ���� ���ڰ� �ִ� ��
	public int m2() {
		System.out.println("m2 test...");
		return 2;
	}
	
	//String�� �����ϴ� �޼���
	public String getName() {
		System.out.println("m3 test...");
		String name = "����" + "��ī����";
		return name; // return "�����ī����"
	}				 //*name ������ ����� ���� �ƴ�*
}

//���� �ð� Ŭ������ ���� ���� : ���ο� ������ Ÿ���� ����� ����
//���� Ŭ������ ���� ���� : �޼��带 ����� �;
//Ŭ���� ����
//1. ���ο� ������ Ÿ��
//2. ���ο� �޼��带 ��� �ִ�
//3. 1+2