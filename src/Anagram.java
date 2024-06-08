import java.util.*;

class Anagram {

    public static boolean isAnagram(char[] s1,char[] s2){
//        char[] c1=s1.toCharArray();
//        //System.out.println(c1[0]);
//        char[] c2=s2.toCharArray();



        if(s1.length!=s2.length){
            System.out.println("Returning from if");
            return false;
        }
        Arrays.sort(s1);
        Arrays.sort(s2);


        for(int i=0;i<s1.length;i++){
                if(s1[i]!=s2[i]){
                    System.out.println(s1[i]+" "+s2[i]);
                    return false;
                }

            }
        return true;



    }

    public static void main(String[] args){
        char[] s1={'L','I','S','T','E','N'};
        char[] s2= {'S','I','L','E','N','T'};

        System.out.println(isAnagram(s1,s2));
    }
}
