// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class butterfly {
    public static void main(String[] args) {
        int n=4;
        for(int y=0; y<n+n-1;y++){
            int y1=(y<n)?y:-y+2*n-2;
            for(int x=0; x<n+n-1;x++){
                int x1=(x<n)?x:-x+2*n-2;
                if(y1>=x1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}