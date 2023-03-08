import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class telaMenu extends JFrame {
    private JPanel pnlTelaMenu;
    private JButton btnCadUsuario;
    private JButton btnCadProdutos;

    public telaMenu() {
        initComponetns();
        components();

    }
    public void initComponetns() {
        setTitle("Tela de Cadastro de produto");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(pnlTelaMenu);
        setVisible(true);
    }
    public void components() {
        btnCadUsuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                formularioCadastro formCadU = new formularioCadastro();
                formCadU.setVisible(true);
                dispose();

            }
        });
        btnCadProdutos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                formularioCadastroProduto formProd = new formularioCadastroProduto();
                formProd.setVisible(true);
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        telaMenu newMenu = new telaMenu();
    }
}
