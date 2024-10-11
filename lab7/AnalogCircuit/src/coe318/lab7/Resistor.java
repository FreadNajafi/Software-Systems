package coe318.lab7;
 
public class Resistor extends Components{
    private static int numRes = 1;
    private int identity;
    
     /**
     * @param resistance
     * @param node1
     * @param node2
      */
    public Resistor(double resistance, int node1, int node2){
        if (resistance<0){
            throw new IllegalArgumentException("Resistance can't be negative");
        }
        else if (resistance==0){
            throw new IllegalArgumentException("Resistance can't be zero");
        }
        else if (node1<0){
            throw new IllegalArgumentException("The first node can't be negative");
        }
        else if (node2<0){
            throw new IllegalArgumentException("The second node can't be negative");
        }
        else{      
            this.a = node1;
            this.b = node2;
            this.value = resistance;
            this.identity = numRes;
            numRes ++;
        }
    }
    
    @Override
    public String toString() {
        String s = "R" + this.identity + " " + this.a + " " + this.b + " " + this.value;
        return s;
    }
}