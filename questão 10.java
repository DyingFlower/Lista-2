package Lista2;
import java.util.Scanner;
public class questão10 {
/* 10)Faça um programa que possa exibir uma sequência como a abaixo,
sendo o teto dos pares da esquerda e direita informados pelo usuário.
Exemplo: com pares da esquerda e direta com o teto de 2 unidades.
0 - 0
0 - 1
0 - 2
1 - 0
1 - 1
1 - 2
2 - 0
2 - 1
2 - 2
3 - 0
3 - 1
3 - 2 */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Escreva o valor do primeiro numero a esquerda:");
		int E = leitor.nextInt();
		System.out.println("Escreva o valor do primeiro numero a direita:");
		int D = leitor.nextInt();
		int p;
		int i;
		for(p=1;p<=4;p++) { // testando entendi que o numero do "p<=" representa quantos numeros diferentes terá no lado esquerdo.
			for(i=1;i<=3;i++) { // como  o direito repete tudo 3 vezes, para ter as 12 linhas do enunciado p precisa ir até 4, 4x3=12.
				System.out.println(E + " - " + D);
				D=D+1;
			}
			E=E+1;
			i=1;
			D=D-3;
		}
	leitor.close();	
	}

}
