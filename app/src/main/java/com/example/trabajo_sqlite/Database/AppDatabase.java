package com.example.trabajo_sqlite.Database;
import com.example.trabajo_sqlite.Entities.Asignatura;
import com.example.trabajo_sqlite.Interfaces.AsignaturaDao;

import androidx.room.Database;
import androidx.room.RoomDatabase;
@Database (entities = {Asignatura.class},version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract AsignaturaDao asignaturaDao();

    private static  AppDatabase sInstace;
}
