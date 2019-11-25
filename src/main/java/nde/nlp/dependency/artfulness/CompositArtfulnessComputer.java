package nde.nlp.dependency.artfulness;

import nde.nlp.dependency.DependencySequence;
import java.util.ArrayList;

/**
 *
 * @author donkarlo
 */
public class CompositArtfulnessComputer extends ArtfullnessComputer implements ArtfulnessComputerInterface {

    private ArrayList<ArtfulnessComputerInterface> artfullnessComputers;

    /**
     *
     * @param artfullnessComputers
     */
    public CompositArtfulnessComputer(ArrayList<ArtfulnessComputerInterface> artfullnessComputers) {
        super(null);
        this.artfullnessComputers = artfullnessComputers;
    }

    /**
     *
     * @return
     */
    @Override
    public double getArtfulnessValue() {
        double totalArtfulnessValue = 0;
        for (ArtfulnessComputerInterface ac : this.artfullnessComputers) {
            totalArtfulnessValue += ac.getArtfulnessValue();
        }
        return totalArtfulnessValue;
    }

    /**
     *
     * @param artfulnessComputer
     */
    public void addArtfulnessComputer(ArtfulnessComputerInterface artfulnessComputer) {
        artfullnessComputers.add(artfulnessComputer);
    }

}
