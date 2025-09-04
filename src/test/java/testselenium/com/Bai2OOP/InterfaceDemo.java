package testselenium.com.Bai2OOP;

interface Playable {
    void play();
    void pause();
}

class MusicPlayer implements Playable {
    @Override
    public void play() {
        System.out.println("Music is playing");
    }

    @Override
    public void pause() {
        System.out.println("Music is paused");
    }
}

class VideoPlayer implements Playable {
    @Override
    public void play() {
        System.out.println("Video is playing");
    }

    @Override
    public void pause() {
        System.out.println("Video is paused");
    }
}

// Interface: chỉ định nghĩa “contract”, class nào implements thì bắt buộc viết code cụ thể.

public class InterfaceDemo {
    public static void main(String[] args) {
        Playable music = new MusicPlayer();
        music.play();
        music.pause();

        Playable video = new VideoPlayer();
        video.play();
        video.pause();
    }
}
