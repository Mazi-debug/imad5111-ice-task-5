package vcmsa.ci.methods

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var sound1 = Pet(petSound1 = "woof!", petSound2 = "meow!", petName = "zoe",
            petAge = 2)
    }
}