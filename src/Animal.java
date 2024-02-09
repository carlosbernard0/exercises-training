import java.util.Scanner;

public class Animal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name1, name2, name3;

        name1 = input.nextLine();
        name2 = input.nextLine();
        name3 = input.nextLine();

        if (name1.equals("vertebrado")){
            if (name2.equals("ave")){
                if (name3.equals("carnivoro")){
                    System.out.println("aguia");
                }else if (name3.equals("onivoro")){
                    System.out.println("pomba");
                }
            }else if (name2.equals("mamifero")){
                if (name3.equals("onivoro")){
                    System.out.println("homem");
                }else if (name3.equals( "herbivoro")){
                    System.out.println("vaca");
                }
            }
        }else if (name1.equals("invertebrado")){
            if (name2.equals("inseto")){
                if (name3.equals("hematofago")){
                    System.out.println("pulga");
                }else if (name3.equals("herbivoro")){
                    System.out.println("lagarta");
                }
            }else if (name2.equals("anelideo")){
                if (name3.equals("hematofago")){
                    System.out.println("sanguessuga");
                }else if (name3.equals("onivoro")){
                    System.out.println("minhoca");
                }
            }
        }

    }
}
