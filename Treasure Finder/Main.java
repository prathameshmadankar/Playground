#include<iostream>
using namespace std;
int main()
{
  int b1,b2,b3;
  cin>>b1>>b2>>b3;
  if ((b1>b2 or b1>b3) and (b1<b2 or b1<b3))
    cout<<"The treasure is in box which has number "<<b1;
  else if ((b2>b1 or b2>b3) and (b2<b1 or b2<b3))
    cout<<"The treasure is in box which has number "<<b2;
  else if ((b3>b2 or b3>b1) and (b3<b2 or b3<b1))
    cout<<"The treasure is in box which has number "<<b3;
  int ans;
  if (b1<b2 and b1<b3)
    ans=b1;
    else if (b2<b1 and b2<b3)
      ans=b2;
  	else
        ans=b3;
  while (ans>0)
  {
   if (b1%ans==0 and b2%ans==0 and b3%ans==0) 
   {cout<<"\nThe code to open the box is "<<ans;
    break;
   }
    ans--;
    
     
  }
    
  //Type your code here.
}