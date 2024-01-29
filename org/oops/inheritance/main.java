

package org.oops.inheritance;

public class main {
    public static void main(String[] args) {

        User u =  new User();
        u.read();

        Developer d  = new Developer();
        d.write();
        d.read();


        Admin a = new Admin();

        a.read();
        a.Manage();
        a.write();

     }
}
