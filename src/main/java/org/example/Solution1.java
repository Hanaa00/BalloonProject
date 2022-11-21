package org.example;

import java.util.TreeSet;
class Solution1 {

    public static int checkWordBalloon(String text) {

        TreeSet<Character> al=new TreeSet<Character>();

        for(int i=0;i<text.length();i++)
        {

            al.add(text.toLowerCase().charAt(i));

        }

        int b=0;

        int a=0;

        int l=0;

        int o=0;

        int n=0;

        for(int i=0;i<text.length();i++)

        {

            if(al.contains(text.toLowerCase().charAt(i)))

            {
                if(text.toLowerCase().charAt(i)=='b')

                    b=b+1;

                else if(text.toLowerCase().charAt(i)=='a')

                    a=a+1;

                else if(text.toLowerCase().charAt(i)=='l')

                    l=l+1;

                else if(text.toLowerCase().charAt(i)=='o')

                    o=o+1;

                else if(text.toLowerCase().charAt(i)=='n')

                    n=n+1;

            }

        }

        l=l/2;

        o=o/2;

        int min=0;

        int am[]={b,a,l,o,n};

        min=b;

        for(int i=0;i<am.length;i++)

        {

            min=Math.min(min,am[i]);

        }
        System.out.println(min);
        return min;

    }

}