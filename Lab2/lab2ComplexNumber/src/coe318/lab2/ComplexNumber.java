package coe318.lab2;

/**
 * ComplexNumber models a complex number expressed in rectangular form (real and
 * imaginary parts). It is an <em>immutable</em> object.
 *
 * @author Your Name
 */
public class ComplexNumber {
//Instance variable declarations
    double realVal;
    double imaginaryVal;
     

    /**
     * Construct a ComplexNumber given its real and imaginary parts.
     *
     * @param re The real component
     * @param im The imaginary component
     */
    public ComplexNumber(double re, double im) {
//Initialize the instance variables
     realVal = re;
     imaginaryVal = im;
     
    }

    /**
     * Returns the real component.
     *
     * @return the real
     */
    public double getReal() {
        return (realVal);	//fixed
    }

    /**
     * Returns the imaginary component.
     *
     * @return the imaginary
     */
    public double getImaginary() {
        return (imaginaryVal);	//A stub: fixed
    }

    /**
     * Returns a new ComplexNumber number that is the negative of <em>this</em>.
     * Note: the original ComplexNumber is <b>NOT</b>
     * modified.
     *
     * @return -this
     */
    public ComplexNumber negate() {
        
        ComplexNumber negateVal = new ComplexNumber(-realVal, -imaginaryVal);
        
       return negateVal; //A stub: fixed

    }

    /**
     * Returns a new ComplexNumber that is the sum of <em>this</em>	and
     * <em>z</em>. Note: the	original ComplexNumber is
     * <b>NOT</b> modified.
     *
     * @param z
     * @return this + z
     */
    public ComplexNumber add(ComplexNumber z) {
        
        ComplexNumber addVal = new ComplexNumber((realVal+z.realVal),(imaginaryVal+z.imaginaryVal));
        
        return addVal;	//A stub: fixed
        ////The “.” operator can access specific variables/methods of an object
    }

    /**
     * Returns a new ComplexNumber that is the difference of <em>this</em>	and
     * <em>z</em>. Note: the	original ComplexNumber is
     * <b>NOT</b> modified.
     *
     * @param z
     * @return this + z
     */
    public ComplexNumber subtract(ComplexNumber z) {
        
        ComplexNumber subtractVal = new ComplexNumber((realVal-z.realVal),(imaginaryVal-z.imaginaryVal));
        
        return subtractVal;	//A stub: to be fixed
        //The “.” operator can access specific variables/methods of an object
    }

    /**
     * Returns a new ComplexNumber that is the product of <em>this</em> and
     * <em>z</em>. Note: the original ComplexNumber is
     * <b>NOT</b> modified.
     *
     * @param z
     * @return this * z
     */
    public ComplexNumber multiply(ComplexNumber z) {
        
        ComplexNumber multiplyVal = new ComplexNumber((realVal*z.realVal-imaginaryVal*z.imaginaryVal),(imaginaryVal*z.realVal+realVal*z.imaginaryVal)); 
        return multiplyVal;	//A stub: to be fixed
    }

    /**
     * Returns a new ComplexNumber that is the reciprocal of <em>this</em>.
     * Note: the original ComplexNumber is
     * <b>NOT</b> modified.
     *
     * @return 1.0 / this
     */
    public ComplexNumber reciprocal() {
        
        ComplexNumber reciprocalVal = new ComplexNumber((realVal/(realVal*realVal + imaginaryVal*imaginaryVal)),(-imaginaryVal/(realVal*realVal + imaginaryVal*imaginaryVal)));
        
        return reciprocalVal; //A stub: to be fixed
        
    }

    /**
     * Returns a new ComplexNumber that is
     * <em>this</em> divided by <em>z</em>. Note: the original ComplexNumber is
     * <b>NOT</b> modified.
     *
     * @param z
     * @return this / z
     */
    public ComplexNumber divide(ComplexNumber z) {
      
      double s = z.realVal;
      double t = z.imaginaryVal;
      
     ComplexNumber divideVal = new ComplexNumber(
              ((realVal*s + imaginaryVal*t)/(s*s + t*t)),
              ((imaginaryVal*s - realVal*t)/(s*s + t*t)));
      
      return divideVal;  //A stub: to be fixed
    }

    /**
     * Returns a String representation of
     * <em>this</em> in the format:
     * <pre>
     *	real +-(optional) i imaginary
     * </pre> If the imaginary part is zero, only the real part is converted to
     * a String. A "+" or "-" is placed between the real and imaginary parts
     * depending on the the sign of the imagrinary part.
     * <p>
     * Examples:
     * <pre>
     *	..println(new ComplexNumber(0,0); -> "0.0"
     *	..println(new ComplexNumber(1,1); -> "1.0 + i1.0"
     *	..println(new ComplexNumber(1,-1); -> "1.0 - i1.0"
     * </pre>
     *
     * @return the String representation.
     */
    @Override
    public String toString() {
//DO NOT MODIFY THIS CODE!
        String str = "" + this.getReal();
        if (this.getImaginary() == 0.0) {
            return str;
        }
        if (this.getImaginary() > 0) {
            return str + " + i" + this.getImaginary();
        } else {
            return str + " - i" + -this.getImaginary();
        }
    }
}

