package Dinero;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        List <Contribuinte> lista = new ArrayList<>();
        System.out.println("Insira o numero de contribuintes: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Dados do contribuinte n°" + i);
            System.out.println("Pessoa física ou juridica(f/j)?");
            char ch = sc.next().charAt(0);
            if (ch == 'f'){
                System.out.println("Nome: ");
                String nome = sc.next();
                System.out.println("Renda anual: ");
                double renda = sc.nextDouble();
                System.out.println("Despesas com saude: ");
                double gasto = sc.nextDouble();
                lista.add(new Individo(nome, renda, gasto));
            } else {
                System.out.println("Nome: ");
                String nome = sc.next();
                System.out.println("Renda anual: ");
                double renda = sc.nextDouble();
                System.out.println("Quantidade de funcionarios: ");
                int func = sc.nextInt();
                lista.add(new Empresa(nome, renda, func));
            }
        }

        System.out.println();
        System.out.println("Contribuintes:");
        for (Contribuinte contribuinte:lista) {
            System.out.printf("%.2f %n", contribuinte.imposto());
        }
        sc.close();

    }
}