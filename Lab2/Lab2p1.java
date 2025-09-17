import java.util.*;
class Lab2p1{
	public static void main(String...args){
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		sc.nextLine();
		String op=sc.nextLine();
		switch (op){
			case "++":
				System.out.println("post: "+ (x++));
				System.out.println("pre: "+ (++x));
				break;
			case "--":
				System.out.println("post: "+ (x--));
				System.out.println("pre: "+ (--x));
				break;
			case "+": 
				x = +x;
				System.out.println("unary +: "+ (x));
				break;
			case "-":
				x = -x;
				System.out.println("unary +: "+ (x));
				break;
			case "~":
				x = ~x;
				System.out.println("unary +: "+ (x));
				break;	
			default:
				System.out.println("You have entered the wrong operator");
		}
	}		 							
}
