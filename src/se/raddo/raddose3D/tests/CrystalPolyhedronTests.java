package se.raddo.raddose3D.tests;

import java.util.HashMap;

import org.testng.annotations.Test;

import se.raddo.raddose3D.Crystal;
import se.raddo.raddose3D.CrystalCuboid;
import se.raddo.raddose3D.CrystalPolyhedron;
import se.raddo.raddose3D.Wedge;

public class CrystalPolyhedronTests {
  @Test
  public static void testFindDepthSimple()
  {
    double xdim = 60, ydim = 20, zdim = 40; // just like in the model file.
    
    Double resolution = 0.5d;
    String modelFile = "models/cuboid-30-20-10.obj";
    String modelType = "obj";
    
    HashMap<Object, Object> properties = new HashMap<Object, Object>();

    properties.put(Crystal.CRYSTAL_RESOLUTION, resolution);
    properties.put(Crystal.CRYSTAL_ANGLE_P, 0d);
    properties.put(Crystal.CRYSTAL_ANGLE_L, 0d);
    properties.put(CrystalPolyhedron.CRYSTAL_WIREFRAME_FILE, modelFile);
    properties.put(CrystalPolyhedron.CRYSTAL_WIREFRAME_TYPE, modelType);
    
    Crystal c = new CrystalPolyhedron(properties);

    Wedge w = new Wedge(0d, 0d, 0d, 100d, 0d, 0d, 0d, 0d, 0d, 0d, 0d);

    double[] crystCoords;
    // this coordinate is in voxel coordinates.
    // this translates to bottom left corner of the crystal
    // in crystCoords (-45, -37, -20)
    // and should therefore be first to intercept the beam and have
    // a depth of 0.
    // taking voxels which are definitely within the crystal (starting
    // from 1, 1, 1 to width - 1, height - 1, depth - 1)
    // due to rounding errors because I still don't know how
    // to deal with those. -- Helen
    
    for (int x = 1; x < xdim * resolution - 1; x++) {
      for (int y = 1; y < ydim * resolution - 1; y++) {
        for (int z = 1; z < zdim * resolution - 1; z++) {
          crystCoords = c.getCrystCoord(x, y, z);
          Assertion.equals(crystCoords[0], -(xdim / 2) + (x / resolution),
              "crystal coordinate x axis for voxel (" + x + ", " + y + ", " + z + ")", 0.01);
          Assertion.equals(crystCoords[1], -(ydim / 2) + (y / resolution),
              "crystal coordinate y axis for voxel (" + x + ", " + y + ", " + z + ")", 0.01);
          Assertion.equals(crystCoords[2], -(zdim / 2) + (z / resolution),
              "crystal coordinate z axis for voxel (" + x + ", " + y + ", " + z + ")", 0.01);
          
          c.setupDepthFinding(0, w);

          double depth = c.findDepth(crystCoords, 0, w);

          // Because the crystal has not been rotated,
          // the depth should just be z / resolution
          Assertion.equals(depth, z / resolution, "depth at z=" + z + " for crystCoord (" + crystCoords[0] + ", " + crystCoords[1] + ", " + crystCoords[2] + ")", 2.0);
        }
      }
    }
  }

  @Test
  public static void testFindDepthConcave()
  {
    double xdim = 30, ydim = 20, zdim = 10; // just like in the model file.
    
    Double resolution = 0.5d;
    String modelFile = "models/concave_cuboid-30-20-10.obj";
    String modelType = "obj";
    
    HashMap<Object, Object> properties = new HashMap<Object, Object>();

    properties.put(Crystal.CRYSTAL_RESOLUTION, resolution);
    properties.put(Crystal.CRYSTAL_ANGLE_P, 0d);
    properties.put(Crystal.CRYSTAL_ANGLE_L, 0d);
    properties.put(CrystalPolyhedron.CRYSTAL_WIREFRAME_FILE, modelFile);
    properties.put(CrystalPolyhedron.CRYSTAL_WIREFRAME_TYPE, modelType);
    
    Crystal c = new CrystalPolyhedron(properties);

    Wedge w = new Wedge(0d, 0d, 0d, 100d, 0d, 0d, 0d, 0d, 0d, 0d, 0d);

    // this is where the beam should be going through the thickest
    // part of the crystal
    double [] crystCoordThick = {3.5, -8.65, 29.9};
    
    // thinnest part of the crystal
    
    double [] crystCoordThin = {5, 6, 30.0};

    c.setupDepthFinding(0, w);

    double thickDepth = c.findDepth(crystCoordThick, 0, w);
    Assertion.equals(thickDepth, 60.0, "Thick part of crystal about 30 um", 1.0);
    
    double thinDepth = c.findDepth(crystCoordThin, 0, w);
    Assertion.equals(thinDepth, 40.0, "Thin part of crystal about 20 um", 3.0);
    
  }
}
