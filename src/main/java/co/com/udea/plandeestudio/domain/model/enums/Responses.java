package co.com.udea.plandeestudio.domain.model.enums;

import org.springframework.http.HttpStatus;

public enum Responses {
    NOT_FOUND_ENTITY("No se pudo encontrar el dato solicitado", "001", HttpStatus.NOT_FOUND),
    NOT_FOUND_ENTITIES("No hay ningun registro para la peticion solicitada", "002", HttpStatus.NOT_FOUND),
    NOT_SAVE_ENTITy("No se pudo guardar el registro", "003", HttpStatus.CONFLICT),
    NOT_DELETE_ENTITy("No se pudo eliminar el registro de la BD", "004", HttpStatus.CONFLICT)
    ;


    private String mensaje;
    private String codigo;
    private HttpStatus httpStatus;

    Responses(String mensaje, String codigo, HttpStatus httpStatus) {
        this.mensaje = mensaje;
        this.codigo = codigo;
        this.httpStatus = httpStatus;
    }

    public String getMensaje() {
        return mensaje;
    }

    public String getCodigo() {
        return codigo;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
}
