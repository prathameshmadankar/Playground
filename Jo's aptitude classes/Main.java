x=int(input())
y=int(input())
z=int(input())
ans=int(input())
x1=min([x,y,z])
if ans>x1:
    print("Answer is wrong.")
else:
    x1=ans
    if (x%x1==0 and y%x1==0 and z%x1==0):
        print("Answer is correct.")
    else:
        print("Answer is wrong.")

      
        