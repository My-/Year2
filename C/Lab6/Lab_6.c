/**
*	Mindaugas...
*
*	7/11/2017
*/

#include <stdio.h>

/*
Write a program that reads that checks its customer’s Credit Limits
on a monthly basis. The program will first receive the number of
customers as an input from the user.
*/
void main() {

	int custumersNo, accNo;
	float balance, custPurchase, custCredit = 0, creditLimit;

	float newBalance, totCredit = 0, maxExcess = 0, totExcess = 0;
	int custOverLimit = 0, maxExecessAcc = 0;

	printf("Enter number of custumers: ");
	scanf("%d", &custumersNo);

	/*
	For each customer the user will enter their:
		• Account Number
		• Balance at the start of the month
		• Total Price of the items purchased during the month.
		• Total credits applied to the account during the month.
		• Credit Limi
	*/
	for (int i = 0; i < custumersNo; i++) {
		printf("Enter\n\t Account Number: ");
		scanf("%d", &accNo);
		//printf("\t %d", accNo);

		printf("\t Balance at the start of the month: ");
		scanf("%f", &balance);
		//printf("\t %.2f", balance);

		printf("\t Total Price of the items purchased during the month: ");
		scanf("%f", &custPurchase);
		printf("\t Total credits applied to the account during the month: ");
		scanf("%f", &custCredit);
		printf("\t Credit Limit: ");
		scanf("%f", &creditLimit);
		printf("\n");

		newBalance = balance +custPurchase -custCredit;
		totCredit += newBalance; // Total Credit outstanding.

		// count over the limit
		if( creditLimit < newBalance ){
			custOverLimit++; // The number of customers over their credit limit.
			totExcess += newBalance -creditLimit; // The total amount of excess credit outstanding

			// The customer with the largest "excess" credit.
			if( maxExcess < newBalance ){
				maxExcess = newBalance;
				maxExecessAcc = accNo;
			}
		}// if

	}// for

	// output relevent information
	printf("\n\nTotal Credit outstanding: %.2f", totCredit);
	printf("\nThe number of customers over their credit limit: %d", custOverLimit);
	printf("\nThe total amount of excess credit outstanding: %.2f", totExcess);
	printf("\nThe customer with the largest \"excess\" credit: %d(%.2f)", maxExecessAcc, maxExcess);

	// scanf(" %c");

}// main()
