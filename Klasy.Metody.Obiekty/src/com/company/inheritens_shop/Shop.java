package com.company.inheritens_shop;


import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Podaj nazwe firmy");
        product.manufacturer = scanner.nextLine();
        System.out.println("Podaj rocznik jaki chcesz");
        product.productionYear = scanner.nextInt();
        System.out.println("Podaj maksymalna cene");
        product.price = scanner.nextFloat();




    }
}
