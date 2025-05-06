#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n, int k) {
    int yang = 12000;
    int drink = 2000;
    
    int fullYang = yang * n;
    int freeDrink = n / 10;
    int payDrink = k-freeDrink;
    int fullDrink = payDrink * drink;
        
    
    int answer = fullYang + fullDrink;
    return answer;
}