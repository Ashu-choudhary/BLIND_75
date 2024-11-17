package String;

import java.util.Scanner;

public class Valid_anagram {

    public boolean isanagram(String s, String t){
        int[] count = new int[26];

        for(char x : s.toCharArray()){
            count[x-'a']++;
        }

        for(char x : t.toCharArray()){
            count[x-'a']--;
        }

        for(int val : count){
            if(val != 0){
                return false;
            }

        }

        return true;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String s = sc.nextLine();
        System.out.println("Enter second string: ");
        String t = sc.nextLine();
        sc.close();

        Valid_anagram v = new Valid_anagram();
        System.out.println(v.isanagram(s,t));
    }
}


