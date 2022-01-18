/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import static Main.Ex2.in;
import java.io.IOException;

/**
 *
 * @author asus
 */
public class Ex6 {

    protected void handling() {

    }

    static String checkString(String mess) throws IOException {
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

    static boolean check_Word(String s) {
        String[] ses = s.split(" ");
        for (int i = 0; i < ses.length; i++) {
            if (ses[i].length() > 10) {
                return false;
            }
        }
        return true;
    }

    static boolean check_String(String s) {
        String[] ses = s.split(" ");
        if (ses.length <= 20) {
            return true;
        }
        return false;
    }

    static void alphabet(String s) {
        s = s.trim().replaceAll("\\s+", " ");
        String[] ses = s.split(" ");

        for (int i = 0; i < ses.length - 1; i++) {
            for (int j = i + 1; j < ses.length; j++) {
                if (ses[i].compareToIgnoreCase(ses[j]) > 0) {
                    String temp = ses[i];
                    ses[i] = ses[j];
                    ses[j] = temp;
                }
            }
        }

        System.out.println("In alphabet order: ");
        for (String word : ses) {
            System.out.println(word);
        }
    }

    public static void main(String[] args) throws IOException {

        String s = "";

        do {
            s = checkString("Enter your string: ");
            if (check_String(s)) {
                if (check_Word(s)) {
                    break;
                } else {
                    System.err.println("The word cant be longer than 10 chars");
                }
            } else {
                System.err.println("Your String cant be longer than 20 words");
            }
        } while (true);
        alphabet(s);
    }
}
