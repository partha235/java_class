import java.util.Scanner;
class dostat{
    public static void main(String arg[]){
        
        Scanner x=new Scanner(System.in);
        System.out.println("enter y");
        int y=x.nextInt();
        x.close();
        System.out.flush();

        do{
            int z=y%2;
            System.out.println(z);
            y--;
        }while(y>=0);
        
    }
}