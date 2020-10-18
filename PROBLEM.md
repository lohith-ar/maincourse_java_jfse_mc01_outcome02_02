## Problem Statement: Performing List Operations on FruitUtil class.

This exercise should be completed using Test Driven Development Technique

  - Write Test classes in TDD approach 
  - Functionality of methods should be completed, such that all the test cases pass 
  - Some requirements/hints are mentioned below
  
```
   In this problem, fruit names have to searched and sorted from the given input collections containing fruit names and taste of respective fruits 
        
   - Following functionality needs to be implemented
   
        - search a given fruit from the given list of fruits
        - sort the given list of fruits in descending order
        - search the fruit for a given taste from the given collection of fruit names and tastes
   
   - Empty and null inputs should be checked       
```

Class FruitUtil must be implemented using TDD for the following methods 

    + searchFruit(List<String> fruits, String searchFruit): boolean
             - This method checks if the parameter `searchFruit` is present the list `fruits`. The parameter `searchFruit` is case-insensitive.
             - return false if parameters are null or empty 
             - return false if the searchFruit is not found in the list fruits
             - return true if the searchFruit is found in the list fruits.
                                
    + sortFruits(List<String> fruits): Optional<List<String>>
             - This method sorts the given list of fruits in descending order.
             - return empty Optional if parameters are null or empty else return optional of sorted list.
             
    +  getFruitByTaste(Map<String, String> fruits, String searchTaste) :String
            - This methods returns the fruit name for the given taste of the fruit.
            - return null if parameters are null or empty.
            - Throw FruitNotFoundException if the fruit is not present.
              
Implement custom exception class FruitNotFoundException

    - This class extends RuntimeException.
    - Implement constructors
    
   
**NOTE: ALL THE METHODS SHOULD BE IMPLEMENTED USING STREAMS API ONLY** 
 
- Write the test cases in the class `FruitUtilTests`.    
- Minimum test cases expected: 10
- Test cases should be written for positive and negative scenarios, wherever applicable
- Test methods should follow (given...ThenShould) naming convention.
    - For example: `givenTwoIntegersWhenAddedThenShouldReturnSum`. If the method name is very long,then you can skip `when` part.
- Test coverage should be 100%

## Instructions

- Take care of whitespace/trailing whitespace
- Do not change the provided class/method names unless instructed
- Follow best practices while coding

## Code coverage 

 - Run mvn test, the JaCoCo code coverage report will be generated at target/site/jacoco/*
 - Open the target/site/jacoco/index.html file, review the code coverage report 
 
            - Green – Code is tested or covered.
            - Red – Code is not tested or covered.
            - Yellow – Code is partially tested or covered.
 - Make sure lines coverage must meet the minimum 90%
