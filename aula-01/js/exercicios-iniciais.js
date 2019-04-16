//Algoritmo 1 - Propriedade 3025
function propriedade3025(n){
	i=Math.round(n/100);
	j=n%100;
	return(((i+j)*(i+j)==n));
}

//Algoritmo 2 - Propriedade 153
function propriedade153(cdu){
	if((cdu<100) || (cdu>999)){
		return "Número Inválido!";
	}else{
		c = Math.floor(cdu/100);
		du = cdu%100;
		d = Math.floor(du/10);
		u = du%10;
		return (Math.pow(c,3)+Math.pow(d,3)+Math.pow(u,3))==cdu;
	}
}

//Algoritmo 3 - Dia da Semana
function diaDaSemana(d, m, a) {
	if((d<1) || (d>31)){
		return "Dia inválido!";
	} else if((m<1) || (m>12)){
		return "Mês inválido!";
	}else if(a<1753){
		return "Ano inválido";
	}
	if(m==1 || m==2){
		m+=12;
		a--;
	}
	s= d + 2*m + Math.floor(3 * (m+1)/5) + a + Math.floor(a/4) - Math.floor(a/100) + Math.floor(a/400);  
	switch(s%7){
		case 0: 
			console.log("Segunda-feira");
			break;
		case 1: 
			console.log("Terça-feira");
			break;
		case 2: 
			console.log("Quarta-feira");
			break;
		case 3: 
			console.log("Quinta-feira");
			break;
		case 4: 
			console.log("Sexta-feira");
			break;
		case 5: 
			console.log("Sábado");
			break;
		case 6: 
			console.log("Domingo");
			break;
	}
	return s % 7;
}
//Algoritmo 4 - Resto da Divisão Inteira

//Algoritmo 5 - Soma dos primeiros naturais

//Algoritmo 6 - Fatorial

//Algoritmo 7 - Produto de Inteiros Usando Somas

//Algoritmo 8 - Potência Usando Somas

//Algoritmo 9 -Valor de PI

//Algoritmo 10 - Logaritmo Natural

//Algoritmo 11 - Razão Áurea

//Algoritmo 12 - Quadrado Perfeito

//Algoritmo 13 - Raiz Quadrada

//Algoritmo 14 - Número Primo

//Algoritmo 15 - Crivo de Eratóstenes


//Algoritmo 16 - Maior Divisor Comum
function mdc(a,b){
	while(b!=0){
		m=a%b;
		a=b;
		b=m;
	}
	return a;
}

//Algoritmo 17 - Maior Divisor Comum
function mdc2(b,a){
	if(b>a || b<=0){
		return "Parâmetros inválidos! \nPermitido: b<=a e b>0.";
	}
	while (a!=b){
		if(a>b){
			a-=b;
		}else{
			b-=a;
		}
	}
	return a;
}

//algoritmo 18 - Regra de Horner para avaliação de polinômio
function horner(x, g, a){
	p = a[g];
	i=g-1;
	while(0<=i){
		p = p * x + a[i];
		i--;
	}
	return p;
}

//algoritmo 19 - Fibonacci
function fibonacci(n){
	a=0;
	c=1;
	if(n==0 || n==1){
		return n;
	}
	i=2;
	while(i<=n){
		t=c;
		c+=a;
		a=t;
		i++;
	}
	return c;
}

//algoritmo 20 - Cadastro de Pessoas Físicas (CPF)
function cpf(d){
	j = d[0] + 2*d[1] + 3*d[2] + 4*d[3] + 5*d[4] + 6*d[5] + 7*d[6]
	+ 8*d[7] + 9*d[8];
 	k = d[1] + 2*d[2] + 3*d[3] + 4*d[4] + 5*d[5] + 6*d[6] + 7*d[7]
	+ 8*d[8] + 9*d[9];	
	dj = (j%11)%10;
	dk = (k%11)%10;
	return (dj==d[9] && dk==d[10]);
}

//algoritmo 21 - Cadastro de Pessoas Físicas (CPF)
function cpf2(d){
	c=7;
	p=d[8];
	s=d[8];
	while(0<=c){
		p+=d[c];
		s+=p;
		c--;
	}
	j=(s%11)%10;
	k=((s - p + 9 * d[9])%11)%10;
	return (j==d[9]) && (k==d[10]);
}
