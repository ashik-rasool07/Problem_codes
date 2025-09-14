#include <stdio.h>
#include <string.h>

int main() {
    char str[200];
    scanf("%s", str);
    int c, index = 0;
    scanf("%d", &c);
    int r = strlen(str) / c;

    char arr[r][c];

    for (int i = 0; i < r; i++) {
        if (i % 2 == 0) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = str[index];
                index++;
            }
        } else {
            for (int j = c - 1; j >= 0; j--) {
                arr[i][j] = str[index];
                index++;
            }
        }
    }

    for (int i = 0; i < c; i++) {
        for (int j = 0; j < r; j++) {
            printf("%c", arr[j][i]);
        }
    }

    return 0;
}

/*
Question:
A string is encrypted by writing it in a zig-zag pattern 
(row-wise, reversing every alternate row) into an r×c matrix. 
Given the encrypted string and number of columns (c), 
decrypt it by reconstructing the matrix and reading column-wise.
*/
