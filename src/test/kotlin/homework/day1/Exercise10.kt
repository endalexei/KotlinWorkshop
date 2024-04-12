package homework.day1

import io.kotest.core.spec.style.FunSpec

/*
Write a program that creates or splits Camel Case variable, method, and class names.

 - Create list with string values: S;M;plasticCup(), C;V;mobile phone, C;C;coffee machine, S;C;LargeSoftwareBook,
 C;M;white sheet of paper, S;V;pictureFrame
 - Each element of the list begins with an operation ('S' or 'C') followed by a semicolon,
 followed by 'M', 'C', or 'V' followed by a semicolon followed by the words you'll need to operate on.
 - The operation either be 'S' (split) or 'C' (combine).
 - 'M' indicates method, 'C' indicates class, and 'V' indicates variable.
 - In the case of a split operation: the words will be a camel case method, class or variable name that you need
 to split into a space-delimited list of words starting with a lowercase letter.
 - In the case of a combine operation: the words will be a space-delimited list of words starting with lowercase letters
 that you need to combine into the appropriate camel case String.
 Methods should end with an empty set of parentheses to differentiate them from variable names.

 Input example: S;V;pictureFrame
 Output example: picture frame
 */

class Exercise10 : FunSpec ({
    // Enter your code here
})