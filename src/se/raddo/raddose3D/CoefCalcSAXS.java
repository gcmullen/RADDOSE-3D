package se.raddo.raddose3D;

import java.util.ArrayList;
import java.util.List;

public class CoefCalcSAXS extends CoefCalcFromParams {
  /**
   * Default unit cell dimension.
   */
  private static final double UNIT_CELL_LENGTH                    = 1000;

  /**
   * Average molecular mass of an amino acid (daltons = grams/mole).
   */
  private static final double AVG_RESIDUE_MASS                    = 110;

  /**
   * Average molecular mass of a ribonucleotide monophosphate molecule (daltons
   * = grams/mole)
   */
  private static final double AVG_RNA_MASS                        = 339.5;

  /**
   * Average molecular mass of a deoxynucleotide monophosphate molecule (daltons
   * = grams/mole)
   */
  private static final double AVG_DNA_MASS                        = 327.0;
  
  /**
   * Average weight of a carbohydrate residue.
   */
  protected static final double      AVG_CARB_MASS          = 180.0;

  /**
   * Conversion factor to convert Angstroms^3 to litres.
   */
  private static final double ANGSTROM_TO_LITRE_VOLUME_CONVERSION = 1e-27;

  /**
   * Compute results and put them in local variables absCoeff, attCoeff,
   * elasCoeff and density.
   *
   * @param cellA cell dimension a
   * @param cellB cell dimension b
   * @param cellC cell dimension c
   * @param cellAlpha cell angle alpha
   * @param cellBeta cell angle beta
   * @param cellGamma cell angle gamma
   * @param numResidues number of amino acids
   * @param numRNA number of RNA residues
   * @param numDNA number of DNA residues
   * @param heavyProteinAtomNames heavy atom protein element symbols
   * @param heavyProteinAtomNums heavy atom protein occurrences
   * @param heavySolutionConcNames heavy atom solvent element symbols
   * @param heavySolutionConcNums heavy atom solvent concentrations in mM.
   * @param solventFraction solvent fraction
   * @param proteinConc protein concentration in grams per litre
   */
  public CoefCalcSAXS(final Double cellA, final Double cellB,
      final Double cellC,
      final Double cellAlpha, final Double cellBeta, final Double cellGamma,
      final int numResidues, final int numRNA,
      final int numDNA,
      final List<String> heavyProteinAtomNames,
      final List<Double> heavyProteinAtomNums,
      final List<String> heavySolutionConcNames,
      final List<Double> heavySolutionConcNums,
      final Double solventFraction,
      final Double proteinConc,
      final int numCarb) {

    /*
     * Create local variables for the unit cell parameters.
     * These don't have to be given in the input file for this module.
     * If these values are null then give suitable defaults.
     */
    Double a = cellA;
    Double b = cellB;
    Double c = cellC;
    Double alpha = cellAlpha;
    Double beta = cellBeta;
    Double gamma = cellGamma;

    if (alpha == null) {
      alpha = RIGHT_ANGLE;
    }
    if (beta == null) {
      beta = RIGHT_ANGLE;
    }
    if (gamma == null) {
      gamma = RIGHT_ANGLE;
    }
    if (a == null) {
      a = UNIT_CELL_LENGTH;
    }
    if (b == null) {
      b = UNIT_CELL_LENGTH;
    }
    if (c == null) {
      c = UNIT_CELL_LENGTH;
    }

    //Set local variable solvent fraction to minus 1
    Double sf = -1.0;

    //If actual solvent fraction is given then set the local variable
    //sf equal to the actual solvent fraction
    if (solventFraction != null) {
      sf = solventFraction;
    }

    //Calculate the Unit Cell Volume
    //This method exists in CoefCalcCompute Class
    double unitCellVolume = cellVolume(a, b, c, alpha, beta, gamma);

    //Calculate the number of monomers
    int numMonomers = calculateNumMonomers(numResidues, numRNA, numDNA,
        proteinConc, unitCellVolume, numCarb);
    
    //Add these here as not passing in the surrounding cryo-solution into SAXS
    List<String> emptyAtoms = new ArrayList<String>();
    List<Double> emptyNumbers = new ArrayList<Double>();

    calculateAtomOccurrences(numMonomers, numResidues, numRNA, numDNA,
        sf, heavyProteinAtomNames, heavyProteinAtomNums,
        heavySolutionConcNames, heavySolutionConcNums, emptyAtoms, emptyNumbers, null, null, numCarb, emptyAtoms, emptyNumbers, 0.);
    
    super.calculateDensity();
  }

  /**
   * Method that calculates the number of protein molecules in a given volume
   * in a solution for a SAXS experiment.
   *
   * @param numberOfResidues Number of residues per molecule unit (monomer)
   * @param proteinConcentration Concentration of the protein in the SAXS
   *          experiment
   * @param volumeAngstromsCubed Given volume considered for calculation
   * @return Number of monomers of the molecule in the given volume
   */
  private int calculateNumMonomers(final int numberOfResidues,
      final int numberOfDNAResidues, final int numberOfRNAResidues,
      final double proteinConcentration, final double volumeAngstromsCubed, final int numCarbResidues) {

    //Calculate molarity of solution as concentration divided by the total
    //molecular mass.
    double molarity = proteinConcentration
        / (AVG_RESIDUE_MASS * numberOfResidues
            + AVG_DNA_MASS * numberOfDNAResidues
            + AVG_RNA_MASS * numberOfRNAResidues
            + AVG_CARB_MASS * numCarbResidues);

    // Calculate volume in litres
    double volumeLitres = ANGSTROM_TO_LITRE_VOLUME_CONVERSION
        * volumeAngstromsCubed;

    //Calculate the number of monomers
    double numOfMon = Math.round(molarity * volumeLitres * AVOGADRO_NUM);

    //Check that the number of molecules is not smaller than 1.
    if (numOfMon < 1) {
      System.out.println("");
      System.out.println("*************** WARNING ***************");
      System.out
          .println("The number of monomers calculated to be in the unit cell"
              + " volume given is less than 1");
      System.out
          .println("You should manually increase the unit cell dimensions in the"
              + " input file.");
      System.out.println("");
      //Set number of monomers in the cell volume to 1
      numOfMon = 1;
    }

    //Cast the result to an integer
    int numOfMonomers = (int) (numOfMon);

    System.out.println("Calculated number of monomers in cell volume: "
        + numOfMonomers);

    //return the result i.e. the number of monomers in the given volume.
    return numOfMonomers;
  }

}
