public class RotateArrayByKTimes {
    public static void main(String[] args) {
        int arr[]={5,4,9,3,2,4};
        int K=3;
        int N= arr.length-1;
        Merge(arr,0,N);
        Merge(arr,0,K-1);
        Merge(arr,K,N);

        for (int i=0;i<=N;i++
             ) {
            System.out.print(arr[i]+" ");

        }
    }
    public static int[] Merge(int arr[], int s, int e){
        while (s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;

            s++;
            e--;
        }
        return arr;
    }
}
