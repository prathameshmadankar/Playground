#include<iostream>
using namespace std;
int main()
{
int n,n2,i=1;
  cin>>n;
  n2=(n*(n+1))+1;
  for (int z=0;z<n;z++)
  {
  for (int j=0;j<z;j++)
    cout<<"--";
    for(int j=0 ; j<n-z;j++)
      cout<<i++<<"*";
    n2-=(n-z);
    for(int j=0 ; j<n-z-1;j++)
    {
      cout<<n2++<<"*";
    }
    cout<<n2++;
    n2-=n-z;
  cout<<"\n";
  
  }
  
}