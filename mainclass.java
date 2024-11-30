import java.util.Scanner;
class divisionexample{
    void dividenumber(int numerator,int denominator){
        try{
            int result =numerator/denominator;
            System.out.println("Answer :"+result);

        }
        catch(ArithmeticException e){
            System.out.println("cannot divide by zero");
           // throw new ArithmeticException("cannot divide by zero");
        }

    }
}
public class mainclass {
    public static void main(String[] args) {
        
        Scanner sca = new Scanner(System.in);
        int n1 =sca.nextInt();
        int d1 = sca.nextInt();

        divisionexample D1 = new divisionexample();
        D1.dividenumber(n1, d1);



    }
}
