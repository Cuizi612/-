
public class User {
    private String name;
    private int money;
   public User(){};
   public User(String n,int m){
       name=n;
       money=m;
   }
   public void show(){
       System.out.println("My name is"+""+name+"I have "+money+"yuan.");
   }
   public void setmoney(int a){
       money=a;
   }
   public String getname(){
       return name;
   }
   public int getmoney(){
       return money;
   }
}
