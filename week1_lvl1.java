import  java.util.Scanner;
public class week1_lvl1 {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int physics,maths,chemistry;
        double total;
        System.out.print("Enter the marks obtained in Maths : ");
        maths=scanner.nextInt();
        System.out.print("Enter the marks obtained in Physics : ");
        physics=scanner.nextInt();
        System.out.print("Enter the marks obtained in Chemistry : ");
        chemistry=scanner.nextInt();
        total=(physics+maths+chemistry)/3;
        System.out.println("The avg marks : "+total+"%");
        scanner.close();

    }
    
}
