#include<iostream>
using namespace std;
int main()
{
  int amt,d,s;
  float ans1,ans2,ans3;
  cin>>amt>>d>>s;
  ans1=-amt*(d/100.0) +s+amt;
  cout<<"In Flipkart Rs."<<ans1;
  cin>>amt>>d>>s;
  ans2=amt-amt*(d/100.0) +s;
  cout<<"\nIn Snapdeal Rs."<<ans2;
  cin>>amt>>d>>s;
  ans3=-amt*(d/100.0) +s+amt;
  cout<<"\nIn Amazon Rs."<<ans3;
  if (ans1<=ans2 and ans1<=ans3)
    cout<<"\nHe will prefer Flipkart";
  else if (ans2<=ans1 and ans2<=ans3)
    cout<<"\nHe will prefer Snapdeal";
  else if (ans3<=ans2 and ans3<=ans1)
    cout<<"\nHe will prefer Amazon"; 
  //Type your code here.
}