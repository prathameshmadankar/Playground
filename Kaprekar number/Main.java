#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int n,n1,i=0,d,ans=0;
  cin>>n;
  n1=n;
  while (n>0)
  {
  i++;
    n=n/10;
  }
  d=i;
  n=n1*n1;
  while(i>0)
  {
  i--;
    ans=ans*10+(n%10);
    n=n/10;
  }
  n=ans;
  ans=0;
  while(n>0)
  {
    ans=ans*10+(n%10);
    n=n/10;
  }
  n=(n1*n1)/(pow(10,d));
  //cout<<n<<"  "<<ans;
  if (n1==(n+ans))
    cout<<"Kaprekar Number";
  else
    cout<<"Not a Kaprekar Number";
    
  //Type your code here.
}