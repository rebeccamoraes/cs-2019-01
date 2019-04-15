//algoritmo 1
function propriedade3025(n){
	i=Math.round(n/100);
	j=n%100;
	return(((i+j)*(i+j)==n));
}

//algoritmo 19
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

//algoritmo 20
function cpf(d){
	j = d[0] + 2*d[1] + 3*d[2] + 4*d[3] + 5*d[4] + 6*d[5] + 7*d[6]
	+ 8*d[7] + 9*d[8];
 	k = d[1] + 2*d[2] + 3*d[3] + 4*d[4] + 5*d[5] + 6*d[6] + 7*d[7]
	+ 8*d[8] + 9*d[9];	
	dj = (j%11)%10;
	dk = (k%11)%10;
	return (dj==d[9] && dk==d[10]);
}
