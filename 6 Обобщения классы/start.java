
public class start{
      
    public static void main(String[] args) {
         
       Account<Integer> acc1=new Account<Integer>(2345, 5000);

       Account<Integer> acc2=new Account<Integer>(2345, 5000);

    }
    Account<String> acc1 = new Account<String>("2345", 5000);

}


class Account<T>{
     
    private T id;
    private int sum;
     
    Account(T id, int sum){
        this.id = id;
        this.sum = sum;
    }
     
    public T getId() { return id; }
    public int getSum() { return sum; }
    public void setSum(int sum) { this.sum = sum; }
}