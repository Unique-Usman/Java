# Turing Machine Tape

The Turing Machine Tape is a class designed to represent the tape used by a Turing Machine, a simple abstract computing device introduced by Alan Turing in the 1930s. The tape consists of cells, which are little squares capable of holding a single character. The Tape class provides various methods to manipulate and access the content of the tape.

## Cell Class

The Tape class relies on the Cell class, which represents a single cell on the tape. Each cell contains a character and maintains pointers to the previous and next cells. The Cell class is already implemented and provided in the file `Cell.java`.

## Tape Class

The Tape class, defined in the `Tape.java` file, encapsulates the functionality of the Turing Machine tape. It includes the following methods:

- `public Cell getCurrentCell()`: Returns the pointer that points to the current cell.
- `public char getContent()`: Returns the character from the current cell.
- `public void setContent(char ch)`: Changes the character in the current cell to the specified value.
- `public void moveLeft()`: Moves the current cell one position to the left along the tape, potentially creating a new cell if necessary.
- `public void moveRight()`: Moves the current cell one position to the right along the tape, potentially creating a new cell if necessary.
- `public String getTapeContents()`: Returns a string consisting of the characters from all the cells on the tape, read from left to right, excluding leading or trailing blank characters.

Additionally, the Tape class provides a constructor that initializes the tape with a single cell containing a blank space character. The current cell pointer is set to this initial cell.

## Testing

To ensure the correctness of the Tape class, you can utilize the provided test programs: `TestTape.java`, `TestTapeGUI.java`, and `TestTuringMachine.java`. These programs exercise the functionality of the Tape class by performing various operations on the tape and verifying the expected outcomes.

Note: Before running the test programs, make sure to copy the `turing` package, including the `Tape.java` and `Cell.java` files, into your Eclipse project.

Feel free to explore and extend the functionality of the Tape class for your specific use cases.

Enjoy coding with Turing Machine Tapes!
