package aso.personcar

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index

@Entity(
    tableName = "person_car_join",
    primaryKeys = ["fk_person_id", "fk_car_id"],
    indices = [
        Index("fk_person_id"),
        Index("fk_car_id")
    ],
    foreignKeys = [
        ForeignKey(
            entity = Person::class,
            childColumns = arrayOf("fk_person_id"),
            parentColumns = arrayOf("person_id")
        ), ForeignKey(
            entity = Car::class,
            childColumns = arrayOf("fk_car_id"),
            parentColumns = arrayOf("car_id")
        )
    ]
)
class PersonCarJoin(
    @ColumnInfo(name = "fk_person_id") var fkPersonId: Long,
    @ColumnInfo(name = "fk_car_id") var fkCarId: Long
)