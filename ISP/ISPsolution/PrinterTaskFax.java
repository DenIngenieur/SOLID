/**
 * Only some printers can also fax, so this function gets an interface by itself.
 */

package be.ucll.ooo.solid;

public interface PrinterTaskFax {
    public boolean faxContent(String content);
}
