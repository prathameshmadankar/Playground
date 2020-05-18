#include<iostream>
#include<string>
using namespace std;
int main() 
{ 	int i=0;
 string ans="";
	std::string f;
  cin>>f;
  for(i=0;i<f.length();i++)
  if(f[i]=='.')
    break;
   for(int j=i+1;j<f.length();j++)
     ans+=f[j];
     cout<<"Floating part is : "<<ans;
  	
	//Type your code here
}
