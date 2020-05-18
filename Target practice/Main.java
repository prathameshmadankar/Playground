#include<iostream>
using namespace std;
int main()
{
  int t,n,i=0,ans=0;
  cin>>t;
  while (true)
  {
    i++;
  cin>>n;
    ans+=n;
    if (ans>=t)
      break;
  }
  cout<<"The number of turns is "<<i;
  
  //Type your code here.
}