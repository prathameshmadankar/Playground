#include<iostream>
using namespace std;


int find(int p, int *m){
	int i=0;
	int e=0,o=0;
	do{	
		if(m[i]%2==0)
			e=1;
		else{
			o=1;
		}
	i++;
	}while(i<p);
	if(e==1 && o==1)
		return 3;
	else if(o==1 && e==0)
		return 2;
	return 1;
}

int main()
{
  //Type your code here.
  int n,ans;
  int k[20];
  cout<<"Enter the number of elements in the array\n";
  cin>>n;
  cout<<"Enter the elements in the array\n";
  int i=0;
	do{
		cin>>k[i];
		i++;
	}while(i<n);
	ans= find(n,k);
	switch(ans){
		case 1: cout<<"The array is Even";
		break;
		case 2: cout<<"The array is Odd";
		break;
		case 3: cout<<"The array is Mixed";
	}
	return 0;
}