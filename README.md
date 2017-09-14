Groovy Exercise: Diamond Kata
-----------------------------

##Overview

The Diamond Kata ('Programming Exercise') is a simple exercise that Seb Rose described [here](http://claysnow.co.uk/recycling-tests-in-tdd/), as follows:

    Given a letter, print a diamond starting with ‘A’ with the supplied letter at the widest point.

    For example: print-diamond ‘C’ prints

      A
     B B
    C   C
     B B
      A


## Corebase structure

In this project you get:

* A Gradle build file
* A standard project structure:

    <proj>
      |
      +- src
          |
          +- main
          |     |
          |     +- java
          |     +- groovy
                   
          |
          +- test
          |   |
          |   +- java
          |   +- groovy
          

## Execution

Example:

    gradle run  -PappArgs="['H']"

    > Task :run
           A       
          B B      
         C   C     
        D     D    
       E       E   
      F         F  
     G           G 
    H             H
     G           G 
      F         F  
       E       E   
        D     D    
         C   C     
          B B      
           A       
         