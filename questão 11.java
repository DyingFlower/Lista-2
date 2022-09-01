package Lista2;
import java.util.Scanner;
public class questão11 {
/* 11)Faça um programa que possa gerar uma segûencia como a seguinte.
0 - 0
0 - 1
0 - 0
0 - 1
0 - 2
1 - 0
1 - 1
1 - 0
1 - 1
1 - 2
2 - 0
2 - 1
2 - 0
2 - 1
2 - 2
3 - 0
3 - 1
3 - 0
3 - 1
3 - 2 */
	public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);
	System.out.println("Escreva  um valor inicial para os números a esquerda:");
	int E=leitor.nextInt();
	System.out.println("Escreva  um valor inicial para os números a direita:");
	int D=leitor.nextInt();
	int i;
	int j;
	for(i=1;i<=4;i++) { // usei o que tinha entendido na questão 10 e consegui fazer essa bem mais rápido.
		for(j=1;j<=5;j++) {
			if(j==5) {
				System.out.println(E + " - " + (D+2));
			}
			else if(j%2==0) {
				System.out.println(E + " - " + (D+1));
			}
			else {
				System.out.println(E + " - " + D);
			}
		}
		E=E+1;
		j=1;
	}
	leitor.close();
	}

}
