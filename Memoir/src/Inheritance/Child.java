package Inheritance;
//polymorphism "Same method different works"
public class Child {
    int age;
    Child(){
        age = 20;
    }
    Child(int x){
        age = x;
    }
    public void intro(){
        System.out.println("gogo power ranger, i am "+ age);
    }
}
