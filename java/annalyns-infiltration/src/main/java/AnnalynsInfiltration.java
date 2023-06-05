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
       return prisonerIsAwake && !archerIsAwake;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        if (petDogIsPresent) {
            return !archerIsAwake;
        } else {
            return !knightIsAwake && !archerIsAwake &&  prisonerIsAwake;
        }
    }
}
