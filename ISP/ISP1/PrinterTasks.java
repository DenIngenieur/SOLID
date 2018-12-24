/**
 * This interface implements all the functions a printer can possibly do.
 * Since not all printers can perform all these functions, this is not the
 * best way to do this.
 * Additionally, if we have a new printer with yet another functionality, we
 * are forced to implement this in all the classes that implement this interface.
 */

package be.ucll.ooo.solid;

public interface PrinterTasks {
    public boolean printContent(String content);
    public boolean scanContent(String content);
    public boolean faxContent(String content);
    public boolean photoCopyContent(String content);

    /*
    Imagine later on, a new machine is build that can print on both sides of a sheet.
    We will now be forced to implent this method everywhere, even if the older machines
    have no way to actually duplex print. Very annoying, and the second part of the
    problem we created by having one 'fat' interface.
    */
    // Possible new method, not foreseen in original design:
    //public boolean printDuplexContent(String content);
}
