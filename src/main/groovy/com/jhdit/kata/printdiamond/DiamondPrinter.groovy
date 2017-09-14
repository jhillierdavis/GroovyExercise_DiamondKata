package com.jhdit.kata.printdiamond

class DiamondPrinter {
    private AlphaUtils alphaUtils = new AlphaUtils()

    String generate(char ch) {
        int offset = alphaUtils.getPosition(ch)
        return generateDiamond(offset, ch)
    }

    private String generateDiamond(int offset, char ch) {
        StringBuilder sb = new StringBuilder()
        sb.append( this.generateTopOfDiamond(offset, ch))
        sb.append( this.generateBottomOfDiamond(offset, ch))

        return sb.toString()
    }

    private String generateTopOfDiamond(int offset, char ch)   {
        StringBuilder sb = new StringBuilder()
        for (int i = 0; i <= offset; i++) {
            sb.append(generateLine(ch, i))
            sb.append('\n')
        }
        return sb.toString()
    }

    private generateBottomOfDiamond(int offset, char ch) {
        StringBuilder sb = new StringBuilder()
        for (int i = offset - 1; i >= 0; i--) {
            sb.append(generateLine(ch, i))
            sb.append('\n')
        }
        return sb.toString()
    }

    String generateLine(char ch, int lineNumber) {
        int offset = alphaUtils.getPosition(ch)

        StringBuilder sb = new StringBuilder()
        sb.append(getPrefixSpacing(offset - lineNumber))
        sb.append(alphaUtils.getCharAtPosition(lineNumber))
        if (lineNumber > 0) {
            sb.append(getSuffixSpacing(getSpacing(lineNumber)))
            sb.append(alphaUtils.getCharAtPosition(lineNumber))
        }
        sb.append(getPrefixSpacing(offset - lineNumber))

        return sb.toString()
    }
/*
    String generateLine(int charPosition, int lineNumber) {
        int diff = Math.abs(charPosition - lineNumber)

        StringBuilder sb = new StringBuilder()
        sb.append(getPrefixSpacing(diff))
        sb.append(alphaUtils.getCharAtPosition(lineNumber))
        if (lineNumber > 0) {
            sb.append(getSuffixSpacing(getSpacing(lineNumber)))
            sb.append(alphaUtils.getCharAtPosition(lineNumber))
        }
        sb.append(getPrefixSpacing(diff))

        return sb.toString()
    }
*/

    String getPrefixSpacing(int x) {
        multiplySpacing x
    }

    String getSuffixSpacing(int x) {
        multiplySpacing x
    }

    String multiplySpacing(int x) {
        return ' ' * x
    }

    int getSpacing(int value) {
        if (value <= 0) {
            return 0
        }

        return 2 * (value - 1) + 1
    }
}