package com.codoacodo.Project2;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@Getter
@Setter
@SpringBootApplication
public class Project2Application {
    private String nombre;
    private int edad;

    public Project2Application() {
    }
    public Project2Application(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void ingresarDatos(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        nombre = sc.nextLine();

        System.out.print("Ingrese su edad: ");
        edad = sc.nextInt();
    }

    public void mostrarDatos(){

        System.out.println("Su nombre es: "+ nombre + " y su edad es: " + edad);

    }

    public void verificarEdad1(){
        if(edad>27){
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("Es menor de edad");
        }
    }

    public void verificarEdad2(){
        System.out.println(edad>21 ? "Es mayor de edad":"Es menor de edad");
    }
    public static void main(String[] args) {
        SpringApplication.run(Project2Application.class, args);

        Project2Application project = new Project2Application();

        project.ingresarDatos();

        project.mostrarDatos();

        project.verificarEdad1();

        project.verificarEdad2();
    }
}
