#include<iostream>
using namespace std;
int main()
{
  int n,ans,i=0;
  cin>>n;
  while (n!=1)
  {
    cout<<n<<"\n";
  if (n%2==0)
    n=n/2;
    else
      n=3*n +1;
    i++;
  }
  cout<<n<<"\n";
  cout<<i;
  //Type your code here.
}