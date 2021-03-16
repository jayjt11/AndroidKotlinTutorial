package com.expleo.androidkotlintutorial.util

import android.content.Context
import android.widget.Toast

class Util  {

    companion object {
        fun showMessage(context: Context) {

            Toast.makeText(context, "clicked", Toast.LENGTH_LONG).show()
        }
    }



}