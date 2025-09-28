# FindLocation Android App 

This is a simple Android application that demonstrates how to retrieve the device's last known location and display its latitude, longitude, country name, locality, and full address.

## 📸 Screenshot

<img width="477" height="932" alt="Screenshot 2025-09-28 155527" src="https://github.com/user-attachments/assets/eaa2e673-7351-408e-98f1-0aa26fb2183b" />

## ✨ Features

*   🛡️ Requests location permission from the user.
*   🛰️ Fetches the last known location using the `FusedLocationProviderClient`.
*   🗺️ Uses `Geocoder` to convert latitude and longitude into a human-readable address.
*   📱 Displays the following information:
    *   **Latitude:** `[value]`
    *   **Longitude:** `[value]`
    *   **Country Name:** `[Country]`
    *   **Locality:** `[City/Area]`
    *   **Full Address:** `[Street Address]`

## ⚙️ How it Works

1.  **Permission Check:** When the "Get Location"  बटन is clicked, the app first checks if the `ACCESS_FINE_LOCATION` permission has been granted.
2.  **Permission Request:** If the permission is not granted, it requests the permission from the user.
3.  **Location Fetching:** If the permission is granted, the app uses `FusedLocationProviderClient.getLastLocation()` to retrieve the most recent known location of the device.
4.  **Geocoding:** Once the `Location` object is obtained, `Geocoder.getFromLocation()` is used to get a list of addresses corresponding to the latitude and longitude.
5.  **Display:** The relevant address details are then displayed in their respective TextViews.

## 🧱 Dependencies

The project utilizes the following key libraries:

*   `androidx.appcompat:appcompat` - For backward compatibility of newer Android features.
*   `com.google.android.gms:play-services-location` (for location services)
*   `androidx.constraintlayout:constraintlayout` - For building flexible layouts.
*   `com.google.android.material:material` - For Material Design components.

## 🚀 Setup and Installation

1.  Clone the repository:
    
