package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PlayGame {


    public static void main(String[] args) {
        System.out.println("isminizi girin");
        Scanner scanName = new Scanner(System.in);
        String name = scanName.next();

        Player player = new Player();
        player.setName(name);
        System.out.println("*------------------------------*");
        System.out.println("*      Enter your Choice        ");
        System.out.println("*-------------------------------");

        System.out.println("1 START GAME");
        System.out.println("2 END GAME");
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {


            int option = scan.nextInt();

            if (option == 1) {
                System.out.println("başladı");


                System.out.println(player.getName() + " oyuna başladı. level:" + player.getMaxLevel());
                adamAsmaca(player);

            } else if (option == 2) {
                System.out.println("bitti");
                System.out.println(player.getName());

            } else {
                System.out.println("geçersiz");
            }

            System.out.println("1 START GAME");
            System.out.println("2 END GAME");


        }


    }


    public static int generateNumber(int level) {
        int randomNum = 0;
        Random rand = new Random();
        if (level == 1) {
            randomNum = rand.nextInt((999 - 100) + 1) + 100;
        } else if (level == 2) {
            randomNum = rand.nextInt((9999 - 1000) + 1) + 1000;
        } else if (level == 3) {
            randomNum = rand.nextInt((99999 - 10000) + 1) + 10000;
        } else {
            randomNum = 0;
        }

        return randomNum;

    }

    public static void adamAsmaca(Player player) {

        int randomNum = 0;
        int chances = 0;

        if (player.getMaxLevel() == 1) {

            chances = 8;
            System.out.println("First level");
            randomNum = generateNumber(1);
            String numbers = String.valueOf(randomNum);

            System.out.println(randomNum);
            System.out.println("***");
            Scanner sc = new Scanner(System.in);
            String[] ary = String.valueOf(randomNum).split("");
            String[] myGuess = {"*", "*", "*"};
            while (sc.hasNext()) {
                System.out.println("Tahmin et");

                String guess = sc.next();

                for (int i = 0; i < ary.length; i++) {

                    if (ary[i].equals(guess)) {
                        myGuess[i] = guess;

                    } else {
                        if (myGuess[i].equals("*")) {
                            myGuess[i] = "*";
                        }

                    }

                }

                System.out.println(String.join("", myGuess));

                if (!Arrays.toString(myGuess).contains("*")) {

                    System.out.println("tebrikler ");
                    player.setMaxLevel(player.getMaxLevel() + 1);
                    player.setPlayCount(player.getPlayCount() + 1);
                    player.setNumWin(player.getNumWin() + 1);
                    break;

                } else {

                    chances = chances - 1;
                    System.out.println("kalan hak: " + chances);
                    if (chances == 0) {

                        System.out.println("başarısız");
                        player.setPlayCount(player.getPlayCount() + 1);

                        break;
                    }

                }

                if (numbers.contains(String.valueOf(guess))) {
                    System.out.println("doğru tahmin");
                } else {
                    chances = chances - 1;
                    if (chances == 0) {
                        break;
                    }
                }


            }


        } else if (player.getMaxLevel() == 2) {

            chances = 10;
            System.out.println("Second level");
            randomNum = generateNumber(2);
            String numbers = String.valueOf(randomNum);

            System.out.println(randomNum);
            System.out.println("****");
            Scanner sc = new Scanner(System.in);
            String[] ary = String.valueOf(randomNum).split("");
            String[] myGuess = {"*", "*", "*", "*"};


            while (sc.hasNext()) {
                System.out.println("Tahmin et");

                String guess = sc.next();

                for (int i = 0; i < ary.length; i++) {

                    if (ary[i].equals(guess)) {
                        myGuess[i] = guess;

                    } else {
                        if (myGuess[i].equals("*")) {
                            myGuess[i] = "*";
                        }

                    }

                }
                System.out.println(String.join("", myGuess));

                if (!Arrays.toString(myGuess).contains("*")) {

                    System.out.println("tebrikler ");
                    player.setMaxLevel(player.getMaxLevel() + 1);
                    player.setPlayCount(player.getPlayCount() + 1);
                    player.setNumWin(player.getNumWin() + 1);
                    break;

                } else {

                    chances = chances - 1;
                    System.out.println("kalan hak: " + chances);
                    if (chances == 0) {

                        System.out.println("başarısız");

                        player.setPlayCount(player.getPlayCount() + 1);
                        break;
                    }

                }

                if (numbers.contains(String.valueOf(guess))) {
                    System.out.println("doğru tahmin");
                } else {
                    chances = chances - 1;
                    if (chances == 0) {
                        break;
                    }
                }
            }
        } else if (player.getMaxLevel() == 3) {

            chances = 12;
            System.out.println("Third level");
            randomNum = generateNumber(3);
            String numbers = String.valueOf(randomNum);

            System.out.println(randomNum);
            System.out.println("*****");
            Scanner sc = new Scanner(System.in);
            String[] ary = String.valueOf(randomNum).split("");
            String[] myGuess = {"*", "*", "*", "*", "*"};


            while (sc.hasNext()) {
                System.out.println("Tahmin et");

                String guess = sc.next();

                for (int i = 0; i < ary.length; i++) {

                    if (ary[i].equals(guess)) {
                        myGuess[i] = guess;

                    } else {
                        if (myGuess[i].equals("*")) {
                            myGuess[i] = "*";
                        }

                    }

                }
                System.out.println(String.join("", myGuess));

                if (!Arrays.toString(myGuess).contains("*")) {

                    System.out.println("tebrikler ");
                    player.setMaxLevel(player.getMaxLevel() + 1);
                    player.setPlayCount(player.getPlayCount() + 1);
                    player.setNumWin(player.getNumWin() + 1);
                    break;

                } else {

                    chances = chances - 1;
                    System.out.println("kalan hak: " + chances);
                    if (chances == 0) {

                        System.out.println("başarısız");
                        System.out.println("NAME: " + player.getName() + "  #OF WIN " + player.getNumWin() + "  MAX LEVEL " + player.getMaxLevel() + "  #OF COUNT " + player.getPlayCount());
                        player.setPlayCount(player.getPlayCount() + 1);
                        break;
                    }

                }

                if (numbers.contains(String.valueOf(guess))) {
                    System.out.println("doğru tahmin");
                } else {
                    chances = chances - 1;
                    if (chances == 0) {
                        break;
                    }
                }

            }
        } else {

            System.out.println("Game Over");


            System.out.println("NAME: " + player.getName() + "  #OF WIN " + player.getNumWin() + "  MAX LEVEL " + player.getMaxLevel() + "  #OF COUNT " + player.getPlayCount());


        }

    }
}


