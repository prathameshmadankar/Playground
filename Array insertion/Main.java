#include<iostream>
using namespace std;

int main()
{
    int n;
  cout<<"Enter the number of elements in the array";
    cin >> n;
    int arr[n];
    int i;
  cout<<"\nEnter the elements in the array";
    for(i = 0; i < n; i++)
    {
        cin >> arr[i];
    }
    int pos;
  cout<<"\nEnter the location where you wish to insert an element";
    cin >> pos;
    int ele;
  
    if(pos > n)
        cout << "\nInvalid Input";
 
    else
    { cout<<"\nEnter the value to insert";
    cin >> ele;
        for (i=n-1;i>=pos-1;i--)//i = n – 1; i >= pos – 1; i--)
        { arr[i+1] = arr[i];}

        arr[pos-1] = ele;

        cout << "\nArray after insertion is\n";

        for (i = 0; i <= n; i++)
            cout << arr[i] << "\n";
    }
    return 0;
}