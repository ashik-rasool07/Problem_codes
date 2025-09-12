#include <stdio.h>

int main() {
    int r, c;
    scanf("%d %d", &r, &c);

    char arr[r][c];
    int opRow = -1, opCol = -1;

    for (int i = 0; i < r; i++) {
        for (int j = 0; j < c; j++) {
            scanf(" %c", &arr[i][j]);
            if (arr[i][j] == '(') {
                opRow = i;
                opCol = j;
            }
        }
    }

    // Start right after '('
    int i = opRow;
    int j = opCol + 1;
    if (j == c) { j = 0; i++; }
    if (i == r) { i = 0; }

    // Traverse circularly
    while (1) {
        if (arr[i][j] == ')') {
            break;
        }

        printf("%c", arr[i][j]);

        
        j++;
        if (j == c) { j = 0; i++; }
        if (i == r) { i = 0; }
    }

  return 0;
}

// input
// a b c 
// ) ( d 
// e f g

// Output:
// defgabc