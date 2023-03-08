import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class formularioCadastro extends JFrame {
    private JPanel pnlCadastroUsuario;
    private JTextField txtNome;
    private JLabel lblNome;

    private JTextField txtSobrenome;
    private JTextField txtSetor;
    private JTextField txtFuncao;
    private JTextField txtLogin;
    private JTextField txtSenha;
    private JLabel lblSobrenome;
    private JLabel lblSetor;
    private JLabel lblFuncao;
    private JLabel lblLogin;
    private JLabel lblSenha;
    private JButton btnCadastro;

    public formularioCadastro() {

        criarListeners();
        initComponents();
    }

    public void criarListeners() {
        btnCadastro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Nome = txtNome.getText();
                String Sobrenome = txtSobrenome.getText();
                String Senha = txtSenha.getText();
                String Funcao = txtFuncao.getText();
                String Login = txtLogin.getText();

                JOptionPane.showMessageDialog(btnCadastro, "O seguinte usuario foi cadastrado!"
                        + "Nome " + Nome + "\n"
                        + "Sobrenome " + Sobrenome + "\n"
                        + "Senha " + Senha + "\n"
                        + "Funcao " + Funcao +    "\n"
                + "Login" + Login);
            }
        });
    }
    public void initComponents() {
        setTitle("Tela Cadastro ");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(pnlCadastroUsuario);
        setVisible(true);



    }

    public static void main(String[] args) {
        formularioCadastroProduto Menu = new formularioCadastroProduto();
    }
}