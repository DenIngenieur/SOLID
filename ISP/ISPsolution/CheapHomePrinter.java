/**
 * This is an inexpensive home printer.
 * It can only print, scan and copy, but not fax.
 * So, it only implements those PrinterTask interfaces it can really use.
 */

package be.ucll.ooo.solid;

// This machine can only print, scan and copy, so we only implement those interfaces.
public class CheapHomePrinter implements PrinterTaskPrint, PrinterTaskScanAndCopy {
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

    @Override
    public boolean photoCopyContent(String content) {
        System.out.println("Content copied.");
        return true;
    }
}
