package Stack;


import java.util.Stack;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 *
 * 示例 1:
 * 输入: "()"
 * 输出: true
 * 示例 2:
 * 输入: "()[]{}"
 * 输出: true
 * 示例 3:
 * 输入: "(]"
 * 输出: false
 * 示例 4:
 * 输入: "([)]"
 * 输出: false
 * 示例 5:
 * 输入: "{[]}"
 * 输出: true
 */

class Solution {
    public boolean isValid(String s) {
        int length = s.length();
        char str;
        boolean flag = true;
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<length; i++){
            str = s.charAt(i);
            if(str=='(' || str=='{' || str=='['){
                stack.push(str);
            }
            else if(str==')' || str=='}' || str==']'){
                if(stack.empty()){
                    flag = false;
                    break;
                }
                if((stack.peek()=='(' && str==')' )||
                        (stack.peek()=='{' && str=='}') ||
                                (stack.peek()=='[' && str==']')) {
                    stack.pop();
                }
                else {
                    flag = false;
                }
            }
            if(i==length-1 && stack.empty()){
                return flag;
            }
        }
        if(!stack.empty()){
            flag = false;
        }
        return flag;
    }
}

public class pipei {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isValid("(])"));
    }
}
