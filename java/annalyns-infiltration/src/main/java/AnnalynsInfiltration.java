import java.util.Arrays;
class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        boolean[] groupAwaknessLevels = {knightIsAwake, archerIsAwake, prisonerIsAwake};
        for(boolean indivitualAwaknessLevel : groupAwaknessLevels){
            if(indivitualAwaknessLevel){ return true;}
        }
        return false;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
       if (prisonerIsAwake && !archerIsAwake) { return true; }
       return false;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        if (petDogIsPresent) {
            if (!archerIsAwake) { return true; }
        } else {
            if (!knightIsAwake && !archerIsAwake) { return true; }
        }
        return false;
    }
}
