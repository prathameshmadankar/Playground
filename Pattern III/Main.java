#include<iostream>
using namespace std;
int main()
{
int i=1,n;
  cin>>n;
  while (i<=n)
  {
  for (int j=0;j<i-1;j++)
    cout<<i<<"*";
    cout<<i;
    cout<<"\n";
    i++;
  }
  i--;
  while(i>=1)
  {
  for (int j=0;j<i-1;j++)
    cout<<i<<"*";
    cout<<i;
    cout<<"\n";
    i--;
  }
  
}