import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Sensores {
	
    public int sensorTemperatura;
    public int sensorUmidade;
    public int sensorCarbonico;
    public int sensorManual;

  
    public void sensorManual() {
        try (Scanner input = new Scanner(System.in)) {
            Date date = new Date();
            int linha = 24;
            int coluna = 2;
            int[][] matrizTemperatura = new int[linha][coluna];

            System.out.println("INICIANDO COLETA DE DADOS MANUAL:");
            for (int l = 0; l < linha; l++) {
            	
                for (int c = 0; c < coluna; c++) {
                    System.out.print("Insira a temperatura: ");
                    
                    matrizTemperatura[l][c] = input.nextInt();
                    System.out.println(" ");
                }
            }
            
            for (int l = 0; l < linha; l++) {
                for (int c = 0; c < coluna; c++) {
                    for (int x = 0; x < linha; x++) {
                        for (int y = 0; y < coluna; y++) {
                            if (matrizTemperatura[l][c] < matrizTemperatura[x][y]) {
                                int aux = matrizTemperatura[l][c];
                                matrizTemperatura[l][c] = matrizTemperatura[x][y];
                                matrizTemperatura[x][y] = aux;
                            }
                        }
                    }
                }
            }

            for (int l = 0; l < linha; l++) {
                for (int c = 0; c < coluna; c++) {
                    date = new Date(date.getTime() + 30 * 60 * 1000);
                    System.out.println("Temperatura: " + matrizTemperatura[l][c] + "1C");
                    System.out.println("Data/Hora: " + date);
                }
            }
        }
    }
    public void sensorTemperatura() {
        int[] vetor; 
        Random r = new Random();
        Date date = new Date();
        int aux = 0; 
        vetor = new int[48];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = r.nextInt(70);
        }
      
        for (int i = 0; i <= vetor.length; i++) {
            for (int j = 0; j < vetor.length - 1; j++)
                if (vetor[j] >= vetor[j + 1]) {
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
            }
        }
     
        for (int j = 0; j < vetor.length; j++) {
            date = new Date(date.getTime() + 30 * 60 * 1000); 
            System.out.println("Temperatura: " + vetor[j]+ "C");
            System.out.println("Data/Hora: " + date);
            System.out.println("");
        }
    }
    public void sensorUmidade() {
        int[] vet;
        Date date = new Date();
        int aux = 0;
        vet = new int[48];
        for (int i = 0; i < vet.length; i++) {
            vet[i] = (int)(Math.random() * 53) + 17;
            
        }
        for (int i = 0; i <= vet.length; i++) {
            for (int j = 0; j < vet.length - 1; j++)
                if (vet[j] <= vet[j + 1]) {
                    aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
                }
        }
        for (int j = 0; j < vet.length; j++) {
            date = new Date(date.getTime() + 30 * 60 * 1000);
            System.out.println("Umidade: " + vet[j] * 0.25 + "%");
            System.out.println("Data/Hora: " + date);
            System.out.println(" ");
        }
    }

    public void sensorCarbonico() throws InterruptedException {
        int[] vetor;
        Date date = new Date();
        int aux = 0;
        vetor = new int[48];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int)(Math.random() * 30) +20;
        }
        for (int i = 0; i <= vetor.length; i++) {
            for (int j = 0; j < vetor.length - 1; j++)
                if (vetor[j] >= vetor[j + 1]) {
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
        }
        for (int j = 0; j < vetor.length; j++) {
            date = new Date(date.getTime() + 30 * 60 * 1000);
            System.out.println("GAS CARBONICO: " + vetor[j] + " CO2");
            System.out.println("Data/Hora: " + date);
            System.out.println(" ");
            Thread.sleep(5000);
        }
    }
    public void AtivadorTemperatura() throws InterruptedException {
        System.out.println("-------------------------");
        System.out.println("INICIANDO COLETA DE DADOS AUTOMATICA DA TEMPERATURA...");
        System.out.println("-------------------------");
        Thread.sleep(5000);

    }
    public void AtivadorUmidade() throws InterruptedException {
        System.out.println("-------------------------");
        System.out.println("INICIANDO COLETA DE DADOS AUTOMATICA DA UMIDADE...");
        System.out.println("-------------------------");
        Thread.sleep(5000);
    }
    public void AtivadorCarbonico() throws InterruptedException {
        System.out.println("-------------------------");
        System.out.println("INICIANDO COLETA DE DADOS AUTOMATICA DO GAS CARBONICO...");
        System.out.println("-------------------------");
        Thread.sleep(5000);
    }
}