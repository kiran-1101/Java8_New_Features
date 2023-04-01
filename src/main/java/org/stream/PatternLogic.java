package org.stream;

public class PatternLogic {

    public static void main(String[] args) {
        for (int i = 1; i<=6; i++)
        {


            for (int j = 1; j<= i;j++)
            {
                if(i%2 != 0)
                {
                    System.out.print(i+""+(char)(i+64));
                }
                else {
                    System.out.print(i + "" + (char) (i + 64));
                }

            }
            System.out.println();
        }
    }
}
