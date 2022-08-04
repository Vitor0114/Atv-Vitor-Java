import java.util.Scanner;
import javax.swing.JOptionPane;

public class ExercicioUm {

    public static void call(Scanner scanner) {
        System.out.println("=== EXERCÍCIOS - LISTA 1 ===");

        System.out.println("+-------------------------------------------------------+");
        System.out.println("| 1 - Calcule a Média                                   |");
        System.out.println("| 2 - Calcule a Área                                    |");
        System.out.println("| 3 - Calcule o Volume                                  |");
        System.out.println("| 4 - Valor é maior que o dobro de outro valor          |");
        System.out.println("| 5 - Cálculo de Bhaskara                               |");
        System.out.println("| 6 - Velocidade Média                                  |");
        System.out.println("| 7 - Percentual de Imposto                             |");
        System.out.println("| 8 - Valor é par ou ímpar                              |");
        System.out.println("| 9 - Comparar dois valores de String                   |");
        System.out.println("| 10 - Valor double em string e convertido para inteiro |");
        System.out.println("| 11 - Imposto de renda de um salário                   |");
        System.out.println("| 12 - DESAFIO                                          |");
        System.out.println("+-------------------------------------------------------+");

        int menu = 0;
        try {
            menu = scanner.nextInt();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            menu = 0;
        }

        switch (menu) {
            case 1:
                // 1) Crie um programa que calcule a média (`(nota1 + nota2 + nota3 / 3)`)

                double media;

                System.out.print("Digite a primeira nota: ");
                double nota1 = scanner.nextDouble();

                System.out.print("Digite a segunda nota: ");
                double nota2 = scanner.nextDouble();

                System.out.print("Digite a terceira nota: ");
                double nota3 = scanner.nextDouble();

                // media(double notaUm, double notaDois, double notaTres)

                media = media( nota1 , nota2 , nota3 );

                System.out.printf("Media das notas: %.2f", media);

                break;

                
            
            case 2:
            // 2) Crie um programa que calcule a área (`lado1 * lado2`)

                double area;

                System.out.print("Digite o Valor do primeiro lado: ");
                double lado1 = scanner.nextDouble();

                System.out.print("Digite o Valor do segundo lado: ");
                double lado2 = scanner.nextDouble();

                area = area (lado1 , lado2);

                System.out.printf("Area: %.2f", area);


                // area(double ladoUm, double ladoDois)

                break;

           
            case 3:
                // 3) Crie um programa que calcule o volume (`largura * altura * profundidade`)

                double volume;

                System.out.print("Digite a Largura: ");
                double largura = scanner.nextDouble();

                System.out.print("Digite a Altura: ");
                double altura = scanner.nextDouble();

                System.out.print("Digite a Profundidade: ");
                double profundidade = scanner.nextDouble();

                volume = volume (largura, altura, profundidade);

                System.out.printf("Volume 2.2f", volume);

                // volume(double largura, double altura, double profundidade)

                break;
           
            case 4:
                // 4) Crie um programa que avalie se um valor é maior do que o dobro de outro valor

                Boolean valorMaiorQueBoolean;

                System.out.println("Digite o primeiro Valor: ");
                double base = scanner.nextDouble();

                System.out.println("Digite o segundo Valor: ");
                double verificar = scanner.nextDouble();


                if(valorMaiorQueBoolean = valorMaiorQueDobro(base, verificar)){
                    System.out.printf("\n%.2f é maior que o dobro de %.2f!%n", base, verificar);
                    
                }else{
                    System.out.printf("\n%.2f é menor que o dobro de %.2f!%n", base, verificar);
                    
                }

                // valorMaiorQueDobro(double base, double verificar)

                break;
            
            case 5:
                // 5) Crie um programa que calcule _bhaskara_

                




                // bhaskara(int a, int b, int c);

                break;

            case 6:
                // 6) Crie um programa que calcule a velocidade média de uma viagem (`distancia (km) / tempo (h)`)

                double mediaViagem;

                System.out.print("Digite a distancia: ");
                double distancia = scanner.nextDouble();

                System.out.print("Digite o tempo: ");
                double tempo = scanner.nextDouble();

                mediaViagem = mediaViagem(distancia , tempo);

                System.out.printf("Media: %.2f", mediaViagem);



                // mediaViagem(double distancia, double tempo)

                break;

            case 7:
                // 7) Crie um programa que calcule o percentual de imposto pago (`faturamento \ qtd imposto`)
                
                double percentualImposto;

                System.out.print("Seu faturamento: ");
                double faturamento = scanner.nextDouble();

                System.out.print("Seu imposto: ");
                double qtdImposto = scanner.nextDouble();

                percentualImposto = percentualImposto(faturamento, qtdImposto);


                System.out.printf("Percentual de imposto pago: %.2f", percentualImposto);


                // percentualImposto(double faturamento, double qtdImposto)

                break;

            case 8:
                // 8) Crie um programa que teste se um valor é par ou ímpar

                Boolean parOuImpar;


                System.out.print("Digite um numero: ");
                int valor = scanner.nextInt();



                if(parOuImpar = parOuImpar(valor)){
                    System.out.printf("%d é Par",valor);
                }else{
                    System.out.printf("%d é Impar",valor);
                }



                // parOuImpar(int valor)

                break;
            
            case 9:
                // 9) Crie um programa que compare dois valores Strings

                Boolean compareString;

                System.out.println("Digite algo: ");
                String stringUm = scanner.nextLine();

                System.out.println("Digite algo: ");
                String stringDois = scanner.nextLine();

                if(compareString = compareString(stringUm, stringDois)){
                    System.out.printf("%s é igual ao %s", stringUm, stringDois);
                }else{
                    System.out.printf("%s não é igual ao %s", stringUm, stringDois);
                }



                // compareString(String stringUm, String stringDois)

                break;
            
            case 10:
                // 10) Crie um programa que tenha uma variável com ponto em String e converta seu valor para inteiro
                Boolean convertString;
                int numero;
                String valor1 = "14.23";

                System.out.printf("\nEssa variavel String tem o valor de %s", valor1);

                System.out.print("\nInforme algum numero para ser convertido em Int: ");
                valor1 = scanner.nextLine();

                numero = convertString(valor1);
                
                System.out.printf("\nSeu valor em String foi convertido para Int\nValor: %d", numero);



                // convertString(String valor);

                break;
         
            case 11:
                // 11) Crie um programa que receba o salário e diga o valor de imposto de renda conforme abaixo:
            // Base                     | Alíquota
            // ---------                | ------
            // Até 1.903,98             | Isento
            // De 1.903,99 até 2.826,65 | 7,5%
            // De 2.826,66 até 3.751,05 | 15%
            // De 3.751,06 até 4.664,68 | 22,5%
            // Acima de 4.664,68        | 27,5%







                // percentualImpostoSalario(double salario);
                break;
            
            case 12:
             // DESAFIO - Crie um programa que teste se um número é primo

                
                


                // testePrimo(int valor)
                break;
            default:
                System.out.println("Operação inválida");
                break;
        }
    }

    public static double media(double notaUm, double notaDois, double notaTres) {
        return ( notaUm + notaDois + notaTres ) / 3;
    }

    public static double area(double ladoUm, double ladoDois) {
        return (ladoUm * ladoDois);
    }

    public static double volume(double largura, double altura, double profundidade) {
        return (largura * altura * profundidade);
    }

    public static boolean valorMaiorQueDobro(double base, double verificar) {
        return (base > verificar * 2);
    }

    public static double[] bhaskara(int a, int b, int c) {
        return new double[2];
    }

    public static double mediaViagem(double distancia, double tempo) {
        return (distancia / tempo);
    }

    public static double percentualImposto(double faturamento, double qtdImposto) {
        return (faturamento / qtdImposto);
    }

    public static boolean parOuImpar(int valor) {
        return (valor%2==0);
    }

    public static boolean compareString(String stringUm, String stringDois) {
        return (stringUm.equals(stringDois));
    }

    public static int convertString(String valor) {
        return (Integer.parseInt(valor));
    }

    public static double percentualImpostoSalario(double salario) {
        return -1;
    }

    public static boolean testePrimo(int valor) {
        return false;
    }

}