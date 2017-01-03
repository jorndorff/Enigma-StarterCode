Enigma
======

Assignment
----------
In this lab, you will read in an input message from a file, encrypt the message, and write the encrypted message or cipher text to an output file. You will simulate a two-rotor Enigma machine, similar to that used by the German military in WWII, to encrypt the message.

Grading
-------
| Category      | Points |
| ------------- | ------ |
| Functionality | 11     |
| Style         | 4      |
| Documentation | 3      |
| FAQs Answered | 2      |

Usage
-----
TODO

How the two-rotor Enigma machine works
--------------------------------------
Rotors 1 (the inner wheel) and 2 (the middle wheel) can rotate clockwise, while the backplate (the outer wheel) is stationary. The numbers around the backplate are useful for keeping track of positions, but do not affect the cipher.
 
To encrypt a character using this machine, locate the plaintext character on rotor 1. Next, identify the character on the backplate at the same position. Let's call this the backplate character. Now locate the backplate character on rotor 2. The ciphertext is the character on the backplate at the same position as the backplate character's position on rotor 2.

Before encrypting the next character, rotor 1 rotates one position to the right. When rotor 1 completes a full revolution by returning to its original positioning, rotor 2 advances one position in the clockwise direction. This is similar to how the minutes and hours advance on a clock.


Method Overview
---------------
- readFile: Reads in the input text from a file and initializes the input ArrayList

`public static void readFile(String inputfilename, ArrayList<Integer> in)`

- writeToFile: Takes in a char as a parameter and appends to a file 
(The method we discuss in class appends to an existing file, so make sure you delete any existing file before you encrypt a new file) 

`public static void writeToFile(char ch)`

- advanceRotor: moves the rotor clockwise one position

`public static void advanceRotor(ArrayList<Integer> rotor)`

- initializeRotors: Initializes the three rotors with the specified starting ASCII values and initializes with all the characters of ASCII value 32 to 126 (clockwise)

`public static void initializeRotors(int s1, int s2, int s3)`

For example: if s1 is 35, rotor1 will have ASCII values from 35, 36, 37, …,126, 32, 33, 34.

- encryptFile: Encrypts the input ArrayList and writes to file. (A good implementation will use helpers)

`public static void encryptFile(ArrayList<Integer> in)`

You will use the following global variables:

public static ArrayList<Integer> rotor1;
public static ArrayList<Integer> rotor2;
public static ArrayList<Integer> backplate;
public static String output; (output)

Commandline arguments
---------------------

- args[0] - inputfliename
- args[1] - outputfilename
- args[2] - starting ASCII value for rotor1
- args[3] - starting ASCII value for rotor2
- args[4] - starting ASCII value for backplate



FAQs
----
1. Would you have used Arrays for this lab instead and why? What are the pros and cons?
2. How would you decrypt the message encrypted with a specific enigma machine? Or what would you need to decrypt?
3. Do you think having more rotors would make the decryption more difficult?
4. The file I/O handling in this lab design is not very efficient, how would you have reimplemented the design?
5. Do you use autoboxing and autounboxing for this lab? (new question)

