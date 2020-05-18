
#include<iostream>
using namespace std;
int main()
{
int x;
  cin>>x;
 int i=1;
  
  while (i<x)
  {
    if (x%i==0 and i!=1)
    {
      cout<<"Not eligible";
      break;}
    i++;
    }
  if (i==x and x!=1)
    cout<<"Eligible";
  else if(x==1)
    cout<<"Not eligible";

}