#include<iostream>
using namespace std;
int main()
{
int n,sum=0,m;   
	cout<<"enter a number";
	cin>>n;
	while (n>0)
	{
		m=n%10;
		sum=sum+m;
		n=n/10;
	}
	cout<<"sum is"<<sum<<endl;
	return 0;

}
