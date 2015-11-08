package pef.kit.hotel;


        import android.app.ListFragment;
        import android.os.Bundle;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ArrayAdapter;
        import android.widget.ListView;

public class menufragment extends ListFragment {
    String[] Seznam = new String[]{"Booking","Rooms","Contact","About","Services"};

    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list_view, container, false);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, Seznam);
        setListAdapter(adapter);

        return view;

    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        textfragment txt = (textfragment) getFragmentManager().findFragmentById(R.id.fragment2);
        txt.change(Seznam[position]);
        getListView().setSelector(android.R.color.holo_blue_dark);
    }
}
