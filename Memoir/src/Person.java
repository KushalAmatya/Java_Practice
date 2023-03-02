public class Person {
    String name;
    int age;
    public Person(String x, int y){
        name = x;
        age = y;
    }
    public void introduce(){
        System.out.println("Hi, my name is "+ name + " and I am " + age +" years old.");
    }
}
