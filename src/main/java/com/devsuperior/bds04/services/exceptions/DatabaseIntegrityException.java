package com.devsuperior.bds04.services.exceptions;

import java.io.Serializable;

public class DatabaseIntegrityException extends RuntimeException implements Serializable{
	private static final long serialVersionUID = 1L;

	public DatabaseIntegrityException(String message) {
		super(message);
	}
}
