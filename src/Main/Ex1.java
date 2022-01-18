/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author asus
 */
public class Ex1 {

    static boolean check(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return s.equals(String.valueOf(sb));
    }

    public static void main(String[] args) {
        int count = 0;
        System.out.println("List reversible number: ");
        for (int i = 100000; i <= 999999; i++) {
            if (check(Integer.toString(i))) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("Count: " + count);
    }
}
