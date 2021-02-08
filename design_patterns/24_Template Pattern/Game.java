public abstract class Game{
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    //Template Pattern

    public final void play(){
        initialize();
        startPlay();
        endPlay();
    }

}