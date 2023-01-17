import java.util.Locale;

public class Fibonacci {
    // instance variable
    private int[] sequence;

    /** Constructor: sets sequence instance variable to an array containing the
     first sequenceLen numbers in a Fibonacci sequence (a Fibonacci sequence is formed
     by summing the previous two numbers to generate the next number,
     e.g. 0, 1, 1, 2, 3, 5, 8, 13, 21...)

     PRECONDITION: sequenceLen >= 2
     */
    public Fibonacci(int sequenceLen)
    { int[] sequence = new int[sequenceLen]; }


    /** Getter method: returns a reference to the sequence array

     @return  reference to sequence instance variable
     */
    public int[] getSequence()
    {
        return sequence;
    }

    /** Returns the index in the array where a particular value, searchVal, is
     located in sequence; if not found, returns -1.  If searchVal == 1, return
     first index where 1 is found (since this value appears twice in Fibonacci
     sequences longer than 2 numbers)

     @param searchVal  the number to search for in sequence
     @return  the index where searchVal is located in sequence, -1 if not found
     */
    public int getIndexOf(int searchVal)
    {
        if (searchVal == 1) {
            return 1;
        }
        if (searchVal != 1) {
            for (int i = 1; i < sequence.length; i++) {
                sequence[0] = 0;
                sequence[1] = 1;
                sequence[i+1] = sequence[i-1] + sequence[i-2];
               for (int j = 0; j < sequence.length; i++ ) {
                   if (sequence[j] == searchVal) {
                       return sequence[j];
                   }
                   else return -1;
                }
            }
        }
        return 0;
    }


    /** Creates a temp array that contains the original sequence array with
     howManyMore numbers Fibonacci values added on to the end,
     then assigns sequence to that new array.

     For example, if sequence == {0, 1, 1, 2, 3, 5} and this method is called
     with howManyMore == 3, sequence would be assigned to a new array with
     the next 2 Fibonacci numbers: {0, 1, 1, 2, 3, 5, 8, 13, 21}
     */
    public void extendBy(int howManyMore)
    { /* IMPLEMENT ME! */ }
}