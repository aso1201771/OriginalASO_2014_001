package jp.ac.st.asojuku.original2014001;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DaikichiActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自動生成されたメソッド・スタブ
		super.onCreate(savedInstanceState);
		setContentView(R.layout.daikichiactivity);
		Intent intent = getIntent();
		String name = intent.getStringExtra("name");

		TextView tv = (TextView)findViewById(R.id.txvMsg3);
		tv.setText(name + "さんの今日の運命は・・・");
	}

}
