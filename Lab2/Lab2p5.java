import java.util.*;
class Lab2p5{
	public static void main(String...args){
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		boolean p=true;
		for(int i=2;i<=x/2;i++){
			if(x%i==0){
				p=false;
				break;
			}
		}
		if(p){
			System.out.println("It is prime number");
		}
		else{
			System.out.println("it is not prime number");
		}
	}
}						
				
		
