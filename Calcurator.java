import java.util.Scanner;

public class Calcurator {
	//속성필드(데이터)
	int number1=0;
	int number2=0;
	
	//메소드(함수 가능)
	public int plus(int x, int y)
	{
		int total =x + y; // total 100 +200;
		return total;
	}
	
	public static void main(String[] args) {
		
		int num1 , num2;
		System.out.println("세개 숫자 입력");
		Scanner scan=new Scanner(System.in);
				num1=scan.nextInt();
				num2=scan.nextInt();
				
		//객체생성
	Calcurator cal =new Calcurator();
    int result =cal.plus(num1, num2);
    System.out.println("result:" + result);
	
	}

}
