# FindLocation Android App

This is a simple Android application that demonstrates how to retrieve the device's last known location and display its latitude, longitude, country name, locality, and full address.

## Features

*   Requests location permission from the user.
*   Fetches the last known location using the FusedLocationProviderClient.
*   Uses Geocoder to convert latitude and longitude into a human-readable address.
*   Displays the following information:
    *   Latitude
    *   Longitude
    *   Country Name
    *   Locality
    *   Full Address

## How it Works

1.  **Permission Check:** When the "Get Location" button is clicked, the app first checks if the `ACCESS_FINE_LOCATION` permission has been granted.
2.  **Permission Request:** If the permission is not granted, it requests the permission from the user.
3.  **Location Fetching:** If the permission is granted, the app uses `FusedLocationProviderClient.getLastLocation()` to retrieve the most recent known location of the device.
4.  **Geocoding:** Once the `Location` object is obtained, `Geocoder.getFromLocation()` is used to get a list of addresses corresponding to the latitude and longitude.
5.  **Display:** The relevant address details (latitude, longitude, country, locality, and full address line) are then displayed in their respective TextViews.

## Dependencies

The project utilizes the following key libraries:

*   `androidx.appcompat:appcompat` - For backward compatibility of newer Android features.
*   `androidx.core:core-ktx` - Kotlin extensions for Android core libraries (although the current code is in Java, this is a common dependency).
*   `com.google.android.gms:play-services-location` - For accessing location services provided by Google Play Services.
*   `androidx.constraintlayout:constraintlayout` - For building flexible and responsive layouts.
*   `com.google.android.material:material` - For implementing Material Design components.

## Setup and Installation

1.  Clone the repository:
    
