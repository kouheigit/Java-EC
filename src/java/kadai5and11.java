/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class kadai5and11 {

    public static void main(String[] args) {
        kadai5and11 ojb1 = new kadai5and11();
        kadai5and11 ojb2 = new kadai5and11();
        System.out.println(ojb1 == ojb2);/*ここでfalseが出るのは理解できる*/
        ojb2 = operate(ojb1, ojb2);
        System.out.println(" " + (ojb1 == ojb2));/*ここもfalseではなのかtrueのはずではない*/
    }

    static kadai5and11 operate(kadai5and11 ojb1, kadai5and11 ojb2) {
        kadai5and11 ojb3 = ojb1;
        ojb1 = ojb2;
        return ojb3;
    }
}
