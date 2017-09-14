package com.jhdit.kata.printdiamond

class AlphaUtils {
    private static char FIRST_CHAR = 'A', LAST_CHAR = 'Z'
    private static final ALPHABET_RANGE = FIRST_CHAR..LAST_CHAR


    int getPosition(char ch) {
        return ALPHABET_RANGE.indexOf(ch.toUpperCase())
    }

    char getCharAtPosition(int position)    {
        if (position < 0 || position >= ALPHABET_RANGE.size())   {
            throw new IndexOutOfBoundsException("Invalid position: ${position}")
        }
        return ALPHABET_RANGE[position]
    }
}
