#include <stdio.h>
#include <stdlib.h>
#include <string.h>


int getIntegerValue(int N)
{
    char s[100];
    sprintf(s, "%d", N);   
    int len = strlen(s);

    char part[10];  

  
    for (int i = 0; i < len; i++)
    {
        int j = i;
        int k = 0;

       
        while (j < len && (s[j] == '0' || s[j] == '1'))
        {
            part[k++] = s[j];
            j++;
        }
        part[k] = '\0'; 

       
        if (k >= 2)
        {
            int decimal = strtol(part, NULL, 2); // convert binary to decimal

            char before[100], after[100], result[100];

            strncpy(before, s, i);
            before[i] = '\0';        // cut the string before binary part
            strcpy(after, s + j);    // part after the binary

            sprintf(result, "%s%d%s", before, decimal, after); // join all
            return atoi(result);     // convert final string to int
        }
    }
    return N; // if no binary part found
}

// main function to test
int main()
{
    int N;
    scanf("%d", &N);   // read input number

    int ans = getIntegerValue(N);  // call the function
    printf("%d", ans);  // print result

    return 0;
}
