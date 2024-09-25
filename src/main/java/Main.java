package main.java;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Cria um objeto da classe CorpoHumano
        CorpoHumano corpo = new CorpoHumano(70.0, 0.075);

        // Exibe os valores iniciais
        System.out.println("Massa: " + corpo.getMassa() + " kg");
        System.out.println("Volume: " + corpo.getVolume() + " m³");
        System.out.println("Densidade: " + corpo.getDensidade() + " kg/m³");

        // Atualiza os valores usando os setters
        corpo.setMassa(80.0);
        corpo.setVolume(0.08);

        // Exibe os novos valores
        System.out.println("\nNovos valores:");
        System.out.println("Massa: " + corpo.getMassa() + " kg");
        System.out.println("Volume: " + corpo.getVolume() + " m³");
        System.out.println("Densidade: " + corpo.getDensidade() + " kg/m³");
    }
}
