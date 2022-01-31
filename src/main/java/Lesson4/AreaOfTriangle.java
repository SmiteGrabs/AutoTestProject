package Lesson4;

import java.text.DecimalFormat;

public class AreaOfTriangle
{
    public static String AreaCalculate(int[] a) throws IllegalArgumentException {
        if(a.length!=3)
        {
            throw new IllegalArgumentException();
        }
        float p = (a[0]+a[1]+a[2])/2;
        DecimalFormat dF = new DecimalFormat( "#.##");

        String formattedDouble = dF.format(Math.sqrt(p * (p - a[0]) * (p - a[1]) * (p - a[2])));
        return formattedDouble;
    }

    public static void main(String[] args) {
        int []a=new int[]{1,2,3};
        try {
            System.out.println(AreaCalculate(a));
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        System.out.println(a[0]);
    }
}
