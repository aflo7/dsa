/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Flores;

import java.util.Stack;

/**
 *
 * @author andres
 */
public class StringTokenizer {

    public String postfix(String input) {
        char[] in = input.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        StringBuilder out = new StringBuilder();

        for (int i = 0; i < in.length; i++) {

            switch (in[i]) {
                case '+':
                case '-':
                    while (!stack.empty() && (stack.peek() == '*' || stack.peek() == '/')) {
                        out.append(' ');
                        out.append(stack.pop());
                    }
                    out.append(' ');
                    stack.push(in[i]);
                    break;
                case '*':
                case '/':
                    out.append(' ');
                    stack.push(in[i]);
                    break;
                case '(':
                    stack.push(in[i]);
                    break;
                case ')':
                    while (!stack.empty() && stack.peek() != '(') {
                        out.append(' ');
                        out.append(stack.pop());
                    }
                    stack.pop();
                    break;
                default:
                    out.append(in[i]);
                    break;
            }

           

        }

        return out.toString();

    }
}
