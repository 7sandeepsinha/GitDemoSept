public class CarAddMusicsystem implements MusicSystem {
    MusicSystem musicSystem;

    public void setMusicSystem(MusicSystem musicSystem) {
        this.musicSystem = musicSystem;

    }

    @Override
    public void play() {
        // TODO Auto-generated method stub
        System.out.println("Play");

    }

    @Override
    public void pause() {
        // TODO Auto-generated method stub
        System.out.println("Pause");
    }

}
