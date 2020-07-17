package Sc1;

public class Javascenario {
    int i=10;
    static String str= "ann";


    public static int scenario()
    {
        int i= 15;
        return i;
    }

    public static void main(String args[])
    {

        int j = scenario();
        System.out.println(j+ str);


        sample obj = new sample();
        String name = obj.getname();
        System.out.println("The name is"+ name);
        // i want to set the name
      //  obj.setname("Anu");
        name = obj.getname();
        System.out.println("The modified name is"+ name);
    }


}
