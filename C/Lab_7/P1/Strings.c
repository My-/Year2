
#include <stdio.h>
#include <string.h>

void main(){
    char string1[15], string2[15];
    int n;
    printf("Enter String 1: ");
    scanf("%s", string1);

    printf("Enter String 2: ");
    scanf("%s", string2);

    printf("Enter Integer: ");
    scanf("%d", &n);

    // Display string length
    printf("String1 length: %d\n", strlen(string1));
    printf("String2 length: %d\n", strlen(string2));

    // Display bouth strings
    printf("String1: \"%s\"\n", string1);
    printf("String2: \"%s\"\n", string2);

    // Compare two strings and display bigger one .
    if( strcmp(string1, string2) > 0 ){ printf("Bigger one is: %s\n", string1); }
    else if( strcmp(string1, string2) < 0 ){ printf("Bigger one is: %s\n", string2); }
    else { printf("Strings are equal.\n"); }

    // Compare a number of chracters, specified in the input,
    // of bouth strings and display the bigger sub-string.
    if( strncmp(string1, string2, n ) > 0 ){ printf("Bigger one is: %s\n", string1); }
    else if( strncmp(string1, string2, n ) < 0 ){ printf("Bigger one is: %s\n", string2); }
    else { printf("Strings are equal.\n"); }

    // Concatenate string2 to string1
    printf("\nConcatenate\n");
    strcat(string1, string2);
    printf("\tstring1 is %s\n", string1);
    printf("\tstring2 is %s\n", string2);

    // Concatenate the first three characters of strind2 to string1
    printf("\nConcatenate first 3 characters\n");
    strncat(string1, string2, 3);
    printf("\tstring1 is %s\n", string1);
    printf("\tstring2 is %s\n", string2);

    // Copy string2 to string1
    printf("\nCopy string2 to string1\n");
    strcpy(string1, string2);
    printf("\tstring1 is %s\n", string1);
    printf("\tstring2 is %s\n", string2);

    // Copy the first three characters of the strin1 to string2
    printf("\nCopy the first three characters of the strin1 to string21\n");
    strncpy(string1, string2, 3);
    printf("\tstring1 is %s\n", string1);
    printf("\tstring2 is %s\n", string2);

    scanf("%d",&n);
}
