
public class start{
      
    public static void main(String[] args) {
         
        Day current = Day.MONDAY;
        System.out.println(current+" "+current.ordinal());    // MONDAY
        
        Day types[] = Day.values();
        for (Day s : types) { System.out.println(s); }

    }

}

enum Day{
 
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}