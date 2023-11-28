// ExplorerAgent.java in the path src/main/java/eu/su/mas/dedaleEtu/mas/agents/dummies/
package eu.su.mas.dedaleEtu.mas.agents.dummies;

import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;

public class ExplorerAgent extends Agent {

	protected void setup() {
		System.out.println(getLocalName() + " started.");
		addBehaviour(new ExplorationBehaviour());
	}

	private class ExplorationBehaviour extends CyclicBehaviour {
		@Override
		public void action() {
			// Exploration logic to be completly defined
			System.out.println(getLocalName() + " is exploring...");
			// After exploration, share data with other agents
			ACLMessage msg = new ACLMessage(ACLMessage.INFORM);
			msg.setContent("map data");
			send(msg);
		}
	}
}
