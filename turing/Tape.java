package turing;

/**
 * Represents a Tape which contains multiple cells.
 * The Tape is used in a Turing Machine simulation.
 *
 * @author Usman Akinyemi
 */
public class Tape {

    // Pointer to the leftmost cell
    Cell leftCell = null;

    // Pointer to the rightmost cell
    Cell rightCell = null;

    // Pointer to the current cell
    Cell currentCell = null;

    /**
     * Constructs a tape that initially consists of a single cell.
     */
    public Tape() {
        currentCell = new Cell();
        currentCell.prev = null;
        currentCell.next = null;
        currentCell.content = '\0';
        leftCell = rightCell = currentCell;
    }

    /**
     * Returns the pointer that points to the current cell.
     *
     * @return The current cell.
     */
    public Cell getCurrentCell() {
        return currentCell;
    }

    /**
     * Returns the character from the current cell.
     *
     * @return The character from the current cell.
     */
    public char getContent() {
        return currentCell.content;
    }

    /**
     * Changes the character in the current cell to the specified value.
     *
     * @param ch The character to set in the current cell.
     */
    public void setContent(char ch) {
        currentCell.content = ch;
    }

    /**
     * Moves the current cell one position to the left along the tape.
     * If there is no previous cell, a new cell is created and becomes the new current cell.
     */
    public void moveLeft() {
        if (currentCell.prev == null) {
            currentCell.prev = new Cell();
            currentCell.prev.content = '\0';
            currentCell.prev.prev = null;
            currentCell.prev.next = currentCell;
            currentCell = currentCell.prev;
            leftCell = currentCell;
        } else {
            currentCell = currentCell.prev;
        }
    }

    /**
     * Moves the current cell one position to the right along the tape.
     * If there is no next cell, a new cell is created and becomes the new current cell.
     */
    public void moveRight() {
        if (currentCell.next == null) {
            currentCell.next = new Cell();
            currentCell.next.content = '\0';
            currentCell.next.next = null;
            currentCell.next.prev = currentCell;
            currentCell = currentCell.next;
            rightCell = currentCell;
        } else {
            currentCell = currentCell.next;
        }
    }

    /**
     * Returns a string consisting of the characters from all the cells on the tape,
     * read from left to right, except that leading or trailing blank characters should be discarded.
     *
     * @return The contents of the tape as a string.
     */
    public String getTapeContents() {
        String s1 = "";

        Cell tmp = leftCell;
        while (tmp.next != null) {
            if (('a' <= tmp.content && tmp.content <= 'z') || ('A' <= tmp.content && tmp.content <= 'Z')) {
                s1 += tmp.content;
            }
            tmp = tmp.next;
        }
        return s1;
    }
}
