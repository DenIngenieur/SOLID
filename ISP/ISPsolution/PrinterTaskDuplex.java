/**
 * Only some printers can print in duplex mode, so this function gets an interface by itself.
 *
 * None of the current printers we have can do this, but if we get a new machine that has this
 * capability, we can easily implement it, without disrupting older code.
 */

package be.ucll.ooo.solid;

public interface PrinterTaskDuplex {
    public boolean printDuplexContent(String content);
}
