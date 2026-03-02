import  java.util.Scanner;
public class week1_lvl1 {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);

        //AVG Marks CACLULATOR

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





        //Simple Interest Caclulator
        double principal,rate,time,interest;
        System.out.print("Enter the principal amount : ");
        principal=scanner.nextDouble();
        System.out.print("Enter the Rate : ");
        rate=scanner.nextDouble();
        System.out.print("Enter the time : ");
        time=scanner.nextDouble();
        interest=(principal*time*rate)/100;
        System.out.println("The Simple interest is "+interest+" for Principal "+principal+" Rate of interest "+rate+ " and time "+time);





        //Weight Convertor
        double kg,pounds;
        System.out.print("Enter the weight in pounds : ");
        pounds=scanner.nextDouble();
        kg=pounds/2.2;
        System.out.println("The weight of the person in pounds is" +pounds +" and in kg is"+ kg);



        //Max HandShake Calculator 
        int numberofStudents;
        System.out.print("Enter the no of Students : ");
        numberofStudents=scanner.nextInt();
        System.out.println("# of Possible handsake "+(numberofStudents*(numberofStudents-1)/2));





















        scanner.close();

    }
    
}
