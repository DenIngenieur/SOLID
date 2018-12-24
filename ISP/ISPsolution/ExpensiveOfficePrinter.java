/**
 * This expensive office printer inplements the PrinterTasks interface
 * and can provide all the tasks.
 * It can print, scan, copy and fax.
 * So it implements all 4 PrinterTask interfaces.
 */

package be.ucll.ooo.solid;

// machine can print and scan (= basic functions), but also fax and copy, so implement all those interfaces
public class ExpensiveOfficePrinter implements PrinterTaskBasic, PrinterTaskFax, PrinterTaskCopy {
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
