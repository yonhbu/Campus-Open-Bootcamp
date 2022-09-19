import java.util.Scanner;

public class Prototype {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Desafio #1");
        System.out.println("Ingrese un numero");
        int numeroIf = sc.nextInt();

        if (numeroIf > 0 ) {
            System.out.println("Numero Ingresado es Positivo");
        }else if (numeroIf < 0) {
            System.out.println("Numero Ingresado es Negativo");
        }


        System.out.println("Desafio #2");
        int numeroWhile = 0;

        while (numeroWhile < 3) {
            numeroWhile = numeroWhile + 1;
            System.out.println(numeroWhile);

        }

        System.out.println("Desafio #3");
        int numeroDoWhile = 0;

        do {
            numeroDoWhile = numeroDoWhile + 1;
            System.out.println(numeroDoWhile);

        }while (numeroDoWhile < 1);


        System.out.println("Desafio #4");
        for (int numeroFor = 0; numeroFor <=3 ; numeroFor++) {
            System.out.println(numeroFor);
        }

        System.out.println("Desafio #5");
        String estacion = "Verano";
        switch (estacion) {
            case "Invierto":
                System.out.println("Su estacion actual es Invierno");
                break;
            case "Verano":
                System.out.println("Su estacion actual es Verano");
                break;
            case "Otoño":
                System.out.println("Su estacion actual es Otoño");
                break;
            case "Primavera":
                System.out.println("Su estacion actual es Primavera");
                break;
            default:
                System.out.println("Su pais no cuenta con estaciones");
        }


    }
}
