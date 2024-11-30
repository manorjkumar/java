import java.util.Scanner;
class NotValidException extends Exception{


}

public class pro2 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        try{
            int age =sca.nextInt();
            if(age<18){
                throw new NotValidException();
            }
        }
        catch(Exception e){
            System.out.println(e);

        }
        
    }
}
