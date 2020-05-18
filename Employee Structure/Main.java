#include<iostream>
using namespace std;
struct employee{
    char    name[30];
    int     e;
    float   salary;
  int age;
  char    d[100];
  int s;
};

int main()
{
  struct employee s;
  cout<<"Enter name:\n";
  cin>>s.name;
  cout<<"Enter ID:\n";
  cin>>s.e;
  cout<<"Enter age:\n";
  cin>>s.age;
  cout<<"Enter designation:\n";
  cin>>s.d;
  cout<<"Enter Salary:\n";
  cin>>s.s;
  
  cout<<"Employee Details\n";
  cout<<"Name of the Employee : "<<s.name<<"\n";
  cout<<"ID of the Employee : "<<s.e<<endl;
  cout<<"Age of the Employee : "<<s.age<<endl;
  cout<<"Designation of the Employee : "<<s.d<<endl;
  cout<<"Salary of the Employee : "<<s.s;
  
  
  //Type your code here.
}