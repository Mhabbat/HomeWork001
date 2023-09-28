package Seminar1;

import java.util.ArrayList;
import java.util.concurrent.Callable;

public class Program {

        public static void main(String[] args) {

                Product product1 = new Product("ООО Источник", "_", -200);
                //product1.name = "Бутылка с водой (1)";
                //product1.brand = "ООО Источник";

                product1.setPrice(-10);
                product1.setName("");

                System.out.println(product1.displayInfo());

                Product product2 = new Product();
                System.out.println(product2.displayInfo());

                Product product3 = new Product("Бутылка с водой (3)", 150);
                System.out.println(product3.displayInfo());

                Product bottleOfWater =
                        new BottleOfWater("ООО Источник", "Бутылка с водой (4)", 250, 1.5);
                System.out.println(bottleOfWater.displayInfo());

                Product bottleOfMilk1 =
                        new BottleOfMilk("ООО Источник", "Бутылка с молоком (1)", 310, 0.5, 15);
                System.out.println(bottleOfMilk1.displayInfo());

                Product bottleOfMilk2 =
                        new BottleOfMilk("ООО Источник", "Бутылка с молоком (2)", 330, 1.5, 15);
                System.out.println(bottleOfMilk2.displayInfo());

                Product bottleOfMilk3 =
                        new BottleOfMilk("ООО Источник", "Бутылка с молоком (3)", 340, 2.5, 35);
                System.out.println(bottleOfMilk3.displayInfo());

                Product bottleOfMilk4 =
                        new BottleOfMilk("ООО Источник", "Бутылка с молоком (4)", 350, 1.5, 25);
                System.out.println(bottleOfMilk4.displayInfo());

                Product chocolate = new Chocolate("Kinder", "Kinder JOY", "black", 150, 30);
                System.out.println(chocolate.displayInfo());
                Product chocolate1 = new Chocolate("Kinder", "Kinder MAX", "black", 350, 100);
                System.out.println(chocolate1.displayInfo());
                Product chocolate2 = new Chocolate("Kinder", "Kinder MAX", "black", 350, 100);
                System.out.println(chocolate2.displayInfo());
                Product chocolate3 = new Chocolate("Kinder", "Kinder JOY", "black", 150, 30);
                System.out.println(chocolate3.displayInfo());
                Product chocolate4 = new Chocolate("Kinder", "Kinder JOY", "black", 150, 30);
                System.out.println(chocolate4.displayInfo());
                Product pampers = new Pampers("Комфорт","beybee",25,3);
                System.out.println(pampers.displayInfo());
                Product pampers2 = new Pampers("Комфорт", "Huggis", 20,4);
                System.out.println(pampers.displayInfo());
                Product pampers3 = new Pampers("Комфорт", "Beybee", 20,2);
                System.out.println(pampers.displayInfo());
                Product pampers4 = new Pampers("Комфорт", "Beybe", 20,1);
                System.out.println(pampers.displayInfo());

                ArrayList<Product> products = new ArrayList<>();
                products.add(bottleOfWater);
                products.add(bottleOfMilk1);
                products.add(bottleOfMilk2);
                products.add(bottleOfMilk3);
                products.add(bottleOfMilk4);
                products.add(chocolate1);
                products.add(chocolate2);
                products.add(chocolate3);
                products.add(chocolate4);
                products.add(chocolate);
                products.add(pampers);
                products.add(pampers2);
                products.add(pampers3);
                products.add(pampers4);


                VendingMachine vendingMachine = new VendingMachine(products);

                BottleOfMilk bottleOfMilk = vendingMachine.getBottleofMilk(1.5, 15);
                if (bottleOfMilk == null) {
                        System.out.println("Такой бутылки с молоком нет в автомате.");
                } else {
                        System.out.println("Вы купили:");
                        System.out.println(bottleOfMilk.displayInfo());
                }

                Chocolate chocolateS = vendingMachine.getChocolate(30);
                if (bottleOfMilk == null) {
                        System.out.println("Такой шоколад нет в автомате.");
                } else {
                        System.out.println("Вы купили:");
                        System.out.println(chocolate.displayInfo());
                }
                Pampers pampersN = vendingMachine.getPampers(3);
                if (pampersN == null) {
                        System.out.println("Такой памперс нет в автомате.");
                } else {
                        System.out.println("Вы купили: ");
                        System.out.println(pampersN.displayInfo());


                }


        }


}