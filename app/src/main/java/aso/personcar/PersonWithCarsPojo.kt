package aso.personcar

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation

class PersonWithCarsPojo {

    @Embedded
    lateinit var person: Person

    @Relation(
        entityColumn = "car_id",
        parentColumn = "person_id",
        associateBy = Junction(
            PersonCarJoin::class,
            parentColumn = "fk_person_id",
            entityColumn = "fk_car_id"
        )
    )
    var cars: List<Car> = arrayListOf()
}