package hw;
import java.util.Scanner;
public class hw03_105021036 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		int d = scn.nextInt();
		int n = a*1000+b*100+c*10+d*1;
		if(n%400==0){
			System.out.println("閏年");
		}else{
			if(n%100==0){
				System.out.println("平年");
			}else{
				if(n%4==0){
					System.out.println("閏年");
				}else{
					System.out.println("平年");
					
				}
			}
		}

	}

}
