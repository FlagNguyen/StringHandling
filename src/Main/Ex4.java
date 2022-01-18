/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Ex4 {
    
    static void handling(String s){
        s=s.trim().replace("\\s+", " ");
        String[] ses = s.split(" ");
        
        int max=0;
        
        for (int i =0;i<ses.length;i++){
            if (ses[i].length() > max ){
                max = ses[i].length();
            }
        }
        
        for (int i =0;i<ses.length;i++){
            if (ses[i].length() == max){
                System.out.printf("The longest word: %s\n",ses[i]);
                System.out.printf("Length of this word: %d\n",ses[i].length());
                System.out.printf("Position: %d\n",i);
                break;
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String s = "One of the biggest challenges in modern   societies is the improvement of healthy aging    and the support to older persons in their daily activities. "
//                + "In particular, given its social and economic impact,     the automatic detection of falls     has attracted considerable attention in the computer vision and pattern "
//                + "recognition communities.";
        System.out.print("Enter your string: ");
        String s = sc.nextLine();
        handling(s);
    }
}
