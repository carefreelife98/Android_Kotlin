package com.example.haegeumgang

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.haegeumgang.databinding.ActivityMapsBinding
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.MarkerOptions
const val TAGMAP = "MAP TAG"
class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityMapsBinding
    private var currentMarker: Marker? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMapsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        startProcess()

        binding.mapExitButton.setOnClickListener { finish() }
    }

    private fun startProcess() {
        val mapFragment = supportFragmentManager
            .findFragmentById(binding.map.id) as SupportMapFragment
        mapFragment.getMapAsync(this)  // 구글 지도를 그려달라는 요청
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    override fun onMapReady(googleMap: GoogleMap) {
        Log.d(TAGMAP, "MAP On Ready")
        mMap = googleMap
        // Add a marker in Sydney and move the camera
//        val geoje = LatLng(34.8739, 128.6509)
//        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(geoje, 15f))
        currentMarker = setupMarker(LatLng(34.8739, 128.6509))
        currentMarker?.showInfoWindow()
        Log.d(TAGMAP, "MAP On Ready ENDS")
    }

    private fun setupMarker(lat: LatLng): Marker? {
        val positionLat = LatLng(lat.latitude, lat.longitude)
        val markerOption = MarkerOptions().apply {
            position(positionLat)
            title("대한민국 거제시")
            snippet("해금강")
        }
        mMap.mapType = GoogleMap.MAP_TYPE_NORMAL
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(positionLat, 15f))
        mMap.animateCamera(CameraUpdateFactory.zoomTo(15f))
        return mMap.addMarker(markerOption)
    }
    
}