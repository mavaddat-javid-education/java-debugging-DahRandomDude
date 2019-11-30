public class YallComputersLazy{

    public static void main(String[] args){
        if(trueMethod() || falseMethod())
            System.out.println("Least 1 Was True");
        else
            System.out.println("Both Are False");

    }

    public static boolean trueMethod() {

        System.out.println("Within trueMethod()");
        return true;
        
    }

    public static boolean falseMethod() {

        System.out.println("Within falseMethod()");
        return false;

    }

}