package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// Задача 1
      int start = 1;
      while (start <=10) {
          System.out.print(start + " ");
          start ++;
      }
      System.out.print("\n");
      for (int i = 10; i >=1; i--) {
          System.out.print(i + " ");
      }
        System.out.print("\n");

     // Задача 2

     for (int friday = 4; friday <=31; friday = friday + 7) {
         System.out.println("Сегодня пятница " + friday + "-е число. Необходимо подготовить отчет");
     }

     // Задача 3
     for (int year = 0; year <= 2122; year = year + 79) {
         if (year >= 1822)
         System.out.println("В " + year + " году");
     }


    }
}