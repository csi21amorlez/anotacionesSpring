package com.app.anota.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("usuarioTest")
public class UsuarioFactory {

	@Autowired // Sirve para realizar la inyeccion de dependecias sin añadir metodo set

	UsuarioImplMongo us;

	public void getInsertaMongo() {
		us.inserta();
	}

}
