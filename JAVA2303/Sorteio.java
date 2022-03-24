import java.util.Random;

public class Sorteio

{
public static void main(String[]args)
{
    Random gerador = new Random();
    int c = 1;
    int stora = 0;
    int menor = c;
    int maior = c;

    while (c <= 1000) {
        int n = 1 + gerador.nextInt(100);
        stora+=n;
        c++;
        System.out.println(n);
        
        if (maior < n)
        {
            maior = n;
        }
        if (menor > n)
        {
            menor = n;
        }

}



    System.out.println("A SOMA É DE: " + stora);
    System.out.println("MENOR NÚMERO: " + menor);
    System.out.println("MAIOR NÚMERO: " + maior);
 
    stora /= (float) 1000;
    System.out.println("E A MÉDIA É DE: " + stora);

    
    System.out.println("MENOR NÚMERO: " + menor);
    System.out.println("MAIOR NÚMERO: " + maior);

}
}

// precisa criar um objeto a partir da classe random 
// e jogando ela dentro da variável que você chamou de gerador.
// bound é o intervalo -1. Bound = 10 
// valor inicial mínimo é 0 e valor final é 9