import java.util.Scanner;
class ifstat{
	public static void main(String arg[]){
		String z,y="saga";
		Scanner x=new Scanner(System.in);
		z=x.nextLine();
		x.close();
		if(z.equals(y)){
			System.out.println("correct");
		}
	}
}
