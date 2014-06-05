package jp.ac.st.asojuku.original2014001;


import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity implements View.OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button btn = (Button)findViewById(R.id.btnOK);
		btn.setOnClickListener(this);
	}

	@Override
	public void onClick(View arg0) {
		// TODO 自動生成されたメソッド・スタブ
		switch(arg0.getId()){
			case R.id.btnOK:
				//エディットテキストから入力内容を取り出す
				EditText etv =(EditText)findViewById(R.id.edtName);
				String inputMsg = etv.getText().toString();

				Random rnd = new Random();
				int ran = rnd.nextInt(4);


				Intent intent = null;

				switch(ran){
				case 0:

					intent = new Intent(MainActivity.this,DaikichiActivity.class);
					startActivity(intent);
					break;

				case 1:

					intent = new Intent(MainActivity.this,ChukichiActivity.class);
					startActivity(intent);
					break;

				case 2:

					intent = new Intent(MainActivity.this,KyouActivity.class);
					startActivity(intent);
					break;

				case 3:

					intent = new Intent(MainActivity.this,DaikyouActivity.class);
					startActivity(intent);
					break;
				}
				intent.putExtra("name",inputMsg);
				startActivity(intent);
		}
	}

}
