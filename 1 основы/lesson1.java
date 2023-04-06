
//javac lesson.java && java lesson

import java.util.Scanner;   //like include scaner for input

public class lesson1{                        //
      
    public static void main (String args[]){ //like int main(argc)
          
        System.out.println("Hello Java! "+"lol"); //print line new


        int x1 = 10;     // объявление и инициализация переменной
        System.out.println(x1);  // 10
        var x2 = 10; //типо само определит тип данных
        final int LIMIT = 5; //константа
        double x3 = 8.5;
        float x = 8.5F;         // like float
        float fl = 30.6f;       //

        int a3 = 4;
        byte b3 = (byte)a3; 

        String text = """
                Вот мысль, которой весь я предан,
                Итог всего, что ум скопил.
                Лишь тот, кем бой за жизнь изведан,
                Жизнь и свободу заслужил.
                """;
        System.out.println(text);
        int y=6;
        System.out.printf("x=%d; y=%d \n", x1, y);
        System.out.println("x=" + x1 + "; y=" + y);


        //мы типо используем доп библ
        Scanner in = new Scanner(System.in);

        System.out.print("Input a number: ");
        //var num = in.nextInt(); //опред тип
        var num=1;
        System.out.printf("Your number:"+num);
        /*
            next(): считывает введенную строку до первого пробела
            nextLine(): считывает всю введенную строку
            nextInt(): считывает введенное число int
            nextDouble(): считывает введенное число double
            nextBoolean(): считывает значение boolean
            nextByte(): считывает введенное число byte
            nextFloat(): считывает введенное число float
            nextShort(): считывает введенное число short
         */
        in.close();


        
        int num2 = 8;

        if(num>num2){
            System.out.println("Первое число больше второго");
        }
        else if(num<num2){
            System.out.println("Первое число меньше второго");
        }
        else{
            System.out.println("Числа равны");
        }
        switch(num){
             
            case 1: 
                System.out.println("число равно 1");
                break;
            case 8: 
                System.out.println("число равно 8");
                num++;
                break;
            case 9: 
                System.out.println("число равно 9");
                break;
            default:
                System.out.println("число не равно 1, 8, 9");
        }

        for (int i = 1; i < 9; i++){
            if (i == 5)
                 break;
            System.out.printf("Квадрат числа %d равен %d \n", i, i * i);
        }


        int nums[] = new int[4];    // массив из 4 чисел
        int nums2[] = new int[] { 1, 2, 3, 5 };
        int nums3[][] = { { 0, 1, 2 }, { 3, 4, 5 } };


        int array[] = new int[] { 1, 2, 3, 4, 5 };
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
        for (int i : array){
            System.out.println(i);
        }


        hello("bob",18,1,2,3);


        


    }


    static void hello(String name, int age,int ...nume){
         
        System.out.println("\n\nHello "+name+"\nage:"+age);
        System.out.println("\n"+sum(5,4)+"\n");

        for(int i:nume){
            System.out.println(i);
        }

    }
    static int sum(int a,int b){
         
        return a+b;
    }


}