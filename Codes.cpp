#include<stdio.h>
int main()
{
  int option = 4;
 // Problem 1:
    printf("Choose your option: ");
  scanf("%d",&option);

  
 int a, b, c;
 printf("Enter the value of a, b: ");
 scanf("%d %d", &a, &b);

  switch (option)
  {
  case 1:
    c = a + b;
    printf("The addition is %d", c);
    break;
  case 2:
    c = a - b;
    printf("The substraction is %d", c);
    break;
    case 3:
    c = a * b;
    printf("The multiplication  is %d", c);
    break;
    case 4:
    c = a / b;
    printf("The division is %d", c);
    break;
  default:
    break;
  }
  

  return 0;
}