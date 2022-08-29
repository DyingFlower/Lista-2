package Lista2;

public class questão8 {
/* 8) Imprima a saída:
0 - 100
1 - 99
2 - 98
...
49 - 51 */
	public static void main(String[] args) {
		int i;
		int j;
		for(i=0, j=100;i<=49 && j>=51;i++, j--) {
			System.out.print(i + " - " + j + "\n");
		}
	}

}
