import java.util.Scanner;
class pro1{
    public static void main(String []args){
        Scanner sca = new Scanner(System.in);
        try{
            int a=sca.nextInt();
            if(a<1){
                throw new ArithmeticException("Age should be greater than one");
            }
        }
        catch( ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("Program end");
    }
} 