#include <iostream>
using namespace std;
struct student
{
    char name[50];
    int roll;
    float marks;
};
int main() 
{
  struct student s;
  string s1;
  cin.getline(s.name,100);

  cin>>s.roll>>s.marks;
  cout<<"\nStudent Details\n";
  cout<<"Name: "<<s.name<<"\n";
  cout<<"Roll: "<<s.roll<<"\n";
  cout<<"Marks: "<<s.marks<<"\n";
 
   //Your code goes here
}
/*Student Details
Name: Akalya Devi
Roll: 40
Marks: 88
  
Student Details
Name: Akalya Devi
Roll: 40
Marks: 88*/