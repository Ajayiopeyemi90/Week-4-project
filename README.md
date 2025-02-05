# Week-4-project
## Java Date and Time API

## Project Overview
This project demonstrates the use of Java's `java.time` package to perform date and time calculations. It includes three Java classes that showcase different functionalities:

1. **Main.java** - Finds and prints all Mondays in the current month.
2. **NumberOfDays.java** - Displays the number of days in each month of the current year.
3. **FindingFriday.java** - Determines if there is a Friday the 13th in the current year and prints it.

## Files and Functionalities
### 1. Main.java
- Retrieves the current date.
- Determines the first Monday of the month.
- Iterates through the month, printing all Mondays.

### 2. NumberOfDays.java
- Retrieves the current year.
- Loops through each month and prints the number of days.

### 3. FindingFriday.java
- Loops through each month of the current year.
- Checks if the 13th day of the month falls on a Friday.
- Prints the date if it is a Friday.

## How to Run
1. Ensure you have Java installed on your system.
2. Navigate to the directory containing the `week4Project` package.
3. Compile the Java files:
   ```sh
   javac week4Project/*.java
   ```
4. Run each class separately:
   ```sh
   java week4Project.Main
   java week4Project.NumberOfDays
   java week4Project.FindingFriday
   ```
## Expected Output Examples
### **Main.java Output Example**
```
2025-02-03
2025-02-10
2025-02-17
2025-02-24
```

### **NumberOfDays.java Output Example**
```
The number of days in different months in 2025 are:
JANUARY: 31 days.
FEBRUARY: 28 days.
MARCH: 31 days.
...
DECEMBER: 31 days.
```

### **FindingFriday.java Output Example**
```
Friday the 13th found on: 2025-06-13
```

## Author
Opeyemi Ajayi



