/**
 * This example is actually based on a true story which happened at Xerox.
 * As you probably know Xerox Corporation manufactures printer systems. In their development process of
 * new systems Xerox had created a new printer system that could perform a variety of tasks such
 * as stapling and faxing along with the regular printing task.
 * The software for this system was created from the ground up. As the software grew for Xerox, making
 * modifications became more and more difficult so that even the smallest change would take a redeployment
 * cycle of an hour, which made development nearly impossible.
 * The design problem was that a single Job class was used by almost all of the tasks.
 * Whenever a print job or a stapling job needed to be performed, a call was made to the Job class.
 * This resulted in a 'fat' class with multitudes of methods specific to a variety of different clients.
 * Because of this design, a staple job would know about all the methods of the print job, even though there
 * was no use for them. Second part of this problem: what if there is a new machine, that can perform a new task?
 *
 * To overcome this problem Robert C. Martin suggested a solution which is called the Interface Segregation Principle.
 * Which means, Instead of one fat interface many small interfaces are preferred
 * based on groups of methods with each one serving one submodule.
 *
 * This example is the wrong way to do this, with one 'fat' interface.
 */

package be.ucll.ooo.solid;

public class Main {

    public static void main(String[] args) {
        ExpensiveOfficePrinter expensiveOfficePrinter = new ExpensiveOfficePrinter();
        CheapHomePrinter cheapHomePrinter = new CheapHomePrinter();

        // Use the functions of the printer and print out if the task was successfully completed.
        System.out.println("Using the expensive machine:");
        System.out.println("Succes: " + expensiveOfficePrinter.printContent("Very important message (VIM)!"));
        System.out.println("Succes: " + expensiveOfficePrinter.scanContent("Very important message (VIM)!"));
        System.out.println("Succes: " + expensiveOfficePrinter.photoCopyContent("Very important message (VIM)!"));
        System.out.println("Succes: " + expensiveOfficePrinter.faxContent("Very important message (VIM)!"));

        System.out.println("");

        // Use the functions of the printer and print out if the task was successfully completed.
        System.out.println("Using the inexpensive machine:");
        System.out.println("Succes: " + cheapHomePrinter.printContent("Very important message (VIM)!"));
        System.out.println("Succes: " + cheapHomePrinter.scanContent("Very important message (VIM)!"));
        // This is a useless functioncall, but you can still do it since it had to be implemented,
        // it just doesn't do anything.
        System.out.println("Succes: " + cheapHomePrinter.photoCopyContent("Very important message (VIM)!"));
        // This is a useless functioncall, but you can still do it since it had to be implemented,
        // it just doesn't do anything.
        System.out.println("Succes: " + cheapHomePrinter.faxContent("Very important message (VIM)!"));
    }
}
