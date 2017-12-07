/*
    C lab exam
    Mindaugas Sarskus 07/12/2017
*/

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_COUNTRIES 10

// list of countries
char countryList[10][MAX_COUNTRIES] = {
    "Galway", "Dublin", "Cork", "Limerick", "Mayo",
    "Roscommon", "Clare", "Kildare", "Wicklow", "Louth"
};

typedef struct Entry{
    char county[15];
    int thisYear;
    int lastYear;
} Entry;

void createTable(Entry table[MAX_COUNTRIES]);
void displayTable(Entry table[MAX_COUNTRIES]);
void tableTamplate(Entry table[MAX_COUNTRIES]);
void papulateTable(Entry table[MAX_COUNTRIES]);
void papulateThisYear(Entry table[MAX_COUNTRIES]);
void papulateLastYear(Entry table[MAX_COUNTRIES]);
float countAverage(int flag, Entry table[MAX_COUNTRIES]);
void displayLargest(Entry table[MAX_COUNTRIES]);
void writeToFile(char fileName[], Entry table[MAX_COUNTRIES]);

void main(){
    float averageCurrent, averagePrev;
    int largestPrevPos, largestCurrPos;
    Entry table[MAX_COUNTRIES];

    createTable(table);
    displayTable(table);

    averageCurrent = countAverage(0, table);
    averagePrev = countAverage(1, table);
    printf("Average price in current year is: %f\n", averageCurrent);
    printf("Average price in previaus year is: %f\n", averagePrev);

    displayLargest(table);

    writeToFile("HousePrices.txt", table);


    int hgh; scanf("%d\n", &hgh); // pause
}


void createTable(Entry table[MAX_COUNTRIES]){
    tableTamplate(table); // add countys to the table
    papulateTable(table);
    // displayTable(table);
}
/**
*   Makes epmty tabele template (populates countys names)
*/
void tableTamplate(Entry table[MAX_COUNTRIES]){
    for(int i = 0; i < MAX_COUNTRIES; i++){
        strcpy(table[i].county, countryList[i]);
        table[i].thisYear = 0;  // empty cell, just to be sure
        table[i].lastYear = 0;
    }
}

/**
*   Displays table.
*/
void displayTable(Entry table[MAX_COUNTRIES]){
    printf("%-12s%-12s%-12s\n\n", "County", "This Year", "Last Year");
    for(int i = 0; i < MAX_COUNTRIES; i++){
        printf("%-12s%-12d%-12d\n", table[i].county, table[i].thisYear, table[i].lastYear);
    }
    printf("\n");
}

/**
*   populates this and last year column in table
*/
void papulateTable(Entry table[MAX_COUNTRIES]){
    papulateThisYear(table);
    papulateLastYear(table);
}

/**
*   populates this year column in table
*/
void papulateThisYear(Entry table[MAX_COUNTRIES]){
    for(int i = 0; i < MAX_COUNTRIES; i++){
        printf("Please enter the average house price in %s year for the county %s\n",
             "this", table[i].county);
        scanf("%d", &table[i].thisYear);
    }
}

/**
*   populates last year column in table
*/
void papulateLastYear(Entry table[MAX_COUNTRIES]){
    for(int i = 0; i < MAX_COUNTRIES; i++){
        printf("Please enter the average house price in %s year for the county %s\n",
             "last", table[i].county);
        scanf("%d", &table[i].lastYear);
    }
}

/**
*   Counts avetage price.
*   flag 0 -> this year
*   flag 1 -> last year
*/
float countAverage(int flag, Entry table[MAX_COUNTRIES]){
    int total = 0;

    for(int i = 0; i < MAX_COUNTRIES; i++){
        switch (flag) {
            case 0:
                total += table[i].thisYear;
                break;
            case 1:
                total += table[i].lastYear;
                break;
        }
    }// end for

    return (float)total / MAX_COUNTRIES;
}

void displayLargest(Entry table[MAX_COUNTRIES]){
    int currPos, lastPos;
    currPos = lastPos = 0;
    // find largest price position of each year
    for(int i = 0; i < MAX_COUNTRIES; i++){
        if(table[currPos].thisYear < table[i].thisYear){ currPos = i; }
        if(table[lastPos].lastYear < table[i].lastYear){ lastPos = i; }
    }

    printf("The county with the largest house price this year is: %s\n", table[currPos].county);
    printf("The county with the largest house price last year is: %s\n", table[lastPos].county);
}

void writeToFile(char fileName[], Entry table[MAX_COUNTRIES]){
    FILE* pFile;
    pFile = fopen(fileName, "w");

    if(pFile == NULL){ printf("Can't open file: %s\n", fileName); }
    else{
        // fprintf(pFile, "%-12s%-12s%-12s\n\n", "County", "This Year", "Last Year");

        for(int i = 0; i < MAX_COUNTRIES; i++){
            fprintf(pFile, "%-12s%-12d%-12d\n", table[i].county, table[i].thisYear, table[i].lastYear);
        }
        fclose(pFile);
    }
}
