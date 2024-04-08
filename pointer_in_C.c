#include <stdio.h>
int main()
{
    int number;
    int *p1; // pointer variable declaration

    number = 5;
    p1 = &number;

    printf("Value in number variable = %d \n", number);
    printf("Value in p1 variable = %d", p1);
    return 0;
}