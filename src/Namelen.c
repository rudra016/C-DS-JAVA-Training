#include <stdio.h>

int main() {
    // Write C code here
    char Str[100];
    int len = 0;
    printf("Enter : ");
    scanf("%s", &Str);
    for(int i = 0; Str[i] != '\0'; ++i){
        len++;
    }
    printf("%d", len);

    return 0;
}