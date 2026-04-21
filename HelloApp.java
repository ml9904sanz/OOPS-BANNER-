public class HelloApp {
    public static void main(String[] args){
        String name="SANTHOSH";
        if(args.length>0){
            name=args[0];
        }
        System.out.println("Hello "+name+"!");
    }
    
}
