#include <stdio.h>
#include <stdlib.h>

void printEveryRowCharacters(int R, int C, char *matrix) {
    for (int i = 0; i < R; i++) {
        for (int j = 0; j < C; j += (i + 1)) {
            printf("%c ", *(matrix + i * C + j));
        }
    }
}

int main() 
{
    int R, C;
    scanf("%d %d", &R, &C);

    char matrix[R][C];
    for (int row = 0; row < R; row++) 
    {
        for (int col = 0; col < C; col++)
     {
            scanf(" %c", &matrix[row][col]);
        }
    }

    printEveryRowCharacters(R, C, (char *)matrix);
    return 0;
}

/*
===============================================
QUESTION:
The function/method printEveryRowCharacters accepts three arguments R, C and matrix.
The integers R and C represent the size of the character matrix.

The function/method printEveryRowCharacters must print the characters of the matrix based
on the following conditions:

- In the 1st row, the function must print every character.
- In the 2nd row, the function must print every 2nd character.
- In the 3rd row, the function must print every 3rd character.
- Similarly, the characters in the remaining rows of the matrix must be printed.

Your task is to implement the function printEveryRowCharacters so that the program runs successfully.

Example Input/Output 1:
Input:
7 9
f n m d h b o c r
i o u m g x y u m
t o g m n p e y w
o p j a g g k s i
x y z q a k b s w
p o r e i c a r b
c z c b e l u m f

Output:
f n m d h b o c r o m x u g p w a s x c u
==========================================
*/
