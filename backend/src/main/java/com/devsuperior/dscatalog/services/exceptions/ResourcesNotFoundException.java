package com.devsuperior.dscatalog.services.exceptions;

public class ResourcesNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public ResourcesNotFoundException(String msg) {
		super(msg);
	}
}
