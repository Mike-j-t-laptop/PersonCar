package aso.personcar

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface PersonCarDao {

    @Insert
    fun insertPerson(person: Person): Long

    @Insert
    fun insertpeople(vararg People: Person)

    @Insert
    fun insertCar(car: Car): Long

    @Insert
    fun insertCars(vararg cars: Car)

    @Insert
    fun insertPersonCarJoin(personCarJoin: PersonCarJoin): Long

    @Query("SELECT * FROM person_table")
    fun getAllPersonsWithCars(): List<PersonWithCarsPojo>
}