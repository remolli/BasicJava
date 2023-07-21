import java.util.Scanner;

public class MetodosEx {
    public static void AnosParaDias() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira os anos: ");
        int anos = sc.nextInt();
        System.out.print("Insira os meses: ");
        int meses = sc.nextInt();
        System.out.print("Insira os dias: ");
        int dias = sc.nextInt();

        int totalDias = ( anos * 365 ) + (meses * 30) + dias;

        System.out.printf("O total em dias é: %d", totalDias);
    }
}