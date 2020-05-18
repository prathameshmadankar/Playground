#include <iostream>
using namespace std;
struct college
{
string name;
  string city;
  int y;
  float p;
  
}s[100];
int main()
{
int n;
  cout<<"Enter the number of colleges"<<endl;
  cin>>n;
  for(int i=0;i<n;i++)
  {cout<<"Enter the details of college "<<i+1<<endl;
   cout<<"Enter name"<<endl;
   cin>>s[i].name;
   cout<<"Enter city"<<endl;
   cin>>s[i].city;
   cout<<"Enter year of establishment"<<endl;
  cin>>s[i].y; 
 cout<<"Enter pass percentage"<<endl;
  cin>>s[i].p; }
  
  cout<<"Details of colleges"<<endl;
   for(int i=0;i<n;i++)
   {
   cout<<"College:"<<i+1<<endl;
     cout<<"Name:"<<s[i].name<<endl;
     cout<<"City:"<<s[i].city<<endl;
     cout<<"Year of establishment:"<<s[i].y<<endl;
     cout<<"Pass percentage:"<<s[i].p<<endl;
//cout<<"Year of establishment:"<<s[i].y<<endl;
   }
  
  
  
}