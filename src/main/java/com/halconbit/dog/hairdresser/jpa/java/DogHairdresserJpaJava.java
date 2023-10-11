package com.halconbit.dog.hairdresser.jpa.java;

import com.halconbit.dog.hairdresser.jpa.java.gui.Main;

/**
 * @author Brayan Esteves
 * Challenge:
 * <b>[ENGLISH]:</b>
 * Integrating Exercise: Dog Grooming Salon.
 * A dog grooming salon needs <b>a form</b> to <b>store the data of each of its
 * client pets.</b> For this, it requests the
 * development of an application that is able to register the following data for
 * each of them and their owners:
 * <b>1) Pets:</b> customer_number, dog_name, breed, color, allergic, special_care,
 *                 observations.
 * <b>2) Owner:</b> owner_id, name, cellphone_number, address.
 * In order to easily register and be attractive to the user, the owner of the
 * dog grooming salon provides the following <b>APPROXIMATE</b> design of the idea
 * she has for the user interface:
 * 0) Title: Dog Grooming Salon.
 * 1) Client Number (Label, Input)
 * 2) Name (Label, Input)
 * 3) Breed (Label, Input)
 * 4) Color (Label, Input)
 * 5) Allergic (Label, Select)
 * 6) Special Attention (Label, Select)
 * 7) Owner's Name (Label, Input)
 * 8) Owner's Phone Number (Label, Input)
 * 9) Observations (Label, Textarea)
 * 10) 2 Buttons (Actions: Clear and Save)
 * Since the <b>data</b> needs to <i>persist over time</i> and for the future, the employees of
 * the grooming salon will be able to access them, it is required that each of the
 * records be stored in a <b>database<*b>.
 * Based on this requirements gathering:
 * 1) Develop a <b>desktop application</b> that is able to register, in a database,
 *    the data, both pets and owners that are entered from a graphical user interface.
 * 2) For this development, take into account the concepts of the <b>LAYERED MODEL.</b>
 * [=======]
 * <b>[SPANISH]:</b>
 * Ejercicio Integrador: Peluqueria Canina.
 * Una peluqueria canina necesita de <b>un formulario</b> para <b>almacenar los datos
 * de cada una de sus mascotas clientes.</b> Para ello, solicita el desarrollo de
 * una aplicación que sea capaz de registrar los siguientes de datos de cada una
 * de ellas y sus dueños:
 * <b>1) Mascotas:</b> num_clientes, numbre_perro, raza, color, alergico, atencion_especial,
 *                     observaciones.
 * <b>2) Dueño:</b> id_dueño, nombre, celular, direccion.
 * Para poder registrar de manera sencilla y que sea atractiva para el usuario,
 * la dueña de la peluqueria canina proporciona el siguiente diseño <b>APROXIMADO</b>
 * de la idea que tiene para la interfaz gráfica de usuario:
 * 0) Titulo: Peluqueria Canina.
 * 1) Cliente Nº (Label, Input)
 * 2) Nombre (Label, Input)
 * 3) Raza (Label, Input)
 * 4) Color (Label, Input)
 * 5) Alergico (Label, Select)
 * 6) Atención Especial (Label, Select)
 * 7) Nombre Dueño (Label, Input)
 * 8) Celular Dueño (Label, Input)
 * 9) Observaciones (Label, Textarea)
 * 10) 2 Botones (Acciones: Limpiar y Guardar)
 * Cómo los <b>datos</b> deben <i>permanecer en  el tiempo</i> y a futuro, los
 * empleados de la peluqueria van a poder a acceder a ellos, se requiere que cada
 * uno de los registros sean almacenados en una <b>base de datos.</b>
 * A partir de este relevamiento de requerimientos:
 * 1) Realizar el desarrollo de una <b>aplicación de escritorio0</b>, que sea capaz de
 *    registrar, en una base de datos, los datos, tanto de mascotas, cómo dueños
 *    que se ingresen desde una interfaz gráfica de usuario.
 * 2) Para este desarrollo, tener en cuenta los conceptos del <b>MODELO DE CAPAS.</b>
 */
public class DogHairdresserJpaJava {

    public static void main(String[] args) {
        Main mainWindows = new Main();
        mainWindows.setVisible(true);
        mainWindows.setLocationRelativeTo(null);
    }
}
