package jp.ac.st.asojuku.yolp01;

import jp.co.yahoo.android.maps.GeoPoint;
import jp.co.yahoo.android.maps.MapView;
import android.app.Activity;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.Menu;

public class MainActivity extends Activity implements LocationListener{



	//LacationManagerを準備
	LocationManager mLocationManager = null;
	//MapViewを準備
	MapView mMapView = null;
	//直前の緯度(1000000倍精度)
	int lastLatitude = 0;
	//直前の経度(1000000倍精度)
	int lastLongitude = 0;

	@Override
	public void onLocationChanged(Location location){

	}

	public void onProviderDisabled(String provider){

	}

	public void onProviderEnabled(String provider){

	}

	public void onStatusChanged(String provider, int status, Bundle extras){

	}
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	protected void onResume(){
		super.onResume();

		//地図表示用のYhaooライブラリview部品を用意
		mMapView = new MapView(this,"dj0zaiZpPUNMWVNkbUNyZE1iZiZzPWNvbnN1bWVyc2VjcmV0Jng9OTk-");
		//ズームボタンを画面にON
		mMapView.setBuiltInZoomControls(true);
		//地図縮尺バーを画面にON
		mMapView.setScalebar(true);
		//ここから、主導で地図をセット
		//渋谷駅の緯度経度のGeoPointを手書きで設定
		double lat = 35.658516;
		double lon = 139.701773;
		GeoPoint gp = new GeoPoint ((int)(lat * 1000000),(int)(lon * 1000000));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
