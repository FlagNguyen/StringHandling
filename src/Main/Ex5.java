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
public class Ex5 {

    protected static String standardlizeString(String s) {
        String strOut = "";
        String st = "";
        st = s.trim().toLowerCase().replaceAll("\\s+", " ");

        String[] temp = new String[100];
        temp = st.split(" ");
        for (int i = 0; i <= temp.length - 1; i++) {
            strOut += String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
            if (i < temp.length - 1) {
                strOut += " ";
            }
        }
        return strOut;
    }

    static void handling(String s) {
        s = s.trim().replace("\\s+", " ");
        String[] ses = s.split(" ");

        String midlle = "";
        for (int i = 1; i < ses.length - 1; i++) {
            midlle += ses[i];
        }
        String strOut = "";
        strOut = ses[ses.length - 1] + " " + ses[0] + " " + midlle;

        System.out.println("String: " + s);
        System.out.println("OUPUT: " + standardlizeString(strOut));
    }

    public static void main(String[] args) {

        handling("nguyen quoc ky");

    }
}
