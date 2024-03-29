package aso.personcar

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(version = 1, entities =  [Person::class,Car::class,PersonCarJoin::class])
abstract class AppDatabase : RoomDatabase() {

    abstract fun personCarDao(): PersonCarDao
}