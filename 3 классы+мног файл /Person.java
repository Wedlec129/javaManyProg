public class Person{
     
    String name;    // имя
    int age;        // возраст
    int selary;

    Person(String n, int age){
        name = n;
        this.age = age;         //this its mean in class 
        selary=120;
    }

    void displayInfo(){
        System.out.printf("Name: %s \tAge: %d \n", name, age);
    }
}