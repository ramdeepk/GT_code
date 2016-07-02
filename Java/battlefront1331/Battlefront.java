import java.util.Scanner;
/**
 * This class will run the simulation.
 * @author Krishna Ramdeep
 * @version 1.0
 */
public class Battlefront {
    /**
     * The running of the simulation.
     * @param args Unused for this assignment.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter the number of Rebel"
            + " Soldiers you'd like to have:");
        int numRebels = kb.nextInt();
        System.out.println("Please enter the number of Jedi"
            + " Knights you'd like to have:");
        int numJedi = kb.nextInt();
        System.out.println("Please enter the number of Stormtroopers"
            + " you'd like to have:");
        int numStorm = kb.nextInt();
        System.out.println("Please enter the number of Sith"
            + " Lords you'd like to have:");
        int numSith = kb.nextInt();
        Simulation sim = new Simulation(numRebels, numJedi, numStorm,
            numSith, new Rebel(70.0, 30.0, 30.0, "CS-01"),
            new Trooper(75.0, 65.0, 50.0, "AK-47"));
        boolean simOver = true;
        do {
            System.out.println("Press enter to continue the simulation.");
            String placeHolder = kb.nextLine();
            simOver = sim.simulateSkirmish(true);
        } while (simOver);
        if (sim.getNumEmpireRemaining() == 0) {
            System.out.println("Simulation Complete!\nThe Rebels won!");
            System.out.println(sim.getNumRebelsRemaining() + " of "
                + numRebels + " Rebel Soldiers remain!");
            System.out.println(sim.getNumJediRemaining() + " of "
                + numJedi + " Jedi remain!");
            System.out.println(sim.getNumTroopersRemaining() + " of "
                + numStorm + " Stormtroopers remain!");
            System.out.println(sim.getNumSithRemaining() + " of "
                + numSith + " Sith remain!");
        } else if (sim.getNumRebellionRemaining() == 0) {
            System.out.println("Simulation Complete!\nThe Empire won!");
            System.out.println(sim.getNumRebelsRemaining() + " of "
                + numRebels + " Rebel Soldiers remain!");
            System.out.println(sim.getNumJediRemaining() + " of "
                + numJedi + " Jedi remain!");
            System.out.println(sim.getNumTroopersRemaining() + " of "
                + numStorm + " Stormtroopers remain!");
            System.out.println(sim.getNumSithRemaining() + " of "
                + numSith + " Sith remain!");
        } else {
            if (sim.getNumRebellionRemaining() > sim.getNumEmpireRemaining()) {
                System.out.println("Simulation Complete!"
                    + "\nThe Rebels routed the Empire!");
                System.out.println(sim.getNumRebelsRemaining() + " of "
                    + numRebels + " Rebel Soldiers remain!");
                System.out.println(sim.getNumJediRemaining() + " of "
                    + numJedi + " Jedi remain!");
                System.out.println(sim.getNumTroopersRemaining() + " of "
                    + numStorm + " Stormtroopers remain!");
                System.out.println(sim.getNumSithRemaining() + " of "
                    + numSith + " Sith remain!");
            } else if (sim.getNumEmpireRemaining()
                > sim.getNumRebellionRemaining()) {
                System.out.println("Simulation Complete!"
                    + "\nThe Empire routed the Rebels!");
                System.out.println(sim.getNumRebelsRemaining() + " of "
                    + numRebels + " Rebel Soldiers remain!");
                System.out.println(sim.getNumJediRemaining() + " of "
                    + numJedi + " Jedi remain!");
                System.out.println(sim.getNumTroopersRemaining() + " of "
                    + numStorm + " Stormtroopers remain!");
                System.out.println(sim.getNumSithRemaining() + " of "
                    + numSith + " Sith remain!");
            } else {
                System.out.println("Simulation Complete!"
                    + "\nThe battle was drawn!");
                System.out.println(sim.getNumRebelsRemaining() + " of "
                    + numRebels + " Rebel Soldiers remain!");
                System.out.println(sim.getNumJediRemaining() + " of "
                    + numJedi + " Jedi remain!");
                System.out.println(sim.getNumTroopersRemaining() + " of "
                    + numStorm + " Stormtroopers remain!");
                System.out.println(sim.getNumSithRemaining() + " of "
                    + numSith + " Sith remain!");
            }
        }
    }
}