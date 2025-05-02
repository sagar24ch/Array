public class Lab1{
    public static void main(String as[]){
        //1.creating array
            //datatype refVar[]=new datatype[size];
            int arr[]=new int[5];

        //2.find the length of array
            int size=arr.length;
            System.out.println(size);

        //3.Accessing elements
            for(int i=0;i<size;i++)
            {
                System.out.print(arr[i]+"\t");
            }

        //4.Assign the vslues
            arr[0]=10;
            arr[1]=20;
            arr[2]=30;
            arr[3]=40;
            arr[4]=50;

        //5.Accessing elements (using enhanced for loop)
            for(int x:arr){
                System.out.print(x);
                System.out.print("\t");
            }
    }
}