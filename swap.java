import java.util.Scanner;
import java.util.ArrayList;
public class swap{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements in the arraylist: ");
        int amount=sc.nextInt();
        ArrayList<Integer> al =new ArrayList<>(amount);
        System.out.println("enter the elements: ");
        for(int i=0; i<amount; i++){
            al.add(sc.nextInt());  
        }
        System.out.println(swapelements(al));
        sc.close();
    }
    public static ArrayList<Integer> swapelements(ArrayList<Integer> al){
            int x=al.get(0);
            int y=al.get(al.size()-1);
            al.set(0, y);
            al.set(al.size()-1, x);
            return al;
        }
}