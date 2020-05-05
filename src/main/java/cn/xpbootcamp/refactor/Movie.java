package cn.xpbootcamp.refactor;

public class Movie {

    private String title;
    private MovieType type;

    Movie(String title, MovieType type) {
        this.title = title;
        this.type = type;
    }

    MovieType getType() {
        return type;
    }

    String getTitle() {
        return title;
    }
}
