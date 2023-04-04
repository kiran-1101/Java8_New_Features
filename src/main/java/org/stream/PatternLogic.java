package org.stream;

public class PatternLogic {

    public static void main(String[] args) {
        char[] arrLetters = {'a', 'b', 'c', 'd', 'e', 'f'};
        for (int i = 1; i <= 6; i++) {

            String str = "";
            for (int j = 1; j <= i; j++) {
                if(i%2==0){
                    if (j % 2 != 0) {
                        str = str + arrLetters[i-1];
                    } else {
                        str = str + i;
                    }
                } else {
                    if (j % 2 == 0) {
                        str = str + arrLetters[i-1];
                } else {
                        str = str + i;
                    }
                }

            }
            System.out.println(str);
        }
    }
}
