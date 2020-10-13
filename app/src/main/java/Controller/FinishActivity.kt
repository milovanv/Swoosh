package Controller

import Model.Player
import Utilities.EXTRA_PLAYER
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.proba.swoosh.R
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        searchLeagesText.text = "Looking for ${player?.league} ${player?.skill} league near you..."
    }
}