// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class numberpattern {
    public static void main(String[] args) {
        int n=3;
        int count=3;
        for(int y=0; y<n+n-1;y++){
            int y1=(y<n)?y:-y+2*n-2;
            for(int x=0; x<n;x++){
                int x1=(x<n)?x:-x+2*n-2;
                if(y1>=x1){
                    System.out.print(y1);
                    System.out.print("\t");  

                }
                else{
                   System.out.print(" ");  
                    if(y1>n){
                        count=count/2;
                    }    
                }  
            }
            System.out.print("\n");
        }
    }
}