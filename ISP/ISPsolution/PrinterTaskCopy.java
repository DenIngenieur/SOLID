/**
 * Only some printers can also copy, so this function gets an interface by itself.
 */

package be.ucll.ooo.solid;

public interface PrinterTaskCopy {
    public boolean photoCopyContent(String content);
}
