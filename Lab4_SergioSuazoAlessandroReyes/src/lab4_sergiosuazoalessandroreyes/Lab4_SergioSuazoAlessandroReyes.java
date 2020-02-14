package lab4_sergiosuazoalessandroreyes;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;




public class Lab4_SergioSuazoAlessandroReyes {

    public static Scanner leer = new Scanner(System.in);
    public static Random random = new Random();
    
    
    
    
    
    
    public static void main(String[] args) {
        boolean r=true;
        while(r){
            System.out.print("1. CRUD Equipo" 
                    + "\n2. CRUD Jugadores" 
                    + "\n3. Simulación del Juego}"
                    + "\n4. Terminar programa"
                    + "\nElija una opcion: ");
            int o = leer.nextInt();
            
            
            switch(o){
                case 1://crud equipo
                    System.out.print("a. Crear equipo"
                            + "\nb. Listar equipo/s"
                            + "\nc. Modificar equipo/s"
                            + "\nd  Eliminar equipo"
                            + "\nELija una opcion: ");
                    char op = leer.next().charAt(0);
                    switch(op){
                        case 'a':
                            
                            break;
                        case 'b':
                            
                            break;
                        case 'c':
                            
                            break;
                        case 'd':
                            
                            break;
                        default:
                            
                    }
                    break;
                case 2://crud jugador
                    System.out.print("a. Crear jugador"
                            + "\nb. Listar jugador/es"
                            + "\nc. Modificar jugador/es"
                            + "\nd. Eliminar jugador"
                            + "\ne. Ver stats de un jugador"
                            + "\nELija una opcion: ");
                    op = leer.next().charAt(0);
                    switch(op){
                        case 'a':
                            
                            break;
                        case 'b':
                            
                            break;
                        case 'c':
                            
                            break;
                        case 'd':
                            
                            break;
                        case 'e':
                            
                            break;
                        default:
                            
                    }
                    break;
                case 3://simulaciion del juego
                    
                    break;
                case 4:
                    r = false;
                    break;
                default:
                    r = false;
            }//fin del switch menu
        }//fin del while menu
    }//fin del main
    
















































































































































































































































































































































































































































































































}
