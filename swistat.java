import java.util.Scanner;
class swistat{
    public static void main(String args[]){
        Scanner x=new Scanner(System.in);
        System.out.println("enter train class")
        char y=x.next().charAt(0); // to read the given character with index 0

        switch(y){
            case "a":
            System.out.println("you enter ac class")
            break;
            case "e":
            System.out.println("you enter economy class")
            case "s":
            System.out.println("you enter sleeper class")
            break;
            case "g":
            System.out.println("you enter general class")
            break;
            default:
            System.out.println("your choice not valid")
            break;
        }
    }
}