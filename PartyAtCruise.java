class PartyAtCruise{
    public static void main(String [] args){
        int [] stay={7,0,5,1,3};
        int [] leave={1,2,1,3,4};
        int time=5;
        int max=Integer.MIN_VALUE;
        int curr=0;
        System.out.println(va);
        for(int i=0 ; i<time ; i++){
            curr=stay[i]-leave[i]+curr;
            max=Math.max(curr , max);
        }
        System.out.println(max);
    }
}