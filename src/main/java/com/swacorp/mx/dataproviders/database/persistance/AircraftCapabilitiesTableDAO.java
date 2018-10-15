package com.swacorp.mx.dataproviders.database.persistance;

import org.springframework.data.repository.CrudRepository;

import com.swacorp.mx.dataproviders.database.domain.AircraftCapabilitiesTable;

//@Repository
public interface AircraftCapabilitiesTableDAO extends CrudRepository<AircraftCapabilitiesTable, String> {

}
