package mc.endorianetwork.uhcrun.Game;

public enum UHCState {

    WAIT(true), GAME(false), GAMEPVP(false), FINISH(false);

    private boolean canJoin;
    private static UHCState currentState;

    UHCState(boolean canJoin){
        this.canJoin = canJoin;
    }

    public boolean canJoin(){
        return canJoin;
    }

    public static void setState(UHCState state){
        UHCState.currentState = state;
    }

    public static boolean isState(UHCState state){
        return UHCState.currentState == state;
    }

    public static UHCState getState(){
        return currentState;
    }
}
