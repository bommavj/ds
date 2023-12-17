package Strings;

import java.util.*;

public class StringBasic {

    public static void main(String[] args) {
        String a ="s";
        String a1 = "s";
        System.out.println(a == a1);
        System.out.println("*******");
        System.out.println(((int)7/2));
        System.out.println("*******");
        System.out.println("kolkata".replace('k', 's'));
        System.out.println("*******");
        System.out.println("ABC".toString() == "ABC");
        System.out.println("*******");
        List<String> aa = new ArrayList<>();
        aa.add("he");
        System.out.println(aa);
        System.out.println("*******");

        int $z;
        int _456;
        int cen_yuyuyyyuiyuiyuyuyuyuyuiy_;



        TreeSet s1 = new TreeSet();
        s1.add("one");
        s1.add("two");
        s1.add("three");
        s1.add("one");

        Iterator it = s1.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        if("ABC".toString() == "ABC")
            System.out.println("correct");
    }
}
