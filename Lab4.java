public class Lab4 {
    static int searchEle(int arr[],int ele){
        for(int i=0;i<arr.length;i++){
            if(ele==arr[i]){
                System.out.println("element found at=");
            
        return i;
            }
        }return 0;
    }
    public static void main(String as[]){
        int arr[]={10,34,23,45,80};
        int ind=searchEle(arr,23);
        System.out.println(ind);
        if(ind==1){
            System.out.println("element found");
        }
        else
        System.out.println("element not found");
}
}
