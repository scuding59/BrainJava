import java.util.Scanner;

public class Calcurator {
	//�Ӽ��ʵ�(������)
	int number1=0;
	int number2=0;
	
	//�޼ҵ�(�Լ� ����)
	public int plus(int x, int y)
	{
		int total =x + y; // total 100 +200;
		return total;
	}
	
	public static void main(String[] args) {
		
		int num1 , num2;
		System.out.println("���� ���� �Է�");
		Scanner scan=new Scanner(System.in);
				num1=scan.nextInt();
				num2=scan.nextInt();
				
		//��ü����
	Calcurator cal =new Calcurator();
    int result =cal.plus(num1, num2);
    System.out.println("result:" + result);
	
	}

}
