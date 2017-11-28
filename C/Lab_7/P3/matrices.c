/*
Write a program that adds two matrices.
The matrices should be of size 3x3 and the user is asked to input the value in both
matrices.
The program should then display the result of the
addition.
*/

#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <time.h>

#define  X  3   // matrix x size
#define  Y  3   // matrix y size

void printMatrix( int matrix[X][Y] );
void makeRandomMatrix(int matrix[X][Y]);
void makeInputMatrix(int matrix[X][Y]);

void main(){
    int matrix_1[X][Y], matrix_2[X][Y], matrix_sum[X][Y];
    srand( time(NULL) ); // random seed

    // makeRandomMatrix(matrix_1);
    // makeRandomMatrix(matrix_2);
    makeInputMatrix(matrix_1);
    makeInputMatrix(matrix_2);

    printMatrix(matrix_1);
    printf("\n+\n\n");
    printMatrix(matrix_2);
    printf("\n=\n\n");

    // sum matrixes
    for( int x = 0; x < X; x++ ){
        for( int y = 0; y < Y; y++ ){
            matrix_sum[x][y] = matrix_1[x][y] + matrix_2[x][y];
        }
    }

    printMatrix(matrix_sum);

    int n; scanf("%d", &n); // <---IGNORE!! (needed to keep terminal open)
}

void printMatrix( int m[X][Y] ){
    for( int x = 0; x < X; x++ ){
        for( int y = 0; y < Y; y++ ){
            printf("%d ", m[x][y]);
        }
        printf("\n");
    }
}

void makeRandomMatrix(int matrix[X][Y]){
    for( int x = 0; x < X; x++ ){
        for( int y = 0; y < Y; y++ ){
            matrix[x][y] = rand() %20;
        }
    }
}

void makeInputMatrix(int matrix[X][Y]){
    for( int x = 0; x < X; x++ ){
        for( int y = 0; y < Y; y++ ){
            printf("Enter number @(%d, %d): ", x, y);
            scanf("%d", &matrix[x][y]);
        }
    }
}
