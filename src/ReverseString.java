 class ReverseString {

    public static String revString(String s) {
        String reverse = "";
        //String newStr="";
        //char ch[]=s.toCharArray();
        //System.out.println(ch);
        for (int i =s.length()-1; i>=0; --i) {
            //System.out.println(ch[i]);
            reverse = reverse+s.charAt(i);
        }
        //System.out.println("In method"+reverse);
        return reverse;
    }

    public static void main(String[] args){
        String s="Anything";

        //StringBuffer sb= new StringBuffer(s);

        //String newStr =sb.reverse().toString();


        //System.out.println(newStr);

        String newString=revString(s);
        System.out.println(newString);

    }


 }