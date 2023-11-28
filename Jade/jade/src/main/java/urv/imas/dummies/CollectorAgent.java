// CollectorAgent.java in the path src/main/java/eu/su/mas/dedaleEtu/mas/agents/dummies/
package eu.su.mas.dedaleEtu.mas.agents.dummies;

import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.MessageTemplate;

public class CollectorAgent extends Agent {

	protected void setup() {
		System.out.println(getLocalName() + " started.");
		addBehaviour(new CollectingBehaviour());
	}

	private class CollectingBehaviour extends CyclicBehaviour {
		@Override
		public void action() {
			MessageTemplate mt = MessageTemplate.MatchPerformative(ACLMessage.INFORM);
			ACLMessage msg = receive(mt);
			if (msg != null) {
				// Collecting logic here
				System.out.println(getLocalName() + " is collecting treasures based on received data.");
			} else {
				block();
			}
		}
	}
}
