#include <iostream>
using namespace std;
struct student
{
    char name[30];
  	char dept[20];
    int year;
    float cgpa;
} s[100];

int main()
{
  	int n;
    cout << "Enter the number of students " << endl;
  	cin>>n;
    for(int i = 0; i < n; ++i)
    {
        cout << "Enter the details of student " <<i+1<< endl;
       
        cout << "Enter name";
        cin >> s[i].name;
      
       cout <<"\nEnter department";
        cin >> s[i].dept;
      
        cout << "\nEnter year of study";
        cin >> s[i].year;
      
      cout <<"\nEnter cgpa";
      cin >> s[i].cgpa;
      

        cout << endl;
    }

    cout << "Details of students" << endl;
    for(int i = 0; i < n-1; ++i)
        for(int j = i+1; j < n; ++j)
        {string x1=s[i].name;
         string x2=s[j].name;
        if (x1>x2)
        {
          struct student x=s[i];
          s[i]=s[j];
          s[j]=x;
        }
        }

    for(int i = 0; i < n; ++i)
    {
        cout<<"Student "<<i+1<<endl;
        cout << "Name:" << s[i].name << endl;
        cout << "Department:" << s[i].dept << endl;
      	cout << "Year of study:" << s[i].year << endl;
      cout << "CGPA:" << s[i].cgpa << endl;
    }

    return 0;
}