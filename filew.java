import java.io.FileWriter;
public class filew {
    public static void main(String[] args) {

        try{
            FileWriter fw = new FileWriter("output.txt",true);
        fw.append("epdi iruka");
        fw.close();   
        System.out.println("Successfully writed");    
          }
        catch(Exception e){
            System.err.println(e+":be carefull");

        }
    }
}
