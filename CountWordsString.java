package DSA;

public class CountWordsString {
    public static void main(String[] args) {
        
        String str="My name is Prakash";

        String[] words=str.split(" ");

        int even=0, odd=0;

        for(int i=0;i<words.length;i++){
     if(words[i].length()%2==0)
     even++;
     else
     odd++;
        }

        int[] arr=new int[]{odd,even};
        System.out.println("["+arr[0]  +" , "+arr[1]+"]");

    }
    
}
