#include <stdio.h>
#include <stdlib.h>

int main()
{
    FILE *fp;
    char filename[100], ch; 
  
    printf("Enter the filename to open \n"); 
    scanf("%s", filename); 

    fp = fopen(filename, "r");

    if (fp == NULL)
    {
        printf("File error");
        exit(0);
    }

    ch = fgetc(fp);

    while (ch != EOF)
    {
        printf("%c", ch);
        ch = fgetc(fp);
    }
    fclose(fp);

    return 0;
}