import java.util.*;
class findSingleElementInString{
    public static void main (String []args){
        String s="aabbc";
        HashMap <Character ,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        map.forEach((key,value)->{
             if(value==1){
                System.out.println(key);
             }
        });
    }
}