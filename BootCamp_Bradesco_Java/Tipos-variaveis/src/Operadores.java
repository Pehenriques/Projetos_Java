public class Operadores {
    public static void main(String[] args) throws Exception {

        // Operadores Aritméticos
        int a = 10;
        int b = 2;
        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        int divisao = a / b;
        int modulo = a % b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Módulo: " + modulo);

        // Operadores de Comparação
        boolean maior = a > b;
        boolean menor = a < b;
        boolean igual = a == b;
        boolean diferente = a != b;
        boolean maiorIgual = a >= b;
        boolean menorIgual = a <= b;

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Igual: " + igual);
        System.out.println("Diferente: " + diferente);
        System.out.println("Maior ou Igual: " + maiorIgual);
        System.out.println("Menor ou Igual: " + menorIgual);

        // Operadores Lógicos
        boolean e = (a > b) && (a < b);
        boolean ou = (a > b) || (a < b);
        boolean negacao = !(a > b);

        System.out.println("E: " + e);
        System.out.println("Ou: " + ou);
        System.out.println("Negação: " + negacao);

        // Operadores de Atribuição
        int c = 10;
        c += 2; // c = c + 2
        c -= 2; // c = c - 2
        c *= 2; // c = c * 2
        c /= 2; // c = c / 2
        c %= 2; // c = c % 2

        System.out.println("Atribuição: " + c);

        // Operadores Unários
        int d = 10;
        d++; // d = d + 1
        d--; //d = d - 1

        System.out.println("Unário: " + d);

        // Operadores Ternários

        int x, y;
        x = 5;
        y = 6;

        String resultado = (x == y) ? "Verdadeiro" : "Falso";

        System.out.println(resultado);

    }
}
