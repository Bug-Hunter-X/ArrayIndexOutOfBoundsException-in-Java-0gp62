# ArrayIndexOutOfBoundsException in Java

This repository demonstrates a common Java error: the `ArrayIndexOutOfBoundsException`.  The `bug.java` file contains code that attempts to access an array element beyond its valid index range.  The corrected code is in `bugSolution.java`.

The error arises because array indices in Java (and most other programming languages) are zero-based.  An array of size N has valid indices from 0 to N-1. Attempting to access an element at index N or greater will result in an `ArrayIndexOutOfBoundsException`. 

This example showcases how crucial it is to carefully manage array indices to avoid this runtime exception.