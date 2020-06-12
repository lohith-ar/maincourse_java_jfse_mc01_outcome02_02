## Problem Statement: List Operations

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
             return false if parameters are null or empty                    
    + sortFruits(List<String> fruits): Optional<List<String>>
             return empty Optional if parameters are null or empty  
    +  getFruitByTaste(Map<String, String> fruits, String searchTaste) :String
              return null if parameters are null or empty  

**NOTE: ALL THE METHODS SHOULD BE IMPLEMENTED USING STREAMS API ONLY** 
         
## Instructions
- Take care of whitespace/trailing whitespace
- Do not change the provided class/method names unless instructed
- Ensure your code compiles without any errors/warning/deprecations 
- Follow best practices while coding