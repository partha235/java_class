import java.util.Scanner;
class dostat{
    public static void main(Sring arg[]){
        
        Scanner x=new Scanner(System.in);
        int y=x.nextInt();
        

        do{
            int z=y%2;
            System.out.println(z);
            y--;
        }while(y>=0);
        
    }
}