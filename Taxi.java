import java.util.Scanner;

public class Taxi {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingrese la distancia del viaje en kilómetros: ");
    double distancia = scanner.nextDouble();

    System.out.print("Ingrese el tiempo de espera en tráfico en minutos: ");
    int tiempoEspera = scanner.nextInt();

    int tarifaBase = 4000;
    int valorKilometro = 900;
    int valorMinuto = 150;

    double precioDistancia = distancia * valorKilometro;
    double precioTiempoEspera = tiempoEspera * valorMinuto;
    double precioTotal = tarifaBase + precioDistancia + precioTiempoEspera;

    System.out.printf("Precio del viaje: $%,.0f%n", precioTotal);
  }
}