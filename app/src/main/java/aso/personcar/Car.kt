package aso.personcar

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "car_table",
    indices = [Index("car_id")]
)
class Car {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "car_id")
    var id: Long = 0

    var carName: String = ""
}