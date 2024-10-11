package coe318.lab7;
import java.util.Scanner;
import java.util.ArrayList;

 
public class UserMain {
    private static Scanner user = new Scanner(System.in);
    static private ArrayList <Components> circuit;
    
    public static void end (){
        System.out.println("All Done");
        System.exit(0);
    }
    
    public static void spice (){
        for(int i = 0; i < circuit.size(); i++) {
            System.out.println(circuit.get(i));
        }
    }
    
     /**
     * @param args
     */
    public static void main(String[] args) {
        String input;
        int numComp = 0;
        circuit = new ArrayList <Components> ();
        System.out.println("Program Start: \n");
                
        while(true){
            int max = 0;
            input=user.nextLine();
            int spice = 0;
            if (input.equalsIgnoreCase("end")){ 
                System.out.println();
                end();
            }
            else if (input.equalsIgnoreCase("spice")){
                spice = 1;
                System.out.println();
                spice();
            }
                        
            String[] ins = input.split("\\s");
            
            if (spice == 0){ 
                switch (ins[0].charAt(0)) {
                    case 'r', 'R' -> {
                        Resistor temp = new Resistor (Double.parseDouble(ins[3]),Integer.parseInt(ins[1]),Integer.parseInt(ins[2]));
                        circuit.add(temp);
                        numComp++;
                    }
                    case 'v', 'V' -> {
                        VoltageSource temp = new VoltageSource (Double.parseDouble(ins[3]),Integer.parseInt(ins[1]),Integer.parseInt(ins[2]));
                        circuit.add(temp);
                        numComp++;
                    }
                    default -> throw new IllegalArgumentException("Invalid Input");
                }
            }
                   
            if (circuit.get(circuit.size()-1).getNode1()>numComp){
                throw new IllegalArgumentException("Invalid Input: The order of nodes must be declared logically");
            }
        }
    }
}

