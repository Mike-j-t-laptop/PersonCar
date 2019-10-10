package aso.personcar

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "person_table",
    indices = [Index("person_id")]
)
class Person() {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "person_id")
    var id: Long = 0

    var personName: String = ""
}