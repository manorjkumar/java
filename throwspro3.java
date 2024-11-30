import java .util.Scanner;
class calc{
    void div()throws Exception{
        int a=10/0;
    }
}
public class throwspro3 {
    public static void main(String[] args) {
        calc c1 =new calc();
        try{
        c1.div();
        }
        catch(Exception e){
            System.out.println(e +":cannot divide by zero");
        }
    }
}
