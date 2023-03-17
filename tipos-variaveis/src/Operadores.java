public class Operadores {
    public static void main (String [] args) {
        /*String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println(nomeCompleto);

        String concatenacao = "?";

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);*/

        
        /* int numero = 5;
        numero = - numero;
        System.out.println(numero);

        numero = numero * -1;
        System.out.println(numero); */ 

        // Incremento e decremento:
        /* int numero = 5;
        //numero = numero + 1;
        numero++;
        System.out.println(numero ++);

        System.out.println(numero); */

        // Negando valores boleanos:
        /* boolean variavel = true;
        variavel = !variavel;

        System.out.println(variavel); */

        // Operadores terciários:
        /* int a, b;
        a = 6;
        b = 6;
        
        String resultado = a == b ? "verdadeiro" : "falso";

        System.out.println(resultado); */

        // Operadores relacionais:
        /* String nomeUm = "Sidney";
        String nomeDois = new String("Sidney");

        System.out.println(nomeUm.equals(nomeDois));

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if(numero1 < numero2){
            System.out.println("a nossa condição é verdadeira");
        }
        System.out.println("numeroUm é igual a numeroDois?" + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente de numeroDois?" + simNao);

        simNao = numero1 > numero2;

        System.out.println("numeroUm é maior que numeroDois?" + simNao);

        simNao = numero1 >= numero2;

        System.out.println("numeroUm é maior ou igual a numeroDois?" + simNao);

        simNao = numero1 < numero2;

        System.out.println("numeroUm é menor que numeroDois?" + simNao);

        simNao = numero1 <= numero2;

        System.out.println("numeroUm é menor ou igual a numeroDois?" + simNao); */

        // Operadores lógicos:
        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && (7 > 4)){
            System.out.println("as duas condições são verdadeiras");
        }

        if(condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeira");
        }
        System.out.println("fim");
    }
}
