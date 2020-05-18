#include<iostream>
using namespace std;
int main()
{
  int n,f1=0,f2=1,t;
  cin>>n;
  if (n==1)
    cout<<"The term "<<n<<" in the fibonacci series is "<<f1;
  else if (n==2)
    cout<<"The term "<<n<<" in the fibonacci series is "<<f2;
  else{
  for(int i=0;i<n-2;i++)
  {t=f2;
    f2=f1+f2;
    f1=t;}
    cout<<"The term "<<n<<" in the fibonacci series is "<<f2;
  }
  
  
  
  //Type your code here.
}