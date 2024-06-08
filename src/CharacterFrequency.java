public class CharacterFrequency {

    // Java implementation to print the character and
// its frequency in order of its occurrence


        static final int SIZE = 52;

        // function to print the character and its
        // frequency in order of its occurrence
        static void printCharWithFreq(String str)
        {
            // size of the string 'str'
            int n = str.length();

            // 'freq[]' implemented as hash table
            int[] freq = new int[SIZE];
            int index=0;

            // accumulate frequency of each character
            // in 'str'
            for (int i = 0; i < n; i++) {
                 index=str.charAt(i) - 'a';
                if(index<0)
                    index=index+26;
                freq[index]++;

            }

            // traverse 'str' from left to right
            for (int i = 0; i < n; i++) {

                index=str.charAt(i) - 'a';
                if(index<0)
                    index=index+26;

                // if frequency of character str.charAt(i)
                // is not equal to 0
                if (freq[index] != 0) {

                    // print the character along with its
                    // frequency
                    System.out.print(str.charAt(i));
                    System.out.print(freq[index] + " ");

                    // update frequency of str.charAt(i) to
                    // 0 so that the same character is not
                    // printed again
                    freq[index] = 0;
                }
            }
        }

        // Driver program to test above
        public static void main(String args[])
        {
            String str = "ageAeaksforgaeeks";
            printCharWithFreq(str);
        }
    }
// This code is contributed by Sumit Ghosh


