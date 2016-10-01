package hw;
import java.util.Scanner;
public class hw01_105021036 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		int x = (n-(a*15+b*20+c*30))/50;
		int y = ((n-(a*15+b*20+c*30))-50*x)/5;
		int z =((n-(a*15+b*20+c*30))-50*x-y*5);
		if(a*15+b*20+c*30<=n){
			System.out.println(x+"個50");
			System.out.println(y+"個5");
			System.out.println(z+"個1");
		}else{
			System.out.println("0");
			}

	}

}
