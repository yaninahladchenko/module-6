Module 6
1. Implement an RLE data compression for a given string. RLE produces sequences in which the same data values occurs in
data elements are stored as a single data value and a counter. For example, AAABB => 3A2B. If you have a number in the
input string then it should be escaped using \ (slash) if you have a \ in the input string it should be escaped by another \. For
example:
Input string: AAAAaaaBBBBBB\12
Output string: 4A3a6B\\\1\2
Input string: AaaaBB2
Output string: 1A3a2B\2
Input string: AaaaBB\\2
Output string: 1A3a2B\\\\\2


2. Create a decoder for a previous task. For example:
Input string: 4A3a6B\\\1\2
Output string: AAAAaaaBBBBBB\12
Make sure to validate an input string and throw an unchecked exception in case of validation failure. For example: 4A3a6B\\
1\2 should not pass the validation and throw an exception


3. Create a LinkedList class which will represent a linear collection of data elements, whose order is not given by their
physical placement in memory. Instead, each element points to the next. Provide methods to add (will add an element to the
end of the list), remove (by index) and get (by index) an element from the list.
DO NOT USE any classes from Java Collection Framework.


4. Using a HashMap class create an application which allows to find a citizen by a passport serial number and series. Create
two classes – Citizen with name and surname and Passport with series and number. Passport class will be used as a key for
HashMap and the Citizen will be used as a value  
