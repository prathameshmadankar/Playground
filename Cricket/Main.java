#include<iostream>
using namespace std;
int main()
{
  int tb,tr,r,b;
  cin>>tb>>tr>>r>>b;
  float to=tb/6.0;
  
  cout<<to<<"\n";
  float of=float(b/6)+(b-(b/6)*6)/10.0;
  cout<<of<<"\n";
  
  
  
  float cr=(r/of);
  cr=cr*10;
  cr+=.5;
  cr=float(int(cr))/10.0;
  cout<<cr<<"\n";
  float trr=tr/to;
  trr=trr*10;
  trr+=.5;
    trr=float(int(trr))/10;
  
  cout<<trr;
  if (cr>=trr)
    cout<<"\nEligible to Win";
    else
      cout<<"\nNot Eligible to Win";
      
  
  //Type your code here.
}