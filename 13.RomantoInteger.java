// The code starts by declaring a variable called n, which is initialized to the length of the string.
// Next, it declares a variable called sum that will be used to store the integer value of each Roman numeral character in an array.
// Then it iterates through each character in the input string and stores its value into a local variable called ch1.
// If there is another character after this one then getVal(ch1) < getVal(s.charAt(i + 1)) so subtracting getVal(ch1) from sum would result in 0 (since they are both less than 100).
// Otherwise adding them together results in 100 (since they are both greater than or equal to 100).
// The code then returns sum as its output
// The code will return the integer value of a given Roman numeral character.
// The switch statement is used to iterate through each character of the input string.
// The case statement checks if there is another character after the current one, and if so, subtracts the current value from the sum.
// Otherwise, adds the current value to the sum.
class Solution {
    public int getVal(char ch) {
        // This method returns the integer value of a given Roman numeral character
        switch(ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default : return 0;
        }
    }

    public int romanToInt(String s) {
        int n = s.length();
        int sum = 0;
        
        // Iterating through each character of the input string
        for (int i = 0; i < n; i++) {
            char ch1 = s.charAt(i);
            
            // Checking if there is another character after the current one
            if ((i + 1) < n && getVal(ch1) < getVal(s.charAt(i + 1))) {
                // If the value of the current character is less than the value of the next character,
                // subtract the current value from the sum
                sum = sum - getVal(ch1);
            } else {
                // Otherwise, add the current value to the sum
                sum = sum + getVal(ch1);
            }
        }
        
        return sum;
    }
}
