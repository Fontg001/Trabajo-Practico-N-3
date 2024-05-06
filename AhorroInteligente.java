import java.util.Scanner;

public class AhorroInteligente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Obtener el consumo anual original (sin casa inteligente)
        System.out.print("Ingresa el consumo anual original en kilovatios-hora (kWh): ");
        double consumoOriginal = scanner.nextDouble();

        // Supongamos un ahorro promedio del 15%
        double ahorroPromedio = 0.15;
 El a
        // Calcular el ahorro anual utilizando sqrt()
        double ahorroAnual = Math.sqrt(consumoOriginal * ahorroPromedio);

        System.out.println("El ahorro anual estimado es de " + ahorroAnual + " kWh.");

        // Determinar el máximo y mínimo consumo de energía entre electrodomésticos
        double heladera = 200;
        double televisor = 180;
        double aireAcondicionado = 1350;

        double maxConsumo = Math.max(Math.max(heladera, televisor), aireAcondicionado);
        double minConsumo = Math.min(Math.min(heladera, televisor), aireAcondicionado);

        System.out.println("Maximo consumo de energia: " + maxConsumo + " W");
        System.out.println("Minimo consumo de energia: " + minConsumo + " W");

        scanner.close();
    }
}