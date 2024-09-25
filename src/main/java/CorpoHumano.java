package main.java;

public class CorpoHumano {
    // Atributos privados
    private double massa;
    private double volume;
    private double densidade;

    // Construtor da classe
    public CorpoHumano(double massa, double volume) {
        this.massa = massa;
        this.volume = volume;
        this.densidade = calcularDensidade();
    }

    // Método para calcular a densidade (massa / volume)
    private double calcularDensidade() {
        if (volume != 0) {
            return massa / volume;
        } else {
            return 0; // Evita divisão por zero
        }
    }

    // Getters
    public double getMassa() {
        return massa;
    }

    public double getVolume() {
        return volume;
    }

    public double getDensidade() {
        return densidade;
    }

    // Setters
    public void setMassa(double massa) {
        this.massa = massa;
        this.densidade = calcularDensidade(); // Atualiza a densidade
    }

    public void setVolume(double volume) {
        this.volume = volume;
        this.densidade = calcularDensidade(); // Atualiza a densidade
    }
}

