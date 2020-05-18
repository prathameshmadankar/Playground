#include<iostream>
#include<string>
using namespace std;
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
  int n1=n,i=1,ans=0,d=3;
  if (n/1000>=1)
    d=4;
 while(n>0)
 {
 i=n%10;
   ans+=power(i,d);
   //std::cout<<ans<<"\n";
   n=n/10;
 }
  if (ans==n1)
    return 1;
  return 0;
  
    //Your code goes here
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}