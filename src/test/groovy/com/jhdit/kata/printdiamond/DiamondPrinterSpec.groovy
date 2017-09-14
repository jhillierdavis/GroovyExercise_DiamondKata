package com.jhdit.kata.printdiamond

import spock.lang.Specification
import spock.lang.Unroll

class DiamondPrinterSpec extends Specification {

    @Unroll
    def "diamond generation with input #testInput"() {
        given:
        def diamondPrinter = new DiamondPrinter()

        when:
        def output = diamondPrinter.generate(testInput as char)

        then:
        output == testOutput

        where:
        testInput || testOutput
        'A'       || 'A\n'
        'B'       || ' A \nB B\n A \n'
        'C'       || '  A  \n B B \nC   C\n B B \n  A  \n'
    }

    @Unroll
    def "line generation for #testChar and #lineNumber"() {
        given:
        def diamondPrinter = new DiamondPrinter()

        expect:
        expected == diamondPrinter.generateLine(testChar, lineNumber)

        where:
        testChar    | lineNumber || expected
        'C' as char | 0          || "  A  "
        'C' as char | 1          || " B B "
        'C' as char | 2          || "C   C"
    }


}
