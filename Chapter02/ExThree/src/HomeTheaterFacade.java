package facade;

public class HomeTheaterFacade {

    private TV tv = new TV();
    private SoundSystem sound = new SoundSystem();
    private DVDPlayer dvd = new DVDPlayer();

    public void watchMovie() {
        tv.on();
        sound.on();
        dvd.on();
        System.out.println("Watching movie...");
    }
}
