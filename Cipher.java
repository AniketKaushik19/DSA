class Cipher{
    public static void main(String [] args){
      String s="Allz 1 best9";
      int key=1;
      int sl=s.length();
      StringBuilder res=new StringBuilder("");
      for(int i=0; i<sl ; i++){
        char ch=s.charAt(i);
        if(ch>='0' && ch<='9'){
            char newValue=(char)(((ch-'0'+key)%10)+'0');
            res.append(newValue);
        }
        else if(ch>='a' && ch<='z'){
            char newValue=(char)((ch-'a'+key)%26+'a');     
            res.append(newValue);
        }
        else if(ch>='A' && ch<='Z'){
           char newValue=(char)((ch-'A'+key)%26+'A');
           res.append(newValue);
        }
        else{
          res.append(ch);
        }
      }
      System.out.println(res);
      
    }
}