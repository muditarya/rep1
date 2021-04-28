#include<iostream>
using namespace std;
int main()
{
	int factorial(int);
	int fact,value;
	cout<<"enter a no.";
	cin>>value;
	fact=factorial(value);
	cout<<"factorial of a number is:"<<fact<<endl;
	return 0;
}
int factorial(int n)
{
	if(n<0)
	return(-1); /*wrong value*/
	if (n==0)
	return(1); /*terminating condition*/
	else{
		return(n*factorial(n-1));
	}
}
