package com.example.camara

import android.Manifest


object Constants {
    const val TAG="Demo Camara"
    const val FILE_NAME_FORMAT = "yy-MM-dd-HH-ss-SSS"
    const val REQUEST_CODE_PERMISSIONS = 123
    val REQUIRED_PERMISSIONS = arrayOf(Manifest.permission.CAMERA)
}