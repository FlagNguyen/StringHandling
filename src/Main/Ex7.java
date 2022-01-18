/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.IOException;

/**
 *
 * @author asus
 */
public class Ex7 {

    static void handling(String s1, String s2) {
        System.out.println(s1);
        do {
            s1 = s1.replace(s2, "");
        } while (s1.contains(s2));
        s1 = s1.trim().replaceAll("\\s+", " ");
        System.out.println(s1);
    }

    public static void main(String[] args) throws IOException {
        Ex2 ex2 = new Ex2();
        String s1 = ex2.checkString("Enter first string: ");
        String s2 = ex2.checkString("Enter seccond string: ");;
        handling(s1, s2);

    }
}
