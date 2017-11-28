/*
Write a program that reads 20 integers into an array.
It should then find the average of the numbers in the array.
Finally, it should display the numbers in the array that are less than the average value
calculated.
*/

#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <time.h>
// #include <conio.h>

void main(){
    int arr[20], total = 0;
    int arrLenght = sizeof(arr) / sizeof(int);
    float average;

    srand( time(NULL) );

    for( int i = 0; i < arrLenght; i++ ){
        // Write a program that reads 20 integers into an array.
        arr[i] = rand() %20; // don't say it should be from user or someware else, so I suse random
        // scanf("%d", &arr[i]);
        total += arr[i];
    }

    average = (float)total / arrLenght; // count average

    printf("\nValues are:\n");
    for( int i = 0; i < arrLenght ; i++ ){ printf("%3d", arr[i]); } // print all values

    printf("\nValues less %.2f are:\n", average);
    for( int i = 0; i < arrLenght ; i++ ){
        if( arr[i] < average ){ printf("%3d", arr[i]); } // print values less then average
        else{ printf("   "); }
    }

    int n; scanf("%d", &n); // <---IGNORE!! (needed to keep terminal open)
}
