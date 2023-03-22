package ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        try{
            int divisor = 1;
            int value = 33;
            if (divisor ==3){
                throw new Error("xyz");
            }
            int result = value/divisor;
            System.out.println("The result is " + result);
        }
        catch(Exception e){
            System.out.println("Error Error Happen GG");
        }
        finally {
            another();
        }
        another();
        another();
    }
    public static void another(){
        System.out.println("hello world");
    }
}
