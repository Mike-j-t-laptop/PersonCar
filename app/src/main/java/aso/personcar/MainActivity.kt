package aso.personcar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.room.Room

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val db = Room.databaseBuilder(applicationContext,AppDatabase::class.java,"personcardb")
            .allowMainThreadQueries()
            .build()
        val personCarDao = db.personCarDao()

        val person = Person()
        person.personName = "Fred"
        personCarDao.insertPerson(person)
        person.personName = "Jane"
        personCarDao.insertPerson(person)
        person.personName = "Anne"
        personCarDao.insertPerson(person)

        val car = Car()
        car.carName = "A"
        personCarDao.insertCar(car)
        car.carName = "B"
        personCarDao.insertCar(car)
        car.carName = "C"
        personCarDao.insertCar(car)

        val pcj1 = PersonCarJoin(1,2)
        personCarDao.insertPersonCarJoin(pcj1)
        val pcj2 = PersonCarJoin(1,3)
        personCarDao.insertPersonCarJoin(pcj2)
        val pcj3 = PersonCarJoin(2,1)
        personCarDao.insertPersonCarJoin(pcj3)
        val pcj4 = PersonCarJoin(2,3)
        personCarDao.insertPersonCarJoin(pcj4)
        val pcj5 = PersonCarJoin(3,3)
        personCarDao.insertPersonCarJoin(pcj5)

        val theList: List<PersonWithCarsPojo> = personCarDao.getAllPersonsWithCars()
        for (pwc: PersonWithCarsPojo in theList) {
            for(c: Car in pwc.cars) {
                Log.d("PWCINFO","Person is " + pwc.person.personName + " Car is " + c.carName)
            }
        }
    }
}
