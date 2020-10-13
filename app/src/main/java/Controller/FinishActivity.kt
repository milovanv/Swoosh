package Controller

import Utilities.EXTRA_LEAGUE
import Utilities.EXTRA_SKILL
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.proba.swoosh.R
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val skill = intent.getStringExtra(EXTRA_SKILL)

        searchLeagesText.text = "Looking for $league $skill league near you..."
    }
}