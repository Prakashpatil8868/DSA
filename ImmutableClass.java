package DSA;
import java.util.Scanner;

public class ImmutableClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        String B=sc.nextLine();
        boolean result= CheckAnagram(A,B);
        System.out.println(result);
    }

    public static boolean CheckAnagram(String A, String B){

        char []c=B.toCharArray();

        for(int i=0;i<A.length();i++){
            int flag=0;

            for(int j=0;j<c.length;j++){
                if(A.charAt(i)==c[j]){
                    c[j]=0;
                    flag=1;
                    break;
                }
            }
            if(flag==0) return false;
        }

        return true;

    }

    
}
// TC- O(N*N) , SC= O(N)