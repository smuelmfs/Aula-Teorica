public class Samuel {
    //Crie um algoritmo recursivo que, a partir de um número n, calcule a soma
   // dos elementos do conjunto formado pelos números de zero até n.

    public static void main(String[] args) {

        // Só mudar o valor de n se quiser ver valor diferente :)
        int n = 20;

        System.out.print("A formula para o calculo é: " +n+ "! = ");
        for(int i = 0; i <= n; i++) {
            if (i == n) {
                System.out.print(i);
            } else {
                System.out.print(i + " + ");
            }
        }

        int resultado = soma(n, 0, 0);
        System.out.println("\nRESULTADO: " + resultado);
    }
    private static int soma(int n, int numero, int valor) {
        valor = valor + numero;
        numero = numero + 1;

        if (numero <= n) {
            return soma(n, numero, valor);
        }
        else {
            return valor;
        }
    }
}