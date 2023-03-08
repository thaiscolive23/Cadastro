import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class formularioCadastroProduto extends JFrame{
    private JPanel pnlCadastroProduto;
    private JTextField txtCodigo;
    private JTextField txtDescricao;
    private JTextField txtPreco;
    private JTextField txtQuantidade;
    private JLabel lblCodigo;
    private JLabel lblDescrição;
    private JLabel lblPreço;
    private JLabel lblQuantidade;
    private JButton btnCadastrarProduto;


   public formularioCadastroProduto() {
       criarListeners();
       initComponents();
   }

   public void criarListeners() {
       btnCadastrarProduto.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
            String Codigo = txtCodigo.getText();
            String Descricao = txtDescricao.getText();
            String Preco = txtPreco.getText();
            String Quantidade = txtQuantidade.getText();

               JOptionPane.showMessageDialog(btnCadastrarProduto, "O seguinte usuario foi cadastrado!"
                       + "codigo " + Codigo + "\n"
                       + "descricao " + Descricao + "\n"
                       + "preco " + Preco + "\n"
                       + "quantidadeEstoque " + Quantidade        );
           }
       });
   }
   public void initComponents() {
      setTitle("Tela Cadastro ");
      setSize(300, 150);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setContentPane(pnlCadastroProduto);
      setVisible(true);



   }

    public static void main(String[] args) {
        formularioCadastroProduto Menu = new formularioCadastroProduto();
    }
}