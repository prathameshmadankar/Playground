# include <iostream>
# include <string>
using namespace std;
int main()
{
    int a,b,i=1, u=1, sum=0,ctr=0;
cin>>a>>b;
  i=a;
   while(i<=b)
 {                                 
   while(u<=b)
   {                              
     if(u<i)
     {
      if(i%u==0 )
      sum=sum+u;
     }                         
     u++;
   }                           
   if(sum==i)
   {
       ctr++;
    cout<<i<<' ';
   }
   i++;
   u=1;  sum=0;
 } 
    // cout<<"Number of Perfect numbers between 1 to 1000 is: "<<ctr<<"\n";
}