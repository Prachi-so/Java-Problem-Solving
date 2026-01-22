# Smart Zoo System

## Scenario Description
Design a Smart Zoo System that manages animals, their habitats, keepers, and feeding schedules. Demonstrate hybrid and multilevel inheritance in Java. Use arrays to manage multiple animals and strings for descriptive fields.

## Classes and Inheritance Structure

1. **Animal (Base Class)**  
   Attributes: name, age, weight, healthStatus  
   Has-A: Habitat habitat, ZooKeeper keeper, FeedingSchedule feedingSchedule  
   Methods: eat(), sleep(), checkHealth(), displayInfo()

2. **Mammal (Child of Animal)**  
   Attribute: furColor  
   Method: displayMammalInfo()

3. **Lion (Child of Mammal)**  
   Attribute: maneSize  
   Method: displayLionInfo()  
   Inheritance: Animal → Mammal → Lion

4. **Elephant (Child of Mammal)**  
   Attribute: tuskLength  
   Method: displayElephantInfo()

5. **Bird (Child of Animal)**  
   Attribute: wingSpan  
   Method: displayBirdInfo()

6. **Parrot (Child of Bird)**  
   Attribute: canTalk  
   Method: displayParrotInfo()  
   Inheritance: Animal → Bird → Parrot

## Supporting Classes

- **Habitat**: name, area, isClean, temperature, humidity  
- **ZooKeeper**: name, experienceYears  
- **FeedingSchedule**: mealTime, foodType, quantity

## Operations

1. Create habitats, zoo keepers, feeding schedules  
2. Create animals (Lion, Elephant, Parrot) with proper attributes  
3. Store animals in an array  
4. Display information, feed animals, adjust habitats, clean if needed, check health  

## Expected Output
Animal: Simba, Age: 5, Weight: 190.0kg, Health: Healthy
Habitat: Savannah, Area: 1500 sq.m, Clean: Yes, Temp: 30.0C, Humidity: 40.0%
Keeper: John, Experience: 10 years
Feeding Schedule: 08:00, Meat, 5.0kg

Fur Color: Golden
Mane Size: 0.5m

Animal: Dumbo, Age: 8, Weight: 5400.0kg, Health: Sick
Habitat: Forest, Area: 3000 sq.m, Clean: No, Temp: 25.0C, Humidity: 50.0%
Keeper: Mary, Experience: 12 years
Feeding Schedule: 09:00, Vegetables, 50.0kg

Fur Color: Grey
Tusk Length: 1.5m

Animal: Polly, Age: 2, Weight: 1.0kg, Health: Healthy
Habitat: Tropical Aviary, Area: 200 sq.m, Clean: Yes, Temp: 28.0C, Humidity: 60.0%
Keeper: Lisa, Experience: 5 years
Feeding Schedule: 07:30, Seeds, 0.5kg

Wing Span: 0.3m
Can Talk: Yes

John is feeding Simba...
Simba is eating Meat...
Mary is feeding Dumbo...
Dumbo is eating Vegetables...
Lisa is feeding Polly...
Polly is eating Seeds...
Adjusting Savannah temperature to 32.0C and humidity to 45.0%...
Forest habitat is now clean.
Dumbo health status: Sick
