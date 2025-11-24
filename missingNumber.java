import java.util.*;

class missingNumber{
    public static void main(String [] args){
        int []arr=new int[]{3,4,0,-1,1};
        Arrays.sort(arr);
        for(int i=0; i<arr.length-1;i++){
            if(arr[i]!=Math.abs(arr[i+1])-1){
                 System.out.println(arr[i]+1);
                 return ;
            }
        }
    }
}