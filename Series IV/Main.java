#include<iostream>
using namespace std;
int main()
{
  int i=1,n,p=2,a=2,j=0;
  cin>>n;
  while(i<=n)
  {
  if(i==1)
    cout<<0<<" ";
    else if(i==2)
    cout<<2<<" ";
    else{
      
      if (j%2==0)
      {
      a+=4;
      }
      p+=a;
     cout<<p<<" ";
       j++;    
    }
    i++;
  }
  //Type your code here.
}