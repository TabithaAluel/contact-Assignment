import com.example.contactappassignment.ContactRvAdapter
import com.example.contactappassignment.Contacts
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.contactappassignment.R


class MainActivity : AppCompatActivity() {
    lateinit var rvcontact:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        displayContact()
    }

    fun displayContact() {
        var contactsList = listOf<Contacts>(
            Contacts("Isaac Ajang", "+254798008316", "ajangmajok@gmail.com"),
            Contacts("Tabitha Aluel", "+254768651609", "alueltabitha@gmail.com"),
            Contacts("James Mwai", "+254712345671", "jamesmwai@gmail.com"),
            Contacts("Jungle JMD", "+25474644433", "junglejmd@gmail.com"),
        )
        rvcontact=findViewById(R.id.rvcontact)
        var ContactRvAdapter=ContactRvAdapter(contactsList)

        rvcontact.layoutManager = LinearLayoutManager(baseContext)
        rvcontact.adapter = ContactRvAdapter





    }
}