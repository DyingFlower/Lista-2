package Lista2;

public class questão9 {
/* 9) Imprima a saída:
0 - 33
2 - 36
4 - 39
...
26 - 72 */
	public static void main(String[] args) {
		int i;
		int j;
		for(i=0,j=33;i<=26 && j<=72;i+=2,j+=3) {
			System.out.print(i + " - " + j + "\n");
		}
	}

}
