package eu.su.mas.dedaleEtu.mas.agents.dummies;

import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;

/**
 * The CollectorAgent's role is to collect treasures based on information received.
 */
public class CollectorAgent extends Agent {

    protected void setup() {
        System.out.println(getLocalName() + "--> Started");

        // Add collecting behaviour
        addBehaviour(new CollectingBehaviour(this));
    }

    private class CollectingBehaviour extends OneShotBehaviour {
        public CollectingBehaviour(Agent a) {
            super(a);
        }

        public void action() {
            // Dedale API
        }
    }
}
