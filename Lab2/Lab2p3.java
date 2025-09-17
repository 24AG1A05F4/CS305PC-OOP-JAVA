import java.util.*;
class Lab2p3{
	public static void main(String...args){
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		String op=sc.next();
		String str = switch(op){
			case "++" -> "hello";
			case "--", "=", "-" -> "bye";
			default -> "sorry";
		};
		System.out.println("Result is:"+ str);
	}
}		
