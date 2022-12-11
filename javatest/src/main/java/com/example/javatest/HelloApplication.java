package com.example.javatest;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.*;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        Scanner in = new Scanner(System.in);
        out.print("введите пример: ");
        String primer = in.nextLine();
        primer = primer.replaceAll("\\s+", "");
        out.println(primer);
        String a = "";
        String b = "";
        int itog;

        int pluse = primer.indexOf("+");
        if (pluse >= 0) {
            int p = pluse;
            for (int i = 0; i < p; i++) {
                a.all = a.all + primer.charAt(0);
                primer = primer.substring(1);
            }
            primer = primer.substring(1);
            b.all = primer;
            pluse.speak();
            itog = A+B;
        }


        int minys = primer.indexOf("-");
        if (minys >= 0) {
            int p = minys;
            for (int i = 0; i < p; i++) {
                a.all = a.all + primer.charAt(0);
                primer = primer.substring(1);
            }
            primer = primer.substring(1);
            b.all = primer;
            pluse.speak();
            itog = A-B;


        }

        int ymnogenie = primer.indexOf("*");
        if (ymnogenie >= 0) {
            int p = ymnogenie;
            for (int i = 0; i < p; i++) {
                a.all = a.all + primer.charAt(0);
                primer = primer.substring(1);
            }
            primer = primer.substring(1);
            b.all = primer;
            pluse.speak();
            itog = A*B;
        }

        int delenie = primer.indexOf("/");
        if (delenie >= 0) {
            int p = delenie;
            for (int i = 0; i < p; i++) {
                a.all = a.all + primer.charAt(0);
                primer = primer.substring(1);
            }
            primer = primer.substring(1);
            b.all = primer;
            pluse.speak();
            itog = A/B;
        }

        int delenie2 = primer.indexOf(":");
        if (delenie2 >= 0) {
            int p = delenie2;
            for (int i = 0; i < p; i++) {
                a.all = a.all + primer.charAt(0);
                primer = primer.substring(1);
            }
            primer = primer.substring(1);
            b.all = primer;
            pluse.speak();
            itog = A/B;
        }

        class Person {
            String all;
        }

        void speak() {
            int co = 0;
            int ko = 0;
            int A,B;
            int n = 0;
            char[] mas = a.toCharArray();
            for (int i = 0; i <= a.length(); i++) {
                out.print(" " + mas[i]);
                {
                    if (Character.isDigit(mas[i])) {
                        A = Integer.parseInt(a);
                        co = co + 1;
                        if (A > 10) {
                            out.println("ошибка,число больше 10");
                        }
                    } else if (!Character.isDigit(mas[i])) {
                        ko = ko + 1;
                        if (a.length() <= 4) {
                            if (mas[i] == 'X') {
                                n = n + 10;
                            }
                            if (mas[i] == 'V') {
                                n = n + 5;
                            }
                            if (mas[i] == 'I') {
                                n = n + 1;
                            }
                            if (a.equals("IV")) {
                                n = 4;
                            }
                            if (a.equals("IX")) {
                                n = 9;
                            }
                        } else out.println("ошибка");
                    }
                }
            }
            char[] mas = b.toCharArray();
            for (int i = 0; i <= b.length(); i++) {
                out.print(" " + mas[i]);
                {
                    if (Character.isDigit(mas[i])) {
                        B = Integer.parseInt(a);
                        co = co + 1;
                        if (B > 10) {
                            out.println("ошибка,число больше 10");
                        }
                    } else if (!Character.isDigit(mas[i])) {
                        ko = ko + 1;
                        if (b.length() <= 4) {
                            if (mas[i] == 'X') {
                                n = n + 10;
                            }
                            if (mas[i] == 'V') {
                                n = n + 5;
                            }
                            if (mas[i] == 'I') {
                                n = n + 1;
                            }
                            if (b.equals("IV")) {
                                n = 4;
                            }
                            if (b.equals("IX")) {
                                n = 9;
                            }
                        } else out.println("ошибка");
                    }
                }
            }
            if (ko>=2){
                out.println("ошибка, несоответствие типов");
            }
            if (co>=2){
                out.println("ошибка, несоответствие типов");
            }
            return(A,B);
        }//я не смогла разобраться с классами и методами
    }
}
