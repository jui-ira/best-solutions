import java.io.*;
import java.util.*;
public class Solution {
     
    // Write your code here.
    int rear=-1,front=-1,top=-1;
  char stack[]=new char[50];
    char queue[]=new char[50];
    void pushCharacter(char c)
    {
      top++;
        stack[top]=c;
           
    }
    void enqueueCharacter(char c)
    {
        if(rear==-1)
        {
       rear++;
        front++;}
        else{
            rear++;
        }
        queue[rear]=c;
    }
    char dequeueCharacter()
    {
        char val;
        val=queue[front];
        front++;
        return val;
    }
    char popCharacter()
    {
        char val1;
        val1=stack[top];
        top--;
        return val1;
    }
public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}