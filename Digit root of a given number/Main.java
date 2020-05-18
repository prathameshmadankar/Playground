#include<iostream>
#include<sstream>  
using namespace std;
int f(int n)
{int i=0;
if (to_string(n).length()==1)
  return n;
  else
  {
  while (n>0)
  {
  i+=n%10;
    n=n/10;
  }
  return f(i);
  }
    
}
int main()
{
int n;
  cin>>n;
  n=f(n);
  cout<<n;
}