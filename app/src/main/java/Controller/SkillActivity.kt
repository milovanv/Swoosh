package Controller

import android.os.Bundle
import Utilities.EXTRA_LEAGUE
import Utilities.EXTRA_SKILL
import android.content.Intent
import android.view.View
import android.widget.Toast
import com.proba.swoosh.R
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    var league = ""
    var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)!!
        println(league)
    }

    fun onBallerClick (view: View) {
        begginerSkillBtn.isChecked = false
        skill = "baller"
    }

    fun onBegginerClick (view: View) {
        ballerSkillBtn.isChecked = false
        skill = "begginer"
    }

    fun onSkillFinishClicked (view: View) {
            if (skill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_LEAGUE, league)
            finishActivity.putExtra(EXTRA_SKILL, skill)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this, "Please select a skill level.", Toast.LENGTH_SHORT).show()
        }
    }

}