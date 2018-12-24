/**
 * This is an expensive office printer that can print, scan, copy and fax.
 * So it implements all those PrinterTask interfaces.
 * Notice that it can't print in duplex!
 */

package be.ucll.ooo.solid;

// This machine can print, scan, copy and fax, so we implement all those interfaces.
// It can not print in duplex though, so that interface does not get implemented!
public class ExpensiveOfficePrinter implements PrinterTaskPrint, PrinterTaskFax, PrinterTaskScanAndCopy {
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
    public boolean faxContent(String content) {
        System.out.println("Content faxed.");
        return true;
    }

    @Override
    public boolean photoCopyContent(String content) {
        System.out.println("Content copied.");
        return true;
    }
}
