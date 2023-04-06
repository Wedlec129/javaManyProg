import java.util.ArrayList; //include lib

public class start{
      
    public static void main(String[] args) {
         
        ArrayList<String> people = new ArrayList<String>();
        // добавим в список ряд элементов
        people.add("Tom");
        people.add("Alice");
        people.add("Kate");
        people.add("Sam");
        people.add(1, "Bob"); // добавляем элемент по индексу 1
          
        System.out.println(people.get(1));// получаем 2-й объект [1]
        people.set(1, "Robert"); // установка нового значения для 2-го объекта
          
        System.out.printf("ArrayList has %d elements \n", people.size());
        for(String person : people){
          
            System.out.println(person);
        }
        // проверяем наличие элемента
        if(people.contains("Tom")){
          
            System.out.println("ArrayList contains Tom");
        }
          
        // удалим несколько объектов
        // удаление конкретного элемента
        people.remove("Robert");
        // удаление по индексу
        people.remove(0);
          
        Object peopleArray[] = people.toArray(); //universal type of valume
        for(Object person : peopleArray){
          
            System.out.println(person);
        }
    


        String str1 = "Java";
        String str4 = new String(new char[]{'w', 'e', 'l', 'c', 'o', 'm', 'e'});
        char[] helloArray = str4.toCharArray();

        /* 
        concat(): объединяет строки
        valueOf(): преобразует объект в строковый вид
        join(): соединяет строки с учетом разделителя
        сompareTo(): сравнивает две строки
        charAt(): возвращает символ строки по индексу
        getChars(): возвращает группу символов
        equals(): сравнивает строки с учетом регистра
        equalsIgnoreCase(): сравнивает строки без учета регистра
        regionMatches(): сравнивает подстроки в строках
        indexOf(): находит индекс первого вхождения подстроки в строку
        lastIndexOf(): находит индекс последнего вхождения подстроки в строку
        startsWith(): определяет, начинается ли строка с подстроки
        endsWith(): определяет, заканчивается ли строка на определенную подстроку
        replace(): заменяет в строке одну подстроку на другую
        trim(): удаляет начальные и конечные пробелы
        substring(): возвращает подстроку, начиная с определенного индекса до конца или до определенного индекса
        toLowerCase(): переводит все символы строки в нижний регистр
        toUpperCase(): переводит все символы строки в верхний регистр
        */

        System.out.println(" ");
        System.out.println(" ");
        String text = "FIFA will never regret it";
        String[] words = text.split(" ");
        for(String word : words){
            System.out.println(word);
        }



    }

}

