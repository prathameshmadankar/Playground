#include <iostream>
using namespace std;
int main()
{
char str[100], rev[100];     
int i,count = 0, end;    
//Your code goes here  
  cin.getline(str,sizeof(str));
 i=0;
  while (str[i]!='\0')
 {
    i++;
  }
  i--;
  int j;
  for(i,j=0;i>=0;i--,j++)
    rev[j]=str[i];
std::cout<<rev;
}