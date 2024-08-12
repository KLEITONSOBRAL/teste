package com.mycompany.atividade_simulacao_transito;

public class ATIVIDADE_SIMULACAO_TRANSITO {

    public static void main(String[] args) {
        
        int tempoTotal = 600; 
        int cicloSemaforo = 80; 
        int filaCarros = 0; 
        int carrosPassaram = 0; 
        int carrosCongestionados = 0; 
        
        for (int tempoAtual = 1; tempoAtual <= tempoTotal; tempoAtual++) {
            int estadoSemaforo = tempoAtual % cicloSemaforo;
            
            if (estadoSemaforo < 30) {
                System.out.println("Semaforo Verde");
                if (filaCarros > 0) {
                    filaCarros--;
                    carrosPassaram++;
                    System.out.println("Um carro passou");
                }
            } else if (estadoSemaforo < 35) {
                System.out.println("Semaforo Amarelo");
            } else {
                System.out.println("Semaforo Vermelho");
            }
            
            if (tempoAtual % 15 == 0) {
                if (filaCarros < 10) {
                    filaCarros++;
                } else {
                    carrosCongestionados++;
                }
            }
        }
        
        System.out.println("Total de carros que passaram: " + carrosPassaram);
        System.out.println("Carros que ficaram congestionados: " + carrosCongestionados);
    }
}
