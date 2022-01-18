/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Ex2 {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    static String string_Change(String s) {
        String strOut = "";
        s = s.toLowerCase();
        String[] ses = s.split("");
        for (int i = 0; i < ses.length; i++) {
            if (i % 2 == 0) {
                strOut += ses[i].toUpperCase();
            } else {
                strOut += ses[i];
            }
        }
        return strOut;
    }

    public static String checkString(String mess) throws IOException {
        String out = "";
        try {
            do {
                System.out.print(mess);
                out = in.readLine();
                if (out.isEmpty()) {
                    System.err.println("Please Enter String");
                } else {
                    break;
                }
            } while (true);
        } catch (Exception e) {
        }

        return out.trim();
    }

    public static void main(String[] args) throws IOException {
        String s = checkString("Enter your string: ");
        System.out.println("OUTPUT: " + string_Change(s));
    }
}
