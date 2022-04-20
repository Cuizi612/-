
import java.util.ArrayList;


public class Groupleader extends User{
   public Groupleader(){};
   public Groupleader(String n,int m){
       super(n,m);
   }
   public ArrayList<Integer> send(int totalmoney,int count){
       ArrayList<Integer> red=new ArrayList<>();
       int leftmoney=super.getmoney();//当前余额
       if(leftmoney<totalmoney){
           System.out.println("Failed, no enough money.");
           return red;
       }
       if(leftmoney>=totalmoney){
           super.setmoney(leftmoney-totalmoney);
           int avg=totalmoney/count;
           int rest=totalmoney%count;
           for(int i=0;i<count;i++){
               red.add(avg);
           }
           int last=avg+rest;
           red.add(last);
       }
       return red;
   }
   
}
