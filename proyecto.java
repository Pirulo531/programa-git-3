public class Usuario {
    int idUsuario;
    String nombres;
    String apellidos;
    double fechaNacimiento;
    double dirección;
    double correo;
    double contraseña;

    public void registrarUsuario() {
        System.out.println("el registro se ha realizado con exito");
    }

    public void iniciarSesion() {
        System.out.println("Bienvenido");
    }

public void actualizarUsuario() {
    System.out.println("sus datos han sido actualizados");
    }

    public void consultarUsuario() {
        System.out.println("se información del usuario");
    }

    public void eliminarUsuario() {
        System.out.println("¿desea eliminar el usuario?");
    }
}
