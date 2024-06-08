import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedBrackets {

    public static boolean isBracketsBalanced(String str){
        Deque<Character> stack=new ArrayDeque<Character>();
        char[] ch=str.toCharArray();
        for(int i=0;i<str.length();i++){
            if(ch[i]=='('||ch[i]=='['||ch[i]=='{') {
                stack.push(ch[i]);
                continue;
            }
            if(stack.isEmpty())
                return false;
            char temp;

            switch (ch[i]) {

                case ')':
                    temp = stack.pop();
                    if (temp == '{' || temp == '[')
                        return false;
                    break;
                case ']':
                    temp = stack.pop();
                    if (temp == '{' || temp == '(')
                        return false;
                    break;
                case '}':
                    temp = stack.pop();
                    if (temp == '(' || temp == '[')
                        return false;
                    break;

            }

        }
        return true;



    }

    public static void main(String[] args) {
        String str="[()]{}{[()()]()}";
        System.out.println(isBracketsBalanced(str));
    }
}
