package calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Digite a operação (+, -, *, /, % ou raiz): ");
        
        char operator = scanner.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Erro: divisão por zero!");
                    return;
                }
                result = num1 / num2;
                break;

             case '%':
                result = calcularPorcentagem(num1, num2);
                break;

            case: 'raiz': 
                result = calculaRaizQuadrada(num1);
                break;
                
            default:
                System.out.println("Operação inválida!");
                return;
        }

        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);

     public static double calcularPorcentagem(double num, float porcentagem) {
        return num * (porcentagem / 100);
        }

    public static double calculaRaizQuadrada(double num) {
        return Math.sqrt(num);
    }
    
    }
    
}
