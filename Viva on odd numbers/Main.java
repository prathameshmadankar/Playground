#include<iostream>
using namespace std;
int main()
{
  int n,i=0;float ans=0.0;

  while (i<3)
  { 
    cin>>n;  
   if(n<0)
   {ans-=1;
     break;}
   if (n%2!=0)
   {ans+=1;
   i++;
   }
   else
     ans-=.5;
  }
  cout<<ans;

  //Type your code here.
}