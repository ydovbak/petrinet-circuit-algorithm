package petrinet;

import petrinet.gui.PetrinetGUI;
import petrinet.logic.Arc;
import petrinet.logic.Petrinet;
import petrinet.logic.Place;
import petrinet.logic.Transition;

public class Alternating {
    public static void main(String[] args) {
        Petrinet pn = new Petrinet("Alternating");
        Transition t1 = pn.transition("t1");
        Transition t2 = pn.transition("t2");
        Transition t3 = pn.transition("t3");
        Transition t4 = pn.transition("t4");

        Place p1 = pn.place("p1");
        Place p2 = pn.place("p2");
        Place p3 = pn.place("p3");
        Place p4 = pn.place("p4");

        Arc a1 = pn.arc("a1", p1, t2);
        Arc a2 = pn.arc("a2", t2, p2);
        Arc a3 = pn.arc("a2", p2, t3);
        Arc a4 = pn.arc("a2", p2, t4);

        Arc a2 = pn.arc("a2", t1, p2);
        Arc a3 = pn.arc("a3", p2, t2);
        Arc a4 = pn.arc("a4", t2, p1);
        System.out.println(pn);

        //PetrinetGUI.displayPetrinet(pn);
    }

}
