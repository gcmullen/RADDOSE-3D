// $ANTLR 3.4 C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g 2017-02-02 22:27:28

package se.raddo.raddose3D.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class InputfileLexer extends Lexer {
    public static final int EOF=-1;
    public static final int ABSCOEFCALC=4;
    public static final int ANGLEL=5;
    public static final int ANGLEP=6;
    public static final int ANGULARRESOLUTION=7;
    public static final int AVERAGE=8;
    public static final int BEAM=9;
    public static final int CALCULATEESCAPE=10;
    public static final int CIRCULAR=11;
    public static final int COLLIMATION=12;
    public static final int COMMENT=13;
    public static final int CONTAINERDENSITY=14;
    public static final int CONTAINERMATERIALELEMENTS=15;
    public static final int CONTAINERMATERIALMIXTURE=16;
    public static final int CONTAINERMATERIALTYPE=17;
    public static final int CONTAINERTHICKNESS=18;
    public static final int CRYSTAL=19;
    public static final int DDM=20;
    public static final int DECAYPARAM=21;
    public static final int DEFAULT=22;
    public static final int DIFFRACTIONDECAYMODEL=23;
    public static final int DIMENSION=24;
    public static final int DUMMY=25;
    public static final int ELEMENT=26;
    public static final int ELEMENTAL=27;
    public static final int ENERGY=28;
    public static final int EXPONENT=29;
    public static final int EXPOSURETIME=30;
    public static final int FILE=31;
    public static final int FLOAT=32;
    public static final int FLUX=33;
    public static final int FWHM=34;
    public static final int HORIZONTAL=35;
    public static final int KEV=36;
    public static final int LEAL=37;
    public static final int LINEAR=38;
    public static final int MATERIALELEMENTS=39;
    public static final int MATERIALMIXTURE=40;
    public static final int MATERIALTYPE=41;
    public static final int MIXTURE=42;
    public static final int MODELFILE=43;
    public static final int NONE=44;
    public static final int NUMDNA=45;
    public static final int NUMMONOMERS=46;
    public static final int NUMRESIDUES=47;
    public static final int NUMRNA=48;
    public static final int PDB=49;
    public static final int PDBNAME=50;
    public static final int PIXELSIZE=51;
    public static final int PIXELSPERMICRON=52;
    public static final int PROTEINCONC=53;
    public static final int PROTEINCONCENTRATION=54;
    public static final int PROTEINHEAVYATOMS=55;
    public static final int RDFORTAN=56;
    public static final int RDJAVA=57;
    public static final int RECTANGULAR=58;
    public static final int ROTAXBEAMOFFSET=59;
    public static final int SAXS=60;
    public static final int SAXSSEQ=61;
    public static final int SEQFILE=62;
    public static final int SEQUENCE=63;
    public static final int SEQUENCEFILE=64;
    public static final int SIMPLE=65;
    public static final int SOLVENTFRACTION=66;
    public static final int SOLVENTHEAVYCONC=67;
    public static final int STARTOFFSET=68;
    public static final int STRING=69;
    public static final int TRANSLATEPERDEGREE=70;
    public static final int TYPE=71;
    public static final int UNITCELL=72;
    public static final int VERTICAL=73;
    public static final int WEDGE=74;
    public static final int WIREFRAMETYPE=75;
    public static final int WS=76;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public InputfileLexer() {} 
    public InputfileLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InputfileLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g"; }

    // $ANTLR start "CRYSTAL"
    public final void mCRYSTAL() throws RecognitionException {
        try {
            int _type = CRYSTAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:187:9: ( ( 'C' | 'c' ) ( 'R' | 'r' ) ( 'Y' | 'y' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'L' | 'l' ) )
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:187:11: ( 'C' | 'c' ) ( 'R' | 'r' ) ( 'Y' | 'y' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CRYSTAL"

    // $ANTLR start "TYPE"
    public final void mTYPE() throws RecognitionException {
        try {
            int _type = TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:235:6: ( ( 'T' | 't' ) ( 'Y' | 'y' ) ( 'P' | 'p' ) ( 'E' | 'e' ) )
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:235:8: ( 'T' | 't' ) ( 'Y' | 'y' ) ( 'P' | 'p' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TYPE"

    // $ANTLR start "DIFFRACTIONDECAYMODEL"
    public final void mDIFFRACTIONDECAYMODEL() throws RecognitionException {
        try {
            int _type = DIFFRACTIONDECAYMODEL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:239:23: ( ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'F' | 'f' ) ( 'F' | 'f' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'Y' | 'y' ) ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'L' | 'l' ) )
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:239:25: ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'F' | 'f' ) ( 'F' | 'f' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'Y' | 'y' ) ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIFFRACTIONDECAYMODEL"

    // $ANTLR start "DDM"
    public final void mDDM() throws RecognitionException {
        try {
            int _type = DDM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:240:5: ( ( 'D' | 'd' ) ( 'D' | 'd' ) ( 'M' | 'm' ) )
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:240:7: ( 'D' | 'd' ) ( 'D' | 'd' ) ( 'M' | 'm' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DDM"

    // $ANTLR start "SIMPLE"
    public final void mSIMPLE() throws RecognitionException {
        try {
            int _type = SIMPLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:246:8: ( ( 'S' | 's' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'P' | 'p' ) ( 'L' | 'l' ) ( 'E' | 'e' ) )
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:246:10: ( 'S' | 's' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'P' | 'p' ) ( 'L' | 'l' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SIMPLE"

    // $ANTLR start "LINEAR"
    public final void mLINEAR() throws RecognitionException {
        try {
            int _type = LINEAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:247:8: ( ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'R' | 'r' ) )
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:247:10: ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LINEAR"

    // $ANTLR start "LEAL"
    public final void mLEAL() throws RecognitionException {
        try {
            int _type = LEAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:248:6: ( ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'L' | 'l' ) )
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:248:8: ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LEAL"

    // $ANTLR start "DECAYPARAM"
    public final void mDECAYPARAM() throws RecognitionException {
        try {
            int _type = DECAYPARAM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:252:13: ( ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'Y' | 'y' ) ( 'P' | 'p' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'M' | 'm' ) )
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:252:15: ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'Y' | 'y' ) ( 'P' | 'p' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'M' | 'm' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DECAYPARAM"

    // $ANTLR start "ABSCOEFCALC"
    public final void mABSCOEFCALC() throws RecognitionException {
        try {
            int _type = ABSCOEFCALC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:256:13: ( ( ( 'A' | 'a' ) ( 'B' | 'b' ) ( 'S' | 's' ) )? ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'C' | 'c' ) )
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:256:15: ( ( 'A' | 'a' ) ( 'B' | 'b' ) ( 'S' | 's' ) )? ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'C' | 'c' )
            {
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:256:15: ( ( 'A' | 'a' ) ( 'B' | 'b' ) ( 'S' | 's' ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='A'||LA1_0=='a') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:256:16: ( 'A' | 'a' ) ( 'B' | 'b' ) ( 'S' | 's' )
                    {
                    if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ABSCOEFCALC"

    // $ANTLR start "DUMMY"
    public final void mDUMMY() throws RecognitionException {
        try {
            int _type = DUMMY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:268:7: ( ( 'D' | 'd' ) ( 'U' | 'u' ) ( 'M' | 'm' ) ( 'M' | 'm' ) ( 'Y' | 'y' ) )
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:268:9: ( 'D' | 'd' ) ( 'U' | 'u' ) ( 'M' | 'm' ) ( 'M' | 'm' ) ( 'Y' | 'y' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DUMMY"

    // $ANTLR start "DEFAULT"
    public final void mDEFAULT() throws RecognitionException {
        try {
            int _type = DEFAULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:269:9: ( ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'T' | 't' ) )
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:269:11: ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DEFAULT"

    // $ANTLR start "AVERAGE"
    public final void mAVERAGE() throws RecognitionException {
        try {
            int _type = AVERAGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:270:9: ( ( 'A' | 'a' ) ( 'V' | 'v' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'G' | 'g' ) ( 'E' | 'e' ) )
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:270:11: ( 'A' | 'a' ) ( 'V' | 'v' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'G' | 'g' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AVERAGE"

    // $ANTLR start "RDFORTAN"
    public final void mRDFORTAN() throws RecognitionException {
        try {
            int _type = RDFORTAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:271:10: ( ( 'R' | 'r' ) ( 'D' | 'd' ) ( 'V' | 'v' ) ( '2' | '3' )? )
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:271:12: ( 'R' | 'r' ) ( 'D' | 'd' ) ( 'V' | 'v' ) ( '2' | '3' )?
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:271:39: ( '2' | '3' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0 >= '2' && LA2_0 <= '3')) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:
                    {
                    if ( (input.LA(1) >= '2' && input.LA(1) <= '3') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RDFORTAN"

    // $ANTLR start "RDJAVA"
    public final void mRDJAVA() throws RecognitionException {
        try {
            int _type = RDJAVA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:272:8: ( ( 'R' | 'r' ) ( 'D' | 'd' ) ( '3' ) ( 'D' | 'd' )? )
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:272:10: ( 'R' | 'r' ) ( 'D' | 'd' ) ( '3' ) ( 'D' | 'd' )?
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:272:28: ( '3' )
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:272:29: '3'
            {
            match('3'); 

            }


            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:272:33: ( 'D' | 'd' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='D'||LA3_0=='d') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:
                    {
                    if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RDJAVA"

    // $ANTLR start "PDB"
    public final void mPDB() throws RecognitionException {
        try {
            int _type = PDB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:273:5: ( ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'P' | 'p' ) )
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:273:7: ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'P' | 'p' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PDB"

    // $ANTLR start "SAXS"
    public final void mSAXS() throws RecognitionException {
        try {
            int _type = SAXS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:274:6: ( ( 'S' | 's' ) ( 'A' | 'a' ) ( 'X' | 'x' ) ( 'S' | 's' ) )
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:274:8: ( 'S' | 's' ) ( 'A' | 'a' ) ( 'X' | 'x' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SAXS"

    // $ANTLR start "SEQUENCE"
    public final void mSEQUENCE() throws RecognitionException {
        try {
            int _type = SEQUENCE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:275:10: ( ( 'S' | 's' ) ( 'E' | 'e' ) ( 'Q' | 'q' ) ( 'U' | 'u' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'E' | 'e' ) )
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:275:12: ( 'S' | 's' ) ( 'E' | 'e' ) ( 'Q' | 'q' ) ( 'U' | 'u' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='Q'||input.LA(1)=='q' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SEQUENCE"

    // $ANTLR start "SAXSSEQ"
    public final void mSAXSSEQ() throws RecognitionException {
        try {
            int _type = SAXSSEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:276:9: ( ( 'S' | 's' ) ( 'A' | 'a' ) ( 'X' | 'x' ) ( 'S' | 's' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'Q' | 'q' ) )
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:276:11: ( 'S' | 's' ) ( 'A' | 'a' ) ( 'X' | 'x' ) ( 'S' | 's' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'Q' | 'q' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='Q'||input.LA(1)=='q' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SAXSSEQ"

    // $ANTLR start "DIMENSION"
    public final void mDIMENSION() throws RecognitionException {
        try {
            int _type = DIMENSION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:290:11: ( ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'S' | 's' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'S' | 's' )? )
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:290:13: ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'S' | 's' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'S' | 's' )?
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:290:94: ( 'S' | 's' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='S'||LA4_0=='s') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:
                    {
                    if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIMENSION"

    // $ANTLR start "ANGLEP"
    public final void mANGLEP() throws RecognitionException {
        try {
            int _type = ANGLEP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:295:8: ( ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'G' | 'g' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'P' | 'p' ) )
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:295:10: ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'G' | 'g' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'P' | 'p' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ANGLEP"

    // $ANTLR start "ANGLEL"
    public final void mANGLEL() throws RecognitionException {
        try {
            int _type = ANGLEL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:300:8: ( ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'G' | 'g' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'L' | 'l' ) )
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:300:10: ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'G' | 'g' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ANGLEL"

    // $ANTLR start "PIXELSPERMICRON"
    public final void mPIXELSPERMICRON() throws RecognitionException {
        try {
            int _type = PIXELSPERMICRON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:304:17: ( ( 'P' | 'p' ) ( 'I' | 'i' ) ( 'X' | 'x' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'P' | 'p' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'C' | 'c' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'N' | 'n' ) )
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:304:19: ( 'P' | 'p' ) ( 'I' | 'i' ) ( 'X' | 'x' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'P' | 'p' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'C' | 'c' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PIXELSPERMICRON"

    // $ANTLR start "UNITCELL"
    public final void mUNITCELL() throws RecognitionException {
        try {
            int _type = UNITCELL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:317:10: ( ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'L' | 'l' ) )
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:317:12: ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNITCELL"

    // $ANTLR start "PROTEINCONC"
    public final void mPROTEINCONC() throws RecognitionException {
        try {
            int _type = PROTEINCONC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:321:12: ( ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'C' | 'c' ) )
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:321:14: ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'C' | 'c' )
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PROTEINCONC"

    // $ANTLR start "PROTEINCONCENTRATION"
    public final void mPROTEINCONCENTRATION() throws RecognitionException {
        try {
            int _type = PROTEINCONCENTRATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:322:21: ( ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' ) )
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:322:23: ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PROTEINCONCENTRATION"

    // $ANTLR start "NUMMONOMERS"
    public final void mNUMMONOMERS() throws RecognitionException {
        try {
            int _type = NUMMONOMERS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:326:12: ( ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'M' | 'm' ) ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'S' | 's' ) )
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:326:14: ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'M' | 'm' ) ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NUMMONOMERS"

    // $ANTLR start "NUMRESIDUES"
    public final void mNUMRESIDUES() throws RecognitionException {
        try {
            int _type = NUMRESIDUES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:330:13: ( ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'M' | 'm' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'I' | 'i' ) ( 'D' | 'd' ) ( 'U' | 'u' ) ( 'E' | 'e' ) ( 'S' | 's' ) )
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:330:15: ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'M' | 'm' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'I' | 'i' ) ( 'D' | 'd' ) ( 'U' | 'u' ) ( 'E' | 'e' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NUMRESIDUES"

    // $ANTLR start "NUMRNA"
    public final void mNUMRNA() throws RecognitionException {
        try {
            int _type = NUMRNA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:334:8: ( ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'M' | 'm' ) ( 'R' | 'r' ) ( 'N' | 'n' ) ( 'A' | 'a' ) )
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:334:10: ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'M' | 'm' ) ( 'R' | 'r' ) ( 'N' | 'n' ) ( 'A' | 'a' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NUMRNA"

    // $ANTLR start "NUMDNA"
    public final void mNUMDNA() throws RecognitionException {
        try {
            int _type = NUMDNA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:338:8: ( ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'M' | 'm' ) ( 'D' | 'd' ) ( 'N' | 'n' ) ( 'A' | 'a' ) )
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:338:10: ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'M' | 'm' ) ( 'D' | 'd' ) ( 'N' | 'n' ) ( 'A' | 'a' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NUMDNA"

    // $ANTLR start "PROTEINHEAVYATOMS"
    public final void mPROTEINHEAVYATOMS() throws RecognitionException {
        try {
            int _type = PROTEINHEAVYATOMS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:346:19: ( ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'V' | 'v' ) ( 'Y' | 'y' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'O' | 'o' ) ( 'M' | 'm' ) ( 'S' | 's' ) )
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:346:21: ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'V' | 'v' ) ( 'Y' | 'y' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'O' | 'o' ) ( 'M' | 'm' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PROTEINHEAVYATOMS"

    // $ANTLR start "ELEMENT"
    public final void mELEMENT() throws RecognitionException {
        try {
            int _type = ELEMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:347:9: ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( 'A' .. 'Z' | 'a' .. 'z' )? )
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:347:11: ( 'A' .. 'Z' | 'a' .. 'z' ) ( 'A' .. 'Z' | 'a' .. 'z' )?
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:347:32: ( 'A' .. 'Z' | 'a' .. 'z' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0 >= 'A' && LA5_0 <= 'Z')||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:
                    {
                    if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELEMENT"

    // $ANTLR start "SOLVENTHEAVYCONC"
    public final void mSOLVENTHEAVYCONC() throws RecognitionException {
        try {
            int _type = SOLVENTHEAVYCONC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:355:18: ( ( 'S' | 's' ) ( 'O' | 'o' ) ( 'L' | 'l' ) ( 'V' | 'v' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'V' | 'v' ) ( 'Y' | 'y' ) ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'C' | 'c' ) )
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:355:20: ( 'S' | 's' ) ( 'O' | 'o' ) ( 'L' | 'l' ) ( 'V' | 'v' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'V' | 'v' ) ( 'Y' | 'y' ) ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'C' | 'c' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SOLVENTHEAVYCONC"

    // $ANTLR start "SOLVENTFRACTION"
    public final void mSOLVENTFRACTION() throws RecognitionException {
        try {
            int _type = SOLVENTFRACTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:359:17: ( ( 'S' | 's' ) ( 'O' | 'o' ) ( 'L' | 'l' ) ( 'V' | 'v' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'F' | 'f' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' ) )
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:359:19: ( 'S' | 's' ) ( 'O' | 'o' ) ( 'L' | 'l' ) ( 'V' | 'v' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'F' | 'f' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SOLVENTFRACTION"

    // $ANTLR start "PDBNAME"
    public final void mPDBNAME() throws RecognitionException {
        try {
            int _type = PDBNAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:363:9: ( ( 'P' | 'p' ) ( 'D' | 'd' ) ( 'B' | 'b' ) )
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:363:11: ( 'P' | 'p' ) ( 'D' | 'd' ) ( 'B' | 'b' )
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PDBNAME"

    // $ANTLR start "WIREFRAMETYPE"
    public final void mWIREFRAMETYPE() throws RecognitionException {
        try {
            int _type = WIREFRAMETYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:367:15: ( ( 'W' | 'w' ) ( 'I' | 'i' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'Y' | 'y' |) ( 'P' | 'p' ) ( 'E' | 'e' ) )
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:367:17: ( 'W' | 'w' ) ( 'I' | 'i' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'Y' | 'y' |) ( 'P' | 'p' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:367:107: ( 'Y' | 'y' |)
            int alt6=3;
            switch ( input.LA(1) ) {
            case 'Y':
                {
                alt6=1;
                }
                break;
            case 'y':
                {
                alt6=2;
                }
                break;
            case 'P':
            case 'p':
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:367:108: 'Y'
                    {
                    match('Y'); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:367:112: 'y'
                    {
                    match('y'); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:367:116: 
                    {
                    }
                    break;

            }


            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WIREFRAMETYPE"

    // $ANTLR start "MODELFILE"
    public final void mMODELFILE() throws RecognitionException {
        try {
            int _type = MODELFILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:371:11: ( ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'E' | 'e' ) )
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:371:13: ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MODELFILE"

    // $ANTLR start "CALCULATEESCAPE"
    public final void mCALCULATEESCAPE() throws RecognitionException {
        try {
            int _type = CALCULATEESCAPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:376:2: ( ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'C' | 'c' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'P' | 'p' ) ( 'E' | 'e' ) )
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:376:5: ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'C' | 'c' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'P' | 'p' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CALCULATEESCAPE"

    // $ANTLR start "CONTAINERMATERIALTYPE"
    public final void mCONTAINERMATERIALTYPE() throws RecognitionException {
        try {
            int _type = CONTAINERMATERIALTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:380:23: ( ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'T' | 't' ) ( 'Y' | 'y' ) ( 'P' | 'p' ) ( 'E' | 'e' ) )
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:380:25: ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'T' | 't' ) ( 'Y' | 'y' ) ( 'P' | 'p' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CONTAINERMATERIALTYPE"

    // $ANTLR start "MATERIALTYPE"
    public final void mMATERIALTYPE() throws RecognitionException {
        try {
            int _type = MATERIALTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:381:14: ( ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'T' | 't' ) ( 'Y' | 'y' ) ( 'P' | 'p' ) ( 'E' | 'e' ) )
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:381:16: ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'T' | 't' ) ( 'Y' | 'y' ) ( 'P' | 'p' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MATERIALTYPE"

    // $ANTLR start "NONE"
    public final void mNONE() throws RecognitionException {
        try {
            int _type = NONE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:387:7: ( ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'E' | 'e' ) )
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:387:9: ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NONE"

    // $ANTLR start "MIXTURE"
    public final void mMIXTURE() throws RecognitionException {
        try {
            int _type = MIXTURE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:388:9: ( ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'X' | 'x' ) ( 'T' | 't' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'E' | 'e' ) )
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:388:11: ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'X' | 'x' ) ( 'T' | 't' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MIXTURE"

    // $ANTLR start "ELEMENTAL"
    public final void mELEMENTAL() throws RecognitionException {
        try {
            int _type = ELEMENTAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:389:11: ( ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'L' | 'l' ) )
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:389:13: ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELEMENTAL"

    // $ANTLR start "CONTAINERTHICKNESS"
    public final void mCONTAINERTHICKNESS() throws RecognitionException {
        try {
            int _type = CONTAINERTHICKNESS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:393:19: ( ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'T' | 't' ) ( 'H' | 'h' ) ( 'I' | 'i' ) ( 'C' | 'c' ) ( 'K' | 'k' ) ( 'N' | 'n' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'S' | 's' ) )
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:393:21: ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'T' | 't' ) ( 'H' | 'h' ) ( 'I' | 'i' ) ( 'C' | 'c' ) ( 'K' | 'k' ) ( 'N' | 'n' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='K'||input.LA(1)=='k' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CONTAINERTHICKNESS"

    // $ANTLR start "CONTAINERMATERIALMIXTURE"
    public final void mCONTAINERMATERIALMIXTURE() throws RecognitionException {
        try {
            int _type = CONTAINERMATERIALMIXTURE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:397:25: ( ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'X' | 'x' ) ( 'T' | 't' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'E' | 'e' ) )
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:397:27: ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'X' | 'x' ) ( 'T' | 't' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CONTAINERMATERIALMIXTURE"

    // $ANTLR start "MATERIALMIXTURE"
    public final void mMATERIALMIXTURE() throws RecognitionException {
        try {
            int _type = MATERIALMIXTURE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:398:16: ( ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'X' | 'x' ) ( 'T' | 't' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'E' | 'e' ) )
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:398:18: ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'X' | 'x' ) ( 'T' | 't' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MATERIALMIXTURE"

    // $ANTLR start "CONTAINERMATERIALELEMENTS"
    public final void mCONTAINERMATERIALELEMENTS() throws RecognitionException {
        try {
            int _type = CONTAINERMATERIALELEMENTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:406:26: ( ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'S' | 's' ) )
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:406:28: ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CONTAINERMATERIALELEMENTS"

    // $ANTLR start "MATERIALELEMENTS"
    public final void mMATERIALELEMENTS() throws RecognitionException {
        try {
            int _type = MATERIALELEMENTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:407:17: ( ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'S' | 's' ) )
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:407:19: ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MATERIALELEMENTS"

    // $ANTLR start "CONTAINERDENSITY"
    public final void mCONTAINERDENSITY() throws RecognitionException {
        try {
            int _type = CONTAINERDENSITY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:411:17: ( ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'S' | 's' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'Y' | 'y' ) )
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:411:19: ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'S' | 's' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'Y' | 'y' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CONTAINERDENSITY"

    // $ANTLR start "SEQUENCEFILE"
    public final void mSEQUENCEFILE() throws RecognitionException {
        try {
            int _type = SEQUENCEFILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:415:14: ( ( 'S' | 's' ) ( 'E' | 'e' ) ( 'Q' | 'q' ) ( 'U' | 'u' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'E' | 'e' ) )
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:415:17: ( 'S' | 's' ) ( 'E' | 'e' ) ( 'Q' | 'q' ) ( 'U' | 'u' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='Q'||input.LA(1)=='q' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SEQUENCEFILE"

    // $ANTLR start "SEQFILE"
    public final void mSEQFILE() throws RecognitionException {
        try {
            int _type = SEQFILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:416:9: ( ( 'S' | 's' ) ( 'E' | 'e' ) ( 'Q' | 'q' ) ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'E' | 'e' ) )
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:416:11: ( 'S' | 's' ) ( 'E' | 'e' ) ( 'Q' | 'q' ) ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='Q'||input.LA(1)=='q' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SEQFILE"

    // $ANTLR start "BEAM"
    public final void mBEAM() throws RecognitionException {
        try {
            int _type = BEAM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:432:6: ( ( 'B' | 'b' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'M' | 'm' ) )
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:432:8: ( 'B' | 'b' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'M' | 'm' )
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BEAM"

    // $ANTLR start "FLUX"
    public final void mFLUX() throws RecognitionException {
        try {
            int _type = FLUX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:449:6: ( ( 'F' | 'f' ) ( 'L' | 'l' ) ( 'U' | 'u' ) ( 'X' | 'x' ) )
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:449:8: ( 'F' | 'f' ) ( 'L' | 'l' ) ( 'U' | 'u' ) ( 'X' | 'x' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLUX"

    // $ANTLR start "FWHM"
    public final void mFWHM() throws RecognitionException {
        try {
            int _type = FWHM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:453:6: ( ( 'F' | 'f' ) ( 'W' | 'w' ) ( 'H' | 'h' ) ( 'M' | 'm' ) )
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:453:8: ( 'F' | 'f' ) ( 'W' | 'w' ) ( 'H' | 'h' ) ( 'M' | 'm' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FWHM"

    // $ANTLR start "ENERGY"
    public final void mENERGY() throws RecognitionException {
        try {
            int _type = ENERGY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:459:8: ( ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'G' | 'g' ) ( 'Y' | 'y' ) )
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:459:10: ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'G' | 'g' ) ( 'Y' | 'y' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ENERGY"

    // $ANTLR start "KEV"
    public final void mKEV() throws RecognitionException {
        try {
            int _type = KEV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:460:5: ( ( 'K' | 'k' ) ( 'E' | 'e' ) ( 'V' | 'v' ) )
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:460:7: ( 'K' | 'k' ) ( 'E' | 'e' ) ( 'V' | 'v' )
            {
            if ( input.LA(1)=='K'||input.LA(1)=='k' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KEV"

    // $ANTLR start "FILE"
    public final void mFILE() throws RecognitionException {
        try {
            int _type = FILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:465:6: ( ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'E' | 'e' ) )
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:465:8: ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FILE"

    // $ANTLR start "PIXELSIZE"
    public final void mPIXELSIZE() throws RecognitionException {
        try {
            int _type = PIXELSIZE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:473:2: ( ( 'P' | 'p' ) ( 'I' | 'i' ) ( 'X' | 'x' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'I' | 'i' ) ( 'Z' | 'z' ) ( 'E' | 'e' ) )
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:473:5: ( 'P' | 'p' ) ( 'I' | 'i' ) ( 'X' | 'x' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'I' | 'i' ) ( 'Z' | 'z' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='Z'||input.LA(1)=='z' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PIXELSIZE"

    // $ANTLR start "COLLIMATION"
    public final void mCOLLIMATION() throws RecognitionException {
        try {
            int _type = COLLIMATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:486:13: ( ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'L' | 'l' ) ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' ) )
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:486:15: ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'L' | 'l' ) ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COLLIMATION"

    // $ANTLR start "RECTANGULAR"
    public final void mRECTANGULAR() throws RecognitionException {
        try {
            int _type = RECTANGULAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:487:13: ( ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'G' | 'g' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'R' | 'r' ) )
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:487:15: ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'G' | 'g' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RECTANGULAR"

    // $ANTLR start "CIRCULAR"
    public final void mCIRCULAR() throws RecognitionException {
        try {
            int _type = CIRCULAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:488:11: ( ( 'C' | 'c' ) ( 'I' | 'i' ) ( 'R' | 'r' ) ( 'C' | 'c' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'R' | 'r' ) )
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:488:13: ( 'C' | 'c' ) ( 'I' | 'i' ) ( 'R' | 'r' ) ( 'C' | 'c' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CIRCULAR"

    // $ANTLR start "HORIZONTAL"
    public final void mHORIZONTAL() throws RecognitionException {
        try {
            int _type = HORIZONTAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:489:13: ( ( 'H' | 'h' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'Z' | 'z' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'L' | 'l' ) )
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:489:15: ( 'H' | 'h' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'Z' | 'z' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='Z'||input.LA(1)=='z' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HORIZONTAL"

    // $ANTLR start "VERTICAL"
    public final void mVERTICAL() throws RecognitionException {
        try {
            int _type = VERTICAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:490:11: ( ( 'V' | 'v' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'L' | 'l' ) )
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:490:13: ( 'V' | 'v' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VERTICAL"

    // $ANTLR start "WEDGE"
    public final void mWEDGE() throws RecognitionException {
        try {
            int _type = WEDGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:516:7: ( ( 'W' | 'w' ) ( 'E' | 'e' ) ( 'D' | 'd' ) ( 'G' | 'g' ) ( 'E' | 'e' ) )
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:516:9: ( 'W' | 'w' ) ( 'E' | 'e' ) ( 'D' | 'd' ) ( 'G' | 'g' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WEDGE"

    // $ANTLR start "EXPOSURETIME"
    public final void mEXPOSURETIME() throws RecognitionException {
        try {
            int _type = EXPOSURETIME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:532:14: ( ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'P' | 'p' ) ( 'O' | 'o' ) ( 'S' | 's' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'E' | 'e' ) )
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:532:16: ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'P' | 'p' ) ( 'O' | 'o' ) ( 'S' | 's' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXPOSURETIME"

    // $ANTLR start "ANGULARRESOLUTION"
    public final void mANGULARRESOLUTION() throws RecognitionException {
        try {
            int _type = ANGULARRESOLUTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:536:19: ( ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'G' | 'g' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'O' | 'o' ) ( 'L' | 'l' ) ( 'U' | 'u' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' ) )
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:536:21: ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'G' | 'g' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'O' | 'o' ) ( 'L' | 'l' ) ( 'U' | 'u' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ANGULARRESOLUTION"

    // $ANTLR start "STARTOFFSET"
    public final void mSTARTOFFSET() throws RecognitionException {
        try {
            int _type = STARTOFFSET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:542:13: ( ( 'S' | 's' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'T' | 't' ) ( 'O' | 'o' ) ( 'F' | 'f' ) ( 'F' | 'f' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'T' | 't' ) )
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:542:15: ( 'S' | 's' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'T' | 't' ) ( 'O' | 'o' ) ( 'F' | 'f' ) ( 'F' | 'f' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STARTOFFSET"

    // $ANTLR start "TRANSLATEPERDEGREE"
    public final void mTRANSLATEPERDEGREE() throws RecognitionException {
        try {
            int _type = TRANSLATEPERDEGREE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:548:20: ( ( 'T' | 't' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'S' | 's' ) ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'P' | 'p' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'G' | 'g' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'E' | 'e' ) )
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:548:22: ( 'T' | 't' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'S' | 's' ) ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'P' | 'p' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'G' | 'g' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TRANSLATEPERDEGREE"

    // $ANTLR start "ROTAXBEAMOFFSET"
    public final void mROTAXBEAMOFFSET() throws RecognitionException {
        try {
            int _type = ROTAXBEAMOFFSET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:552:17: ( ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'X' | 'x' ) ( 'B' | 'b' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'F' | 'f' ) ( 'F' | 'f' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'T' | 't' ) )
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:552:19: ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'X' | 'x' ) ( 'B' | 'b' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'F' | 'f' ) ( 'F' | 'f' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ROTAXBEAMOFFSET"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:557:5: ( ( '+' | '-' )? ( ( '0' .. '9' )+ | ( '0' .. '9' )+ '.' ( '0' .. '9' )* | '.' ( '0' .. '9' )+ ) ( EXPONENT )? )
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:557:7: ( '+' | '-' )? ( ( '0' .. '9' )+ | ( '0' .. '9' )+ '.' ( '0' .. '9' )* | '.' ( '0' .. '9' )+ ) ( EXPONENT )?
            {
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:557:7: ( '+' | '-' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='+'||LA7_0=='-') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:558:5: ( ( '0' .. '9' )+ | ( '0' .. '9' )+ '.' ( '0' .. '9' )* | '.' ( '0' .. '9' )+ )
            int alt12=3;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:558:7: ( '0' .. '9' )+
                    {
                    // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:558:7: ( '0' .. '9' )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:559:7: ( '0' .. '9' )+ '.' ( '0' .. '9' )*
                    {
                    // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:559:7: ( '0' .. '9' )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);


                    match('.'); 

                    // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:559:23: ( '0' .. '9' )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0 >= '0' && LA10_0 <= '9')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;
                case 3 :
                    // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:560:19: '.' ( '0' .. '9' )+
                    {
                    match('.'); 

                    // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:560:23: ( '0' .. '9' )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0 >= '0' && LA11_0 <= '9')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt11 >= 1 ) break loop11;
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                throw eee;
                        }
                        cnt11++;
                    } while (true);


                    }
                    break;

            }


            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:561:7: ( EXPONENT )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='E'||LA13_0=='e') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:561:7: EXPONENT
                    {
                    mEXPONENT(); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:565:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:565:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:565:22: ( '+' | '-' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='+'||LA14_0=='-') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:565:33: ( '0' .. '9' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0 >= '0' && LA15_0 <= '9')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXPONENT"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:567:5: ( ( '#' | '//' | '!' ) (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:567:9: ( '#' | '//' | '!' ) (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:567:9: ( '#' | '//' | '!' )
            int alt16=3;
            switch ( input.LA(1) ) {
            case '#':
                {
                alt16=1;
                }
                break;
            case '/':
                {
                alt16=2;
                }
                break;
            case '!':
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }

            switch (alt16) {
                case 1 :
                    // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:567:10: '#'
                    {
                    match('#'); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:567:16: '//'
                    {
                    match("//"); 



                    }
                    break;
                case 3 :
                    // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:567:23: '!'
                    {
                    match('!'); 

                    }
                    break;

            }


            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:567:28: (~ ( '\\n' | '\\r' ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0 >= '\u0000' && LA17_0 <= '\t')||(LA17_0 >= '\u000B' && LA17_0 <= '\f')||(LA17_0 >= '\u000E' && LA17_0 <= '\uFFFF')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:567:42: ( '\\r' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='\r') ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:567:42: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }


            match('\n'); 

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:570:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:570:9: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:585:2: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '.' | '$' | '-' | '_' )+ )
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:585:4: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '.' | '$' | '-' | '_' )+
            {
            // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:585:4: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '.' | '$' | '-' | '_' )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0=='$'||(LA19_0 >= '-' && LA19_0 <= '.')||(LA19_0 >= '0' && LA19_0 <= '9')||(LA19_0 >= 'A' && LA19_0 <= 'Z')||LA19_0=='_'||(LA19_0 >= 'a' && LA19_0 <= 'z')) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1) >= '-' && input.LA(1) <= '.')||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:1:8: ( CRYSTAL | TYPE | DIFFRACTIONDECAYMODEL | DDM | SIMPLE | LINEAR | LEAL | DECAYPARAM | ABSCOEFCALC | DUMMY | DEFAULT | AVERAGE | RDFORTAN | RDJAVA | PDB | SAXS | SEQUENCE | SAXSSEQ | DIMENSION | ANGLEP | ANGLEL | PIXELSPERMICRON | UNITCELL | PROTEINCONC | PROTEINCONCENTRATION | NUMMONOMERS | NUMRESIDUES | NUMRNA | NUMDNA | PROTEINHEAVYATOMS | ELEMENT | SOLVENTHEAVYCONC | SOLVENTFRACTION | PDBNAME | WIREFRAMETYPE | MODELFILE | CALCULATEESCAPE | CONTAINERMATERIALTYPE | MATERIALTYPE | NONE | MIXTURE | ELEMENTAL | CONTAINERTHICKNESS | CONTAINERMATERIALMIXTURE | MATERIALMIXTURE | CONTAINERMATERIALELEMENTS | MATERIALELEMENTS | CONTAINERDENSITY | SEQUENCEFILE | SEQFILE | BEAM | FLUX | FWHM | ENERGY | KEV | FILE | PIXELSIZE | COLLIMATION | RECTANGULAR | CIRCULAR | HORIZONTAL | VERTICAL | WEDGE | EXPOSURETIME | ANGULARRESOLUTION | STARTOFFSET | TRANSLATEPERDEGREE | ROTAXBEAMOFFSET | FLOAT | COMMENT | WS | STRING )
        int alt20=72;
        alt20 = dfa20.predict(input);
        switch (alt20) {
            case 1 :
                // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:1:10: CRYSTAL
                {
                mCRYSTAL(); 


                }
                break;
            case 2 :
                // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:1:18: TYPE
                {
                mTYPE(); 


                }
                break;
            case 3 :
                // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:1:23: DIFFRACTIONDECAYMODEL
                {
                mDIFFRACTIONDECAYMODEL(); 


                }
                break;
            case 4 :
                // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:1:45: DDM
                {
                mDDM(); 


                }
                break;
            case 5 :
                // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:1:49: SIMPLE
                {
                mSIMPLE(); 


                }
                break;
            case 6 :
                // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:1:56: LINEAR
                {
                mLINEAR(); 


                }
                break;
            case 7 :
                // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:1:63: LEAL
                {
                mLEAL(); 


                }
                break;
            case 8 :
                // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:1:68: DECAYPARAM
                {
                mDECAYPARAM(); 


                }
                break;
            case 9 :
                // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:1:79: ABSCOEFCALC
                {
                mABSCOEFCALC(); 


                }
                break;
            case 10 :
                // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:1:91: DUMMY
                {
                mDUMMY(); 


                }
                break;
            case 11 :
                // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:1:97: DEFAULT
                {
                mDEFAULT(); 


                }
                break;
            case 12 :
                // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:1:105: AVERAGE
                {
                mAVERAGE(); 


                }
                break;
            case 13 :
                // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:1:113: RDFORTAN
                {
                mRDFORTAN(); 


                }
                break;
            case 14 :
                // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:1:122: RDJAVA
                {
                mRDJAVA(); 


                }
                break;
            case 15 :
                // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:1:129: PDB
                {
                mPDB(); 


                }
                break;
            case 16 :
                // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:1:133: SAXS
                {
                mSAXS(); 


                }
                break;
            case 17 :
                // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:1:138: SEQUENCE
                {
                mSEQUENCE(); 


                }
                break;
            case 18 :
                // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:1:147: SAXSSEQ
                {
                mSAXSSEQ(); 


                }
                break;
            case 19 :
                // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:1:155: DIMENSION
                {
                mDIMENSION(); 


                }
                break;
            case 20 :
                // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:1:165: ANGLEP
                {
                mANGLEP(); 


                }
                break;
            case 21 :
                // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:1:172: ANGLEL
                {
                mANGLEL(); 


                }
                break;
            case 22 :
                // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:1:179: PIXELSPERMICRON
                {
                mPIXELSPERMICRON(); 


                }
                break;
            case 23 :
                // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:1:195: UNITCELL
                {
                mUNITCELL(); 


                }
                break;
            case 24 :
                // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:1:204: PROTEINCONC
                {
                mPROTEINCONC(); 


                }
                break;
            case 25 :
                // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:1:216: PROTEINCONCENTRATION
                {
                mPROTEINCONCENTRATION(); 


                }
                break;
            case 26 :
                // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:1:237: NUMMONOMERS
                {
                mNUMMONOMERS(); 


                }
                break;
            case 27 :
                // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:1:249: NUMRESIDUES
                {
                mNUMRESIDUES(); 


                }
                break;
            case 28 :
                // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:1:261: NUMRNA
                {
                mNUMRNA(); 


                }
                break;
            case 29 :
                // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:1:268: NUMDNA
                {
                mNUMDNA(); 


                }
                break;
            case 30 :
                // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:1:275: PROTEINHEAVYATOMS
                {
                mPROTEINHEAVYATOMS(); 


                }
                break;
            case 31 :
                // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:1:293: ELEMENT
                {
                mELEMENT(); 


                }
                break;
            case 32 :
                // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:1:301: SOLVENTHEAVYCONC
                {
                mSOLVENTHEAVYCONC(); 


                }
                break;
            case 33 :
                // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:1:318: SOLVENTFRACTION
                {
                mSOLVENTFRACTION(); 


                }
                break;
            case 34 :
                // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:1:334: PDBNAME
                {
                mPDBNAME(); 


                }
                break;
            case 35 :
                // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:1:342: WIREFRAMETYPE
                {
                mWIREFRAMETYPE(); 


                }
                break;
            case 36 :
                // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:1:356: MODELFILE
                {
                mMODELFILE(); 


                }
                break;
            case 37 :
                // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:1:366: CALCULATEESCAPE
                {
                mCALCULATEESCAPE(); 


                }
                break;
            case 38 :
                // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:1:382: CONTAINERMATERIALTYPE
                {
                mCONTAINERMATERIALTYPE(); 


                }
                break;
            case 39 :
                // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:1:404: MATERIALTYPE
                {
                mMATERIALTYPE(); 


                }
                break;
            case 40 :
                // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:1:417: NONE
                {
                mNONE(); 


                }
                break;
            case 41 :
                // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:1:422: MIXTURE
                {
                mMIXTURE(); 


                }
                break;
            case 42 :
                // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:1:430: ELEMENTAL
                {
                mELEMENTAL(); 


                }
                break;
            case 43 :
                // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:1:440: CONTAINERTHICKNESS
                {
                mCONTAINERTHICKNESS(); 


                }
                break;
            case 44 :
                // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:1:459: CONTAINERMATERIALMIXTURE
                {
                mCONTAINERMATERIALMIXTURE(); 


                }
                break;
            case 45 :
                // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:1:484: MATERIALMIXTURE
                {
                mMATERIALMIXTURE(); 


                }
                break;
            case 46 :
                // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:1:500: CONTAINERMATERIALELEMENTS
                {
                mCONTAINERMATERIALELEMENTS(); 


                }
                break;
            case 47 :
                // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:1:526: MATERIALELEMENTS
                {
                mMATERIALELEMENTS(); 


                }
                break;
            case 48 :
                // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:1:543: CONTAINERDENSITY
                {
                mCONTAINERDENSITY(); 


                }
                break;
            case 49 :
                // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:1:560: SEQUENCEFILE
                {
                mSEQUENCEFILE(); 


                }
                break;
            case 50 :
                // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:1:573: SEQFILE
                {
                mSEQFILE(); 


                }
                break;
            case 51 :
                // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:1:581: BEAM
                {
                mBEAM(); 


                }
                break;
            case 52 :
                // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:1:586: FLUX
                {
                mFLUX(); 


                }
                break;
            case 53 :
                // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:1:591: FWHM
                {
                mFWHM(); 


                }
                break;
            case 54 :
                // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:1:596: ENERGY
                {
                mENERGY(); 


                }
                break;
            case 55 :
                // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:1:603: KEV
                {
                mKEV(); 


                }
                break;
            case 56 :
                // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:1:607: FILE
                {
                mFILE(); 


                }
                break;
            case 57 :
                // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:1:612: PIXELSIZE
                {
                mPIXELSIZE(); 


                }
                break;
            case 58 :
                // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:1:622: COLLIMATION
                {
                mCOLLIMATION(); 


                }
                break;
            case 59 :
                // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:1:634: RECTANGULAR
                {
                mRECTANGULAR(); 


                }
                break;
            case 60 :
                // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:1:646: CIRCULAR
                {
                mCIRCULAR(); 


                }
                break;
            case 61 :
                // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:1:655: HORIZONTAL
                {
                mHORIZONTAL(); 


                }
                break;
            case 62 :
                // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:1:666: VERTICAL
                {
                mVERTICAL(); 


                }
                break;
            case 63 :
                // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:1:675: WEDGE
                {
                mWEDGE(); 


                }
                break;
            case 64 :
                // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:1:681: EXPOSURETIME
                {
                mEXPOSURETIME(); 


                }
                break;
            case 65 :
                // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:1:694: ANGULARRESOLUTION
                {
                mANGULARRESOLUTION(); 


                }
                break;
            case 66 :
                // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:1:712: STARTOFFSET
                {
                mSTARTOFFSET(); 


                }
                break;
            case 67 :
                // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:1:724: TRANSLATEPERDEGREE
                {
                mTRANSLATEPERDEGREE(); 


                }
                break;
            case 68 :
                // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:1:743: ROTAXBEAMOFFSET
                {
                mROTAXBEAMOFFSET(); 


                }
                break;
            case 69 :
                // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:1:759: FLOAT
                {
                mFLOAT(); 


                }
                break;
            case 70 :
                // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:1:765: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 71 :
                // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:1:773: WS
                {
                mWS(); 


                }
                break;
            case 72 :
                // C:\\Users\\jonathan\\workspace\\RADDOSE-3D\\lib\\antlrworks-parsergenerator\\Inputfile.g:1:776: STRING
                {
                mSTRING(); 


                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    protected DFA20 dfa20 = new DFA20(this);
    static final String DFA12_eotS =
        "\1\uffff\1\3\3\uffff";
    static final String DFA12_eofS =
        "\5\uffff";
    static final String DFA12_minS =
        "\2\56\3\uffff";
    static final String DFA12_maxS =
        "\2\71\3\uffff";
    static final String DFA12_acceptS =
        "\2\uffff\1\3\1\1\1\2";
    static final String DFA12_specialS =
        "\5\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\4\1\uffff\12\1",
            "",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "558:5: ( ( '0' .. '9' )+ | ( '0' .. '9' )+ '.' ( '0' .. '9' )* | '.' ( '0' .. '9' )+ )";
        }
    }
    static final String DFA20_eotS =
        "\1\uffff\23\40\1\32\1\31\1\32\4\uffff\5\40\1\uffff\50\40\1\32\2"+
        "\31\12\32\1\u008a\15\32\1\u009b\1\u009d\2\32\1\u00a1\4\32\1\u00a6"+
        "\14\32\1\u00b5\3\32\2\31\6\32\1\u00be\3\32\1\uffff\4\32\1\u00c7"+
        "\5\32\1\u00cd\4\32\1\u009b\1\uffff\1\u009d\1\uffff\3\32\1\uffff"+
        "\4\32\1\uffff\4\32\1\u00de\5\32\1\u00e4\1\u00e5\1\u00e6\1\u00e7"+
        "\1\uffff\10\32\1\uffff\5\32\1\u00f5\2\32\1\uffff\5\32\1\uffff\20"+
        "\32\1\uffff\1\32\1\u010e\3\32\4\uffff\15\32\1\uffff\1\u011f\5\32"+
        "\1\u0125\1\32\1\u0127\1\u0128\5\32\1\u012e\5\32\1\u0135\1\u0136"+
        "\1\32\1\uffff\5\32\1\u013d\11\32\1\u0147\1\uffff\1\u0148\1\32\1"+
        "\u014a\2\32\1\uffff\1\u014e\2\uffff\5\32\1\uffff\6\32\2\uffff\3"+
        "\32\1\u015e\2\32\1\uffff\1\u0161\3\32\1\u0165\4\32\2\uffff\1\u016b"+
        "\1\uffff\3\32\1\uffff\11\32\1\u0178\5\32\1\uffff\1\32\1\u0181\1"+
        "\uffff\3\32\1\uffff\2\32\1\u018a\2\32\1\uffff\7\32\1\u0194\1\32"+
        "\1\u0196\2\32\1\uffff\3\32\1\u019c\4\32\1\uffff\7\32\1\u018a\1\uffff"+
        "\1\u01a8\10\32\1\uffff\1\32\1\uffff\5\32\1\uffff\3\32\1\u01bc\3"+
        "\32\1\u01c0\3\32\1\uffff\3\32\1\u01c7\1\32\1\u01c9\3\32\1\u01ce"+
        "\1\32\1\u01d0\1\u01d1\6\32\1\uffff\3\32\1\uffff\3\32\1\u01dc\2\32"+
        "\1\uffff\1\32\1\uffff\1\32\1\u01e1\2\32\1\uffff\1\32\2\uffff\1\u01e5"+
        "\1\u01e6\10\32\1\uffff\4\32\1\uffff\3\32\2\uffff\24\32\1\u020a\3"+
        "\32\1\u020e\1\32\1\u0210\1\u0211\2\32\1\u0214\3\32\1\u0218\1\uffff"+
        "\2\32\1\u021b\1\uffff\1\32\2\uffff\2\32\1\uffff\1\u021f\2\32\1\uffff"+
        "\2\32\1\uffff\1\u0226\1\32\1\u0228\1\uffff\3\32\1\u022c\1\u022d"+
        "\1\32\1\uffff\1\32\1\uffff\3\32\2\uffff\6\32\1\u0239\1\u023a\2\32"+
        "\1\u023d\2\uffff\2\32\1\uffff\2\32\1\u0242\1\32\1\uffff\1\u0244"+
        "\1\uffff";
    static final String DFA20_eofS =
        "\u0245\uffff";
    static final String DFA20_minS =
        "\1\11\23\44\1\56\1\44\1\60\4\uffff\5\44\1\uffff\50\44\1\53\2\44"+
        "\1\123\1\106\1\124\1\114\2\103\1\105\1\116\1\106\1\105\1\44\2\101"+
        "\1\115\1\120\1\123\1\106\1\126\1\122\1\105\1\114\1\103\1\122\1\114"+
        "\2\44\1\124\1\101\1\44\1\115\1\122\1\105\1\124\1\44\1\124\1\104"+
        "\2\105\1\107\2\105\1\124\1\115\1\130\1\115\1\105\1\44\1\111\1\124"+
        "\1\60\2\44\1\124\1\103\1\101\1\111\2\125\1\44\1\123\1\122\1\116"+
        "\1\uffff\1\131\1\125\1\131\1\114\1\44\1\105\1\111\1\105\1\124\1"+
        "\101\1\44\1\117\1\101\1\105\1\114\1\44\1\uffff\1\44\1\uffff\1\101"+
        "\1\130\1\123\1\uffff\1\105\1\107\1\114\1\105\1\uffff\1\103\1\117"+
        "\1\105\1\116\1\44\1\106\1\105\1\114\1\122\1\125\4\44\1\uffff\1\132"+
        "\1\111\2\101\1\111\1\115\2\114\1\uffff\1\114\1\101\1\123\1\120\1"+
        "\114\1\44\2\105\1\uffff\1\116\1\114\1\116\1\117\1\122\1\uffff\1"+
        "\105\1\107\1\114\1\101\1\116\1\102\1\125\1\116\1\131\1\123\1\111"+
        "\1\105\1\116\1\123\2\101\1\uffff\1\122\1\44\1\106\1\111\1\122\4"+
        "\uffff\1\117\1\103\2\114\1\116\4\101\1\103\1\111\1\101\1\124\1\uffff"+
        "\1\44\1\121\1\103\1\105\1\124\1\106\1\44\1\105\2\44\1\122\1\107"+
        "\1\105\1\122\1\124\1\44\1\111\1\116\1\114\1\117\1\111\2\44\1\101"+
        "\1\uffff\1\111\1\101\1\105\1\116\1\101\1\44\1\103\1\105\2\124\1"+
        "\122\2\124\1\117\1\122\1\44\1\uffff\1\44\1\105\1\44\2\106\1\uffff"+
        "\1\44\2\uffff\1\122\1\125\1\101\1\105\1\101\1\uffff\1\105\1\132"+
        "\1\103\1\114\1\115\1\104\2\uffff\1\115\2\114\1\44\1\124\1\114\1"+
        "\uffff\1\44\1\122\1\111\1\105\1\44\1\105\1\111\1\116\1\101\2\uffff"+
        "\1\44\1\uffff\1\105\1\122\1\123\1\uffff\1\105\1\114\1\115\1\124"+
        "\1\114\1\122\1\105\1\117\1\105\1\44\1\105\1\125\3\105\1\uffff\1"+
        "\101\1\44\1\uffff\1\104\1\117\1\105\1\uffff\1\120\1\117\1\44\1\115"+
        "\1\111\1\uffff\2\101\1\105\1\123\1\101\1\117\1\111\1\44\1\115\1"+
        "\44\1\116\1\101\1\uffff\1\122\1\105\1\124\1\44\1\131\1\111\2\114"+
        "\1\uffff\1\101\1\110\1\105\1\116\1\123\1\105\1\116\1\44\1\uffff"+
        "\1\44\1\114\1\126\1\103\1\124\1\117\1\122\1\106\1\115\1\uffff\1"+
        "\111\1\uffff\1\103\1\126\2\123\1\120\1\uffff\1\120\1\130\1\105\1"+
        "\44\1\124\1\111\1\116\1\44\1\103\1\122\1\104\1\uffff\1\105\1\131"+
        "\1\124\1\44\1\114\1\44\1\106\1\105\1\103\1\44\1\131\2\44\2\120\2"+
        "\105\1\124\1\115\1\uffff\1\105\1\103\1\123\1\uffff\1\101\1\104\1"+
        "\105\1\44\1\103\1\111\1\uffff\1\125\1\uffff\1\123\1\44\1\122\1\116"+
        "\1\uffff\1\101\2\uffff\2\44\1\125\1\105\1\122\1\113\1\111\1\120"+
        "\1\105\1\103\1\uffff\2\117\1\124\1\105\1\uffff\1\117\2\124\2\uffff"+
        "\1\122\1\116\1\111\1\116\1\124\1\105\1\107\1\101\2\116\1\111\1\124"+
        "\1\116\1\122\1\117\1\105\1\124\1\101\1\105\1\131\1\44\1\122\1\131"+
        "\1\103\1\44\1\117\2\44\1\101\1\115\1\44\1\123\1\114\1\123\1\44\1"+
        "\uffff\1\105\1\115\1\44\1\uffff\1\116\2\uffff\1\124\1\123\1\uffff"+
        "\1\44\1\105\1\123\1\uffff\1\105\1\117\1\uffff\1\44\1\111\1\44\1"+
        "\uffff\1\131\1\111\1\114\2\44\1\104\1\uffff\1\117\1\uffff\1\120"+
        "\1\130\1\105\2\uffff\1\105\1\116\1\105\1\124\1\115\1\114\2\44\1"+
        "\125\1\105\1\44\2\uffff\1\122\1\116\1\uffff\1\105\1\124\1\44\1\123"+
        "\1\uffff\1\44\1\uffff";
    static final String DFA20_maxS =
        "\24\172\1\71\1\172\1\71\4\uffff\5\172\1\uffff\50\172\1\71\2\172"+
        "\1\163\1\146\1\164\1\154\2\143\1\145\1\156\1\146\1\145\1\172\2\141"+
        "\1\155\1\160\1\163\1\165\1\166\1\162\1\145\1\154\1\143\1\162\1\165"+
        "\2\172\1\164\1\141\1\172\1\155\1\162\1\145\1\164\1\172\1\164\1\162"+
        "\2\145\1\147\2\145\1\164\1\155\1\170\1\155\1\145\1\172\1\151\1\164"+
        "\1\71\2\172\1\164\1\143\1\141\1\151\2\165\1\172\1\163\1\162\1\156"+
        "\1\uffff\1\171\1\165\1\171\1\154\1\172\1\145\1\151\1\145\1\164\1"+
        "\141\1\172\1\157\1\141\1\145\1\154\1\172\1\uffff\1\172\1\uffff\1"+
        "\141\1\170\1\163\1\uffff\1\145\1\147\1\154\1\145\1\uffff\1\143\1"+
        "\157\2\156\1\172\1\146\1\145\1\154\1\162\1\165\4\172\1\uffff\1\172"+
        "\1\151\2\141\1\151\1\155\2\154\1\uffff\1\154\1\141\1\163\1\160\1"+
        "\154\1\172\2\145\1\uffff\1\156\1\154\1\156\1\157\1\162\1\uffff\1"+
        "\145\1\147\1\160\1\141\1\156\1\142\1\165\1\156\1\171\1\163\1\151"+
        "\1\145\1\156\1\163\2\141\1\uffff\1\162\1\172\1\146\1\151\1\162\4"+
        "\uffff\1\157\1\143\2\154\1\156\4\141\1\143\1\151\1\141\1\164\1\uffff"+
        "\1\172\1\161\1\143\1\145\1\164\1\146\1\172\1\145\2\172\1\162\1\147"+
        "\1\145\1\162\1\164\1\172\1\160\1\156\1\154\1\157\1\151\2\172\1\141"+
        "\1\uffff\1\151\1\141\1\145\1\156\1\141\1\172\1\143\1\145\2\164\1"+
        "\162\2\164\1\157\1\162\1\172\1\uffff\1\172\1\145\1\172\1\150\1\146"+
        "\1\uffff\1\172\2\uffff\1\162\1\165\1\141\1\145\1\141\1\uffff\1\145"+
        "\1\172\1\150\1\154\1\155\1\144\2\uffff\1\155\2\154\1\172\1\164\1"+
        "\154\1\uffff\1\172\1\162\1\151\1\145\1\172\1\145\1\151\1\156\1\141"+
        "\2\uffff\1\172\1\uffff\1\145\1\162\1\163\1\uffff\1\145\1\154\1\155"+
        "\1\164\1\154\1\162\1\145\1\157\1\145\1\172\1\145\1\165\2\145\1\164"+
        "\1\uffff\1\141\1\172\1\uffff\1\164\1\157\1\145\1\uffff\1\160\1\157"+
        "\1\172\1\155\1\151\1\uffff\2\141\1\145\1\163\1\141\1\157\1\151\1"+
        "\172\1\155\1\172\1\156\1\141\1\uffff\1\162\1\145\1\164\1\172\1\171"+
        "\1\151\2\154\1\uffff\1\141\1\150\1\145\1\156\1\163\1\145\1\156\1"+
        "\172\1\uffff\1\172\1\154\1\166\1\143\1\164\1\157\1\162\1\146\1\155"+
        "\1\uffff\1\151\1\uffff\1\143\1\166\2\163\1\171\1\uffff\1\160\1\170"+
        "\1\145\1\172\1\164\1\151\1\156\1\172\1\143\1\162\1\144\1\uffff\1"+
        "\145\1\171\1\164\1\172\1\154\1\172\1\146\1\145\1\143\1\172\1\171"+
        "\2\172\2\160\2\145\1\164\1\155\1\uffff\1\145\1\143\1\163\1\uffff"+
        "\1\141\1\144\1\145\1\172\1\143\1\151\1\uffff\1\165\1\uffff\1\163"+
        "\1\172\1\162\1\156\1\uffff\1\141\2\uffff\2\172\1\165\1\145\1\162"+
        "\1\153\1\151\1\160\1\145\1\143\1\uffff\2\157\1\164\1\145\1\uffff"+
        "\1\157\2\164\2\uffff\1\162\1\156\1\151\1\156\1\164\1\145\1\147\1"+
        "\141\2\156\1\151\1\164\1\156\1\162\1\157\1\145\1\164\1\141\1\145"+
        "\1\171\1\172\1\162\1\171\1\143\1\172\1\157\2\172\1\141\1\155\1\172"+
        "\1\163\1\154\1\163\1\172\1\uffff\1\145\1\155\1\172\1\uffff\1\156"+
        "\2\uffff\1\164\1\163\1\uffff\1\172\1\164\1\163\1\uffff\1\145\1\157"+
        "\1\uffff\1\172\1\151\1\172\1\uffff\1\171\1\151\1\154\2\172\1\144"+
        "\1\uffff\1\157\1\uffff\1\160\1\170\1\145\2\uffff\1\145\1\156\1\145"+
        "\1\164\1\155\1\154\2\172\1\165\1\145\1\172\2\uffff\1\162\1\156\1"+
        "\uffff\1\145\1\164\1\172\1\163\1\uffff\1\172\1\uffff";
    static final String DFA20_acceptS =
        "\27\uffff\1\106\1\107\1\105\1\110\5\uffff\1\37\151\uffff\1\4\20"+
        "\uffff\1\15\1\uffff\1\16\3\uffff\1\17\4\uffff\1\42\16\uffff\1\67"+
        "\10\uffff\1\2\10\uffff\1\20\5\uffff\1\7\20\uffff\1\50\5\uffff\1"+
        "\63\1\64\1\65\1\70\15\uffff\1\12\30\uffff\1\77\20\uffff\1\5\5\uffff"+
        "\1\6\1\uffff\1\24\1\25\5\uffff\1\66\6\uffff\1\34\1\35\6\uffff\1"+
        "\1\11\uffff\1\13\1\22\1\uffff\1\62\3\uffff\1\14\17\uffff\1\51\2"+
        "\uffff\1\11\3\uffff\1\74\5\uffff\1\21\14\uffff\1\27\10\uffff\1\76"+
        "\10\uffff\1\23\11\uffff\1\52\1\uffff\1\71\5\uffff\1\44\13\uffff"+
        "\1\10\23\uffff\1\75\3\uffff\1\72\6\uffff\1\102\1\uffff\1\73\4\uffff"+
        "\1\30\1\uffff\1\32\1\33\12\uffff\1\61\4\uffff\1\100\3\uffff\1\43"+
        "\1\47\43\uffff\1\45\3\uffff\1\41\1\uffff\1\104\1\26\2\uffff\1\55"+
        "\3\uffff\1\60\2\uffff\1\40\3\uffff\1\57\6\uffff\1\101\1\uffff\1"+
        "\36\3\uffff\1\53\1\103\13\uffff\1\31\1\46\2\uffff\1\3\4\uffff\1"+
        "\54\1\uffff\1\56";
    static final String DFA20_specialS =
        "\u0245\uffff}>";
    static final String[] DFA20_transitionS = {
            "\2\30\2\uffff\1\30\22\uffff\1\30\1\27\1\uffff\1\27\1\32\6\uffff"+
            "\1\31\1\uffff\1\24\1\26\1\27\12\25\7\uffff\1\6\1\16\1\1\1\3"+
            "\1\10\1\17\1\23\1\21\2\23\1\20\1\5\1\15\1\13\1\23\1\11\1\23"+
            "\1\7\1\4\1\2\1\12\1\22\1\14\3\23\4\uffff\1\32\1\uffff\1\6\1"+
            "\16\1\1\1\3\1\10\1\17\1\23\1\21\2\23\1\20\1\5\1\15\1\13\1\23"+
            "\1\11\1\23\1\7\1\4\1\2\1\12\1\22\1\14\3\23",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\1\35\7\37\1\36\5"+
            "\37\1\34\2\37\1\33\10\37\4\uffff\1\32\1\uffff\1\35\7\37\1\36"+
            "\5\37\1\34\2\37\1\33\10\37",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\21\37\1\42\6\37\1"+
            "\41\1\37\4\uffff\1\32\1\uffff\21\37\1\42\6\37\1\41\1\37",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\3\37\1\44\1\45\3"+
            "\37\1\43\13\37\1\46\5\37\4\uffff\1\32\1\uffff\3\37\1\44\1\45"+
            "\3\37\1\43\13\37\1\46\5\37",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\1\50\3\37\1\51\3"+
            "\37\1\47\5\37\1\52\4\37\1\53\6\37\4\uffff\1\32\1\uffff\1\50"+
            "\3\37\1\51\3\37\1\47\5\37\1\52\4\37\1\53\6\37",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\4\37\1\55\3\37\1"+
            "\54\21\37\4\uffff\1\32\1\uffff\4\37\1\55\3\37\1\54\21\37",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\1\37\1\56\13\37\1"+
            "\60\7\37\1\57\4\37\4\uffff\1\32\1\uffff\1\37\1\56\13\37\1\60"+
            "\7\37\1\57\4\37",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\3\37\1\61\1\62\11"+
            "\37\1\63\13\37\4\uffff\1\32\1\uffff\3\37\1\61\1\62\11\37\1\63"+
            "\13\37",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\13\37\1\65\1\37\1"+
            "\66\11\37\1\64\2\37\4\uffff\1\32\1\uffff\13\37\1\65\1\37\1\66"+
            "\11\37\1\64\2\37",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\3\37\1\71\4\37\1"+
            "\67\10\37\1\70\10\37\4\uffff\1\32\1\uffff\3\37\1\71\4\37\1\67"+
            "\10\37\1\70\10\37",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\15\37\1\72\14\37"+
            "\4\uffff\1\32\1\uffff\15\37\1\72\14\37",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\16\37\1\74\5\37\1"+
            "\73\5\37\4\uffff\1\32\1\uffff\16\37\1\74\5\37\1\73\5\37",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\4\37\1\76\3\37\1"+
            "\75\21\37\4\uffff\1\32\1\uffff\4\37\1\76\3\37\1\75\21\37",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\1\100\7\37\1\101"+
            "\5\37\1\77\13\37\4\uffff\1\32\1\uffff\1\100\7\37\1\101\5\37"+
            "\1\77\13\37",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\4\37\1\102\25\37"+
            "\4\uffff\1\32\1\uffff\4\37\1\102\25\37",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\10\37\1\105\2\37"+
            "\1\103\12\37\1\104\3\37\4\uffff\1\32\1\uffff\10\37\1\105\2\37"+
            "\1\103\12\37\1\104\3\37",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\4\37\1\106\25\37"+
            "\4\uffff\1\32\1\uffff\4\37\1\106\25\37",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\16\37\1\107\13\37"+
            "\4\uffff\1\32\1\uffff\16\37\1\107\13\37",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\4\37\1\110\25\37"+
            "\4\uffff\1\32\1\uffff\4\37\1\110\25\37",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\37\4\uffff\1\32"+
            "\1\uffff\32\37",
            "\1\26\1\uffff\12\25",
            "\1\32\10\uffff\1\32\1\112\1\uffff\12\25\7\uffff\4\32\1\111"+
            "\25\32\4\uffff\1\32\1\uffff\4\32\1\111\25\32",
            "\12\113",
            "",
            "",
            "",
            "",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\30\32\1\114\1\32"+
            "\4\uffff\1\32\1\uffff\30\32\1\114\1\32",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\4\32\1\115\6\32\1"+
            "\117\1\32\1\116\14\32\4\uffff\1\32\1\uffff\4\32\1\115\6\32\1"+
            "\117\1\32\1\116\14\32",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\13\32\1\120\16\32"+
            "\4\uffff\1\32\1\uffff\13\32\1\120\16\32",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\21\32\1\121\10\32"+
            "\4\uffff\1\32\1\uffff\21\32\1\121\10\32",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\17\32\1\122\12\32"+
            "\4\uffff\1\32\1\uffff\17\32\1\122\12\32",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\1\123\31\32\4\uffff"+
            "\1\32\1\uffff\1\123\31\32",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\5\32\1\124\6\32\1"+
            "\125\15\32\4\uffff\1\32\1\uffff\5\32\1\124\6\32\1\125\15\32",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\14\32\1\126\15\32"+
            "\4\uffff\1\32\1\uffff\14\32\1\126\15\32",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\2\32\1\127\2\32\1"+
            "\130\24\32\4\uffff\1\32\1\uffff\2\32\1\127\2\32\1\130\24\32",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\14\32\1\131\15\32"+
            "\4\uffff\1\32\1\uffff\14\32\1\131\15\32",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\14\32\1\132\15\32"+
            "\4\uffff\1\32\1\uffff\14\32\1\132\15\32",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\27\32\1\133\2\32"+
            "\4\uffff\1\32\1\uffff\27\32\1\133\2\32",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\20\32\1\134\11\32"+
            "\4\uffff\1\32\1\uffff\20\32\1\134\11\32",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\13\32\1\135\16\32"+
            "\4\uffff\1\32\1\uffff\13\32\1\135\16\32",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\1\136\31\32\4\uffff"+
            "\1\32\1\uffff\1\136\31\32",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\15\32\1\137\14\32"+
            "\4\uffff\1\32\1\uffff\15\32\1\137\14\32",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\1\140\31\32\4\uffff"+
            "\1\32\1\uffff\1\140\31\32",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\22\32\1\141\7\32"+
            "\4\uffff\1\32\1\uffff\22\32\1\141\7\32",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\4\32\1\142\25\32"+
            "\4\uffff\1\32\1\uffff\4\32\1\142\25\32",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\6\32\1\143\23\32"+
            "\4\uffff\1\32\1\uffff\6\32\1\143\23\32",
            "\1\32\10\uffff\2\32\1\uffff\3\32\1\145\6\32\7\uffff\25\32\1"+
            "\144\4\32\4\uffff\1\32\1\uffff\25\32\1\144\4\32",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\2\32\1\146\27\32"+
            "\4\uffff\1\32\1\uffff\2\32\1\146\27\32",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\23\32\1\147\6\32"+
            "\4\uffff\1\32\1\uffff\23\32\1\147\6\32",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\17\32\1\150\12\32"+
            "\4\uffff\1\32\1\uffff\17\32\1\150\12\32",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\4\32\1\151\25\32"+
            "\4\uffff\1\32\1\uffff\4\32\1\151\25\32",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\4\32\1\152\25\32"+
            "\4\uffff\1\32\1\uffff\4\32\1\152\25\32",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\27\32\1\153\2\32"+
            "\4\uffff\1\32\1\uffff\27\32\1\153\2\32",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\16\32\1\154\13\32"+
            "\4\uffff\1\32\1\uffff\16\32\1\154\13\32",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\1\32\1\155\30\32"+
            "\4\uffff\1\32\1\uffff\1\32\1\155\30\32",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\10\32\1\156\21\32"+
            "\4\uffff\1\32\1\uffff\10\32\1\156\21\32",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\14\32\1\157\15\32"+
            "\4\uffff\1\32\1\uffff\14\32\1\157\15\32",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\15\32\1\160\14\32"+
            "\4\uffff\1\32\1\uffff\15\32\1\160\14\32",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\21\32\1\161\10\32"+
            "\4\uffff\1\32\1\uffff\21\32\1\161\10\32",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\3\32\1\162\26\32"+
            "\4\uffff\1\32\1\uffff\3\32\1\162\26\32",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\3\32\1\163\26\32"+
            "\4\uffff\1\32\1\uffff\3\32\1\163\26\32",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\23\32\1\164\6\32"+
            "\4\uffff\1\32\1\uffff\23\32\1\164\6\32",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\27\32\1\165\2\32"+
            "\4\uffff\1\32\1\uffff\27\32\1\165\2\32",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\1\166\31\32\4\uffff"+
            "\1\32\1\uffff\1\166\31\32",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\24\32\1\167\5\32"+
            "\4\uffff\1\32\1\uffff\24\32\1\167\5\32",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\7\32\1\170\22\32"+
            "\4\uffff\1\32\1\uffff\7\32\1\170\22\32",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\13\32\1\171\16\32"+
            "\4\uffff\1\32\1\uffff\13\32\1\171\16\32",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\25\32\1\172\4\32"+
            "\4\uffff\1\32\1\uffff\25\32\1\172\4\32",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\21\32\1\173\10\32"+
            "\4\uffff\1\32\1\uffff\21\32\1\173\10\32",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\21\32\1\174\10\32"+
            "\4\uffff\1\32\1\uffff\21\32\1\174\10\32",
            "\1\31\1\uffff\1\175\2\uffff\12\176",
            "\1\32\10\uffff\2\32\1\uffff\12\177\7\uffff\4\32\1\111\25\32"+
            "\4\uffff\1\32\1\uffff\4\32\1\111\25\32",
            "\1\32\10\uffff\2\32\1\uffff\12\113\7\uffff\4\32\1\111\25\32"+
            "\4\uffff\1\32\1\uffff\4\32\1\111\25\32",
            "\1\u0080\37\uffff\1\u0080",
            "\1\u0081\37\uffff\1\u0081",
            "\1\u0082\37\uffff\1\u0082",
            "\1\u0083\37\uffff\1\u0083",
            "\1\u0084\37\uffff\1\u0084",
            "\1\u0085\37\uffff\1\u0085",
            "\1\u0086\37\uffff\1\u0086",
            "\1\u0087\37\uffff\1\u0087",
            "\1\u0088\37\uffff\1\u0088",
            "\1\u0089\37\uffff\1\u0089",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "\1\u008b\37\uffff\1\u008b",
            "\1\u008c\37\uffff\1\u008c",
            "\1\u008d\37\uffff\1\u008d",
            "\1\u008e\37\uffff\1\u008e",
            "\1\u008f\37\uffff\1\u008f",
            "\1\u0091\16\uffff\1\u0090\20\uffff\1\u0091\16\uffff\1\u0090",
            "\1\u0092\37\uffff\1\u0092",
            "\1\u0093\37\uffff\1\u0093",
            "\1\u0094\37\uffff\1\u0094",
            "\1\u0095\37\uffff\1\u0095",
            "\1\u0096\37\uffff\1\u0096",
            "\1\u0097\37\uffff\1\u0097",
            "\1\u0098\10\uffff\1\u0099\26\uffff\1\u0098\10\uffff\1\u0099",
            "\1\32\10\uffff\2\32\1\uffff\2\32\2\u009a\6\32\7\uffff\32\32"+
            "\4\uffff\1\32\1\uffff\32\32",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\3\32\1\u009c\26\32"+
            "\4\uffff\1\32\1\uffff\3\32\1\u009c\26\32",
            "\1\u009e\37\uffff\1\u009e",
            "\1\u009f\37\uffff\1\u009f",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\16\32\1\u00a0\13"+
            "\32\4\uffff\1\32\1\uffff\16\32\1\u00a0\13\32",
            "\1\u00a2\37\uffff\1\u00a2",
            "\1\u00a3\37\uffff\1\u00a3",
            "\1\u00a4\37\uffff\1\u00a4",
            "\1\u00a5\37\uffff\1\u00a5",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "\1\u00a7\37\uffff\1\u00a7",
            "\1\u00aa\10\uffff\1\u00a8\4\uffff\1\u00a9\21\uffff\1\u00aa"+
            "\10\uffff\1\u00a8\4\uffff\1\u00a9",
            "\1\u00ab\37\uffff\1\u00ab",
            "\1\u00ac\37\uffff\1\u00ac",
            "\1\u00ad\37\uffff\1\u00ad",
            "\1\u00ae\37\uffff\1\u00ae",
            "\1\u00af\37\uffff\1\u00af",
            "\1\u00b0\37\uffff\1\u00b0",
            "\1\u00b1\37\uffff\1\u00b1",
            "\1\u00b2\37\uffff\1\u00b2",
            "\1\u00b3\37\uffff\1\u00b3",
            "\1\u00b4\37\uffff\1\u00b4",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "\1\u00b6\37\uffff\1\u00b6",
            "\1\u00b7\37\uffff\1\u00b7",
            "\12\176",
            "\1\32\10\uffff\2\32\1\uffff\12\176\7\uffff\32\32\4\uffff\1"+
            "\32\1\uffff\32\32",
            "\1\32\10\uffff\2\32\1\uffff\12\177\7\uffff\4\32\1\111\25\32"+
            "\4\uffff\1\32\1\uffff\4\32\1\111\25\32",
            "\1\u00b8\37\uffff\1\u00b8",
            "\1\u00b9\37\uffff\1\u00b9",
            "\1\u00ba\37\uffff\1\u00ba",
            "\1\u00bb\37\uffff\1\u00bb",
            "\1\u00bc\37\uffff\1\u00bc",
            "\1\u00bd\37\uffff\1\u00bd",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "\1\u00bf\37\uffff\1\u00bf",
            "\1\u00c0\37\uffff\1\u00c0",
            "\1\u00c1\37\uffff\1\u00c1",
            "",
            "\1\u00c2\37\uffff\1\u00c2",
            "\1\u00c3\37\uffff\1\u00c3",
            "\1\u00c4\37\uffff\1\u00c4",
            "\1\u00c5\37\uffff\1\u00c5",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\22\32\1\u00c6\7\32"+
            "\4\uffff\1\32\1\uffff\22\32\1\u00c6\7\32",
            "\1\u00c8\37\uffff\1\u00c8",
            "\1\u00c9\37\uffff\1\u00c9",
            "\1\u00ca\37\uffff\1\u00ca",
            "\1\u00cb\37\uffff\1\u00cb",
            "\1\u00cc\37\uffff\1\u00cc",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "\1\u00ce\37\uffff\1\u00ce",
            "\1\u00cf\37\uffff\1\u00cf",
            "\1\u00d0\37\uffff\1\u00d0",
            "\1\u00d1\37\uffff\1\u00d1",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "",
            "\1\u00d2\37\uffff\1\u00d2",
            "\1\u00d3\37\uffff\1\u00d3",
            "\1\u00d4\37\uffff\1\u00d4",
            "",
            "\1\u00d5\37\uffff\1\u00d5",
            "\1\u00d6\37\uffff\1\u00d6",
            "\1\u00d7\37\uffff\1\u00d7",
            "\1\u00d8\37\uffff\1\u00d8",
            "",
            "\1\u00d9\37\uffff\1\u00d9",
            "\1\u00da\37\uffff\1\u00da",
            "\1\u00db\10\uffff\1\u00dc\26\uffff\1\u00db\10\uffff\1\u00dc",
            "\1\u00dd\37\uffff\1\u00dd",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "\1\u00df\37\uffff\1\u00df",
            "\1\u00e0\37\uffff\1\u00e0",
            "\1\u00e1\37\uffff\1\u00e1",
            "\1\u00e2\37\uffff\1\u00e2",
            "\1\u00e3\37\uffff\1\u00e3",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "",
            "\1\u00e8\37\uffff\1\u00e8",
            "\1\u00e9\37\uffff\1\u00e9",
            "\1\u00ea\37\uffff\1\u00ea",
            "\1\u00eb\37\uffff\1\u00eb",
            "\1\u00ec\37\uffff\1\u00ec",
            "\1\u00ed\37\uffff\1\u00ed",
            "\1\u00ee\37\uffff\1\u00ee",
            "\1\u00ef\37\uffff\1\u00ef",
            "",
            "\1\u00f0\37\uffff\1\u00f0",
            "\1\u00f1\37\uffff\1\u00f1",
            "\1\u00f2\37\uffff\1\u00f2",
            "\1\u00f3\37\uffff\1\u00f3",
            "\1\u00f4\37\uffff\1\u00f4",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "\1\u00f6\37\uffff\1\u00f6",
            "\1\u00f7\37\uffff\1\u00f7",
            "",
            "\1\u00f8\37\uffff\1\u00f8",
            "\1\u00f9\37\uffff\1\u00f9",
            "\1\u00fa\37\uffff\1\u00fa",
            "\1\u00fb\37\uffff\1\u00fb",
            "\1\u00fc\37\uffff\1\u00fc",
            "",
            "\1\115\37\uffff\1\115",
            "\1\u00fd\37\uffff\1\u00fd",
            "\1\u00ff\3\uffff\1\u00fe\33\uffff\1\u00ff\3\uffff\1\u00fe",
            "\1\u0100\37\uffff\1\u0100",
            "\1\u0101\37\uffff\1\u0101",
            "\1\u0102\37\uffff\1\u0102",
            "\1\u0103\37\uffff\1\u0103",
            "\1\u0104\37\uffff\1\u0104",
            "\1\u0105\37\uffff\1\u0105",
            "\1\u0106\37\uffff\1\u0106",
            "\1\u0107\37\uffff\1\u0107",
            "\1\u0108\37\uffff\1\u0108",
            "\1\u0109\37\uffff\1\u0109",
            "\1\u010a\37\uffff\1\u010a",
            "\1\u010b\37\uffff\1\u010b",
            "\1\u010c\37\uffff\1\u010c",
            "",
            "\1\u010d\37\uffff\1\u010d",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "\1\u010f\37\uffff\1\u010f",
            "\1\u0110\37\uffff\1\u0110",
            "\1\u0111\37\uffff\1\u0111",
            "",
            "",
            "",
            "",
            "\1\u0112\37\uffff\1\u0112",
            "\1\u0113\37\uffff\1\u0113",
            "\1\u0114\37\uffff\1\u0114",
            "\1\u0115\37\uffff\1\u0115",
            "\1\u0116\37\uffff\1\u0116",
            "\1\u0117\37\uffff\1\u0117",
            "\1\u0118\37\uffff\1\u0118",
            "\1\u0119\37\uffff\1\u0119",
            "\1\u011a\37\uffff\1\u011a",
            "\1\u011b\37\uffff\1\u011b",
            "\1\u011c\37\uffff\1\u011c",
            "\1\u011d\37\uffff\1\u011d",
            "\1\u011e\37\uffff\1\u011e",
            "",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "\1\u0120\37\uffff\1\u0120",
            "\1\u0121\37\uffff\1\u0121",
            "\1\u0122\37\uffff\1\u0122",
            "\1\u0123\37\uffff\1\u0123",
            "\1\u0124\37\uffff\1\u0124",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "\1\u0126\37\uffff\1\u0126",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "\1\u0129\37\uffff\1\u0129",
            "\1\u012a\37\uffff\1\u012a",
            "\1\u012b\37\uffff\1\u012b",
            "\1\u012c\37\uffff\1\u012c",
            "\1\u012d\37\uffff\1\u012d",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "\1\u0130\6\uffff\1\u012f\30\uffff\1\u0130\6\uffff\1\u012f",
            "\1\u0131\37\uffff\1\u0131",
            "\1\u0132\37\uffff\1\u0132",
            "\1\u0133\37\uffff\1\u0133",
            "\1\u0134\37\uffff\1\u0134",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "\1\u0137\37\uffff\1\u0137",
            "",
            "\1\u0138\37\uffff\1\u0138",
            "\1\u0139\37\uffff\1\u0139",
            "\1\u013a\37\uffff\1\u013a",
            "\1\u013b\37\uffff\1\u013b",
            "\1\u013c\37\uffff\1\u013c",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "\1\u013e\37\uffff\1\u013e",
            "\1\u013f\37\uffff\1\u013f",
            "\1\u0140\37\uffff\1\u0140",
            "\1\u0141\37\uffff\1\u0141",
            "\1\u0142\37\uffff\1\u0142",
            "\1\u0143\37\uffff\1\u0143",
            "\1\u0144\37\uffff\1\u0144",
            "\1\u0145\37\uffff\1\u0145",
            "\1\u0146\37\uffff\1\u0146",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "\1\u0149\37\uffff\1\u0149",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "\1\u014c\1\uffff\1\u014b\35\uffff\1\u014c\1\uffff\1\u014b",
            "\1\u014d\37\uffff\1\u014d",
            "",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "",
            "",
            "\1\u014f\37\uffff\1\u014f",
            "\1\u0150\37\uffff\1\u0150",
            "\1\u0151\37\uffff\1\u0151",
            "\1\u0152\37\uffff\1\u0152",
            "\1\u0153\37\uffff\1\u0153",
            "",
            "\1\u0154\37\uffff\1\u0154",
            "\1\u0155\37\uffff\1\u0155",
            "\1\u0156\4\uffff\1\u0157\32\uffff\1\u0156\4\uffff\1\u0157",
            "\1\u0158\37\uffff\1\u0158",
            "\1\u0159\37\uffff\1\u0159",
            "\1\u015a\37\uffff\1\u015a",
            "",
            "",
            "\1\u015b\37\uffff\1\u015b",
            "\1\u015c\37\uffff\1\u015c",
            "\1\u015d\37\uffff\1\u015d",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "\1\u015f\37\uffff\1\u015f",
            "\1\u0160\37\uffff\1\u0160",
            "",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "\1\u0162\37\uffff\1\u0162",
            "\1\u0163\37\uffff\1\u0163",
            "\1\u0164\37\uffff\1\u0164",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "\1\u0166\37\uffff\1\u0166",
            "\1\u0167\37\uffff\1\u0167",
            "\1\u0168\37\uffff\1\u0168",
            "\1\u0169\37\uffff\1\u0169",
            "",
            "",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\5\32\1\u016a\24\32"+
            "\4\uffff\1\32\1\uffff\5\32\1\u016a\24\32",
            "",
            "\1\u016c\37\uffff\1\u016c",
            "\1\u016d\37\uffff\1\u016d",
            "\1\u016e\37\uffff\1\u016e",
            "",
            "\1\u016f\37\uffff\1\u016f",
            "\1\u0170\37\uffff\1\u0170",
            "\1\u0171\37\uffff\1\u0171",
            "\1\u0172\37\uffff\1\u0172",
            "\1\u0173\37\uffff\1\u0173",
            "\1\u0174\37\uffff\1\u0174",
            "\1\u0175\37\uffff\1\u0175",
            "\1\u0176\37\uffff\1\u0176",
            "\1\u0177\37\uffff\1\u0177",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "\1\u0179\37\uffff\1\u0179",
            "\1\u017a\37\uffff\1\u017a",
            "\1\u017b\37\uffff\1\u017b",
            "\1\u017c\37\uffff\1\u017c",
            "\1\u017f\7\uffff\1\u017e\6\uffff\1\u017d\20\uffff\1\u017f\7"+
            "\uffff\1\u017e\6\uffff\1\u017d",
            "",
            "\1\u0180\37\uffff\1\u0180",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "",
            "\1\u0184\10\uffff\1\u0182\6\uffff\1\u0183\17\uffff\1\u0184"+
            "\10\uffff\1\u0182\6\uffff\1\u0183",
            "\1\u0185\37\uffff\1\u0185",
            "\1\u0186\37\uffff\1\u0186",
            "",
            "\1\u0187\37\uffff\1\u0187",
            "\1\u0188\37\uffff\1\u0188",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\22\32\1\u0189\7\32"+
            "\4\uffff\1\32\1\uffff\22\32\1\u0189\7\32",
            "\1\u018b\37\uffff\1\u018b",
            "\1\u018c\37\uffff\1\u018c",
            "",
            "\1\u018d\37\uffff\1\u018d",
            "\1\u018e\37\uffff\1\u018e",
            "\1\u018f\37\uffff\1\u018f",
            "\1\u0190\37\uffff\1\u0190",
            "\1\u0191\37\uffff\1\u0191",
            "\1\u0192\37\uffff\1\u0192",
            "\1\u0193\37\uffff\1\u0193",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "\1\u0195\37\uffff\1\u0195",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "\1\u0197\37\uffff\1\u0197",
            "\1\u0198\37\uffff\1\u0198",
            "",
            "\1\u0199\37\uffff\1\u0199",
            "\1\u019a\37\uffff\1\u019a",
            "\1\u019b\37\uffff\1\u019b",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "\1\u019d\37\uffff\1\u019d",
            "\1\u019e\37\uffff\1\u019e",
            "\1\u019f\37\uffff\1\u019f",
            "\1\u01a0\37\uffff\1\u01a0",
            "",
            "\1\u01a1\37\uffff\1\u01a1",
            "\1\u01a2\37\uffff\1\u01a2",
            "\1\u01a3\37\uffff\1\u01a3",
            "\1\u01a4\37\uffff\1\u01a4",
            "\1\u01a5\37\uffff\1\u01a5",
            "\1\u01a6\37\uffff\1\u01a6",
            "\1\u01a7\37\uffff\1\u01a7",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "\1\u01a9\37\uffff\1\u01a9",
            "\1\u01aa\37\uffff\1\u01aa",
            "\1\u01ab\37\uffff\1\u01ab",
            "\1\u01ac\37\uffff\1\u01ac",
            "\1\u01ad\37\uffff\1\u01ad",
            "\1\u01ae\37\uffff\1\u01ae",
            "\1\u01af\37\uffff\1\u01af",
            "\1\u01b0\37\uffff\1\u01b0",
            "",
            "\1\u01b1\37\uffff\1\u01b1",
            "",
            "\1\u01b2\37\uffff\1\u01b2",
            "\1\u01b3\37\uffff\1\u01b3",
            "\1\u01b4\37\uffff\1\u01b4",
            "\1\u01b5\37\uffff\1\u01b5",
            "\1\u01b8\10\uffff\1\u01b6\26\uffff\1\u01b8\10\uffff\1\u01b7",
            "",
            "\1\u01b9\37\uffff\1\u01b9",
            "\1\u01ba\37\uffff\1\u01ba",
            "\1\u01bb\37\uffff\1\u01bb",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "\1\u01bd\37\uffff\1\u01bd",
            "\1\u01be\37\uffff\1\u01be",
            "\1\u01bf\37\uffff\1\u01bf",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "\1\u01c1\37\uffff\1\u01c1",
            "\1\u01c2\37\uffff\1\u01c2",
            "\1\u01c3\37\uffff\1\u01c3",
            "",
            "\1\u01c4\37\uffff\1\u01c4",
            "\1\u01c5\37\uffff\1\u01c5",
            "\1\u01c6\37\uffff\1\u01c6",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "\1\u01c8\37\uffff\1\u01c8",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "\1\u01ca\37\uffff\1\u01ca",
            "\1\u01cb\37\uffff\1\u01cb",
            "\1\u01cc\37\uffff\1\u01cc",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\4\32\1\u01cd\25\32"+
            "\4\uffff\1\32\1\uffff\4\32\1\u01cd\25\32",
            "\1\u01cf\37\uffff\1\u01cf",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "\1\u01b8\37\uffff\1\u01b8",
            "\1\u01b8\37\uffff\1\u01b8",
            "\1\u01d2\37\uffff\1\u01d2",
            "\1\u01d3\37\uffff\1\u01d3",
            "\1\u01d4\37\uffff\1\u01d4",
            "\1\u01d5\37\uffff\1\u01d5",
            "",
            "\1\u01d6\37\uffff\1\u01d6",
            "\1\u01d7\37\uffff\1\u01d7",
            "\1\u01d8\37\uffff\1\u01d8",
            "",
            "\1\u01d9\37\uffff\1\u01d9",
            "\1\u01da\37\uffff\1\u01da",
            "\1\u01db\37\uffff\1\u01db",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "\1\u01dd\37\uffff\1\u01dd",
            "\1\u01de\37\uffff\1\u01de",
            "",
            "\1\u01df\37\uffff\1\u01df",
            "",
            "\1\u01e0\37\uffff\1\u01e0",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "\1\u01e2\37\uffff\1\u01e2",
            "\1\u01e3\37\uffff\1\u01e3",
            "",
            "\1\u01e4\37\uffff\1\u01e4",
            "",
            "",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "\1\u01e7\37\uffff\1\u01e7",
            "\1\u01e8\37\uffff\1\u01e8",
            "\1\u01e9\37\uffff\1\u01e9",
            "\1\u01ea\37\uffff\1\u01ea",
            "\1\u01eb\37\uffff\1\u01eb",
            "\1\u01ec\37\uffff\1\u01ec",
            "\1\u01ed\37\uffff\1\u01ed",
            "\1\u01ee\37\uffff\1\u01ee",
            "",
            "\1\u01ef\37\uffff\1\u01ef",
            "\1\u01f0\37\uffff\1\u01f0",
            "\1\u01f1\37\uffff\1\u01f1",
            "\1\u01f2\37\uffff\1\u01f2",
            "",
            "\1\u01f3\37\uffff\1\u01f3",
            "\1\u01f4\37\uffff\1\u01f4",
            "\1\u01f5\37\uffff\1\u01f5",
            "",
            "",
            "\1\u01f6\37\uffff\1\u01f6",
            "\1\u01f7\37\uffff\1\u01f7",
            "\1\u01f8\37\uffff\1\u01f8",
            "\1\u01f9\37\uffff\1\u01f9",
            "\1\u01fa\37\uffff\1\u01fa",
            "\1\u01fb\37\uffff\1\u01fb",
            "\1\u01fc\37\uffff\1\u01fc",
            "\1\u01fd\37\uffff\1\u01fd",
            "\1\u01fe\37\uffff\1\u01fe",
            "\1\u01ff\37\uffff\1\u01ff",
            "\1\u0200\37\uffff\1\u0200",
            "\1\u0201\37\uffff\1\u0201",
            "\1\u0202\37\uffff\1\u0202",
            "\1\u0203\37\uffff\1\u0203",
            "\1\u0204\37\uffff\1\u0204",
            "\1\u0205\37\uffff\1\u0205",
            "\1\u0206\37\uffff\1\u0206",
            "\1\u0207\37\uffff\1\u0207",
            "\1\u0208\37\uffff\1\u0208",
            "\1\u0209\37\uffff\1\u0209",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "\1\u020b\37\uffff\1\u020b",
            "\1\u020c\37\uffff\1\u020c",
            "\1\u020d\37\uffff\1\u020d",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "\1\u020f\37\uffff\1\u020f",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "\1\u0212\37\uffff\1\u0212",
            "\1\u0213\37\uffff\1\u0213",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "\1\u0215\37\uffff\1\u0215",
            "\1\u0216\37\uffff\1\u0216",
            "\1\u0217\37\uffff\1\u0217",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "",
            "\1\u0219\37\uffff\1\u0219",
            "\1\u021a\37\uffff\1\u021a",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "",
            "\1\u021c\37\uffff\1\u021c",
            "",
            "",
            "\1\u021d\37\uffff\1\u021d",
            "\1\u021e\37\uffff\1\u021e",
            "",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "\1\u0222\7\uffff\1\u0221\6\uffff\1\u0220\20\uffff\1\u0222\7"+
            "\uffff\1\u0221\6\uffff\1\u0220",
            "\1\u0223\37\uffff\1\u0223",
            "",
            "\1\u0224\37\uffff\1\u0224",
            "\1\u0225\37\uffff\1\u0225",
            "",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "\1\u0227\37\uffff\1\u0227",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "",
            "\1\u0229\37\uffff\1\u0229",
            "\1\u022a\37\uffff\1\u022a",
            "\1\u022b\37\uffff\1\u022b",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "\1\u022e\37\uffff\1\u022e",
            "",
            "\1\u022f\37\uffff\1\u022f",
            "",
            "\1\u0230\37\uffff\1\u0230",
            "\1\u0231\37\uffff\1\u0231",
            "\1\u0232\37\uffff\1\u0232",
            "",
            "",
            "\1\u0233\37\uffff\1\u0233",
            "\1\u0234\37\uffff\1\u0234",
            "\1\u0235\37\uffff\1\u0235",
            "\1\u0236\37\uffff\1\u0236",
            "\1\u0237\37\uffff\1\u0237",
            "\1\u0238\37\uffff\1\u0238",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "\1\u023b\37\uffff\1\u023b",
            "\1\u023c\37\uffff\1\u023c",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "",
            "",
            "\1\u023e\37\uffff\1\u023e",
            "\1\u023f\37\uffff\1\u023f",
            "",
            "\1\u0240\37\uffff\1\u0240",
            "\1\u0241\37\uffff\1\u0241",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "\1\u0243\37\uffff\1\u0243",
            "",
            "\1\32\10\uffff\2\32\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            ""
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( CRYSTAL | TYPE | DIFFRACTIONDECAYMODEL | DDM | SIMPLE | LINEAR | LEAL | DECAYPARAM | ABSCOEFCALC | DUMMY | DEFAULT | AVERAGE | RDFORTAN | RDJAVA | PDB | SAXS | SEQUENCE | SAXSSEQ | DIMENSION | ANGLEP | ANGLEL | PIXELSPERMICRON | UNITCELL | PROTEINCONC | PROTEINCONCENTRATION | NUMMONOMERS | NUMRESIDUES | NUMRNA | NUMDNA | PROTEINHEAVYATOMS | ELEMENT | SOLVENTHEAVYCONC | SOLVENTFRACTION | PDBNAME | WIREFRAMETYPE | MODELFILE | CALCULATEESCAPE | CONTAINERMATERIALTYPE | MATERIALTYPE | NONE | MIXTURE | ELEMENTAL | CONTAINERTHICKNESS | CONTAINERMATERIALMIXTURE | MATERIALMIXTURE | CONTAINERMATERIALELEMENTS | MATERIALELEMENTS | CONTAINERDENSITY | SEQUENCEFILE | SEQFILE | BEAM | FLUX | FWHM | ENERGY | KEV | FILE | PIXELSIZE | COLLIMATION | RECTANGULAR | CIRCULAR | HORIZONTAL | VERTICAL | WEDGE | EXPOSURETIME | ANGULARRESOLUTION | STARTOFFSET | TRANSLATEPERDEGREE | ROTAXBEAMOFFSET | FLOAT | COMMENT | WS | STRING );";
        }
    }
 

}