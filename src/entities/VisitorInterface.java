package entities;

import java.util.List;
import java.util.Map;


public interface VisitorInterface {
    /**
     * "Visits" the simulation and creates the output
     * @param simulation where the data is stored
     * @param array output array
     */
    void visit(Simulation simulation, List<Map<String, Object>> array);
}
