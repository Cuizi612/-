
import java.util.ArrayList;
import java.util.Random;
public class Member extends User{
   public Member(){};
   public Member(String n,int m){
       super(n,m);
   }
   public void recieve(ArrayList<Integer> a){
       int index=new Random().nextInt(a.size());
       int delta=a.remove(index);
       int money=super.getmoney();
       super.setmoney(money+delta);
   }
}
