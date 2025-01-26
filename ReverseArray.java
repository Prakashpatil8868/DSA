public class ReverseArray {
    public static void main(String[] args) {
        int arr[]={5,6,7,1,3,4};

      //  int k=2;  //7 1 3 4 5 6
//int[] add=new int[arr.length];
        int p1=0, p2= arr.length-1;
        while(p1<p2){
            int temp=arr[p1];
            arr[p1]=arr[p2];
            arr[p2]=temp;

            p1++;
            p2--;

        }

        for (int i=0;i< arr.length-1;i++){
            System.out.println(arr[i]);

        }


    }
}
