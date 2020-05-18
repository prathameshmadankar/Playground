#include<iostream>
using namespace std;
int main()
{
  int s=1,a,n;
  cout<<"Enter the value of a\n";
  cin>>a;
  cout<<"Enter the value of n\n";
  cin>>n;
    for(int i=0;i<n;i++)
      s*=a;
  cout<<"The value of "<<a<<" power "<<n<<" is "<<s;
}