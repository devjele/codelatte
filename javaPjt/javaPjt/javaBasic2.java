package javaPjt;

public class javaBasic2 {

	public static void main(String[] args) {
		// ���ڿ� �����
		// %s�� �Ϲ������� ���ڿ��� �������ִ� ������
		String name = "��ī";
		String output = String.format("�� �̸��� %s �̴�", name);
		System.out.println(output);

		// \n : print �Ǵ� printf �ٹٲ�
		name = "��Ŭ����";
		System.out.printf("�� �̸��� %s�̴�\n", name);
				
		// %f�� �Ǽ��� �������ִ� ������
		float temperature = 23.5f;
		output = String.format("������ �µ��� %f�� �̴�", temperature);
		System.out.println(output);
	}
}
