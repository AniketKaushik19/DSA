class FurnishingCompany{
    public static void main(String [] args){
      String s="bbbaaabab";
      int count=0;
      int k=3;
      int size=0;
      int max=Integer.MIN_VALUE;
      for(int i=0 ; i<s.length() ; i++){
        char ch=s.charAt(i);
        if(ch=='a'){
            count++;
        }
        if(k==size){
            count=0;
        }
        max=Math.max(max,count);
        size++;
      }
      System.out.println(max);
      
    }
}