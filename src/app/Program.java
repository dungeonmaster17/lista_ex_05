package app;

import entidades.INSS;
import entidades.Pessoa;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("xxxxx");
        String nome = sc.next();
        int idade = sc.nextInt();
        int tempoTrab = sc.nextInt();
        Pessoa p = new Pessoa(nome, idade, tempoTrab);
        INSS inss = new INSS(p);
        System.out.println(inss.estaQualificado(p));

    }
}
