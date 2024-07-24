package DesafioControleFluxo;
import java.util.Scanner;
/**
 *  @author Guilherme Chagas
 *  @version 1.0
 *  @since 24/07/2024
 */
public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Digite o primeiro parâmetro: ");
        int parametroUm  = scanner.nextInt();

        System.out.print("Digite o segundo parâmetro: ");
        int parametroDois  = scanner.nextInt();

        try{
            contar(parametroUm, parametroDois);

        }catch (java.util.InputMismatchException contador){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro!");
        }
    }
    /**
     * Esta função realiza uma subtração entre dois parâmetros e em seguida conta quantos números restaram.
     * Lança uma exceção InputMismatchException se o primeiro parâmetro não for menor que o segundo.
     *
     * @param parametroUm primeiro parâmetro deve ser menor que parametroDois
     * @param parametroDois segundo parâmetro deve ser maior que parametroUm
     * @throws java.util.InputMismatchException se parametroUm não for menor que parametroDois
     */
    static void contar(int parametroUm , int parametroDois) throws java.util.InputMismatchException {
     while (parametroUm > parametroDois){
         throw new java.util.InputMismatchException();
     }
        int contagem = parametroDois - parametroUm;
     for (int i = 1 ; i <= contagem ; i++) {
         System.out.println("Imprimindo o número " + i);
      }
    }
  }
