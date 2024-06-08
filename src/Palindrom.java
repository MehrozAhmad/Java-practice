 class Palindrom {

    public static boolean ispalindrom(String s){
        String reverse="";
        for(int i=0;i<s.length();i++){
            reverse=s.charAt(i)+reverse;
        }

        if(s.equals(reverse))
            return true;
        return false;

    }

    public static void main(String[] args){

        String s="121";
        boolean palidromtest=ispalindrom(s);
        System.out.println("Given string is palindrom : "+palidromtest);
    }
}
