#include <stdio.h>
#include <string.h>
#include <ctype.h>
#include <stdbool.h>

int findVowelsBitMask(char str[])
{
    bool isVowel[5] = {false, false, false, false, false};

    for (int i = 0; i < strlen(str); i++)
    {
        char c = tolower(str[i]);
        switch (c)
        {
            case 'a': isVowel[0] = true; break;
            case 'e': isVowel[1] = true; break;
            case 'i': isVowel[2] = true; break;
            case 'o': isVowel[3] = true; break;
            case 'u': isVowel[4] = true; break;
        }
    }

    int totalsum = 0, weight = 1;
    for (int j = 0; j < 5; j++)
    {
        if (isVowel[j])
        {
            totalsum += weight;
        }
        weight *= 2;
    }
    return totalsum;
}

int main()
{
    char str[100];
    scanf("%s", str);

    int result = findVowelsBitMask(str);
    printf("%d\n", result);

    return 0;
}


/* Given a string, set bits for vowels (a=1, e=2, i=4, o=8, u=16), return sum+10.
Input: SkillRack   -> Output: 15
Input: Archaeologist -> Output: 25 */
