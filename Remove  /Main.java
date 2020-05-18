#include<iostream>
using namespace std;
int main()
{
  string s,x="";
  int i=0;
 try{ while(true)
  {
  cin>>s;
    if (s=="the")
      continue;
    else if(s=="string")
    {x+=" " +s;
    break;}
      if (i==0)
      {
      x+=s;i++;
      }
   else
   {x+=" "+s;
   i++;
   }
   
  }}
  catch(exception& e)
  {
  return 0;
  }
  cout<<x;
}