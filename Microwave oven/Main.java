#include<iostream>
using namespace std;
int main()
{
  int i;
  float t;
  cin>>i>>t;
  switch(i)
  {
    case 1:
      cout<<t;
      break;
    case 2:
      cout<<t+(t/2.0);
        break;
    case 3:
      cout<<2*t;
      break;
    default:cout<<"Number of items is more";
      break;
      
        
  
  }
  //Type your code here.
}