package app.com.davgod.memento;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;


import java.util.List;

import app.com.davgod.memento.Note.Note;


public class NoteListAdapter extends ArrayAdapter<Note> {
    private final Context context;
    private final List<Note> objects;

    public NoteListAdapter(Context context, int resource, List<Note> objects) {
        super(context, resource, objects);
        this.context = context;
        this.objects = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        Note currentNote = objects.get(position);

        View noteView = inflater.inflate(R.layout.note_listitem, parent, false);

        TextView title = (TextView) noteView.findViewById(R.id.listitem_text);
        final TextView btnFav = (Button) noteView.findViewById(R.id.btn_favorite);
        btnFav.setSelected(currentNote.get_isFavorite());

        btnFav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnFav.setSelected(!btnFav.isSelected());
            }
        });
        title.setText(currentNote.toString());

        return noteView;
    }

}
