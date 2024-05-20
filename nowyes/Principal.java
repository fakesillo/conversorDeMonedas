package nowyes;


import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.out;

public class Principal {
    public static void main(String[] args) throws RuntimeException {
        int opcion = 0;


        String menu =
                """
                        *************************************************
                        Bienvenido al conversor de moneda
                        *************************************************
                                                
                           USD - Dólar americano
                           CLP - Peso chileno
                           COP - Peso colombiano
                           ARS - Peso argentino
                                      
                        1) USD ===> CLP
                        2) CLP ===> USD
                        3) USD ===> COP
                        4) COP ===> USD
                        5) USD ===> ARS
                        6) ARS ===> USD
                        7) Salir
                                        
                        Elija una opción Válida:
                                
                        """;

        Scanner teclado = new Scanner(System.in);

        while (7 != opcion) {
            out.println(menu);
            try {
                opcion = teclado.nextInt();
            } catch (InputMismatchException e) {
                out.println("Ingrese un número");
                teclado.next();
                continue;
            }


            switch (opcion) {
                case 1:
                    out.println("¿Cuántos dólares desea convertir a peso chileno?");
                    Scanner keyboard = new Scanner(System.in);
                    AppiConexion conversor = new AppiConexion();
                    Cambio cambio = conversor.usdClp();
                    break;


                case 2:
                    out.println("¿Cuántos pesos chilenos desea convertir a dólares?");
                    Scanner keyboard1 = new Scanner(System.in);
                    AppiConexion conversor1 = new AppiConexion();
                    Cambio cambio1 = conversor1.clpUsd();
                    break;

                case 3:
                    out.println("¿Cuántos dólares desea convertir a pesos colombianos?");
                    Scanner keyboard2 = new Scanner(System.in);
                    AppiConexion conversor2 = new AppiConexion();
                    Cambio cambio2 = conversor2.usdCop();
                    break;

                case 4:
                    out.println("¿Cuántos pesos colombianos desea convertir a dólares?");
                    Scanner keyboard3 = new Scanner(System.in);
                    AppiConexion conversor3 = new AppiConexion();
                    Cambio cambio3 = conversor3.copUsd();
                    break;

                case 5:
                    out.println("¿Cuántos dólares desea convertir a pesos argentinos?");
                    Scanner keyboard4 = new Scanner(System.in);
                    AppiConexion conversor4 = new AppiConexion();
                    Cambio cambio4 = conversor4.usdArs();
                    break;

                case 6:
                    out.println("¿Cuántos pesos argentinos desea convertir a dólares?");
                    Scanner keyboard5 = new Scanner(System.in);
                    AppiConexion conversor5 = new AppiConexion();
                    Cambio cambio5 = conversor5.arsUsd();
                    break;
                case 7:
                    out.println("Gracias por usar este conversor de moneda, hasta luego");
                    break;
                default:
                    out.println("Elija una opción válida");

            }
        }
    }
}

