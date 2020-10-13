package Controller

import Model.Player
import Utilities.EXTRA_PLAYER
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Toast
import com.proba.swoosh.R
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    lateinit var player: Player

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putParcelable(EXTRA_PLAYER, player)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState != null) {
            player = savedInstanceState.getParcelable<Player>(EXTRA_PLAYER)!!
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)!!
    }

    fun onBallerClick (view: View) {
        begginerSkillBtn.isChecked = false
        player.skill = "baller"
    }

    fun onBegginerClick (view: View) {
        ballerSkillBtn.isChecked = false
        player.skill = "begginer"
    }

    fun onSkillFinishClicked (view: View) {
            if (player.skill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER, player)
             startActivity(finishActivity)
        } else {
            Toast.makeText(this, "Please select a skill level.", Toast.LENGTH_SHORT).show()
        }
    }

}