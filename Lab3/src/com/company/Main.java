package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Entrez le premier nombre du calcul : ");
        String nbr1 = sc1.nextLine();

        int nbr_1 = Integer.parseInt(nbr1);

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Entrez le second nombre du calcul : ");
        String nbr2 = sc2.nextLine();

        int nbr_2 = Integer.parseInt(nbr2);

        Functions fonction = new Functions();

        System.out.println("Le total de l'addition est " + fonction.add(nbr_1,nbr_2));
        System.out.println("Le total de la soustraction est " + fonction.sub(nbr_1,nbr_2));
    }
}
