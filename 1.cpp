#include<stdio.h>
int main()
{
int a[50], size, i, j = 0, big, sec_big;
scanf("%d", &size);
for(i=0; i<size; i++)
scanf("%d", &a[i]);
big=a[0];
for(i=1;i<size;i++)
{
if(big<a[i])
{
big=a[i];
j = i;
}
}
sec_big =a[size-j-1];
for(i=1;i<size;i++)
{
if(sec_big <a[i] && j != i)
sec_big =a[i];
}
printf("%d", sec_big);
return 0;
}