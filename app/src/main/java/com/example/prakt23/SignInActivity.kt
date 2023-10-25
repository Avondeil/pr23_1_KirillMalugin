/* While this template provides a good starting point for using Wear Compose, you can always
 * take a look at https://github.com/android/wear-os-samples/tree/main/ComposeStarter and
 * https://github.com/android/wear-os-samples/tree/main/ComposeAdvanced to find the most up to date
 * changes to the libraries and their usages.
 */

package com.example.prakt23

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity
import retrofit2.Call
import retrofit2.Response

lateinit var email:EditText
lateinit var password :EditText
class SignInActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        email=findViewById(R.id.email)
        password=findViewById(R.id.password)
    }

    fun Enter(view: View) {
/*if (email.text.toString().isNotEmpty() && password.text.toString().isNotEmpty())
{
    val log = MyRetrofit().getRetrofit()
    val getApi=log.create(API::class.java)
    var hashMap:HashMap<String,String> = HashMap<String,String>()
    hashMap.put("email",email.text.toString())
    hashMap.put("password", password.text.toString())
    val log_call:retrofit2.Call<login> = getApi.getAuth(hashMap)
    log_call.enqueue(object:retrofit2.Callback<login> {
        override fun onResponse(call: Call<login>, response: Response<login>) {
            if (response.isSuccessful) {
                val intent = Intent(this@SignInActivity, ResultActivity::class.java)
                startActivity(intent)
            }
        }

        override fun onFailure(call: Call<login>, t: Throwable) {
            Toast.makeText(this@SignInActivity, t.message, Toast.LENGTH_SHORT).show()
        }
    })
}*/ val intent=Intent(this,ResultActivity::class.java)
        startActivity(intent)
        finish()
    }
}

