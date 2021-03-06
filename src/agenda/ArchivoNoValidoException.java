/*
 * Copyright (C) 2015 Dhaby Xiloj <dhabyx@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package agenda;

/**
 * Clase creada para tener una excepción extra para cuando se detecta que el 
 * archivo no tiene la estructura adecuada para la aplicación.
 * 
 * @author Dhaby Xiloj <dhabyx@gmail.com>
 */
public class ArchivoNoValidoException extends Exception{
    private String mensaje = "El archivo no tiene la estructura de una Agenda";
    
    /**
     *
     */
    public ArchivoNoValidoException() {
        super();
    }   
    
    /**
     *
     * @param mensaje
     */
    public ArchivoNoValidoException(String mensaje) {
        super(mensaje);
        this.mensaje = mensaje;
    }
    
    /**
     *
     * @param causa
     */
    public ArchivoNoValidoException(Throwable causa) {
        super(causa);
    }
    
    /**
     *
     * @param mensaje
     * @param causa
     */
    public ArchivoNoValidoException(String mensaje, Throwable causa) {
        super(mensaje, causa);
        this.mensaje = mensaje;
    }

    /**
     * Se crea para cuando se necesite escribir directamente la clase
     * @return mensaje
     */
    @Override
    public String toString() {
        return mensaje;
    }

    /**
     * Método para obtner el mensaje, sobre-escrito para que no despliegue
     * el mejsaje de error de la clase heredada.
     * @return mensaje
     */
    @Override
    public String getMessage() {
        return mensaje;
    }
    
    
}
