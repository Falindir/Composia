package composia;

import composia.core.Boostrap;

/**
 * Created by jimmy on 09/04/16.
 */
public class Main {

    public static void main (String[] args){
        System.out.println("Hello master Falindir");

        Boostrap.run();

        System.out.println(Boostrap.componentDescriptor.toString());

        System.out.println("By master Falindir");

        Object o = new Object();

        System.out.println(o.getClass().getName());


    }
}
