import java.util.Scanner;

 class JavaPractice {


    public static boolean isVowel(char ch) {
        if(ch == 'a' || ch =='e' || ch =='i' || ch =='o' || ch =='u')
            return true;

        return false;
    }

    public static void main(String args[]) {
        // Your code goes here
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        int vowelCount = 0;
        int consCount = 0;

        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            if(isVowel(ch) == true) vowelCount++;
            else if(ch >='a' && ch<='z' && isVowel(ch) == false) consCount++;
        }

        System.out.println("Number of vowels are: " + vowelCount);
        System.out.println("Number of consonants are: " + consCount);
        System.out.println("Number of other characters are: " + (int)(str.length() - vowelCount -consCount));
    }
    }

