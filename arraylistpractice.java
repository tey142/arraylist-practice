import java.util.*;
public class arraylistpractice{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of arrays: ");
        int arrays=sc.nextInt();
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        for(int i=0; i<arrays; i++){
            System.out.println("enter the amount of elements in array"+(i+1)+": ");
            int amount=sc.nextInt();
            ArrayList<Integer> arry=new ArrayList<>();
            System.out.println("enter the elements of array"+(i+1)+": ");
            for(int j=0; j<amount; j++){
                arry.add(sc.nextInt());
            }
            arr.add(i, arry);
        }
        System.out.println("enter the number of queries to process: ");
        int num=sc.nextInt();
        for(int k=0; k<num; k++){
            System.out.println("enter the row and column of the element to print: ");
            int row=sc.nextInt();
            int column=sc.nextInt();
            try{
                System.out.println("element in ()"+row+","+column+") is: "+arr.get(row-10).get(column-1));
            }
            catch(Exception ex){
                System.out.println("error");
            }
        }
    }
}