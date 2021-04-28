#include<iostream>
using namespace std;
int main()
{
	int i, fact=1, number;
	cout<<"enter any no.";
	cin>>number;
	for(i=1;number;i++){
		fact=fact*i;
	}
	cout<<"factorial of"<<number<<"is:"<<fact<<endl;
	return 0;
}
