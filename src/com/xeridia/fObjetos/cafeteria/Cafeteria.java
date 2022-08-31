package com.xeridia.fObjetos.cafeteria;

import com.xeridia.utils.Teclado;

public class Cafeteria {
    private Pedido order;
    private String name;
    private boolean isTakeAway;



    public Cafeteria (String name){
        this.name = name;
    }



    public void createOrder (){
        boolean isTakeAway;
        Cafe coffe;
        isTakeAway = isTakeAway();
        this.order = new Pedido(isTakeAway);
        menuPedido(this.order,isTakeAway);
    }

    //    public int menuPrincipal (){
//        System.out.println("Por favor introduce la acción que desae llevar a cabo:\n-[1]: Hacer pedido.\n-[0]: Salir del sistema.");
//        int menu;
//        do {
//            menu = Teclado.readInteger();
//            if (menu == 0){
//                System.out.println("Ha elegido la opción de salir del sistema.");
//                System.exit(0);
//            }
//            if ( menu != 0 && menu != 1){
//                System.out.println("Por favor, vuelva a introducir los datos de forma correcta.\n\"Por favor introducce la acción que desae llevar a cabo:\\n\t-[1]: Hacer pedido.\\n\t-[0]: Salir del sistema.");
//            }
//        } while (menu != 1);
//        return 1;
//    }

    public boolean isTakeAway(){
        int take = 0;
        StringBuilder out = new StringBuilder("¿Desea tomar aqui su pedido?\n\t-[1]: Si.\n\t-[0]: No.");
        System.out.println(out);
        do {
            take = Teclado.readInteger();
            out.append("Ha introducido mal los datos, vuelva a introducirlos por favor. \n\t-[1]: Si.\n\t-[0]: No.");
        }while (take != 0 && take != 1);

        return take == 1;
    }
    public void menuPedido (Pedido order, boolean isTakeAway){
        int menu;
        do {
            System.out.println("Introduce la acción que desea llevar a cabo:\n\t-[1]: Añadir café.\n\t-[2]: Eliminar cafe.\n\t-[0]: Salir.");
            menu = Teclado.readInteger();
            if (menu == 1){
                int option = selectCoffeeToAdd();
                if (option != 0){
                    addCoffee(option, order);
                    menu = 3;
                }else{
                    menu = 3;
                }
            } else if (menu == 2){
                int option = selectCoffeeToDelete();
                if (option != 0){
                    removeCoffee(option);
                    menu = 3;
                }else {
                    menu = 3;
                }
            } else if (menu == 0){
                this.order.impirmirTicket(isTakeAway);
                break;
            }
        }while (menu != 2 && menu != 1 && menu != 0);
    }
    public int selectCoffeeToAdd (){
        StringBuilder output = new StringBuilder("¿Qué tipo de cafe desea usted pedir?\n");
        int option;
        for (int i = 0; i < CoffeTypes.values().length; i++) {
            output.append("\n\t- [").append(i +1).append("]: ").append(CoffeTypes.values()[i].getType()).append(" (").append(CoffeTypes.values()[i].getPrize()).append(" €).");
        }
        output.append("\n\t- [0]: Salir.");
        do {
            System.out.println(output);
            option = Teclado.readInteger();
        } while (option < 0 || option > CoffeTypes.values().length + 1);
        return option;
    }
    public void addCoffee (int option, Pedido order){
        System.out.println("¿Cuantos cafes desea pedir? ");
        int numCoffe = Teclado.readInteger();
        Cafe coffee = new Cafe(CoffeTypes.values()[option -1].getType(), CoffeTypes.values()[option -1].getPrize(),numCoffe);
        this.order.addCoffee(coffee);
    }
    public int selectCoffeeToDelete(){
        StringBuilder output = new StringBuilder("¿Qué tipo de cafe desea usted borrar?\n");
        int option;
        for (int i = 0; i < CoffeTypes.values().length; i++) {
            output.append("\n\t- [").append(i +1).append("]: ").append(CoffeTypes.values()[i].getType()).append(" (").append(CoffeTypes.values()[i].getPrize()).append(" €).");
        }
        output.append("\n\t- [0]: Salir.");
        do {
            System.out.println(output);
            option = Teclado.readInteger();
        } while (option < 0 || option > CoffeTypes.values().length + 1);
        return option;
    }
    public void removeCoffee(int option){
        this.order.removeCoffe(CoffeTypes.values()[option -1].getType());
        System.out.println("Café eliminado con éxito.");
    }




    public int selectCoffe (){
        StringBuilder out = new StringBuilder();
        int option = 0;
        do {
            for (int i = 0; i < CoffeTypes.values().length; i++) {
                out.append("\n\t- [").append(i).append("]: ").append(CoffeTypes.values()[i].getType()).append(" (").append(CoffeTypes.values()[i].getPrize()).append(" €).");
            }
            out.append("\n\t- [0]: Salir.");
            System.out.println(out);
        } while (option < 0 && option > CoffeTypes.values().length + 1);
        return option;
    }
    public int selectAmount(){
        StringBuilder out = new StringBuilder();
        System.out.println("por favor, introduzca la cantidad de cafes seleccionada: ");
        int amount = Teclado.readInteger();
        do {

            amount = Teclado.readInteger();
        } while (amount >= 0);
        return amount;
    }

}
