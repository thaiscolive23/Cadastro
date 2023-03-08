import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginTela extends JFrame {
    private JPanel telaInicial;
    private JButton btnOk;
    private JTextField txtUsuario;
    private JPasswordField pswSenha;
    private JLabel lblUsuario;
    private JLabel lblSenha;
public LoginTela() {
    iniciarComponentes();
    criarListeners();
}
    public  void iniciarComponentes() {
        setTitle("Tela de login");
        setSize(300,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(telaInicial);
        setVisible(true);
    }
 public void criarListeners() {

    btnOk.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            validarLogin();

        }
    });
}
private void validarLogin() {
    String usuario = txtUsuario.getText();
    String senha = new String (pswSenha.getPassword());

    if (usuario.equals("admin") && senha.equals("admin")) {
        telaMenu menu = new telaMenu();
        menu.setVisible(true);
        dispose();

    } else {
        JOptionPane.showMessageDialog(this, "Usuário ou senha incorreto!");
     }
    }

    public static void main(String[] args) {

        LoginTela iniciar = new LoginTela();
    }
}
