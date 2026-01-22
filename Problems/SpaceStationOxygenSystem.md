# SpaceStation Oxygen System

## Problem Statement
Design an `OxygenSystem` module for a SpaceStation to manage multiple oxygen tanks, track total oxygen supply, and ensure astronauts get a safe supply.

### Tank Attributes
- `tankID` (unique ID)
- `currentOxygenLevel` (liters)
- `maxCapacity`
- `status` (ACTIVE / INACTIVE)

### Station Attributes
- `totalOxygenInStation` (total across active tanks)
- `totalTanks` (total tanks created)

### Requirements
1. **Private Fields**: All tank fields must be private. No direct modification from outside.
2. **Controlled Access**: Public methods:
   - `addOxygen(int liters)` → Add safely if ACTIVE and within max capacity
   - `consumeOxygen(int liters)` → Consume safely if ACTIVE
   - `activateTank()`, `deactivateTank()` → Change status
   - `getCurrentOxygenLevel()`, `getMaxCapacity()`, `getTankStatus()` → Read-only access
   - Static methods: `getTotalOxygenInStation()`, `getTotalTanks()`
3. **Initializers**:
   - Static initializer → totalOxygenInStation & totalTanks = 0
   - Non-static initializer → unique tankID assigned automatically
4. **Validation**:
   - Prevent overfilling or negative oxygen
   - Operations only on ACTIVE tanks
   - Automatic update of totalOxygenInStation when tank status or oxygen changes

### Example Scenario
Setup:

- Tank 1: max 500, ACTIVE, empty  
- Tank 2: max 300, ACTIVE, empty  
- Tank 3: max 200, INACTIVE, empty  

Actions:

1. Add 400 to Tank 1  
2. Add 200 to Tank 2  
3. Attempt to add 100 to Tank 3 (inactive)  
4. Consume 50 from Tank 1  
5. Deactivate Tank 2  
6. Activate Tank 3 and add 150  
7. Check individual tank levels and station totals  

### Expected Output
Tank 1 current oxygen: 400 liters
Tank 2 current oxygen: 200 liters
Cannot add oxygen: Tank 3 is inactive
Tank 1 consumed 50 liters. Current level: 350 liters
Tank 2 deactivated. Oxygen removed from station total.
Tank 3 activated.
Tank 3 current oxygen: 150 liters
Tank 1 status: ACTIVE, oxygen: 350 liters
Tank 2 status: INACTIVE, oxygen: 200 liters
Tank 3 status: ACTIVE, oxygen: 150 liters
Total oxygen in station: 500 liters
Total tanks created: 3


### Constraints
- All oxygen operations must validate tank status and capacity
- Changing tank status automatically updates totalOxygenInStation
- Direct access to oxygen levels or totals outside the class is prohibited
