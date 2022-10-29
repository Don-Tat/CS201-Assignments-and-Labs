import java.util.*;

public class ArrowDemo {
    public static void main(String[] args) {
        int tail, width;
        Character choice = 0;
        Scanner keyboard = new Scanner(System.in);
        Scanner check = new Scanner(System.in);
        while (choice != 's') {
            // Opening display
            System.out.println(
                    "\nSelect left or right arrow or stop\nEnter L for left\nEnter R for right\nEnter S to stop program\nSelect:");
            // Declare objects
            RightArrow r = new RightArrow(0, 0, 0);
            LeftArrow l = new LeftArrow(0, 0, 0);
            choice = check.next().charAt(0);
            choice = Character.toLowerCase(choice);
            if (choice == 'l') {
                System.out.print("Enter length of arrow:");
                tail = keyboard.nextInt();
                System.out.print("Enter width of arrow, must be odd:");
                width = keyboard.nextInt();
                if (width % 2 == 0)
                    System.out.println("Width is even, arrow cannot be drawn");
                else {
                    l.set(tail, width);
                    l.drawHere();
                }
            } else if (choice == 'r') {
                System.out.print("Enter length of Arrow:");
                tail = keyboard.nextInt();
                System.out.print("Enter width of Arrow:");
                width = keyboard.nextInt();
                if (width % 2 == 0)
                    System.out.println("Wrong Choices of width");
                else {
                    r.set(tail, width);
                    r.drawHere();
                }
            } else if (choice == 's') {
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }
        keyboard.close();
        check.close();
    }
}

class RightArrow extends ShapeBase {
    private int tail;
    private int width;

    RightArrow() {
        super();
        tail = 0;
        width = 0;
    }

    RightArrow(int theOffset, int tailSize, int theWidth) {
        super(theOffset);
        tail = tailSize;
        width = theWidth;
    }

    void set(int newHeight, int newWidth) {
        tail = newHeight;
        width = newWidth;
    }

    public void drawHere() {
        topArrowHead();
        ArrowTail();
        bottomArrowHead();
    }

    void topArrowHead() {
        skipSpaces(tail);
        System.out.println("*");
        for (int i = 1; i < width / 2; i++) {
            skipSpaces(tail);
            System.out.print("*");
            skipSpaces(2 * i - 1);
            System.out.println("*");
        }
    }

    void ArrowTail() {
        for (int i = 0; i < tail; i++)
            System.out.print("*");
        System.out.print("*");
        skipSpaces(width / 2 + 2);
        System.out.println("*");
    }

    void bottomArrowHead() {
        for (int i = width / 2 - 1; i > 0; i--) {
            skipSpaces(tail);
            System.out.print("*");
            skipSpaces(2 * i - 1);
            System.out.println("*");
        }
        skipSpaces(tail);
        System.out.print("*");
    }

    private static void skipSpaces(int number) {
        for (int count = 0; count < number; count++)
            System.out.print(" ");
    }
}

class LeftArrow extends ShapeBase {
    private int tail;
    private int width;

    LeftArrow() {
        super();
        tail = 0;
        width = 0;
    }

    LeftArrow(int theOffset, int tailSize, int theWidth) {
        super(theOffset);
        tail = tailSize;
        width = theWidth;
    }

    void set(int newHeight, int newWidth) {
        tail = newHeight;
        width = newWidth;
    }

    public void drawHere() {
        topArrowHead();
        ArrowTail();
        bottomArrowHead();
    }

    void topArrowHead() {
        skipSpaces(width / 2 + 3);
        System.out.println("*");
        for (int i = 1; i < width / 2; i++) {
            skipSpaces(width / 2 + 3 - 2 * i);
            System.out.print("*");
            skipSpaces(2 * i - 1);
            System.out.println("*");
        }
    }

    void ArrowTail() {
        System.out.print("*");
        skipSpaces(width / 2 + 2);
        System.out.print("*");
        for (int i = 0; i < tail; i++)
            System.out.print("*");
        System.out.println();
    }

    void bottomArrowHead() {
        for (int i = 0; i < width / 2 - 1; i++) {
            skipSpaces(2 * i + 2);
            System.out.print("*");
            skipSpaces(width / 2 - 2 * i);
            System.out.println("*");
        }
        skipSpaces(width / 2 + 3);
        System.out.print("*");
    }

    private static void skipSpaces(int number) {
        for (int count = 0; count < number; count++)
            System.out.print(" ");
    }
}

abstract class ShapeBase implements ShapeInterface {
    private int offset;

    ShapeBase() {
        offset = 0;
    }

    ShapeBase(int theOffset) {
        offset = theOffset;
    }

    public abstract void drawHere();

    public void drawAt(int lineNumber) {
        for (int count = 0; count < lineNumber; count++)
            System.out.println();
    }

    public void setOffset(int newOffset) {
        offset = newOffset;
    }

    public int getOffset() {
        return offset;
    }
}

interface ShapeInterface {

    public void setOffset(int newOffset);

    public int getOffset();

    public void drawAt(int lineNumber);

    public void drawHere();
}