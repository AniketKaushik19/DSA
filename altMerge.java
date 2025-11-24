class altMerge{
    public static void main(String [] args){
      String s="abc";
      String p="pqrs";
      int sl=s.length();
      int pl=p.length();
      int i=0,j=0;
      StringBuilder res=new StringBuilder("");
      while(i<sl && j<pl){
        if(i<sl){
            res.append(s.charAt(i));
            i++;
        }
        if(j<pl){
            res.append(p.charAt(j));
            j++;
        }
      }

      while(i<sl){
        res.append(s.charAt(i));
        i++;
      }
      while(j<pl){
        res.append(p.charAt(j));
        j++;
      }

      System.out.println(res);
      
    }
}