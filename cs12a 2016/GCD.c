/*
GCD.c
Alston Huang
1471706
lab8
Calculates GCD of two numbers.
*/

#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<ctype.h>

int isInteger(char s[]){  //declaring functions before int main() to avoid implicit declaration
   int i, n;
   
   if( s==NULL ) 
      return 0;
   n = strlen(s);
   if( n==0 ) 
      return 0;
   if( s[0]=='-')
      return 0;
   if( !isdigit(s[0]))
   	return 0;
   for(i=1; i<n; i++){
      if( !isdigit(s[i]) ) 
         return 0;
   }
   return 1;
}

int main() {
	int a, n, j, b, temp;
	char str[200], str1[200];
	int x[2];


	while(1) {
		printf("Enter a positive integer: ");
		n = scanf(" %s", str);

		if( isInteger(str) ) {
			sscanf(str, "%d", &x[0]);
			break;
		}
	}

	while(1) {
		printf("Please enter another positive integer: ");
		j = scanf(" %s", str1);

		if( isInteger(str1) ) {
			sscanf(str1, "%d", &x[1]);
			break;
		}
	}

	a = x[0];
	b = x[1];

	if(a > b) {
		temp = a % b;
		if(temp == 0) {
			printf("The GCD of %d and %d is %d\n", a, b, b);
		}
		else{
			while(temp > 0) {
				temp = a % b;
				a = b;
				b = temp;
				if(temp == 0) {
					printf("The GCD of %d and %d is %d\n", x[0], x[1], a);
				}
			}
		}
	}

	if(b > a) {
		temp = b % a;
		if(temp == 0) {
			printf("The GCD of %d and %d is %d\n", a, b, a);
		}
		else{
			while(temp > 0) {
				temp = b % a;
				b = a;
				a = temp;
				if(temp == 0) {
					printf("The GCD of %d and %d is %d\n", x[0], x[1], b);
				}
			}
		}
	}

	if(a == b) {
		printf("The GCD of %d and %d is %d\n", a, b, a);
	}

	return 0;
}
