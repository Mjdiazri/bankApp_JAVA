import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Variables
        String name = "Angely";
        String tipoCuenta = "Corriente";
        double saldo = 1599.99;
        String mensajeBienvenida = "Bienvenid@ a AppBank " + name;
        int transaccion = 0;
        String mensaje = """               
                **********************************************************
                 Por favor Escriba el número de la transaccion que desea realizar:
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                4 - Salir
                """;

        System.out.println(mensajeBienvenida);


        //Programa
        do {
            System.out.println(mensaje);
            Scanner requerimiento = new Scanner(System.in);
            transaccion = requerimiento.nextInt();

            switch (transaccion){
                case 1:
                    System.out.printf("EL saldo de tu cuenta %s es de %.2f", tipoCuenta, saldo);
                    break;

                case 2:
                    System.out.println("Por favor ingresa la cantidad de dinero a retirar");
                    Scanner retiro = new Scanner(System.in);
                    double cantidadRetiro = retiro.nextDouble();

                    if(cantidadRetiro > saldo){
                        System.out.println("saldo insuficiente");
                    } else if (cantidadRetiro <= saldo) {
                        saldo -= cantidadRetiro;
                        System.out.printf("El nuevo saldo de tu cuenta %s es %.3f", tipoCuenta, saldo);
                    }
                    break;

                case 3:
                    System.out.println("Por favor ingresa la cantidad de dinero a depositar");
                    Scanner ingreso = new Scanner(System.in);
                    double cantidadDeposito = ingreso.nextDouble();

                    saldo += cantidadDeposito;
                    System.out.printf("El nuevo saldo de tu cuenta de %s es de  %.3f", tipoCuenta, saldo);
                    break;

                case 4:
                    System.out.println("Gracias por utilizar nuestros servicios. Esperamos verte pronto");
                    break;

                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        }
        while(transaccion != 4);

    }
}

