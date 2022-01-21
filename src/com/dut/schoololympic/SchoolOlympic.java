package com.dut.schoololympic;

import data.*;
import java.util.Random;

public class SchoolOlympic {

    public static void main(String[] args) {
        int v = 0, o = 0;
        Teacher Hoang = new Teacher("BACH KHOA", "SE2204", "NGUYEN VAN HOANG", 40, "MALE");
        Teacher Thu = new Teacher("BACH KHOA", "SE1255", "LE THI THU", 42, "FEMALE");
        Teacher Ba = new Teacher("SBTC", "SE8899", "PHAN TAN TRUNG", 33, "MALE");
        Student dia1 = new Student("GOOD", "SBTC", "SE8899", "DIA!", 20, "MALE");
        Student zeros = new Student("GOOD", "SBTC", "SE9897", "PHAM MINH LOC", 21, "MALE");
        RaceRegistration sena = new RaceRegistration() {
            @Override
            public double runForOnesLife() {
                return new Random().nextDouble() * 20 * 2;
            }

            @Override
            public void unbelievableAchievement() {
                System.out.println("SENA CHẠY NỢ ");
            }

            @Override
            public void result() {
                System.out.printf("NO NAME");
            }
        };
        RaceRegistration thiSinh[] = new RaceRegistration[]{
            Hoang, Thu, Ba, dia1, zeros, sena
        };
        System.out.println("BEFORE SORTING CHAMPION");
        double arr[] = new double[thiSinh.length];
        for (RaceRegistration x : thiSinh) {
            x.unbelievableAchievement();
            System.out.printf("%f km/h \n",arr[v] = x.runForOnesLife());
            v++;
        }
        
        
        
        
        System.out.println("\nOLYMPIC RESULT: \n\n\n");
        for (int i = 0; i < thiSinh.length - 1; i++) {
            for (int j = i; j < thiSinh.length; j++) {
                if (arr[i] < arr[j]) {
                    RaceRegistration a = thiSinh[i];
                    thiSinh[i] = thiSinh[j];
                    thiSinh[j] = a;
                    double temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        for (RaceRegistration x : thiSinh) {
            if(o == 0) System.out.println("CHAMPION  CHAMPION  CHAMPION  CHAMPION  CHAMPION  CHAMPION  CHAMPION");
            System.out.printf(" #%d ",(o + 1));
            x.unbelievableAchievement();
            System.out.println(arr[o] + " km/h");
            if(o == 0) System.out.println("CHAMPION  CHAMPION  CHAMPION  CHAMPION  CHAMPION  CHAMPION  CHAMPION\n\n\n");
            
            o++;
        }

    }
}
