package com.example.orientatonviewpagertest;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.database.DataSetObserver;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.ListAdapter;

import com.example.orientatonviewpagertest.transformers.AccordionPageTransformer;
import com.example.orientatonviewpagertest.transformers.CubeTransformer;
import com.example.orientatonviewpagertest.transformers.DepthPageTransformer;
import com.example.orientatonviewpagertest.transformers.FlipPageTransformer;
import com.example.orientatonviewpagertest.transformers.InRightDownTransformer;
import com.example.orientatonviewpagertest.transformers.InRightUpTransformer;
import com.example.orientatonviewpagertest.transformers.RotateTransformer;
import com.example.orientatonviewpagertest.transformers.RotationPageTransformer;
import com.example.orientatonviewpagertest.transformers.ScalePageTransformer;
import com.example.orientatonviewpagertest.transformers.ZoomOutPageTransformer;

public class MainActivity extends ActionBarActivity {

	private ViewPager viewpager_orientation;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		viewpager_orientation = (ViewPager) findViewById(R.id.viewpager_orientation);
//		viewpager_orientation.setPageTransformer(true,
//				new CubeTransformer());
		MyPagerAdapter myPagerAdapter = new MyPagerAdapter();
		viewpager_orientation.setAdapter(myPagerAdapter);

	}

	class MyPagerAdapter extends PagerAdapter {

		@Override
		public int getCount() {
			return 4;
		}

		@Override
		public boolean isViewFromObject(View arg0, Object arg1) {
			return arg0 == arg1;
		}

		@Override
		public Object instantiateItem(ViewGroup container, int position) {
			ImageView imageView = new ImageView(MainActivity.this);
			imageView.setLayoutParams(new LayoutParams(
					LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
			switch (position) {
			case 0:
				imageView.setBackgroundColor(Color.RED);
				break;
			case 1:
				imageView.setBackgroundColor(Color.GREEN);
				break;
			case 2:
				imageView.setBackgroundColor(Color.BLUE);
				break;
			case 3:
				imageView.setBackgroundColor(Color.GRAY);
				break;

			default:
				imageView.setBackgroundColor(Color.RED);
				break;
			}

			container.addView(imageView);
			return imageView;
		}

		@Override
		public void destroyItem(ViewGroup container, int position, Object object) {
			container.removeView((ImageView) object);
		}

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_AccordionPageTransformer) {
			viewpager_orientation.setPageTransformer(true,
					new AccordionPageTransformer());
			return true;
		} else if (id == R.id.action_CubeTransformer) {
			viewpager_orientation.setPageTransformer(true,
					new CubeTransformer());
			return true;
		} else if (id == R.id.action_DepthPageTransformer) {
			viewpager_orientation.setPageTransformer(true,
					new DepthPageTransformer());
			return true;
		} else if (id == R.id.action_FlipPageTransformer) {
			viewpager_orientation.setPageTransformer(true,
					new FlipPageTransformer());
			return true;
		} else if (id == R.id.action_InRightDownTransformer) {
			viewpager_orientation.setPageTransformer(true,
					new InRightDownTransformer());
			return true;
		} else if (id == R.id.action_InRightUpTransformer) {
			viewpager_orientation.setPageTransformer(true,
					new InRightUpTransformer());
			return true;
		} else if (id == R.id.action_RotateTransformer) {
			viewpager_orientation.setPageTransformer(true,
					new RotateTransformer());
			return true;
		} else if (id == R.id.action_RotationPageTransformer) {
			viewpager_orientation.setPageTransformer(true,
					new RotationPageTransformer());
			return true;
		} else if (id == R.id.action_ScalePageTransformer) {
			viewpager_orientation.setPageTransformer(true,
					new ScalePageTransformer());
			return true;
		} else if (id == R.id.action_ZoomOutPageTransformer) {
			viewpager_orientation.setPageTransformer(true,
					new ZoomOutPageTransformer());
			return true;
		}

		return super.onOptionsItemSelected(item);
	}
}
