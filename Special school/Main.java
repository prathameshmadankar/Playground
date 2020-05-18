#include<iostream>
#include <cstring>
#include<string.h>
using namespace std;
int main()
{int flag=0;
  string s1,s2;
  cin>>s1;
  cin>>s2;
  int length = s1.length();
  for(int i=0;i < length ;i++){
        if(s1[i] != s2[length-i-1]){
            flag = 1;
            break;
        }}
  if (flag==1)
    cout<<"It is wrong";
  else
    cout<<"It is correct";
  
  //Type your code here.
}