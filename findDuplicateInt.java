import java.util.*;

class findDuplicateInt{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int [n];
        for(int i=0;i<n;i++){
            int temp=sc.nextInt();
            arr[i]=temp;
        }
         Arrays.sort(arr);

        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                 System.out.println(arr[i]);
            }
        }
    }
}