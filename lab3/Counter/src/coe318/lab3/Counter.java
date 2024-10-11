/**
 *
 * @author Ahmad
 */
package coe318.lab3;
public class Counter {
    //Instance variables here
    int modulusV, digit;
    Counter leftV;
    
    public Counter(int modulus, Counter left) {
        
        this.modulusV = modulus;
        this.leftV = left;
        digit = 0; 
        
        
    }


    /**
     * @return the modulus
     */
    public int getModulus() {
        return this.modulusV;
    }

    /**
     * Returns the Counter to the left attached to this
     * Counter.  Returns null if there is no Counter
     * to the left.
     * @return the left
     */
    public Counter getLeft() {
        return this.leftV;
    }

    /**
     * @return the digit
     */
    public int getDigit() {
        return digit;
    }

    /**
     * @param digit the digit to set
     */
    public void setDigit(int digit) {
        this.digit = getDigit();
    }

    /**
     * Increment this counter.  If it rolls over,
     * its left Counter is also incremented if it
     * exists.
     */
    public void increment() {
         digit++;
        if(digit == modulusV){
            digit = 0;
            if(this.leftV != null){
                this.leftV.digit++;
    }
        }    
    }

    /** Return the count of this Counter combined
     * with any Counter to its left.
     *
     * @return the count
     */
    public int getCount() {
        
        if(this.leftV != null){
            return(digit + modulusV*leftV.digit);
        }else {
            return(digit);
        }
    }


    /** Returns a String representation of the Counter's
     * total count (including its left neighbour).
     * @return the String representation
     */
    @Override
    public String toString() {
        //DO NOT MODIFY THIS CODE
        return "" + getCount();
    }

}
