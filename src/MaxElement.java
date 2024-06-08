 class MaxElement {
     public static int isMax(int[] a ){
         int max=a[0];
         //int min=Integer.MIN_VALUE;
         if(a.length==0)
             return 0;

         for(int i=0;i<a.length;i++){
             if(max<a[i])
                 max=a[i];
         }
         return max;
     }

     public static void main(String[] args){
         int[] a={-3,-2,-1,-1};
         int maximum=isMax(a);
         System.out.println("Maximum element is "+maximum);
     }
}
