/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
import java.util.*;
import java.util.Scanner;

/**
 *
 * @author ntu-user
 */
public class Ex2_4 {

    public static void main(String[] args) {
        List<Character> chars = new LinkedList<>();
        List<Integer> num = new LinkedList<>(); // required to allow changing the value
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a string!");
        String userInput=myObj.nextLine();
        for(int i=0;i<userInput.length();i++) 
        {
            if (chars.contains(userInput.charAt(i)))
            {
                num.set(chars.indexOf(userInput.charAt(i)), num.get(chars.indexOf(userInput.charAt(i)))+1);
            }
            else
            {
                chars.add(userInput.charAt(i));
                num.add(1);
            }
        }
        
        for(int i = 0; i < chars.size(); i++)

        {
            System.out.print("char: " + chars.get(i));
            System.out.println(", occurrences: " + num.get(i));
        }
    }
}
