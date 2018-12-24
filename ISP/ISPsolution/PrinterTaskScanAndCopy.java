/**
 * Only some printers can scan and copy, but if they can scan, they can also always make
 * copies (and vice versa), so we can put both these functions in one interface.
 */

package be.ucll.ooo.solid;

public interface PrinterTaskScanAndCopy {
    public boolean scanContent(String content);
    public boolean photoCopyContent(String content);
}
