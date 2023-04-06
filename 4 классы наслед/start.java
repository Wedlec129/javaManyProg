
public class start{
      
    public static void main(String[] args) {
         
        Person bob = new Person("bob", 25); 
        bob.displayInfo();

        Person bob2 = new Person("bob2", 252); 
        bob2.displayInfo();
       


        Worker alex= new Worker("Alex", 80,"apple.com");
        alex.displayInfo();


       
    }

}

class Person{
     
    String name;    // имя
    int age;        // возраст
     private int selary;

    static int a=0; //типо статическая перем, она одна на класс и при каждом обекте разная

    Person(String n, int age){
        name = n;
        this.age = age;         //this its mean in class 
        selary=120;
    }

    private void sayStatic(){
        a++;
        System.out.printf("statik int "+a);
        System.out.println(" ");
        System.out.println(" ");
    } 

     void displayInfo(){ //like public
        
        System.out.printf("Name: %s \tAge: %d \n", name, age);
        sayStatic();
    }


}


class Worker extends Person{ //наследование от person. наслед можно от 1 класса
    //на этот выход пришли интерфейсы(типо классы, но способные решить эту проб)
    String komany;

    public Worker(String name, int age,String komany){
        super(name,age);    // если базовый класс определяет конструктор импользуем констуктор от Person
                             //  то производный класс должен его вызвать
        this.komany=komany;
    }


    //полиморфизм
    @Override
    public void displayInfo(){
        System.out.printf("Name: %s \tAge: %d \t komp: %s\n", name, age, komany);
       
    }



}
