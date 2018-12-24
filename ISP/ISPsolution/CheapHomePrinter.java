/**
 * This inexpensive home printer inplements the PrinterTasks interface
 * but can not provide all the tasks defined in the interface.
 * It can only print and scan, not copy or fax.
 * So, it only implements those PrinterTask interfaces it can really use.
 */

package be.ucll.ooo.solid;

// machine can only print and scan, so only implement those interfaces
public class CheapHomePrinter implements PrinterTaskBasic {
    @Override
    public boolean printContent(String content) {
        System.out.println("Content printed.");
        return true;
    }

    @Override
    public boolean scanContent(String content) {
        System.out.println("Content scanned.");
        return true;
    }
}
