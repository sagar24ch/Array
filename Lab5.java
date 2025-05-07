public class Lab5 {
    static int searchEle(int arr[],int ele){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ele)
        return i;
        }
        return -1;
    }
    public static void main(String as[]){
        int arr[]={23,45,66,43,11,89};
        int result=searchEle(arr,43);
        if(result>0){
            System.out.println("Element is found at=");
        }
        else {
            System.out.println("element is not found");
        }
    }
    
}
