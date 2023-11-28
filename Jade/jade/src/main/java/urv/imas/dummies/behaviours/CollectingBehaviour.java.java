// CollectingBehaviour.java in the package eu.su.mas.dedaleEtu.mas.agents.dummies.behaviours
package eu.su.mas.dedaleEtu.mas.agents.dummies.behaviours;

import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.MessageTemplate;
import eu.su.mas.dedaleEtu.mas.agents.dummies.CollectorAgent;

/**
 * This behaviour allows the CollectorAgent to collect treasures.
 */
public class CollectingBehaviour extends CyclicBehaviour {

  private CollectorAgent myAgent;

  public CollectingBehaviour(CollectorAgent agent) {
    super(agent);
    this.myAgent = agent;
  }

  @Override
  public void action() {
    // Listening for messages from ExplorerAgents with shared map data
    MessageTemplate mt = MessageTemplate.MatchPerformative(ACLMessage.INFORM);
    ACLMessage msg = myAgent.receive(mt);
    if (msg != null) {
      // Simulate collecting logic based on received map data
      System.out.println(myAgent.getLocalName() + " received map data and is attempting to collect treasure.");

      // Here I would add logic to move towards and collect treasure
      // For now, let's simulate the action of collecting
      boolean successfulCollection = Math.random() > 0.5; // Randomly simulate collection success

      if (successfulCollection) {
        System.out.println(myAgent.getLocalName() + " has successfully collected a treasure.");
      } else {
        System.out.println(myAgent.getLocalName() + " failed to collect a treasure.");
      }
    } else {
      block();
    }
  }
}
