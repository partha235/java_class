import java.util.Scanner;
class iftry{
	public static void main(String arg[]){
		String z,y="saga";
		Scanner x=new Scanner(System.in);
		z=x.nextLine();
		System.out.println(z+"\n"+y);
		System.out.println(z==y);
		if(z==y){
			System.out.println("correct");
		}
	}
}
