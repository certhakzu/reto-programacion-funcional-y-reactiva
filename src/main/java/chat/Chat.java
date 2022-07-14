package chat;

import reactor.core.publisher.Flux;

import java.util.List;
import java.util.Scanner;

public class Chat {
    private final static Scanner scanner = new Scanner(System.in);
    List<String> malasPalabras = List.of("estupido", "marica", "pirobo", "gonorrea", "mierda", "puta", "monda");
    public void filtroChat() {

        System.out.println("Mensaje:");
        String mensaje = scanner.nextLine();
        List<String> palabrasDelMensaje = List.of(mensaje.split(" "));
        Flux.fromIterable(palabrasDelMensaje)
            .map(palabra -> {
                if (malasPalabras.contains(palabra.toLowerCase())) palabra = "****";
                return palabra;
            })
            .reduce("", (acum, me) -> acum +=" "+me)
            .subscribe(palabra -> System.out.println(palabra.toString()));
    }

    public static void main(String[] args) {
        Chat chat = new Chat();
        chat.filtroChat();
    }
}



