/**
 * This is a new interface, that extracted the bonus calculation
 * method out of the old Employee class.
 */

package be.ucll.ooo.solid;

public interface CalculateBonusInterface {
    public double calculateBonus(double salary);
}
