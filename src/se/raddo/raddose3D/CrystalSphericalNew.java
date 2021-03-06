package se.raddo.raddose3D;

import java.util.Map;

public class CrystalSphericalNew extends CrystalPolyhedron{

  public CrystalSphericalNew(final Map<Object, Object> properties) {
    // Pass properties to Crystal()-constructor
    super(properties);
  }
  
  @Override
  public void loadVertices(final Map<Object, Object> mergedProperties) {
    int[][] tempIndices = {
        {1, 14, 13},
        {2, 14, 16},
        {1, 13, 18},
        {1, 18, 20},
        {1, 20, 17},
        {2, 16, 23},
        {3, 15, 25},
        {4, 19, 27},
        {5, 21, 29},
        {6, 22, 31},
        {2, 23, 26},
        {3, 25, 28},
        {4, 27, 30},
        {5, 29, 32},
        {6, 31, 24},
        {7, 33, 38},
        {8, 34, 40},
        {9, 35, 41},
        {10,    36, 42},
        {11,    37, 39},
        {39,    42, 12},
        {39,    37, 42},
        {37,    10, 42},
        {42,    41, 12},
        {42,    36, 41},
        {36,    9,  41},
        {41,    40, 12},
        {41,    35, 40},
        {35,    8,  40},
        {40,    38, 12},
        {40,    34, 38},
        {34,    7,  38},
        {38,    39, 12},
        {38,    33, 39},
        {33,    11, 39},
        {24,    37, 11},
        {24,    31, 37},
        {31,    10, 37},
        {32,    36, 10},
        {32,    29, 36},
        {29,    9,  36},
        {30,    35, 9},
        {30,    27, 35},
        {27,    8,  35},
        {28,    34, 8},
        {28,    25, 34},
        {25,    7,  34},
        {26,    33, 7},
        {26,    23, 33},
        {23,    11, 33},
        {31,    32, 10},
        {31,    22, 32},
        {22,    5,  32},
        {29,    30, 9},
        {29,    21, 30},
        {21,    4,  30},
        {27,    28, 8},
        {27,    19, 28},
        {19,    3,  28},
        {25,    26, 7},
        {25,    15, 26},
        {15,    2,  26},
        {23,    24, 11},
        {23,    16, 24},
        {16,    6,  24},
        {17,    22, 6},
        {17,    20, 22},
        {20,    5,  22},
        {20,    21, 5},
        {20,    18, 21},
        {18,    4,  21},
        {18,    19, 4},
        {18,    13, 19},
        {13,    3,  19},
        {16,    17, 6},
        {16,    14, 17},
        {14,    1,  17},
        {13,    15, 3},
        {13,    14, 15},
        {14,    2,  15},

    };
    
    Double diameter = (Double) mergedProperties.get(Crystal.CRYSTAL_DIM_X);
    
    double[][] tempVertices = {
        {0.000000,  -0.500000,  0.000000},
        {0.361804,  -0.223610,  0.262863},
        {-0.138194, -0.223610,  0.425325},
        {-0.447213, -0.223608,  0.000000},
        {-0.138194, -0.223610,  -0.425325},
        {0.361804,  -0.223610,  -0.262863},
        {0.138194,  0.223610,   0.425325},
        {-0.361804, 0.223610,   0.262863},
        {-0.361804, 0.223610,   -0.262863},
        {0.138194,  0.223610,   -0.425325},
        {0.447213,  0.223608,   0.000000},
        {0.000000,  0.500000,   0.000000},
        {-0.081228, -0.425327,  0.249998},
        {0.212661,  -0.425327,  0.154506},
        {0.131434,  -0.262869,  0.404506},
        {0.425324,  -0.262868,  0.000000},
        {0.212661,  -0.425327,  -0.154506},
        {-0.262865, -0.425326,  0.000000},
        {-0.344095, -0.262868,  0.249998},
        {-0.081228, -0.425327,  -0.249998},
        {-0.344095, -0.262868,  -0.249998},
        {0.131434,  -0.262869,  -0.404506},
        {0.475529,  0.000000,   0.154506},
        {0.475529,  0.000000,   -0.154506},
        {0.000000,  0.000000,   0.500000},
        {0.293893,  0.000000,   0.404508},
        {-0.475529, 0.000000,   0.154506},
        {-0.293893, 0.000000,   0.404508},
        {-0.293893, 0.000000,   -0.404508},
        {-0.475529, 0.000000,   -0.154506},
        {0.293893,  0.000000,   -0.404508},
        {0.000000,  0.000000,   -0.500000},
        {0.344095,  0.262868,   0.249998},
        {-0.131434, 0.262869,   0.404506},
        {-0.425324, 0.262868,   0.000000},
        {-0.131434, 0.262869,   -0.404506},
        {0.344095,  0.262868,   -0.249998},
        {0.081228,  0.425327,   0.249998},
        {0.262865,  0.425326,   0.000000},
        {-0.212661, 0.425327,   0.154506},
        {-0.212661, 0.425327,   -0.154506},
        {0.081228,  0.425327,   -0.249998},

        
    };
    
    setIndices(tempIndices);
    
    for (int i = 0; i < tempVertices.length; i++) {
      for (int j = 0; j < 3; j++) {
        tempVertices[i][j] = tempVertices[i][j] * diameter;
      }
    }
    
    vertices = new double[tempVertices.length][3];

    for (int i = 0; i < tempVertices.length; i++) {
      System.arraycopy(tempVertices[i], 0, vertices[i], 0, 3);
    }
    
  }
  
  @Override
  public String crystalInfo() {
    return String
        .format(
            "Spherical crystal of diameter %.0f um, "
                + "at a resolution of %.2f um per voxel edge.",
            crystSizeUM[0], 1 / crystalPixPerUM);
  }
}
  
