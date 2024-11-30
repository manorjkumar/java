import java.io.FileWriter;
import java.io.BufferedWriter;
public class fwbw {
    public static void main(String[] args) {


        try{
        FileWriter fw = new FileWriter("output.txt");
        BufferedWriter bw =new BufferedWriter(fw);
        bw.write("hay manoj don't worry everything will be okey");
        bw.newLine();
        bw.write("you will be okey");
        bw.close();
        System.out.println("work done");
        }
        catch(Exception e){
            System.err.println(e);

        }
        
    }
}
