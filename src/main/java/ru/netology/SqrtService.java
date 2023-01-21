package ru.netology;
public class SqrtService {

    public int calcSqrt(int min, int max) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            int sqr = i * i;
            if (min <= sqr & sqr <= max) counter++;
        }

        return counter;
    }
}
