package model.classes;

public class Artworks {
    int id_artWork;
    String title;
    String description;
    String image_path;
    int user_id;

    public Artworks(int id_artWork, String title, String description, String image_path, int user_id) {
        this.id_artWork = id_artWork;
        this.title = title;
        this.description = description;
        this.image_path = image_path;
        this.user_id = user_id;
    }

    public int getId_artWork() {
        return id_artWork;
    }


    public void setId_artWork(int id_artWork) {
        this.id_artWork = id_artWork;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage_path() {
        return image_path;
    }

    public void setImage_path(String image_path) {
        this.image_path = image_path;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
}
