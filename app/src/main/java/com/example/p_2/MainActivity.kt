package com.example.p_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() { var Tag="mainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    private fun showMessage(msg:String){ Log.i(Tag,msg)
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }
    override fun onStart() { super.onStart()
        showMessage("on start is called")
    }

    override fun onResume() { super.onResume()
        showMessage("on resume is called")
    }

    override fun onStop() { super.onStop()
        showMessage("on stop is called")
    }
}
