import java.util.*;
class LeadersInArray{
    public static void main(String [] args){
      int [] arr={1,2,5,3,1,2};
      int len=arr.length;
      ArrayList<Integer> res=new ArrayList<>();
      res.add(arr[len-1]);
      for(int i=len-2; i>=0; i--){
        if(res.get(res.size()-1)<arr[i]){
            res.add(arr[i]);
        }
      }
      System.out.println(res);
      
    }
}