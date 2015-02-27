package app.com.davgod.memento.Note;

public class Note {

    public Integer get_id() {
        return _id;
    }

    public void set_id(Integer _id) {
        this._id = _id;
    }

    public String get_description() {
        return _description;
    }

    public void set_description(String _description) {
        this._description = _description;
    }

    public Boolean get_isFavorite() {
        return _isFavorite;
    }

    public void set_isFavorite(Boolean _isFavorite) {
        this._isFavorite = _isFavorite;
    }

    public String get_imgPath() {
        return _imgPath;
    }

    public void set_imgPath(String _imgPath) {
        this._imgPath = _imgPath;
    }

    private Integer _id;
    private String  _description;
    private Boolean _isFavorite = false;
    private String  _imgPath;

    public Note(Integer id, String description, Boolean isFav, String imgPath) {
        _id = id;
        _description = description;
        _isFavorite = isFav;
        _imgPath = imgPath;
    }

    @Override
    public String toString() {
        return get_description();
    }
}
