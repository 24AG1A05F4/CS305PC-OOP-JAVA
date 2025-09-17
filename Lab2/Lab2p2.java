import java.util.*;
class Lab2p2{
	public static void main(String...args){
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		System.out.println("output is:"+ k++ + ++k);
		System.out.println("output is:"+ (k++ + ++k));
		System.out.println(k++ + ++k +": output is");
	}
}		
