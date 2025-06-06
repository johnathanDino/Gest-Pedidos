package clients;

public class Client {

    private int idClient;
    private String name;
    private String lastname;
    private String mail;
    private String password;

    // Constructor
    public Client(int idCliente, String name, String lastname,
                  String mail, String password) {
        this.idClient = idCliente;
        this.name = name;
        this.lastname = lastname;
        this.mail = mail;
        this.password = password;
    }

    // Getters y setters
    public int getIdCliente() { return idClient; }
    public void setIdCliente(int idCliente) { this.idClient = idCliente; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getLastname() { return lastname; }
    public void setLastname(String lastname) { this.lastname = lastname; }

    public String getMail() { return mail; }
    public void setMail(String mail) { this.mail = mail; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    @Override
    public String toString() {
        return idClient + " - " + name + " " + lastname + " <" + mail + ">";
    }
}
