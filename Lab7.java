import java.util.Arrays;
//delete element when position is given
public class Lab7 {
    public static int[] deleteEle(int arr[],int pos){
        //arr[pos-1]=0;
        for(int i=pos-1;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=0;
        return arr;
    }
    public static void main(String as[]){
        int arr[]=new int[10];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;
        arr[5]=10;
        arr[6]=20;
        arr[7]=30;
        arr[8]=40;
        arr[9]=50;
        System.out.println(Arrays.toString(arr));
        deleteEle(arr,3);
        System.out.println(Arrays.toString(arr));
    }
}
