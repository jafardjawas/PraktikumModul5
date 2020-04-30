package com.example.mymaps;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng skl1 = new LatLng(-8.123971, 112.570677);
        mMap.addMarker(new MarkerOptions().position(skl1).title("SDN Ardirejo 2"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(skl1, 18));

        LatLng skl2 = new LatLng(-8.120115, 112.575635);
        mMap.addMarker(new MarkerOptions().position(skl2).title("SMPN 1 Kepanjen"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(skl2, 18));

        LatLng skl3 = new LatLng(-8.124427, 112.572484);
        mMap.addMarker(new MarkerOptions().position(skl3).title("SDN Ardirejo 1"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(skl3, 18));

        LatLng skl4 = new LatLng(-8.123322, 112.571111);
        mMap.addMarker(new MarkerOptions().position(skl4).title("SMA PGRI Kepanjen"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(skl4, 18));

        LatLng skl5 = new LatLng(-8.123661, 112.572220);
        mMap.addMarker(new MarkerOptions().position(skl5).title("SDN Ardirejo 4"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(skl5, 18));

        LatLng skl6 = new LatLng(-8.124607, 112.572208);
        mMap.addMarker(new MarkerOptions().position(skl6).title("SMAN 1 KEPANJEN"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(skl6, 18));

        LatLng skl7 = new LatLng(-8.132233, 112.575287);
        mMap.addMarker(new MarkerOptions().position(skl7).title("SMK Muhammadiyah 1 Kepanjen"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(skl7, 18));

        LatLng skl8 = new LatLng(-8.130480, 112.566211);
        mMap.addMarker(new MarkerOptions().position(skl8).title("SMPN 4 Kepanjen"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(skl8, 18));

        LatLng skl9 = new LatLng(-8.132446, 112.581713);
        mMap.addMarker(new MarkerOptions().position(skl9).title("SMAI Kepanjen"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(skl9, 18));

        LatLng skl10 = new LatLng(-8.131899, 112.582565);
        mMap.addMarker(new MarkerOptions().position(skl10).title("SDN Ardirejo 3"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(skl10, 18));

        LatLng rumah = new LatLng(-8.124200, 112.576353);
        mMap.addMarker(new MarkerOptions().position(rumah).title("Your Location"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(rumah, 18));
    }
}
