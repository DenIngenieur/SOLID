/**
 * All printers can at least print and scan, so we can put this together in one interface.
 */

package be.ucll.ooo.solid;

public interface PrinterTaskBasic {
    public boolean printContent(String content);
    public boolean scanContent(String content);
}
