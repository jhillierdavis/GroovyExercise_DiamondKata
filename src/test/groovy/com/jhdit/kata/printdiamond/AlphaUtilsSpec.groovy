package com.jhdit.kata.printdiamond


import spock.lang.Specification
import spock.lang.Unroll

class AlphaUtilsSpec extends Specification {

    @Unroll
    def "get alphabet offset from position for valid char: #testInputChar"() {
        setup:
        AlphaUtils alphaUtils = new AlphaUtils()

        expect:
        expectedPosition == alphaUtils.getPosition(testInputChar)

        where:
        testInputChar || expectedPosition
        'A' as char   || 0
        'D' as char   || 3
        'K' as char   || 10
        'Z' as char   || 25
        'z' as char   || 25
    }

    @Unroll
    def "get alphabet char from offset position for valid position: #testInputPosition"() {
        setup:
        AlphaUtils alphaUtils = new AlphaUtils()

        expect:
        expectedChar == alphaUtils.getCharAtPosition(testInputPosition)

        where:
        testInputPosition || expectedChar
        0                 || 'A' as char
        25                || 'Z' as char
    }


    @Unroll
    def "get alphabet char from offset position for invalid position: #testInputPosition"() {
        setup:
        AlphaUtils alphaUtils = new AlphaUtils()

        when:
        alphaUtils.getCharAtPosition(testInputPosition)

        then:
        final IndexOutOfBoundsException e = thrown()

        where:
        testInputPosition | foo
        -1                | _
        26                | _
    }
}
