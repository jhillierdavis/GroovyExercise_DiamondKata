package com.jhdit.kata.printdiamond


class CommandLineDiamondGenerator {
    static void main(String[] args)  {
        char ch = this.validateCommandLineArgs(args)

        DiamondPrinter dp = new DiamondPrinter()
        println dp.generate(ch)
    }

    static char validateCommandLineArgs(String[] args)  {
        if (args.size() <= 0  || args[0].isEmpty() ) {
            displayErrorMessage()
        }

        char ch = args[0] as char
        if (!ch in 'A'..'Z') {
            displayErrorMessage()
        }
        return ch
    }

    static void displayErrorMessage()    {
        println "Invalid programs arguments!"
        displayUsageAndQuit()
    }

    static void displayUsageAndQuit() {
        println CommandLineDiamondGenerator.getName() + " <Letter>"
        System.exit(1)
    }
}
