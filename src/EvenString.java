 class EvenString {

    public static void evenString(String s){

        String[] tempStr=s.split(" ");


        for(int i=0;i<tempStr.length;i++){

            //String[] tempStr=s.split(" ");
            if(tempStr[i].length()%2==0)
               System.out.println(tempStr[i]);


            //System.out.println(tempStr[i]);
        }

//        for(String word :s.split(" ")){
//            if(word.length()%2==0)
//                System.out.println(word);
//        }


    }

    public static void main(String[] args){
        String s="My abc name is Lakhan an a ";
        evenString(s);
    }
}
