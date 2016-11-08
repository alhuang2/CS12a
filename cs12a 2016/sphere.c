/*
	sphere.c
	Alston Huang
	1471706
	lab7
	calculates surface area and volume given a radius.
*/
	
#include<stdio.h>
#include<stdlib.h>
#include<math.h>

int main() {
	const double pi = 3.141592654;
	double volume, surfaceA, radius;

	printf("Enter the radius of the sphere: ");
	scanf("%lf", &radius);
	volume = (4 * pi * pow(radius, 3))/3;
	surfaceA = 4 * pi * pow(radius, 2);
	printf("The volume is %f and the surface area is %f\n", volume, surfaceA);

	return 0;
}