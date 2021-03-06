package by.training.notebook.bean;

import by.training.notebook.bean.entity.ShortNote;


public class ResponseWithNoteList extends Response {

    private ShortNote[] noteList;


    public ResponseWithNoteList(ShortNote[] noteList){
        super(true);
        setNoteList(noteList);
    }


    public ShortNote[] getNoteList() {
        return noteList;
    }

    public void setNoteList(ShortNote[] noteList) {
        if (noteList == null){
            throw new NullPointerException("NoteList is null");
        }
        this.noteList = noteList;
    }
}
