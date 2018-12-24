/**
 * This inexpensive home printer inplements the PrinterTasks interface
 * but can not provide all the tasks defined in the interface.
 * It can only print and scan, not copy or fax.
 * Still, since we implement the PrinterTasks interface, we have to implement all
 * the methods, including copying and faxing, even if this machine can't
 * perform these tasks. This is obviously not a good design.
 */

package be.ucll.ooo.solid;

public class CheapHomePrinter implements PrinterTasks {
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

    // Pretty useless method, but it still has to be implemented,
    // even if the hardware can't do this.
    @Override
    public boolean faxContent(String content) {
        System.out.println("Function not possible!");
        return false;
    }

    // Pretty useless method, but it still has to be implemented,
    // even if the hardware can't do this.
    @Override
    public boolean photoCopyContent(String content) {
        System.out.println("Function not possible!");
        return false;
    }
}
