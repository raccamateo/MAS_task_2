// ExplorationBehaviour.java in the package eu.su.mas.dedaleEtu.mas.agents.dummies.behaviours
package eu.su.mas.dedaleEtu.mas.agents.dummies.behaviours;

import jade.core.behaviours.CyclicBehaviour;
import eu.su.mas.dedaleEtu.mas.agents.dummies.ExplorerAgent;

public class ExplorationBehaviour extends CyclicBehaviour {

    private ExplorerAgent myAgent;

    public ExplorationBehaviour(ExplorerAgent agent) {
        this.myAgent = agent;
    }

    @Override
    public void action() {
        // Simulate exploration
        System.out.println(myAgent.getLocalName() + " exploring...");

        // If the agent has completed the exploration
        if (/* condition to check if exploration is complete */) {
            myAgent.addBehaviour(new MapSharingBehaviour(myAgent));
            myAgent.removeBehaviour(this);
        }
    }
}
