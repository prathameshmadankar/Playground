#include<iostream>
using namespace std;
int main(){
  int n,c1=0,c2=0,x;
  cin>>n;
  for(int i=0;i<n;i++)
  {
  cin>>x;
    if(x%2==0)
      c1++;
    else
      c2++;
  }
  cout<<c2<<"\n"<<c1;
  // Type your code here
  return 0;
}