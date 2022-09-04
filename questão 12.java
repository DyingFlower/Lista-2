package Lista2;
import java.util.Scanner;
public class questão12 {
/* 12)Para cada item abaixo imprima as formas apresentadas. Permita que o
usuário escolha o número de linhas e colunas desejado, para os itens
abaixo foram utilizados com 6 linhas e 6 colunas. Porém,
independentemente do número de linhas e colunas, as formas devem
ser mantidas para cada item.

a)
  *
	* *
	* * *
	* * * *
	* * * * *
	* * * * * *          

b)
   # * * * * #
   * # * * # *
   * * # # * *
   * * # # * *
   * # * * # *
   # * * * * #
   
c)
   # # # # # #
   * * * * * *
   # # # # # #
   * * * * * *
   # # # # # #
   * * * * * *
 
d)
   # # # # # #
   # * * * * #
   # * * * * #
   # * * * * #
   # * * * * #
   # # # # # #
 	
e)
   * * * * * *
   * * * * * *
   * * * * * *
   # $ # $ # $
   # $ # $ # $
   # $ # $ # $
	                  */
	
	public static void main(String[] args) {
	char tipo;
	Scanner leitor = new Scanner(System.in);
	System.out.println("Escreva o tipo de forma que você deseja, digite a, b, c, d ou e");
	tipo = leitor.next().charAt(0);
	System.out.println("Tipo escolhido foi o:"+ tipo);
	System.out.println("Diga quantas linhas e colunas você deseja");
	int i; // só consegui fazer com o número de linhas = o de colunas
	i= leitor.nextInt();
	int j,g;
	String a = " * ";
	String b = " # ";
	String c = " $ ";
	String n = a;
	if(tipo == 'a') {
		for(j=0; j<i; j++) {
			System.out.print( n + "\n");
			n=n+a;
		}
	}
	else if(tipo == 'b') {
		int x;// essa só faz sentido se for par o numero de linhas e colunas.
		for(j=1, x=i; x>0 && j<=i; j++, x--){
	        for(g=1;g<=i;g++) {
	            if (j==g || g==x) {
	                System.out.print(b);
	            } else {
	                System.out.print(a);
	            }


	        }
	        System.out.println("\n");
	    }
	}
	else if(tipo == 'c') {
		for(j=1;j<=i;j++){
	        for(g=1;g<=i;g++) {
	            if (j%2==0){
	                System.out.print(a);
	            } 
	            else {
	                System.out.print(b);;
	            }
	        }
	        System.out.print("\n");
	    }
	}
	else if(tipo == 'd') {
		for(j=1;j<=i;j++){
	        for(g=1;g<=i;g++) {
	            if (j==1||j==i||g==1 || g==i){
	                System.out.print(b);
	            } 
	            else {
	                System.out.print(a);
	            }
	        }
	        System.out.print("\n");
	    }
		
	}
	else if(tipo == 'e') {
		for(j=1;j<=i;j++){ // só funciona se o valor dado for par, foi como consegui, e como faz sentido pela estética.
	        for(g=1;g<=i;g++) {
	            if (j<=(i/2)) {
	            	System.out.print(a);
	            } 
	            if (j>(i/2) && g %2 ==0) {
	            	System.out.print(c);
	            }
	            if (j>(i/2) && g %2 !=0){
	                System.out.print(b);
	            }
	        }
	        System.out.print("\n");
	    }
	}
	leitor.close();
	}
}
