public class Main {
    public static void main(String[] args) {
        Usuario user1 = new Usuario("Pedro", "pedro@gmail.com", 23, true);

        System.out.println(String.format("Se creo el usuario: %s", user1));

        Usuario user2 = new Usuario("Juan", "juan@hotmail.com", 25, false);
        Usuario user3 = new Usuario("Pedro", "pedro@gmail.com", 23, true);

        System.out.println(String.format("El usuario %s es igual al usuario %s -> %s", user1, user2, user1.equals(user2)));
        System.out.println(String.format("El usuario %s es igual al usuario %s -> %s", user1, user3, user1.equals(user3)));

        user1.setCuentaActiva(false);
    }
}
