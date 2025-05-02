import java.util.ArrayList;

public class Lab2 {
    public static void main(String as[]){
        //int arr[]=new int[5];
        ArrayList <Integer> mylist=new ArrayList<Integer>();
        
        mylist.add(10);
        mylist.add(20);

        for(int x:mylist){
            System.out.println(x);
        }
    }
}
