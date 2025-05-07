import java.util.Arrays;

public class Lab6 {
    static int[] insertEle(int arr[],int ele,int position){
        int index=position-1;
        for(int i=arr.length-1;i>index;i--){
            arr[i]=arr[i-1];
        }
        arr[index]=ele;
        return arr;
    }
    public static void main(String as[]){
        int arr[]=new int[10];
        arr[0]=10;
        arr[1]=30;
        arr[2]=50;
        arr[3]=90;
        arr[4]=70;

        System.out.println(arr.length);
        //int element=25;
        //int position=3;
        System.out.println(Arrays.toString(arr));
        insertEle(arr,33,3);
        insertEle(arr, 55, 8);
        System.out.println("after insertion"+"\t");
        System.out.println(Arrays.toString(arr));
    }
}
