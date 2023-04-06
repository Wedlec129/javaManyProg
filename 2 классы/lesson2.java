
public class lesson2{
      
    public static void main(String[] args) {
         
        Person bob = new Person("bob", 25); // вызов третьего конструктора с двумя параметрами
        bob.displayInfo();

    }

}



class Person{
     
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