package cs310w10.MoleFinder.View;

import cs310w10.MoleFinder.Model.Mole;
import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ListView;

public class SearchViewActivity extends Activity implements fView<Mole> {
	private EditText textInput;
	private ListView resultsList;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.search);

		textInput = (EditText) findViewById(R.id.SearchViewTextInput);
		resultsList = (ListView) findViewById(R.id.SearchViewResultsList);

	}

	public void update(Mole model) {
		// TODO Auto-generated method stub

	}

}
