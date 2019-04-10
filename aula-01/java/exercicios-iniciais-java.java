public class Exercicios {
	public static void main(String[] args) {
		System.out.println("Isso NÃO é um teste!");
		System.out.println("Propriedade 3025 do númeto 3025 :" + propriedade3025(3025));
		System.out.println("Propriedade 153 do númeto 153 :" + propriedade153(153));
		System.out.println("Dia da semana: " + diaDaSemana(26,4,2019));
		System.out.println("Resto 10/6: " + mod(10,6));
		System.out.println("Soma dos 13 primeiros números naturais: "+ somaNaturais(13));
		System.out.println("Fatorial de 6: "+ fatorial(6));
		System.out.println("Produto de 7 e 9: " + produto(7,9));
		System.out.println("Potencia 2 ^ 10: "+potencia(2,10));
	}
	
	//ex1
	public static boolean propriedade3025(int n){
		int i = n/100;
		int j = n%100;
		return Math.pow(i+j,2) == n;
	}
	
	//ex2
	public static boolean propriedade153(int n){
		int c = n/100;
		int du = n%100;
		int d = du/10;
		int u = du%10;
		
		return (Math.pow(c, 3) + Math.pow(d, 3) + Math.pow(u, 3))==n; 
	}
	
	//ex3
	public static int diaDaSemana(int d, int m, int a){
		if(m==1 || m==2){
			m+=12;
			a+=1;
		}
		int s = d + 2*m + (3*(m+1))/5 + a + a/4 - a/100 + a/400;
		return s%7;
	}
	
	//ex4
	public static int mod(int x, int y){
		int s=x;
		while(y<=s){
			s-=y;
		}
		
		return s;
	}
	
	//ex5
	public static int somaNaturais(int n){
		int i=2;
		int s=1;
		while(i<=n){
			s+=i;
			i++;
		}
		return s;
	}
	
	//ex6
	public static int fatorial(int n){
		int i=2;
		int f=1;
		while(i<=n){
			f*=i;
			i++;
		}
		return f;
	}
	
	//ex7 - Produto de inteiros usando somas
	public static int produto(int a, int b){
		int totalParcelas = a;
		int parcela=b;
		if(b<a){
			totalParcelas = b;
			parcela = a;
		}
		int i = 1;
		int s = 0;
		while(i<=totalParcelas){
			s+=parcela;
			i++;
		}
		return s;
	}
	
	//ex8 - Potência usando somas
	public static int potencia(int x, int y){
		int potencia=1;
		int i=1;
		while(i<=y){
			potencia = produto(potencia, x);
			i++;
		}
		return potencia;
	}

}
