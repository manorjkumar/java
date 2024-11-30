public class Firstprogram {
    String globlename;
    Firstprogram(){
        this.globlename ="manoj";

    }
    private void customMethod(String myargs){
        //globlename="my name";
        System.out.println(myargs);
        System.out.println("MY GLOBLE NAME :"+ globlename);
    }

    public static void main(String[] args){
         Firstprogram F1 = new Firstprogram();
         F1.customMethod("passing argument as a String");

    }
}
