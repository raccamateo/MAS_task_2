// MapSharingBehaviour.java in the package eu.su.mas.dedaleEtu.mas.agents.dummies.behaviours
package eu.su.mas.dedaleEtu.mas.agents.dummies.behaviours;

import jade.core.behaviours.OneShotBehaviour;
import jade.lang.acl.ACLMessage;
import eu.su.mas.dedaleEtu.mas.agents.dummies.ExplorerAgent;

public class MapSharingBehaviour extends OneShotBehaviour {

  private ExplorerAgent myAgent;

  public MapSharingBehaviour(ExplorerAgent agent) {
    this.myAgent = agent;
  }

  @Override
  public void action() {
    ACLMessage msg = new ACLMessage(ACLMessage.INFORM);
    msg.setContent("map data");
    // Add other explorer agents as receivers
    // msg.addReceiver(new AID("AnotherExplorer", AID.ISLOCALNAME));
    myAgent.send(msg);
    System.out.println(myAgent.getLocalName() + " sharing map...");
  }
}
