package com.hotakakademy.dockwitcher.domain.entities

import com.hotakademy.dockwitcher.domain.entities.Entity
import com.hotakakademy.dockwitcher.domain.repositories.IConductorRepository
import java.util.Date

class Conductor : Entity<IConductorRepository>(){
    var nombre: String? = null
    var identificacion: String? = null
    var licencia: String? = null
    var fechaCaducidad: Date? = null
    var telefono: String? = null
    var email: String? = null
    var formaciones: List<String> = mutableListOf()
    var observaciones: String? = null
    var experiencia: Experiencia = Experiencia()
    var disponibilidad: Disponibilidad = Disponibilidad()
    var historial: List<Incidentes> = mutableListOf()
}
