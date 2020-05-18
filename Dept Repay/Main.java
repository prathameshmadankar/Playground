#include<iostream>

using namespace std;

int main(){

int x,y,r;

double inter,amount,disc,fina;

cin>>x>>y>>r;

inter=(x*y*r)/100;

amount=x+inter;

disc=inter*2/100;

fina=x+inter-disc;

cout<<inter<<endl;

cout<<amount<<endl;

cout<<disc<<endl<<fina;}

