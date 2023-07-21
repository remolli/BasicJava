import java.util.Scanner;

public class MetodosEx {
    public static void AnosParaDias()
    {
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
    public static void Media()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira x: ");
        int x = sc.nextInt();
        System.out.print("Insira y: ");
        int y = sc.nextInt();
        System.out.print("Insira z: ");
        int z = sc.nextInt();
        double mediaUm = (double) (x + y + z) / 3 ;

        System.out.print("Insira a: ");
        int a = sc.nextInt();
        System.out.print("Insira b: ");
        int b = sc.nextInt();
        System.out.print("Insira c: ");
        int c = sc.nextInt();
        double mediaDois = (double) (a + b + c) / 3 ;

        System.out.printf("MediaUm: %.2f%n", mediaUm);
        System.out.printf("MediaDois: %.2f%n", mediaDois);
        System.out.printf("Soma das médias: %.2f%n", mediaUm + mediaDois);
        System.out.printf("Média das médias: %.2f%n", (mediaUm + mediaDois) / 2 );
    }
}