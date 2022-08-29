package Lista2;

public class questão6 {
/* 6) Imprima a saída:
0 - 33
1 - 32
2 - 31
...
99 - -66 */
	public static void main(String[] args) {
		int h;
		int b;
		for(h=0, b=33;h<=99 && b>=-66;h++, b-=1) {
			System.out.print(h + " - " + b + " \n ");
		}
	}

}
