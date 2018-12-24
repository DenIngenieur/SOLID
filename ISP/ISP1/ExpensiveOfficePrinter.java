/**
 * This expensive office printer inplements the PrinterTasks interface
 * and can provide all the tasks.
 * It can print, scan, copy and fax.
 * So no problem here.
 */

package be.ucll.ooo.solid;

public class ExpensiveOfficePrinter implements PrinterTasks {
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
