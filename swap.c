#include <stdio.h>

int main() {
    // Write C code here
    int a = 4;
    int b = 5;
    
    int temp = a;
    a = b;
    b =  temp;
    
    printf("%d %d", a, b);
    

    return 0;
}
