package com.ok.test1.pattern;

public class stars {

    public static void main(String[] args) {
        int n = 5;
        stars curs = new stars();
            curs.square(n);
//          curs.triangle(n);

    }
    void square(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(n);
            System.out.print('\n');
        }
    }
    void triangle(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
