Comments
Source code can be commented to clarify it or to add notes. There are two ways to do this.

Single-line comments are marked with two slashes //. Everything following them on the same line is interpreted as a comment.

Multi-line comments are marked with a slash and an asterisk /*, and closed with an asterisk followed by a slash */. Everything between them is interpreted as a comment.

Below is an example of a program where both are used.

  public class Comments {
    public static void main(String[] args) {
        // Printing
        System.out.println("Text to print");
        System.out.println("More text to print!");
        /* Next:
        - more on printing
        - more practice
        - variables
        - ...
        */
        System.out.println("Some other text to print");
        // System.out.println("Trying stuff out")
    }
}
