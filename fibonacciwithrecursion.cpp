#include<iostream>
using namespace std;
void printFibonacci(int n){
	static int n1=0,n2=1,n3;
	if(n>0){
		n3=n1 + n2;
		n1=n2;
		n2=n3;
		cout<<n3<<" ";
		printFibonacci (n-1);
	}
}
int main(){
	int n;
	cout<<" enter the no. of elements:";
	cin>>n;
	cout<<"fibonacci series: ";
	cout<<"0"<<"1";
	printFibonacci (n-2); // n-2 because 2 nos. are already printed
	return 0;
}
