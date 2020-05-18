#include<iostream>
using namespace std;
int main()
{
int i=1,x,n;
  cin>>n;
  x=n;
  while(i<=4)
  {
  for(int j=0;j<i;j++)
    cout<<n;
    cout<<"\n";
    i+=1;
    n+=1;
  }
  i=4;
  n--;
while(i>0)
  {
  for(int j=0;j<i;j++)
    cout<<n;
    cout<<"\n";
    i-=1;
    n-=1;
  }

}