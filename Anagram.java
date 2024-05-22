/* Siddharth Korukonda
   115607752
   CSE 114
   Paul Fodor
   Homework 3
   Question 3 (Anagram.java)
 */

import java.util.*;

public class Anagram {
    public static boolean Anagram(String input1, String input2) {
        String input1_intermediate_modification = input1.toLowerCase().trim();
        String input1_modified = input1_intermediate_modification.replace(" ","");
        String input2_intermediate_modification = input2.toLowerCase().trim();
        String input2_modified = input2_intermediate_modification.replace(" ","");

        int aCount1 = 0;
        int bCount1 = 0;
        int cCount1 = 0;
        int dCount1 = 0;
        int eCount1 = 0;
        int fCount1 = 0;
        int gCount1 = 0;
        int hCount1 = 0;
        int iCount1 = 0;
        int jCount1 = 0;
        int kCount1 = 0;
        int lCount1 = 0;
        int mCount1 = 0;
        int nCount1 = 0;
        int oCount1 = 0;
        int pCount1 = 0;
        int qCount1 = 0;
        int rCount1 = 0;
        int sCount1 = 0;
        int tCount1 = 0;
        int uCount1 = 0;
        int vCount1 = 0;
        int wCount1 = 0;
        int xCount1 = 0;
        int yCount1 = 0;
        int zCount1 = 0;

        int length1 = input1_modified.length();
        int length2 = input2_modified.length();

        if (length1!=length2) {
            return false;
        }

        for (int i=0; i<length1; i++) {
            if (input1_modified.charAt(i)=='a')
                aCount1++;
            else if (input1_modified.charAt(i)=='b')
                bCount1++;
            else if (input1_modified.charAt(i)=='c')
                cCount1++;
            else if (input1_modified.charAt(i)=='d')
                dCount1++;
            else if (input1_modified.charAt(i)=='e')
                eCount1++;
            else if (input1_modified.charAt(i)=='f')
                fCount1++;
            else if (input1_modified.charAt(i)=='g')
                gCount1++;
            else if (input1_modified.charAt(i)=='h')
                hCount1++;
            else if (input1_modified.charAt(i)=='i')
                iCount1++;
            else if (input1_modified.charAt(i)=='j')
                jCount1++;
            else if (input1_modified.charAt(i)=='k')
                kCount1++;
            else if (input1_modified.charAt(i)=='l')
                lCount1++;
            else if (input1_modified.charAt(i)=='m')
                mCount1++;
            else if (input1_modified.charAt(i)=='n')
                nCount1++;
            else if (input1_modified.charAt(i)=='o')
                oCount1++;
            else if (input1_modified.charAt(i)=='p')
                pCount1++;
            else if (input1_modified.charAt(i)=='q')
                qCount1++;
            else if (input1_modified.charAt(i)=='r')
                rCount1++;
            else if (input1_modified.charAt(i)=='s')
                sCount1++;
            else if (input1_modified.charAt(i)=='t')
                tCount1++;
            else if (input1_modified.charAt(i)=='u')
                uCount1++;
            else if (input1_modified.charAt(i)=='v')
                vCount1++;
            else if (input1_modified.charAt(i)=='w')
                wCount1++;
            else if (input1_modified.charAt(i)=='x')
                xCount1++;
            else if (input1_modified.charAt(i)=='y')
                yCount1++;
            else if (input1_modified.charAt(i)=='z')
                zCount1++;
        }

        int aCount2 = 0;
        int bCount2 = 0;
        int cCount2 = 0;
        int dCount2 = 0;
        int eCount2 = 0;
        int fCount2 = 0;
        int gCount2 = 0;
        int hCount2 = 0;
        int iCount2 = 0;
        int jCount2 = 0;
        int kCount2 = 0;
        int lCount2 = 0;
        int mCount2 = 0;
        int nCount2 = 0;
        int oCount2 = 0;
        int pCount2 = 0;
        int qCount2 = 0;
        int rCount2 = 0;
        int sCount2 = 0;
        int tCount2 = 0;
        int uCount2 = 0;
        int vCount2 = 0;
        int wCount2 = 0;
        int xCount2 = 0;
        int yCount2 = 0;
        int zCount2 = 0;

        for (int i=0; i<length2; i++) {
            if (input2_modified.charAt(i)=='a')
                aCount2++;
            else if (input2_modified.charAt(i)=='b')
                bCount2++;
            else if (input2_modified.charAt(i)=='c')
                cCount2++;
            else if (input2_modified.charAt(i)=='d')
                dCount2++;
            else if (input2_modified.charAt(i)=='e')
                eCount2++;
            else if (input2_modified.charAt(i)=='f')
                fCount2++;
            else if (input2_modified.charAt(i)=='g')
                gCount2++;
            else if (input2_modified.charAt(i)=='h')
                hCount2++;
            else if (input2_modified.charAt(i)=='i')
                iCount2++;
            else if (input2_modified.charAt(i)=='j')
                jCount2++;
            else if (input2_modified.charAt(i)=='k')
                kCount2++;
            else if (input2_modified.charAt(i)=='l')
                lCount2++;
            else if (input2_modified.charAt(i)=='m')
                mCount2++;
            else if (input2_modified.charAt(i)=='n')
                nCount2++;
            else if (input2_modified.charAt(i)=='o')
                oCount2++;
            else if (input2_modified.charAt(i)=='p')
                pCount2++;
            else if (input2_modified.charAt(i)=='q')
                qCount2++;
            else if (input2_modified.charAt(i)=='r')
                rCount2++;
            else if (input2_modified.charAt(i)=='s')
                sCount2++;
            else if (input2_modified.charAt(i)=='t')
                tCount2++;
            else if (input2_modified.charAt(i)=='u')
                uCount2++;
            else if (input2_modified.charAt(i)=='v')
                vCount2++;
            else if (input2_modified.charAt(i)=='w')
                wCount2++;
            else if (input2_modified.charAt(i)=='x')
                xCount2++;
            else if (input2_modified.charAt(i)=='y')
                yCount2++;
            else if (input2_modified.charAt(i)=='z')
                zCount2++;
        }

        if (aCount1!=aCount2 ||
        bCount1!=bCount2 ||
        dCount1!=dCount2 ||
        cCount1!=cCount2 ||
        eCount1!=eCount2 ||
        fCount1!=fCount2 ||
        gCount1!=gCount2 ||
        hCount1!=hCount2 ||
        iCount1!=iCount2 ||
        jCount1!=jCount2 ||
        kCount1!=kCount2 ||
        lCount1!=lCount2 ||
        mCount1!=mCount2 ||
        nCount1!=nCount2 ||
        oCount1!=oCount2 ||
        pCount1!=pCount2 ||
        qCount1!=qCount2 ||
        rCount1!=rCount2 ||
        sCount1!=sCount2 ||
        tCount1!=tCount2 ||
        uCount1!=uCount2 ||
        vCount1!=vCount2 ||
        wCount1!=wCount2 ||
        xCount1!=xCount2 ||
        yCount1!=yCount2 ||
        zCount1!=zCount2) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String input1 = s.nextLine();
        System.out.print("Enter the second string: ");
        String input2 = s.nextLine();

        if (Anagram(input1, input2)) {
            System.out.print(input1+" and "+input2+" are anagrams");
        }
        else {
            System.out.print(input1+" and "+input2+" are NOT anagrams");
        }
    }
}
