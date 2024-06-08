 class SmallestLargestArray {

    public static int smalleLargeElement(int [] arr){
        int max=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>max)
                max=arr[i];
            if(arr[i]<min)
                min=arr[i];
        }

        System.out.println(max);
        System.out.println(min);


        return max;

    }

    public static void main(String args[]){
        int[] arr={3,4,10,20,100,12};
        System.out.println("Max element is :"+smalleLargeElement(arr));
    }
}
